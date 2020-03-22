package demo;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String getColor(){
        return super.getColor();
    }
    @Override
    public boolean isFilled(){
        return super.isFilled();
    }
    @Override
    public void setColor(String color){
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled){
        super.setFilled(filled);
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
