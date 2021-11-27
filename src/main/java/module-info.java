module sample.cg_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.cg_3 to javafx.fxml;
    exports sample.cg_3;
}