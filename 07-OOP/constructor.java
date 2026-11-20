public class constructor {
    public static void main(String[] args) {
      Student s1 = new Student();
      Student s2 = new Student("Aditya");
      Student s3 = new Student("rohit",10);
      Student s4 = new Student("daksh",11,20);
      Student s5 = new Student("taran",11,21,"dbuu");
      System.out.println(s1.name);
      System.out.println(s2.college);
      
      
      
      
        
    }
    
}
class Student {
    String name ;
    int rollnum ; 
    int age ; 
    String college ;
    Student (){
        this( "unknown");

    }
    Student (String name){
        this(name , 0) ;     
        
    }
    Student (String name , int rollnum  ){
        this(name , rollnum , 0);
    
    }
    Student (String name,int rollnum , int age ){
        this (name,rollnum,age,"unknown");
        
    }    
        Student (String name ,int rollnum , int age , String college){
        this.name=name;
        this.rollnum=rollnum ;
        this.age=age;
        this.college=college;

        }
    }


