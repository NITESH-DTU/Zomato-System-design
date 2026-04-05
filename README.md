# Zomato Backend System Design 🍅

> **Disclaimer:** This is an educational project created for learning and practice. It is not a fully working, production-ready application. It was built to explore core Object-Oriented Programming (OOP) concepts and Software Design Patterns in Java.

## 📖 Overview
This project simulates the core backend flow of a food delivery application like Zomato. It models the user journey of finding a restaurant, browsing a menu, adding items to a cart, and processing a checkout. The focus is strictly on clean architecture, separation of concerns, and scalable design patterns.

## ✨ Key Features
* **User Session Management:** Tracks individual users and their specific shopping carts (orders).
* **Restaurant Discovery:** Search for restaurants based on location and view their menus.
* **Cart Operations:** Add and remove menu items dynamically.
* **Smart Checkout:** Handles empty cart validation, dynamic order creation (Now vs. Scheduled), and calculating totals.
* **Payment Simulation:** Supports multiple payment methods (UPI, Netbanking, Cash).

## 🏗️ Architecture & Design Patterns
This system uses industry-standard design patterns to keep the code modular and scalable:

* **Facade Pattern (`Tomato.java`):** Acts as the central orchestrator/controller. It hides the complex backend logic behind a simple API for the user to interact with.
* **Singleton Pattern (`RestaurantManager`, `OrderManager`):** Ensures there is only one central instance managing the database of restaurants and global orders.
* **Factory Pattern (`Orderfactory`):** Dynamically creates the correct type of order (`nowOrder` or `scheduledOrder`) based on user input during checkout.
* **Strategy Pattern (`PaymentStrategy`):** Decouples the payment logic from the order logic, allowing users to choose their payment method (`upi`, `netbanking`, `cash`) at runtime.

## 🛠️ Tech Stack
* **Language:** Java
* **Concepts:** OOP, System Design, Design Patterns

## 🚀 How to Run Locally

1. **Clone the repository:**
   `git clone https://github.com/NITESH-DTU/Zomato-System-design`
   `cd Zomato-System-design`

2. **Compile the Java files:**
   *(Ensure your terminal is opened to the root folder of the project)*
   `javac Main.java services/*.java manager/*.java Interfaces/*.java`

3. **Run the application:**
   `java Main`

## 🌱 What I Learned
Building this project solidified my understanding of backend architecture before integrating a real database. It provided hands-on experience with identifying tight coupling and resolving it using abstraction, interfaces, and specific design patterns.