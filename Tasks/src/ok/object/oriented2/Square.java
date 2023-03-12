package ok.object.oriented2;

public class Square extends Figure implements Drawable {
    public Square(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double area() {
         return Math.pow(Math.abs(point2.x - point1.x), 2);
    }
    public double perimeter() {
        return 4*Math.abs(point2.x - point1.x);
    }

    public void draw() {
        System.out.println("Фигура: Квадрат");
        System.out.println("Цвет: Черный");
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
    }

    public void draw(Color color) {
        System.out.println("Фигура: Квадрат");
        System.out.println("Цвет: " + color.getColor());
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
    }
}
