package ok.object.oriented2;

public class Triangle extends Figure implements Drawable {
    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double area() {
        return 0.5*Math.abs((point1.x - point3.x)*(point2.y - point3.y) - (point2.x - point3.x)*(point1.y - point3.y));
    }
    public double perimeter() {
        return Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2)) +
                Math.sqrt(Math.pow((point3.x - point1.x), 2) + Math.pow((point3.y - point1.y), 2)) +
                Math.sqrt(Math.pow((point3.x - point2.x), 2) + Math.pow((point3.y - point2.y), 2));
    }

    public void draw() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Цвет: Черный");
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
        System.out.println("Координаты точки 3: " + point3.x + ", " + point3.y);
    }

    public void draw(Color color) {
        System.out.println("Фигура: Треугольник");
        System.out.println("Цвет: " + color.getColor());
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
        System.out.println("Координаты точки 3: " + point3.x + ", " + point3.y);
    }
}
