##Explain your Cucumber BDD Framework Structure
My current automation is based on java-maven-Selenium with Cucumber BDD Framework created from scratch.
First, we have a Maven project that helps us build project structure, manage project dependencies and
execute automated scripts. In the pom.xml file, I am storing my dependencies as well as plugins to
gain additional features with the maven capabilities, and my framework is consisting of different layers and
those layers are Pages, Runner, steps definitions, utils the resources and I have properties file so
in the properties file I keep my Global values where I can reach them from anywhere in my framework.

I write my cucumber BDD test inside the resources as a feature. We are creating a test case scenario
by using I keep all of my scenarios in Gherkin language in feature files
since we are using cucumber with the JUnit's and we are able to type our scenarios in plain English.
I have packages for the pages of our application such as “the Homepage” and “Login page"
which have been created as an Object Repository for web UI elements by using POM(page object model)
Also, every page is inherited from Browser Utils for using its properties.
The advantage of the model is that it reduces code duplication and improves test maintenance.
IN POM (page object model) design we have some structure for each page by the page factory method.
@FindBy annotation to locate each web Element also getter and setter
methods related to web elements for the purpose by using encapsulation in the OOP concept.
By the way In the future, if there is a change in the web element, it can be easier to involve it.
Also, we have a runner package for testing in order to run a specific scenario.
By using especially tag. I have 2 test runner classes one is running for the tests
that I want to execute and the other one is for executing the failed ones.
When my test case is failed, it is stored in the target package as rerun.txt.

For the data that I need to use while I create and execute my tests, I have a configuration properties file:
I store important and also changeable data, and generally use it by environment and path.
I have a step definitions package for writing each gherkin step by using methods of test 
that we have worked on and I have a Cucumber Hooks class using @Before and @After annotation,
in @After hook, we are taking screenshots of every failed scenario where we store
Lastly, We have Utility packages that add some methods in order to make code effective and readable.
include many helpers such as;
Configuration reading file: because I need to read the data inside it
driver Util is built on a singleton design where I have a driver's pool for running parallel tests 
The last one is browser Utils where we store useful methods to help with writing more understandable code
