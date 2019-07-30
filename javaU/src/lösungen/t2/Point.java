package lösungen.t2;

public class Point {
    private final int x;
    private final int y;
    public Point(int xPos, int yPos){
        x=xPos;
        y=yPos;
    }
    private Integer relativeXPositionTo(Point p){
        return Integer.compare(this.x, p.x);
    }
}