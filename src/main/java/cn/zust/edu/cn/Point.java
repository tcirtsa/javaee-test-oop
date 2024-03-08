package cn.zust.edu.cn;
/**
 * 
 * @author tcirtsa
<<<<<<< HEAD
 * @since 2024/3/8
=======
 * @since 2024/3/6
>>>>>>> fe75bb91022c77da5c890097b4cfe5d10a7fceac
 */
public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0, 0);
    }
    public Point(Point p){
        this(p.x, p.y);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
