package Constructor;

class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.print(this.name);
        System.out.print(this.age);
    }
    Student(String name , int age){
        this.name = name;
        this.age = age;
        
    }
}


public class Parameter {
    public static void main(String[] args) {
       Student s1 = new Student("Rohit",21);
       
       
      s1.PrintInfo(); 
    }
}
