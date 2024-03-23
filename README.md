# MaxK Calculation API

## Description
The MaxK Calculation API offers a solution for calculating the maximum value of `k` such that `0 ≤ k ≤ n` and `k % x = y`. This project is built using Spring Boot and Java 11, following best practices for REST API software development.

## Technologies implemented
- **Java 11**
- **Spring Boot**
- **Maven**
- **JUnit**

## Setting up environment
### Requirements
- JDK 11 installed and configured.
- Maven 3.6 or higher.

### Installation and Execution
**Clone the repository:**
   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
   ```

   ```bash
   cd tu-repositorio
   ```

## Build the project with Maven:
```bash
mvn clean install
```

## Run the application:
```bash
mvn spring-boot:run
```

## Using the API
### Endpoints
**1. Calculate MaxK (GET):**
```bash
/api/max-k?x={x}&y={y}&n={n}
```

**Example cURL:**
```bash
curl "http://localhost:8080/api/max-k?x=10&y=5&n=187"
``` 

**2. Calculate MaxK (POST):**
with a JSON request body containing x, y, and n
```bash
/api/max-k/calculate
```
**Example request body:**
```json
{
  "x": 7,
  "y": 5,
  "n": 12345
}
```

**Example cURL:**
```bash
curl -X POST "http://localhost:8080/api/max-k/calculate" \              ok 
     -H "Content-Type: application/json" \
     -d '{"x":5,"y":0,"n":4}'
```

# Tests
This project includes unit and integration tests to validate the business logic and API endpoints.

## To run the tests:
```bash
mvn test
```


