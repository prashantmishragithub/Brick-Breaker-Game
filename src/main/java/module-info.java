module com.example.brick_breaker_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brick_breaker_game to javafx.fxml;
    exports com.example.brick_breaker_game;
}