package com.example.environmentalimpactcalc;

import com.example.environmentalimpactcalc.data.Questions;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller {
    private int questionIndex;
    private Questions[] allQuestions;


    @FXML
    private Label questionText, sliderValue;

    @FXML
    private Slider slider;


    @FXML
    protected void nextQuestion() {
        if (questionIndex >= allQuestions.length) return;
        questionText.setText(allQuestions[questionIndex].getQuestion());
        questionIndex++;
        slider.valueProperty().setValue(1);
    }

    public void initialize() {
        this.questionIndex = 0;
        allQuestions = Questions.values();
        questionText.setText(allQuestions[questionIndex].getQuestion());
        questionIndex++;
        sliderValue.textProperty().bind(slider.valueProperty().asString("%.0f"));
    }
}
