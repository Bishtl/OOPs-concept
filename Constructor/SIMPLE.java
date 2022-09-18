package Constructor;

class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.print(this.name);
        System.out.print(this.age);
    }
    Student(){
        System.out.print("Constructor called");
    }
}


public class SIMPLE {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Rohit";
       s1.age = 21;
       
      s1.PrintInfo(); 
    }
}
