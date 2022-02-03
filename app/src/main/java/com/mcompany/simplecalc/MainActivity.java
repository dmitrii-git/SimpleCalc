package com.mcompany.simplecalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListParcelable listParcelable = new ListParcelable();


    private TextView text;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button buttonC;
    private Button buttonDell;
    private Button buttonPercent;
    private Button buttonDivide;
    private Button buttonMultiplication;
    private Button buttonMinus;
    private Button buttonPlus;
    private Button buttonEquals;
    private Button buttonPoint;


    private List list = new ArrayList();
    private String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getSupportActionBar().hide();
        setListeners();
    }

    private void setListeners() {
        button_0.setOnClickListener(listener);
        button_1.setOnClickListener(listener);
        button_2.setOnClickListener(listener);
        button_3.setOnClickListener(listener);
        button_4.setOnClickListener(listener);
        button_5.setOnClickListener(listener);
        button_6.setOnClickListener(listener);
        button_7.setOnClickListener(listener);
        button_8.setOnClickListener(listener);
        button_9.setOnClickListener(listener);
        buttonC.setOnClickListener(listener);
        buttonDell.setOnClickListener(listener);
        buttonDivide.setOnClickListener(listener);
        buttonEquals.setOnClickListener(listener);
        buttonMinus.setOnClickListener(listener);
        buttonMultiplication.setOnClickListener(listener);
        buttonPercent.setOnClickListener(listener);
        buttonPlus.setOnClickListener(listener);
        buttonPoint.setOnClickListener(listener);

    }

    private void initView() {
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        buttonC = findViewById(R.id.buttonC);
        buttonDell = findViewById(R.id.buttonDel);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonPoint = findViewById(R.id.buttonPoint);

        text = findViewById(R.id.text);

    }


    View.OnClickListener listener = new View.OnClickListener() {


        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case (R.id.button_0): {
                    if (listParcelable.getSize() > 0) {
                        listParcelable.adResult((String) button_0.getText());
                        result = TextUtils.join("", listParcelable.getResult());
                        text.setText(result);
                    }
                    break;

                }
                case (R.id.button_1): {
                    listParcelable.adResult((String) button_1.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_2): {
                    listParcelable.adResult((String) button_2.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_3): {
                    listParcelable.adResult((String) button_3.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_4): {
                    listParcelable.adResult((String) button_4.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_5): {
                    listParcelable.adResult((String) button_5.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_6): {
                    listParcelable.adResult((String) button_6.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_7): {
                    listParcelable.adResult((String) button_7.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_8): {
                    listParcelable.adResult((String) button_8.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_9): {
                    listParcelable.adResult((String) button_9.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.buttonC): {
                    listParcelable.clearResult();
                    text.setText("");
                    break;
                }
                case (R.id.buttonDel): {
                    listParcelable.removeResult();
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.buttonDivide): {
                    if (listParcelable.getSize() > 0) {
                    listParcelable.adResult((String) buttonDivide.getText());
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    }
                    break;
                }
                case (R.id.buttonMinus): {
                    if (listParcelable.getSize() > 0) {
                        listParcelable.adResult((String) buttonMinus.getText());
                        result = TextUtils.join("", listParcelable.getResult());
                        text.setText(result);
                    }
                    break;
                }
                case (R.id.buttonMultiplication): {
                    if (listParcelable.getSize() > 0) {
                        listParcelable.adResult((String) buttonMultiplication.getText());
                        result = TextUtils.join("", listParcelable.getResult());
                        text.setText(result);
                    }
                    break;
                }
                case (R.id.buttonPercent): {
                    if (listParcelable.getSize() > 0) {
                        listParcelable.adResult((String) buttonPercent.getText());
                        result = TextUtils.join("", listParcelable.getResult());
                        text.setText(result);
                    }
                    break;
                }
                case (R.id.buttonPlus): {
                    if (listParcelable.getSize() > 0) {
                        listParcelable.adResult((String) buttonPlus.getText());
                        result = TextUtils.join("", listParcelable.getResult());
                        text.setText(result);
                    }
                    break;
                }
                case (R.id.buttonEquals): {
                    if (listParcelable.getSize() > 0) {
                        listParcelable.adResult((String) buttonEquals.getText());
                        result = TextUtils.join("", listParcelable.getResult());
                        text.setText(result);
                    }
                    break;
                }
                case (R.id.buttonPoint): {
                    if (listParcelable.getSize() > 0) {
                        listParcelable.adResult((String) buttonPoint.getText());
                        result = TextUtils.join("", listParcelable.getResult());
                        text.setText(result);
                    }
                    break;
                }




            }

        }

    };

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("listParcelable", listParcelable);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        listParcelable = savedInstanceState.getParcelable("listParcelable");
        result = TextUtils.join("", listParcelable.getResult());
        text.setText(result);
    }
}




