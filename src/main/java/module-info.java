module com.brightlauncher.brightlauncher {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                    requires org.kordamp.ikonli.javafx;
                    requires com.almasb.fxgl.all;
    
    opens com.brightlauncher.brightlauncher to javafx.fxml;
    exports com.brightlauncher.brightlauncher;
}