package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;

public class Chart {

    private ObservableList<XYChart.Data<Double, Double>> points;

    public Chart() {
        points = FXCollections.observableArrayList();
    }

    public Chart(ObservableList<XYChart.Data<Double, Double>> points) {
        this.points = points;
    }

    public void addPoint(double x) {
        Point point = new Point(x, calculateY(x));
        points.add(point.getPoint());
    }

    public void deletePoint(int index) {
        points.remove(index);
    }

    public void editPoint(int index, double x) {
        points.get(index).setXValue(x);
        points.get(index).setYValue(calculateY(x));
    }

    private double calculateY(double x) {
        return x * x;
    }

    public ObservableList<XYChart.Data<Double, Double>> getPoints() {
        return points;
    }

    public void setPoints(ObservableList<XYChart.Data<Double, Double>> points) {
        this.points = points;
    }
}
