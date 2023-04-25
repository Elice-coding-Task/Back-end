public class Car {
    public static int redCount = 0;
    public static int otherCount = 0;

    Car(String color){
        if(color.toLowerCase().equals("red")) redCount++;
        else otherCount++;
    }


    public static int getNumOfCar() {
        return redCount + otherCount;
    }

    public static int getNumOfRedCar() {
        return redCount;
    }
}
