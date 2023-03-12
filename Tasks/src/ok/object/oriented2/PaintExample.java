package ok.object.oriented2;

public class PaintExample {
    public static void main(String[] arg) {
        Point pt1 = new Point(-10, 2);
        Point pt2 = new Point(5, 0);
        Point pt3 = new Point(-5, -10);

        Circle circle = new Circle(pt1, pt2);
        Rectangle rectangle = new Rectangle(pt1, pt2);
        Square square = new Square(pt2, pt3);
        Triangle triangle = new Triangle(pt1, pt2, pt3);

        // Круг
        FigureUtil.draw(circle);
        System.out.println("> Площадь: " + FigureUtil.area(circle));
        System.out.println("> Периметр: " + FigureUtil.perimeter(circle));
        FigureUtil.draw(circle, Color.Blue);
        System.out.println();

        // Прямоугольник
        FigureUtil.draw(rectangle);
        System.out.println("> Площадь: " + FigureUtil.area(rectangle));
        System.out.println("> Периметр: " + FigureUtil.perimeter(rectangle));
        FigureUtil.draw(rectangle, Color.Red);
        System.out.println();

        // Квадрат
        FigureUtil.draw(square);
        System.out.println("> Площадь: " + FigureUtil.area(square));
        System.out.println("> Периметр: " + FigureUtil.perimeter(square));
        FigureUtil.draw(square, Color.Orange);
        System.out.println();

        // Треугольник
        FigureUtil.draw(triangle);
        System.out.println("> Площадь: " + FigureUtil.area(triangle));
        System.out.println("> Периметр: " + FigureUtil.perimeter(triangle));
        FigureUtil.draw(triangle, Color.Violet);
        System.out.println();
    }
}