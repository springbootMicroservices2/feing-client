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
