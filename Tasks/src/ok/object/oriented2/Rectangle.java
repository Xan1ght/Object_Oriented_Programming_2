package ok.object.oriented2;

public class Rectangle extends Figure implements Drawable {
    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double area() {
        return Math.abs(point2.x - point1.x)*Math.abs(point2.y - point1.y);
    }

    public double perimeter() {
        return 2*(Math.abs(point2.x - point1.x)+Math.abs(point2.y - point1.y));
    }

    public void draw() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Цвет: Черный");
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
    }

    public void draw(Color color) {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Цвет: " + color.getColor());
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
    }
}
