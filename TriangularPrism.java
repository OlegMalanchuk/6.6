public class TriangularPrism {
    public double side_a;
    public double side_b;
    public double side_c;
    public double side_h;

    public TriangularPrism(double side_a, double side_b, double side_c, double side_h){
        this.side_a =side_a;
        this.side_b =side_b;
        this.side_c =side_c;
        this.side_h =side_h;
    }
    public TriangularPrism(){}
    public double areaTriangularPrism(double side_a, double side_b, double side_c, double side_h){
        double p = (side_a+side_b+side_c)/2;//пів периметр
        System.out.println(p);
        double areaBaza =  Math.sqrt(p*((p - side_a)*(p-side_b)*(p-side_c)));//площа основи
        System.out.println(areaBaza);
        double areaLateral = (side_a+side_b+side_c)*side_h;// площа бічна
        return  areaLateral+(2*areaBaza);
    }
    public void volumeTriangularPrism(double side_a, double side_b, double side_c, double side_h){
        double p = (side_a+side_b+side_c)/2;//пів периметр
        double areaBaza =  Math.sqrt(p*((p - side_a)*(p-side_b)*(p-side_c)));//площа основи
        double volume = areaBaza *side_h;
        System.out.println("Обєм = "+volume);
    }
    public double areaTriangularPrism(){
        double p = (side_a+side_b+side_c)/2;//пів периметр
        System.out.println(p);
        double areaBaza =  Math.sqrt(p*((p - side_a)*(p-side_b)*(p-side_c)));//площа основи
        System.out.println(areaBaza);
        double areaLateral = (side_a+side_b+side_c)*side_h;// площа бічна
        return  areaLateral+(2*areaBaza);
    }
    public void volumeTriangularPrism(){
        double p = (side_a+side_b+side_c)/2;//пів периметр
        double areaBaza =  Math.sqrt(p*((p - side_a)*(p-side_b)*(p-side_c)));//площа основи
        double volume = areaBaza *side_h;
        System.out.println("Обєм = "+volume);
    }





}
