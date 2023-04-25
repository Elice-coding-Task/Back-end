public class Main {
    public static void main(String[] args) {
        //1번 문제
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());

        //2번 문제
        Triangle t1 = new Triangle (10.0, 5.0);
        Triangle t2 = new Triangle (5.0, 10.0);
        Triangle t3 = new Triangle (8.0, 8.0);
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));


        //3번 문제
        Member sMember = new Member("둘리", "드래곤", "1137*", 3900);
        System.out.printf("%s\t%s\t%s\t%d\n", sMember.getName(), sMember.getId(), sMember.getPassword(), sMember.getage());
        sMember.setMember("공실이", "핑크드래곤", "2599#", 4200);
        System.out.printf("%s\t%s\t%s\t%d\n", sMember.getName(), sMember.getId(), sMember.getPassword(), sMember.getage());


        //4번 문제
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");
        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());

    }
}
