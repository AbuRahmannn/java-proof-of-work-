class Student{
    String name;
    int age;
    public void studs(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructor called");
    }
}
public class NonParameterizedConstructor {
    public static void main(String[] args){
     Student s1 = new Student();
     s1.name = "Rahman";
     s1.age = 19;
     s1.studs();
    }
}
