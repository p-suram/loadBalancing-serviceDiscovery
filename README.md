This repo contains all microservices to demonstrate load balancing and service discovery in microservices
- we are using FEIGN for load balancing and for making api calls among svcs
- we are using eureka for service discovery
- currency-exchange-svc, currency-conversion-svc, api-gateway are registered as eureka clients and naming-server is eureka server
- currency-exchange-svc running on port 8000 (Multiple instances are created locally in the idea).
- currency-convesion-svc is running on port 8100
- api-gateway is running on port 8765
- naming-server is running on port 8761
- 
<img width="478" alt="image" src="https://github.com/p-suram/loadBalancing-serviceDiscovery/assets/157307140/047dac10-09a5-4efd-87c2-a556f16d86d2">
