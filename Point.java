// Реализовать класс Point, описывающий точку в двумерном (по желанию – в трёхмерном) пространстве. Предусмотреть поля, хранящие координаты по X и Y.
// Сделать методы, позволяющие переместить точку (например - вверх, вниз, влево, вправо) на указанное количество единиц.
// И ещё добавить метод, который покажет координаты точки на экране консоли


public class Point {

    int x;
    int y;
    int z;


    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void shiftPointUpwards(int shift){
        this.y += shift;
    }

    public void shiftPointDownwards(int shift){
        this.y -= shift;

    }

    public void shiftPointRight(int shift){
        this.x += shift;
    }

    public void shiftPointLeft(int shift){
        this.x -= shift;
    }


    public  void shiftPointForward(int shift){
        this.z += shift;
    }

    public  void shiftPointBackwards(int shift){
        this.z -= shift;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}