package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class View {

    private LineChart<Number, Number> chartView;

    private Chart chart;

    public View(LineChart<Number, Number> chartView) {
        this.chartView = chartView;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public void update() {
        XYChart.Series series = new XYChart.Series();
        ObservableList<XYChart.Data> data = FXCollections.observableArrayList();
        for (Point point : chart.getPoints()) {
            data.add(new XYChart.Data(point.getX(), point.getY()));
        }
        series.setData(data);
        chartView.getData().clear();
        chartView.getData().add(series);
    }
}
