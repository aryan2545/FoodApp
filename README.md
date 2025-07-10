![download](https://github.com/user-attachments/assets/bc420ae0-eeff-4b47-8e68-b22ac5d0e794)**🍽️ Food Ordering Console App — Java + JDBC**
A lightweight, console-based Java application for food ordering that supports user registration,  menu browsing, placing orders, and viewing order history — all backed by MySQL and JDBC.

**🚀 Features**
✨ User Registration & Login
📋 Dynamic Menu loaded from database
🛍️ Place Orders with a single selection
🧾 View Past Orders instantly
🔗 MySQL + JDBC integration
🔧 Built with Core Java + Maven
🧑‍🎓 Perfect for beginners & learners

**🏗️ Project Structure**
css
Copy code
FoodOrderingApp/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── foodapp/
                    ├── App.java
                    ├── DBUtil.java
                    ├── UserService.java
                    ├── MenuService.java
                    └── OrderService.java
**🛠️ Tech Stack**
Tech	Description
Java	Console-based Core Java App
JDBC	Connects Java to MySQL
MySQL	Stores users, menu & orders
Maven	Dependency & build management
**
**🗃️ Database Setup (MySQL)****
Create your database and tables using the following SQL:

sql
Copy code
CREATE DATABASE foodapp;
USE foodapp;

CREATE TABLE users (
    id INT AUTO_INCREMENT ,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(50)
);

CREATE TABLE menu (
    id INT AUTO_INCREMENT ,
    name VARCHAR(100),
    price DOUBLE
);

CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    food_id INT,
   
);

INSERT INTO menu (name, price) VALUES
('Burger', 100), ('Pizza', 200), ('Fries', 60);


📦 Build & Run
Make sure Maven is installed.



📸 Console Preview
![Screenshot 2025-07-10 140613](https://github.com/user-attachments/assets/83a28cd1-4858-4e2b-87ec-313b7d16c766)
![Uploading Screenshot 2025-07-10 140712.png…]()

