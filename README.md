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
   git clone https://github.com/codigobacknd/MaxK-API.git
   ```

   ```bash
   cd MaxK-API
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
curl "http://localhost:8080/api/max-k?x=7&y=5&n=12345"
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
curl -X POST "http://localhost:8080/api/max-k/calculate" \
     -H "Content-Type: application/json" \
     -d '{"x":7,"y":5,"n":12345}'
```

# Tests
This project includes unit and integration tests to validate the business logic and API endpoints.

## To run the tests:
```bash
mvn test
```

# Setting Up the Development Environment for Frontend
## Prerequisites
Before getting started, make sure you have Node.js installed (preferably the latest LTS version) and npm (included with Node.js). This project also requires Angular CLI for building and developing the frontend. You can install Angular CLI globally on your system with the following command:

```bash
npm install -g @angular/cli
```

**Clone the repository:**
```bash
git clone https://github.com/codigobacknd/MaxK-UI.git
```

```bash
cd MaxK-UI
   ```

## Installing Dependencies
After cloning the repository, navigate to the frontend project folder and run the following command to install all the required dependencies:

```bash
cd to MaxK-UI project folder
```

```bash
npm install
```

## Building the Application
To build the project, run the following command in the root of the frontend project:

```bash
ng build
```

## Running the Application
To run the application in development mode and access it through a browser, use:

```bash
ng serve
```

## Running Unit Tests
To run the project's unit tests, use the following command:

```bash
ng test
```

## Running Integration or E2E Tests
If you have end-to-end (E2E) tests set up, you can run them with:

```bash
ng e2e
```

# DEMO

```bash
https://maxkapp.azurewebsites.net/
```