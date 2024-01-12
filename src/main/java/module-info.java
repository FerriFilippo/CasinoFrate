module com.example.casinofrate {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.casinofrate to javafx.fxml;
    exports com.example.casinofrate;
}