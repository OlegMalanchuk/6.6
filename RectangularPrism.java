public class RectangularPrism {
    public double side_a;
    public double side_b;
    public double side_h;

    public RectangularPrism(double side_a, double side_b, double side_h) {// конструктор
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_h = side_h;
    }


    public RectangularPrism() {
    }

    public void areaRectangularPrism(double side_a, double side_b, double side_h) {
        double area = 2 * ((side_a * side_b) + (side_a * side_h) + (side_b * side_h));
        System.out.println("Площа = " + area);
    }

    public double volumeRectangularPrism(double side_a, double side_b, double side_h) {

        return side_b * side_a * side_h;
    }

    public void areaRectangularPrism() {
        // нижні методи  якщо вввести у крнструкторі дані а в  подальшому в методі не потрібно вводити
        double area = 2 * ((side_a * side_b) + (side_a * side_h) + (side_b * side_h));
        System.out.println("Площа = " + area);
    }

    public double volumeRectangularPrism() {

        return side_b * side_a * side_h;
    }

//    public void areaRectangularPrism(int side_a, int side_b, int side_h) {
//        double area = 2 * ((side_a * side_b) + (side_a * side_h) + (side_b * side_h));
//        System.out.println("Площа = " + area);
//    }



}
