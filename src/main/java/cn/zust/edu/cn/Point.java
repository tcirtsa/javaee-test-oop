package cn.zust.edu.cn;
/**
 * 
 * @author czg
 * @since 2023/3/7 10:50
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
