## What is Page Object Model ?
Page Object Model is a design pattern in Selenium that creates an object repository for storing all web elements.
Page Object is a concept that helps to reduce code duplication and improves test maintenance
The main idea behind page object is to place the code relating to the functionality of subpages in separate classes.
IN POM (page object model) design we have some structure by considering each web page of an application as a class file.
Each class file will contain only corresponding web page elements. by the page factory method.
First of all,
@FindBy annotation is used for locating each web Element as private modifier and with getter and setter methods
The methods related with the locators is prepared.
By the way In the future,if there is a change in the web element, it can be easier to involve it.
In Page Object Model,
