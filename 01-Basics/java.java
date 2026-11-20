public class java {
    public static void main(String[] args) {
       student s1 = new student();
       student s2 = new student();
       s1.name= "taran" ;
       s1.rollnum = 12 ;
       s1.college = "dbuu" ;

       s2.name = "tushar";
       s2.rollnum = 13 ;
       s2.college = " abc ";

       s1.markattendance ();
       s2.markattendance ();

       s1.print();
       s2.print();


    }
    
}
class student {
String name ;
int rollnum;
String college ;

void markattendance(){
    System.out.println("attendance marked by " + name);
}
void print (){
    System.out.println(name + " , " + rollnum +  " , "  +college);
}

}
