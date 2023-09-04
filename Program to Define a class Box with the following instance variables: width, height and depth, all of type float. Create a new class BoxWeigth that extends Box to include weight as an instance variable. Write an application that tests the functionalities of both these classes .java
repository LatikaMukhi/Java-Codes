class Box{
   float width;
   float height;
   float depth;
   public void boxVolume(){
    System.out.println("Volume = "+(width*height*depth));
   }
}
class BoxWeigh extends Box{
   float weight;
   public void setWidth(float w){
    this.width = w;
   }
   public void setHeight(float h){
    this.height = h;
   }
   public void setDepth(float d){
    this.depth = d;
   }
   public void setWeight(float w1){
    this.weight = w1;
   }
   public float getWidth(){
    return width;
   }
   public float getHeight(){
    return height;
   }
   public float getDepth(){
    return depth;
   }
   public float getWeight(){
    return weight;
   }
}
public class BoxHeightWidthDepth {
    public static void main(String []args){
        BoxWeigh b = new BoxWeigh();
        b.setHeight(10);
        b.setWidth(5);
        b.setDepth(9);
        b.setWeight(52);
        b.boxVolume();
        System.out.println("Weight = "+b.getWeight());
    }
}
