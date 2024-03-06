package cn.zust.edu.cn;
/**
 * 
 * @author tcirtsa
 * @since 2024/3/6
 */
public class Rectangle implements IShape {
    Point ptTopLeft;
    Point ptTopRight;
    int width;
    int height;
    public Rectangle(){
        ptTopLeft = new Point();
        ptTopRight = new Point();
        width = 0;
        height = 0;
    }
    public Rectangle(Point topleft,int hight,int width){
        ptTopLeft = topleft;
        ptTopRight = new Point(topleft.getX()+width,topleft.getY()+hight);
        this.width = width;
        this.height = hight;
    }
    public double perimeter(){
        return 2*(width+height);
    }
    public double area(){
        return width*height;
    }
    public void draw(){
        System.out.println("绘制矩形");
        System.out.println("左上角坐标("+ptTopLeft.getX()+","+ptTopLeft.getY()+")");
        System.out.println("右下角坐标("+ptTopRight.getX()+","+ptTopRight.getY()+")");
        System.out.println("宽度:"+width+" 高度:"+height);
        System.out.println("周长:"+perimeter()+" 面积:"+area());
        System.out.println();
    }
}
