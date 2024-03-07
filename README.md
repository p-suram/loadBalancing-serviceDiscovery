This repo contains all microservices to demonstrate load balancing and service discovery and distributed tracing in microservices
- we are using FEIGN for load balancing and for making api calls among svcs
- we are using eureka for service discovery
- currency-exchange-svc, currency-conversion-svc, api-gateway are registered as eureka clients and naming-server is eureka server
- currency-exchange-svc running on port 8000 (Multiple instances are created locally in the idea).
- currency-convesion-svc is running on port 8100
- api-gateway is running on port 8765
- naming-server is running on port 8761
- we are using zipkin for distributed tracing.
- we are launching zipkin in docker using command "docker run -p 9411:9411 openzipkin/zipkin:3.1.0" and by adding related zipkin dependencies in all the svcs, we will be able to trace all the api's. 
<img width="478" alt="image" src="https://github.com/p-suram/loadBalancing-serviceDiscovery/assets/157307140/047dac10-09a5-4efd-87c2-a556f16d86d2">
<img width="473" alt="image" src="https://github.com/p-suram/loadBalancing-serviceDiscovery/assets/157307140/bdc6ec37-a213-460f-ac9b-190054fd030c">

