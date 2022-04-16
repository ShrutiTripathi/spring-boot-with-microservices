# springboot-with-microservices

This projects constitutes of three microservices. The microservices communicates with each otherusing WebCLient. 
Integrated the services with another service i.e Service discovery with Eureka to facilitate services finding each other to communicate.

# Tech stack:
- Spring Cloud
- Java 
- Spring boot


- Service 1: Movie Catalogue Service
- Input: User ID
- Output : Movie List with details

- Service 2: Movie Info Service
- Input : Movie ID
- Output: Movie Details

- Service 3: Ratings Data Service
- Input: User ID
- Output: Movie Ids and ratings

- Discovery Server
