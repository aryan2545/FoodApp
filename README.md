**🍽️ Food Ordering Console App — Java + JDBC**
A lightweight, console-based Java application for food ordering that supports user registration,  menu browsing, placing orders, and viewing order history — all backed by PostgresqlSQL and JDBC.




**🚀 Features**
✨ User Registration 
📋 Dynamic Menu loaded from database
🛍️ Place Orders with a single selection
🧾 View Past Orders instantly
🔗 Postgresql+ JDBC integration
🔧 Built with Core Java + Maven
🧑‍🎓 Perfect for beginners & learners




**🏗️ Project Structure**

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
JDBC	Connects Java to PostgresqlSQL
MySQL	Stores users, menu & orders
Maven	Dependency & build management



**🗃️ Database Setup (PostgreSQL)****
Create your database and tables using the following SQL:
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




**🛠️ Requirements**
To run the app, you will need:

 - Java IDE(Eclipse)
 -Postgresql
🧠 Basic knowledge of Java programming & Postgrsql




**📸 Console Preview**
![image alt](<img width="1011" height="673" alt="Screenshot 2025-07-10 140613" src="https://github.com/user-attachments/assets/e6e51014-e050-4ffd-abc1-9416c3a25f54" />)
![image alt](<img width="611" height="828" alt="Screenshot 2025-07-10 140712" src="https://github.com/user-attachments/assets/4f23782a-4452-4f41-b9aa-d2532a042a11" />)



**📞 Contact**
For any questions or issues, feel free to reach out to the developer at:

**📧 Email:** kajaledhiraj088@gmail.com

**🐙 GitHub:** [Dhirajkajale18](https://github.com/Dhirajkajale18)



**👨‍💻 other information:**
Created by:

1).Abdulraheman Mahamad Sayyad

2).Amankhan Khalil Pathan
