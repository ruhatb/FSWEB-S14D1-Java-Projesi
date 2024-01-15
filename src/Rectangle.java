public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        // Constructordan gelen değerleri sınıfın özelliklerine atama
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        // Genişlik negatifse 0.0 olarak ayarlama
        if (width < 0.0) {
            width = 0.0;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        // Uzunluk negatifse 0.0 olarak ayarlama
        if (length < 0.0) {
            length = 0.0;
        }
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
}