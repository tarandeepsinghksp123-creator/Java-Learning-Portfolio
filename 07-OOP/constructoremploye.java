public class constructoremploye {
    public static void main(String[] args) {
        employe e1 = new employe("taran");
        employe e2 = new employe("taran");
        employe e3 = new employe("taran");
        employe e4 = new employe("taran");
        employe e5 = new employe("taran");
        System.out.println("total employe created " +employe.count);

        
    }    
}
class employe {
    String name ;
    static int count=0 ;
    employe (String name){
        this.name = name;
        count ++;
    }
    
}
