// Create a Main class
public class Class {
    String classAttribute; // Create a class attribute

    // Create a class constructor for the class
    public Class(){
        classAttribute = "classAttribute"; // Set the initial value for the class attribute
    }

    public void classMethod(){
       Class classObject = new Class(); // Create an object of the class
       System.out.println(classObject.classAttribute);
    }
}