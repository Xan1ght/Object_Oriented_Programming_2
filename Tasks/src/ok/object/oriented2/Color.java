package ok.object.oriented2;

public enum Color {
    Red("Красный"),
    Blue("Синий"),
    Orange("Оранжевый"),
    Yellow("Желтый"),
    Violet("Фиолетовый");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}