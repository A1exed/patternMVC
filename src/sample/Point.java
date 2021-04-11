package sample;

import javafx.scene.chart.XYChart;

public class Point {

    private XYChart.Data<Double, Double> point;

    public Point() {
    }

    public Point(double x, double y) {
        point = new XYChart.Data<>(x, y);
    }

    public XYChart.Data<Double, Double> getPoint() {
        return point;
    }

    public void setPoint(XYChart.Data<Double, Double> point) {
        this.point = point;
    }
}
