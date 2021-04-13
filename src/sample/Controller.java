package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.awt.print.PrinterException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField input;

    @FXML
    private Button addBtn;

    @FXML
    private Button editBtn;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableView<XYChart.Data<Double, Double>> table;

    @FXML
    private TableColumn<XYChart.Data<Double, Double>, Double> x;

    @FXML
    private TableColumn<XYChart.Data<Double, Double>, Double> y;

    @FXML
    private Pane btnsArea;

    @FXML
    private Pane actionArea;

    @FXML
    private LineChart<Double, Double> chartView;

    private Chart chart;

    private View view;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chart = new Chart(table.getItems());
        x.setCellValueFactory(new PropertyValueFactory<>("XValue"));
        y.setCellValueFactory(new PropertyValueFactory<>("YValue"));
        chart.addPoint(0);
        chart.addPoint(1);
        chart.addPoint(2);
        chart.addPoint(6);
        view = new View(chartView, chart);
    }

    @FXML
    public void add() {
        try {
            if (!input.getText().equals("")) {
                chart.addPoint(Double.parseDouble(input.getText()));
            }
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setContentText("Некорректный ввод!");
            alert.show();
        }

    }

    @FXML
    public void edit() {
        try {
            if (table.getSelectionModel().getSelectedIndex() != -1 && !input.getText().equals("")) {
                chart.editPoint(table.getSelectionModel().getSelectedIndex(), Double.parseDouble(input.getText()));
            }
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setContentText("Некорректный ввод!");
            alert.show();
        }
    }

    @FXML
    public void delete() {
        try {
            if (table.getSelectionModel().getSelectedIndex() != -1) {
                chart.deletePoint(table.getSelectionModel().getSelectedIndex());
            }
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setContentText("Некорректный ввод!");
            alert.show();
        }

    }
}
