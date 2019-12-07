# feing-client
https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html

to test
start eureka server at 8090
start product server 
start feign client
hit http://localhost:8080/fetchProducts 


to test fallback
stop product server 
and hit the http://localhost:8080/fetchProducts
you will see the backup details


-->@FeignClient(name=””, url=””) – To make send HTTP request to an external RESTful Web Service provide name and base url value. 
In the @FeignClient annotation the String value  is an arbitrary client name, which is used to create a Ribbon load balancer. You can also specify a URL using the url attribute . The name of the bean in the application context is the fully qualified name of the interface. To specify your own alias value you can use the qualifier value of the @FeignClient annotation

-->To be able to use ErrorDecoder, you will need to create a new Java class and make it implement ErrorDecoder interface. Implementing ErrorDecoder interface you give you access to: Method Key and Response objects.

methodKey – will contain a Feign client class name and a method name,
Response – will allow you to access HTTP status code, Body of HTTP Response and also the Request object. You can use these details when handing an error message and preparing a response.

-->To enable Feign Client logging you will need to update an application.properties file of your project with a new property.
logging.level.<full class name of the interface here> = DEBUG

The logger is created for each Feign Client.
The default logger level of Feign Client is NONE. So if you want to see something meaningful appear in your console, update the default logger level from NONE to one of these options:

BASIC, Log only the request method and URL and the response status code and execution time.
HEADERS, Log the basic information along with request and response headers.
FULL, Log the headers, body, and metadata for both requests and responses.

To configure the logger level create a Logger.Level Bean
 @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

