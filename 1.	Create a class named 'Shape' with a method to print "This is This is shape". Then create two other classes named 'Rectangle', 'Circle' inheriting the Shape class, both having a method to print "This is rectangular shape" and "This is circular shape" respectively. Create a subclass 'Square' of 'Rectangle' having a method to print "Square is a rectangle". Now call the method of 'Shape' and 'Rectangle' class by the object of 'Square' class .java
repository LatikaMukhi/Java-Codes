class Shape{
   String shape1;
   
   public void print(){
       System.out.println("This is "+ shape1);
      
   }
}
class Rectangle extends Shape{
    public void print1(){
      System.out.println("This is rectangular shape");
    }
  }
  class Circle extends Shape{
    public void print2(){
      System.out.println("This is circular shape");
    }
  }
  class Square extends Rectangle{
    public void print3(){
      System.out.println("Square is a rectangle");
    }
  }
public class ShapeSquareRectangle {
    public static void main(String[]args){
        Square s = new Square();
        
        s.print1();
        
        s.print3();
        
    }
}
