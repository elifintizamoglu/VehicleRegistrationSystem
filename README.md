# Vehicle Registration System - Backend Part

- It is a web application project which is developed by using Java and React. In this project, user can sign up, login, update password, make a list of his/her cars, add/delete/update/read the list and see count of cars he/she owns. 

- This repository is backend part of a fullstack web application project. I made this project as a final project in software development training held by [@Patika.Dev](https://www.patika.dev/tr) and try to use what I have learned in this trainig. [@Frontend](https://github.com/elifintizamoglu/vrs-frontend) part of the project is here.

## What technologies are used while developing?

- I used Java - Spring Boot and MySQL. I developed this project on Visual Studio Code.


## Install and Run the Project

- After pulling this repository, you will need JDK, IDE, and database to be able to start the project.  After that, you can use Postman to send request to project and see the responses. You can find URL's that requests needs to go [@here.](https://github.com/elifintizamoglu/VehicleRegistrationSystem/tree/main/src/main/java/com/elifintizam/VehicleRegistrationSystem/controller)

## API Usage
See some API requests below.
#### Get all cars in database

```http
  GET /car/all
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `no parameter` | `-` | - |

#### Get cars by user id

```http
  GET /car/getByUserId/{userId}
```

| Parametre | Tip     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `userId`      | `Long` | **Required**. User id whom cars will be got |

```http
  GET /car/delete/{carId}
```

| Parametre | Tip     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `carId`      | `Long` | **Required**. Car id that will be deleted |
  
