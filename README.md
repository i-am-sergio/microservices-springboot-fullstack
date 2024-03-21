
# University Management System (microservices architecture)

This project is a University Management System built using microservices architecture with Spring Boot.

## Technologies Used

- `Backend`
    - Spring Boot
    - Spring Security
    - JSON Web Tokens (JWT) for authentication
    - Hibernate + JPA

- `Microservices`
    - Gateway
    - Spring Cloud Eureka
    - Config Server
    - Zipkin Server
    - Gradle for dependency management
    - Docker for containerization

- `Databases`
    - MySQL
    - PostgreSQL 

- `Frontend`
    - VueJS 3
    - Typescript

## Microservices

## Microservices

1. **Students Service**: Manages student information including registration, enrollment, and grades.
2. **Teachers Service**: Manages professor information including registration, course assignments, and schedules.
3. **Courses Service**: Manages course information including creation, scheduling, and enrollment.
4. **Auth Service**: Provides authentication and authorization functionalities using JSON Web Tokens (JWT).
5. **Eureka Service**: Registry for each microservice implemented, facilitating service discovery and communication within the system.
6. **Config Service**: Centralized configuration management service that stores and serves configuration details for each microservice in the architecture.
7. **Gateway Service**: Entry point for all external client requests, responsible for routing requests to the appropriate microservice and handling cross-cutting concerns such as authentication, authorization, and logging. The Gateway Service also serves as a single point of contact for all external communication, improving security and manageability.


## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/university-management-system.git
    ```
2. Install JDK 17 (LTS)
3. Run each microservice

## Docker

1. `students-microservice`
    - Build container:
    ```bash 
    docker build -t students-mcsv .
    ```
    - Run microservice:
    ```
    docker run -p 8001:8001 students-mcsv
    ```
## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
