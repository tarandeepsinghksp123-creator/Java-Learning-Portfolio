public class constructorcopy {
    public static void main(String[] args) {
        Student s1 = new Student("taran" , 20);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
        
        
    }   
}
class Student {
    String name ;
    int age;
    Student (String name , int age) {
        this.name = name ;
        this.age=age;
    }
    Student(Student s){
        this.name = s.name;
        this.age= s.age;

    }
    void display (){
        System.out.println("name="+ name +"age"+age);
    }
}
