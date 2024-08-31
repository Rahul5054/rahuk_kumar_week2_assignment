public class Rectangle {
    
    private int leng;
    private int width;

    public Rectangle(){
        System.out.println("this is default constructor..");
    }

    public Rectangle(int side){
        this.leng=side;
        this.width=side;
        System.out.println("Constructor with 1 argument..");
    }
public Rectangle(int leng,int width){
    this.leng=leng;
    this.width=width;
    System.out.println("Constructor with 2 argument..");

}

public int area(){
    return leng*width;
}

public int perimeter(){
    return 2*(leng+width);

}

public void dispArea(){
    System.out.println("Area is :- "+area());
}

public void dispPerimeter(){
    System.out.println("Perimeter is :- "+perimeter());
}

public static void main(String[] args) {
    
Rectangle rec=new Rectangle();
rec.dispArea();
rec.dispPerimeter();


Rectangle rec1=new Rectangle(5);
rec1.dispArea();
rec1.dispPerimeter();


Rectangle rect2=new Rectangle(5,8);

rect2.dispArea();
rect2.dispPerimeter();


}

}
