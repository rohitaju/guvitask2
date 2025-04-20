/*1.1)Create a class Person with properties (name and age) with following features.
a. Default age of person should be 18;
b. A person object can be initialized with name and age;
c. Method to display name and age of person*/


package guvitask2qn1;

//class created

public class person {
     String name;
     int age;
     
     person(String name, int age){
    	 this.name = name;
    	 this.age = age;
     }
     
     
     
     void display() {
    	 System.out.println("name " + name);
    	 System.out.println("age " + age);
     }
	 public static void main(String args[]) {
	
	 person p1 = new person("rohit", 18);
    
	 p1.display();
	
   
}



}

