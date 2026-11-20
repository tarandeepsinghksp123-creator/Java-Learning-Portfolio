public class constructorvolume {
    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box(10);
        box b3 = new box(20,30,40);
        b1.volume();
        b2.volume();
        b3.volume();

    }
}
class box {
    int length ;
    int breadth ;
    int hieght ;
    box (){
        this(1);
    }
    box (int length){
        this(length,length,length);
    }
    box (int length,int breadth,int hieght){
        this.length = length;
        this.breadth = breadth;
        this.hieght = hieght;
    }
    void volume(){
        int volume = length * breadth * hieght ;
        System.out.println(volume);
    }
}