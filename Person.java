
//Create a class Person with attributes like name,age, and methods to display these attributes.
public class Person {

   private String name;
   private int age;

   public Person(String name,int age){
    this.name=name;
    this.age=age;

   }

   public String getName(){
    return name;
   }

   public int getAge(){
    return age;
   }

   public void setName(String name){
    this.name=name;
   }

   public void setAge(int age){

    this.age=age;
   }

   public void displayPersonDetails(){

    System.out.println("Person name is:- "+name);
    System.out.println("Person age is:- "+age);
   }

   public static void main(String[] args) {
    Person person=new Person("Rahul kumar", 25);



    person.displayPersonDetails();
   } 

}