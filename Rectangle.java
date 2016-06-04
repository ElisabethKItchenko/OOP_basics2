//Реализовать класс Rectangle. Добавить поля: ширину, высоту и координаты левого верхнего угла (тип Point).
// Добавить методы вычисления периметра и площади на основе полей. Создать метод рисования этого примитива звёздочками.

public class Rectangle {

    int width;
    int height;
    Point leftUpperAngle;


    public Rectangle(Point leftUpperAngle, int width, int height)
    {
        this.width = width;
        this.height = height;
        this.leftUpperAngle = leftUpperAngle;
    }

    public int returnSquare() {
        return width * height;
    }

    public int returnPerimeter() {
        return 2 * (width + height);
    }


    public void printRectangle(){

        for (int y =0; y<height; y++)
        {
            for (int x=0; x<width; x++)
                System.out.print("*");
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(new Point(1,1,0), 5, 6);


        System.out.println(myRectangle.returnPerimeter());
        System.out.println(myRectangle.returnSquare());
        System.out.println(myRectangle);

        myRectangle.printRectangle();

    }
}
