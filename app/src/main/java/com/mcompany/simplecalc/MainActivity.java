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

        text = findViewById(R.id.text);

    }


    View.OnClickListener listener = new View.OnClickListener() {


        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case (R.id.button_0): {
                    listParcelable.adResult("0");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;

                }
                case (R.id.button_1): {
                    listParcelable.adResult("1");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_2): {
                    listParcelable.adResult("2");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_3): {
                    listParcelable.adResult("3");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_4): {
                    listParcelable.adResult("4");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_5): {
                    listParcelable.adResult("5");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_6): {
                    listParcelable.adResult("6");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_7): {
                    listParcelable.adResult("7");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_8): {
                    listParcelable.adResult("8");
                    result = TextUtils.join("", listParcelable.getResult());
                    text.setText(result);
                    break;
                }
                case (R.id.button_9): {
                    listParcelable.adResult("9");
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




