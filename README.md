# Web Services Demo using Spring Boots
web Services Demo In Spring Boots. Thanks for Udacity.com tute content. 

**Web Services and API**

A web service is a way to share data between two disparate systems. The communication typically happens between a client and a server, rather than directly with users. 

The communication can happen between any combination of systems. 

e.g. 

 Mobile phone -> Windows server

 Mainframe system -> Java web application

 Web service -> Web service

 

**Benifit of web service**

Resuability -  Multiple devices access to same data. i.g. facebook, login from mobile and login from desktop to browse the same content. 

Usability - expose business logic, allowed using by 3rd parties. Reduce development time. 

Web services v.s. API

APIs are more dynamic, lightweight and streamlined.

SOAP(Simple Object Access Protocol) complecxities let to REST 

All Web services are APIs, but not all APIs are web services.  

**REST**  Stands for REpresentational State Transfer. 

There are **four principles** that APIs follow:

1. Data and functionality in the API are considered "resources" and identified through URL. 
2. Resources are manipulated using a fixed set of operations. GET retrieves a resource. POST creates one. Use PUT to update the resource, and of course, DELETE will remove it.
3. Resources can be represented in multiple formats, such as HTML, XML, plain text, and other formats defined by a media type.
4. Communication between the client and server (i.e. endpoint) is stateless. This means the server will not remember or store any state about the client that made the call.
