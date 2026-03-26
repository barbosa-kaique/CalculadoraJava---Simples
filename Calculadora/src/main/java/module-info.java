module br.com.kaiquebr.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.jetbrains.annotations;


    opens br.com.kaiquebr.calculadora to javafx.fxml;
    exports br.com.kaiquebr.calculadora;
}