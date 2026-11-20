public class consturctorcalculatearea {
    public static void main(String[] args) {
        calculatearea s1=new calculatearea(10, 20);
        calculatearea s2=new calculatearea(20, 40);
        calculatearea s3= new calculatearea(50, 100);

        s1.area();
        s2.area();
        s3.area();

    }

}

class calculatearea {
    int length;
    int breadth;

    calculatearea(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
    void area(){
        int area = length * breadth ;
        System.out.println("area of rectangle "+area);
    }   
}
