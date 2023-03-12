package ok.object.oriented2;

public class Circle extends Figure implements Drawable {
    public Circle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double area() {
        return Math.PI*Math.pow(Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2)), 2);
    }
    public double perimeter() {
        return Math.PI*2*Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
    }

    public void draw() {
        System.out.println("Фигура: Круг");
        System.out.println("Цвет: Черный");
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
    }

    public void draw(Color color) {
        System.out.println("Фигура: Круг");
        System.out.println("Цвет: " + color.getColor());
        System.out.println("Координаты точки 1: " + point1.x + ", " + point1.y);
        System.out.println("Координаты точки 2: " + point2.x + ", " + point2.y);
    }
}
