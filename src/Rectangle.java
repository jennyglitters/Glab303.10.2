public class Rectangle extends Shape{
    public Rectangle(String color){
        super(color);
    }
    public Rectangle(){

    }
    public Rectangle(String color, double area, double base, double width, double height){
        super(color,area, base, width, height);
    }
    @Override
    public void setBase(double base){
        super.setBase(base);   }
    @Override
    public void setWidth(double width){
        super.width = width;   }
    @Override
    public double getArea(){
        return width * height;  }
    public double perimeter(){
        super.area = super.width*super.height;
        return super.area;   }
    @Override
    public void displayshapName(){
        System.out.println("I am a rectangle"   );   }
    @Override
    public String toString(){
        return "Rectangle[height =" + height + ", width=" + width + "," + super.toString() + "]";
        }
    }
