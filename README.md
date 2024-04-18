

# CRUD API Using Spring Boot and Java

This project is a CRUD (Create, Read, Update, Delete) API developed using Spring Boot and Java. It provides endpoints to interact with a database to perform basic CRUD operations on a User entity.

## Prerequisites

To run this application, you'll need the following software installed on your system:

- IntelliJ IDEA (or any other Java IDE of your choice)
- MySQL Workbench (or any other MySQL database management tool)
- Postman (or any other API testing tool)

## Setup Instructions

Follow these steps to set up and run the application:

1. Clone this repository to your local machine:

   ```
   git clone https://github.com/your-username/your-repository.git
   ```

2. Open the project in IntelliJ IDEA or your preferred Java IDE.

3. Set up your MySQL database:
   - Open MySQL Workbench and create a new database for the application.
   - Update the `application.properties` file in the project's `src/main/resources` directory with your database connection details.

4. Run the application:
   - Open the project in your IDE and build the project.
   - Run the application using the IDE's running configuration or by executing the main class (`CrudApiApplication.java`).

5. Test the API endpoints:
   - Use Postman or any other API testing tool to send requests to the API endpoints.
   - The base URL for the API will be `http://localhost:8080`.

## API Endpoints

The following endpoints are available:

- `GET /users`: Retrieve all users.
- `GET /users/{id}`: Retrieve a user by ID.
- `POST /users`: Create a new user.
- `PUT /users/{id}`: Update an existing user.
- `DELETE /users/{id}`: Delete a user by ID.

Refer to the source code for detailed information on request and response formats.


