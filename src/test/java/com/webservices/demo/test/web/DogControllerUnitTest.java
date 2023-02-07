package com.webservices.demo.test.web;

import com.webservices.demo.service.DogService;
import com.webservices.demo.web.DogController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DogController.class)
public class DogControllerUnitTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    DogService dogService;
    @Test
    public void getAllDogs() throws Exception{
        mockMvc.perform(get("/dog")).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
        verify(dogService, times(1)).retrieveDogs();
    }
    @Test
    public void getBreedById() throws Exception{
        mockMvc.perform(get("/1/breed")).andExpect(status().isOk());
        verify(dogService, times(1)).retrieveDogBreedById(1L);
    }
}
