# Library Management System (Java)

## Overview
A Java-based Library Management System demonstrating OOP concepts,
SOLID principles, and clean code practices.

## Features
- Book Management (Add, Update, Remove, Search)
- Patron Management
- Book Checkout & Return
- Inventory Tracking

## Design Patterns
- Factory Pattern

## Class Diagram
Book 
 ├── isbn 
 ├── title 
 
 ├── author 
 
 ├── publicationYear 
 
 └── available 

Patron 

 ├── patronId 
 
 ├── name 
 
 └── borrowingHistory 

InventoryService 

 └── manages → Book 

PatronService 

 └── manages → Patron 

LendingService 

 └── uses → Book, Patron 

BookFactory 

 └── creates → Book 


## Tech Stack
- Java
- Java Collections

## Author
Gufraan Ansari
