//Описать класс «triangle». В качестве свойств возьмите длинны сторон треугольника.
// Реализуйте метод который будет возвращать площадь этого треугольника. Создайте несколько объектов этого класса и протестируйте их.

public class Triangle {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  double returnSquareAccordingGeronFormula(){

        double p = (a + b + c)/2;
        return Math.sqrt (p * ((p - a) * (p - b) * (p - c)));
    }

    public static void main(String[] args) {

        Triangle triangleA = new Triangle(2,3,4);
        System.out.println(triangleA.returnSquareAccordingGeronFormula());

        Triangle triangleB = new Triangle(5,6,3);
        System.out.println(triangleB.returnSquareAccordingGeronFormula());

        Triangle triangleC = new Triangle(7,5,3);
        System.out.println(triangleC.returnSquareAccordingGeronFormula());
    }
}
