package sample;

import java.util.ArrayList;
import java.util.List;

public class Chart {

    private List<Point> points;

    public Chart() {
        points = new ArrayList<>();
    }

    public Chart(List<Point> points) {
        this.points = points;
    }

    public void addPoint(double x) {
        points.add(new Point(x, calculateY(x)));
    }

    private double calculateY(double x) {
        return x * x;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
