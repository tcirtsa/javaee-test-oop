package cn.zust.edu.cn;
/**
 * 
 * @author tcirtsa
 * @since 2024/3/6
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
