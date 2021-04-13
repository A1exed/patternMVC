package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class View {

    private LineChart<Double, Double> chartView;

    private ObservableList<XYChart.Series<Double, Double>> series;

    private Chart chart;

    public View(LineChart<Double, Double> chartView, Chart chart) {
        this.chartView = chartView;
        this.chart = chart;
        series = FXCollections.observableArrayList();
        series.add(new XYChart.Series<>(this.chart.getPoints()));
        series.get(0).setName("Y = X^2");
        this.chartView.setData(series);
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }
}
