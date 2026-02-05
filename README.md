A. Project Overview

Purpose of API
    
    This project is simple library API. It helps store books and categories in database. We can add books, read books, and see list of books.

Entities and relationships
  
    Category has id and name
    Book has id, name, type and category
    Book belongs to category

OOP design overview
       
        Project uses abstract class BookBase
        EBook and PrintedBook extend BookBase
        Repository works with database
        Service checks logic and validation

------------------------------------------------------------------------------------------------------------

B. SOLID Principles

SRP
    
    Each class has one job.
    Repository works with DB.
    Service works with logic.
    Main only runs program.

OCP
    
    We can add new book types without changing BookBase.

LSP
    
    EBook and PrintedBook can be used like BookBase.

ISP
    
    Interfaces are small and simple.

DIP
    
    Service works with repository, not database directly.

------------------------------------------------------------------------------------------

C. Advanced OOP Features

Generics
    
    Can be used in repository interfaces.

Lambdas
    
    Can be used for sorting book list.

Reflection
    
    ReflectionUtils can show class name, fields and methods.

Interface default/static methods
    
    Used in interfaces for extra logic.

-------------------------------------------------------------------------

D. OOP Design

Abstract class
    
    BookBase is abstract parent class.

Subclasses
    
    EBook
    PrintedBook

Composition
    
    Book has Category object.

Polymorphism
    
    BookBase book = new EBook() works.

UML diagram
    
    Category 1 → many Books

---------------------------------------------------------------------------------

E. Database

Tables
    
    categories
    books

Constraints
    
    Category name is unique
    Book has foreign key to category

Sample insert
    
    INSERT INTO categories(name) VALUES ('Programming');

---------------------------------------------------------------------------------------

F. Architecture

Controller
    
    Main class simulates controller.

Service
    
    Checks validation and rules.

Repository
    
    Works with JDBC and SQL queries.

--------------------------------------------------------------------------------------

G. How to Run

Need Java
Need PostgreSQL
Need JDBC driver

Steps
    
    Create database library
    Run SQL schema
    Run Main.java

----------------------------------------------------------------

H. Screenshots


    Books list
    Validation errors
    Database insert working

------------------------------------------------------------------------

I. Reflection

What I learned
    
    How JDBC works
    How OOP works with database
    How SOLID makes code better

Challenges
    
    Database connection errors
    Foreign key errors
    Driver setup
Code is cleaner
Easy to add new features
Better structure
