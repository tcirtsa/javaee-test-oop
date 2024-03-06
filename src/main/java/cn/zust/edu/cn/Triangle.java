package cn.zust.edu.cn;

public class Triangle implements IShape {
    public Point ptA;
    public Point ptB;
    public Point ptC;

    double edgeA;
    double edgeB;
    double edgeC;

    public Triangle(Point ptA,Point ptB,Point ptC){
        this.ptA = ptA;
        this.ptB = ptB;
        this.ptC = ptC;
    }
    public double perimeter(){
        return edgeA+edgeB+edgeC;
    }
    public double area(){
        double p = perimeter()/2;
        return Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
    }
    public void draw(){
        System.out.println("绘制三角形");
        System.out.println("左上角坐标("+ptA.getX()+","+ptA.getY()+")");
        System.out.println("右上角坐标("+ptB.getX()+","+ptB.getY()+")");
        System.out.println("右下角坐标("+ptC.getX()+","+ptC.getY()+")");
        System.out.println("周长:"+perimeter());
        System.out.println("面积:"+area());
        System.out.println();
    }
}
