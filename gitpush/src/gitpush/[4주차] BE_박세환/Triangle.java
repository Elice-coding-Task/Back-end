public class Triangle {
    private double bottom;
    private double height;
    Triangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double findArea(){
        return (bottom * height) / 2;
    }

    public boolean isSameArea(Triangle entitiy){
        return findArea() == entitiy.findArea();
    }
}
