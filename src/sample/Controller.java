package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Pane btnsArea;

    @FXML
    private Pane actionArea;

    @FXML
    private LineChart<Number, Number> chartView;

    private Chart chart;

    private View view;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();
        chartView = new LineChart<>(x, y);
        chart = new Chart();
        chart.addPoint(0);
        chart.addPoint(1);
        chart.addPoint(2);
        chart.addPoint(6);
        view = new View(chartView);
        view.setChart(chart);
        view.update();
    }
}
