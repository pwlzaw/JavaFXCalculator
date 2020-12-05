package edu.ib;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;


public class javaFXCalculatorControler {

    @FXML
    private TextField display;

    @FXML
    private Button C;

    @FXML
    private Button pm;

    @FXML
    private Button procent;

    @FXML
    private Button dzielenie;

    @FXML
    private Button siedem;

    @FXML
    private Button osiem;

    @FXML
    private Button dziewiec;

    @FXML
    private Button mnozenie;

    @FXML
    private Button cztery;

    @FXML
    private Button piec;

    @FXML
    private Button szesc;

    @FXML
    private Button odejmowanie;

    @FXML
    private Button jeden;

    @FXML
    private Button dwa;

    @FXML
    private Button trzy;

    @FXML
    private Button dodawanie;

    @FXML
    private Button zero;

    @FXML
    private Button kropka;

    @FXML
    private Button wynik;

    @FXML
    void onC(ActionEvent event) {
        display.setText("0");
    }

    @FXML
    void oncztery(ActionEvent event) {
        if (czyszczenie ==1 ) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("4");
        else
            display.setText(display.getText() + "4");
    }

    @FXML
    void ondodawanie(ActionEvent event) {
        display.setText(display.getText() + "+");
        czyszczenie=0;
    }

    @FXML
    void ondwa(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("2");
        else
            display.setText(display.getText() + "2");
    }

    @FXML
    void ondzielenie(ActionEvent event) {
        display.setText(display.getText() + "/");
        czyszczenie=0;
    }

    @FXML
    void ondziewiec(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("9");
        else
            display.setText(display.getText() + "9");
    }

    @FXML
    void onjeden(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("1");
        else
            display.setText(display.getText() + "1");
    }

    @FXML
    void onkropka(ActionEvent event) {
            display.setText(display.getText() + ".");
    }

    @FXML
    void onmnozenie(ActionEvent event) {
            display.setText(display.getText() + "*");
            czyszczenie=0;
    }

    @FXML
    void onodejmowanie(ActionEvent event) {
            display.setText(display.getText() + "-");
            czyszczenie=0;
    }

    @FXML
    void onosiem(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("8");
        else
            display.setText(display.getText() + "8");
    }

    @FXML
    void onpiec(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("5");
        else
            display.setText(display.getText() + "5");
    }

    @FXML
    void onpm(ActionEvent event) {
            if (display.getText(0,1).equals("-"))
                display.setText(display.getText(1,display.getLength()));
            else
                display.setText("-" + display.getText());
    }

    @FXML
    void onprocent(ActionEvent event) {
        display.setText(display.getText() + "%" );
    }

    @FXML
    void onsiedem(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("7");
        else
            display.setText(display.getText() + "7");
    }

    @FXML
    void onszesc(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("6");
        else
            display.setText(display.getText() + "6");
    }

    @FXML
    void ontrzy(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("3");
        else
            display.setText(display.getText() + "3");
    }

    @FXML
    void onwynik(ActionEvent event) {
        Function w= new Function("f(x)="+display.getText());
        Expression e1= new Expression("f(0)",w);
        display.setText(String.valueOf((e1.calculate())));
        czyszczenie =1;
    }

    @FXML
    void onzero(ActionEvent event) {
        if (czyszczenie ==1) {
            display.setText("0");
            czyszczenie=0;
        }
        if (display.getText().equals("0"))
            display.setText("0");
        else
            display.setText(display.getText() + "0");
    }
    double czyszczenie;
}
