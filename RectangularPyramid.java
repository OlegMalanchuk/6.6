public class RectangularPyramid {
    double side_a;

    double side_h;

    public RectangularPyramid(double side_a,  double side_h) {
        this.side_a = side_a;

        this.side_h = side_h;
    }
    public RectangularPyramid(){
    }

    public double areaRectangularPyramid(double side_a,  double side_h) {
        double per = (side_a + side_a) * 2;
        System.out.println(per);
        double areaBaza = side_a * side_a;
        System.out.println(areaBaza);
        double half_side_b = side_a / 2;
        double apotheme1 = Math.sqrt((Math.pow(side_h, 2)) + Math.pow(half_side_b, 2));
        System.out.println(apotheme1);
        double areaLateral = per * 0.5 * apotheme1;
        System.out.println(areaLateral);
        return  areaLateral+areaBaza;
    }

    public  void volumeRectangularPyramid(double side_a,  double side_h){
        double areaBaza = side_a * side_a;
        double volume = areaBaza *side_h*1/3;
        System.out.println("обєм = "+volume);
    }
    public double areaRectangularPyramid() {
        double per = (side_a + side_a) * 2;
        System.out.println(per);
        double areaBaza = side_a * side_a;
        System.out.println(areaBaza);
        double half_side_b = side_a / 2;
        double apotheme1 = Math.sqrt((Math.pow(side_h, 2)) + Math.pow(half_side_b, 2));
        System.out.println(apotheme1);
        double areaLateral = per * 0.5 * apotheme1;
        System.out.println(areaLateral);
        return  areaLateral+areaBaza;
    }

    public  void volumeRectangularPyramid(){
        double areaBaza = side_a * side_a;
        double volume = areaBaza *side_h*1/3;
        System.out.println("обєм = "+volume);
    }

}
