package br.com.kaiquebr.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class Controller {
    @FXML
    private TextField visor;

    @FXML
    private Label visorHistorico;

    private double num1;
    private String operacao;

    @FXML
    public void clicarNumero (ActionEvent event){
        Button botao = (Button) event.getSource();

        visor.setText(visor.getText() + botao.getText());
    }

    @FXML
    public void clicarOperacao (ActionEvent event){
        Button botao = (Button) event.getSource();

        num1 = Double.parseDouble(visor.getText());
        operacao = botao.getText();
        visorHistorico.setText(visor.getText() + " " + operacao);
        visor.clear();
    }

    @FXML
    public void clicarPonto() {
        if (!visor.getText().contains(".")) {
            visor.setText(visor.getText() + ".");
        }
    }


    @FXML
    public void calcular (){
        double num2 = Double.parseDouble(visor.getText());
        double resultado = 0 ;

        switch(operacao){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        visorHistorico.setText(num1 + " " + operacao + " " + num2 + " =");
        visor.setText(String.valueOf(resultado));
    }

    @FXML
    public void limpa() {
        visor.clear();
        num1 = 0;
        operacao = " ";
    }
}
