package com.example.triangulorectapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt_calc;
    private Button bt_limpiar;

    private EditText et_ady;
    private EditText et_opu;

    private TextView t_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_calc = findViewById(R.id.button_calc);
        bt_limpiar = findViewById(R.id.button_limpiar);

        et_ady = findViewById(R.id.editText_ady);
        et_opu = findViewById(R.id.editText_opu);

        t_result = findViewById(R.id.textView_result);

        bt_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(et_ady.getText().toString());
                int num2 = Integer.parseInt(et_opu.getText().toString());
                double hipo;
                hipo = Math.sqrt(Math.pow(num1,2)+Math.pow(num2,2));
                t_result.setText(String.valueOf(hipo));
            }
        });
   bt_limpiar.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           et_ady.setText("");
           et_opu.setText("");
           t_result.setText("");
       }
   });
    }
}