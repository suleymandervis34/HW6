package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView enter = findViewById(R.id.tv_enter);
        TextView welcom = findViewById(R.id.tv_welcom);
        TextView textView = findViewById(R.id.tv_text);
        EditText email =findViewById(R.id.et_email);
        EditText parol = findViewById(R.id.et_password);
        Button button = findViewById(R.id.btn_enter);
        TextView foggot = findViewById(R.id.tv_foggot);
        TextView text = findViewById(R.id.tv_press);

        parol.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);

        parol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length()>0){
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                }
                else {
                    button.setBackgroundColor(getResources().getColor(R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length()>0){
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                }
                else {
                    button.setBackgroundColor(getResources().getColor(R.color.gray));
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email2 = email.getText().toString();
                String parol2 = parol.getText().toString();

                if (email2.equals("admin")&&parol2.equals("admin")){
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистировались", Toast.LENGTH_SHORT).show();
                    welcom.setVisibility(View.VISIBLE);
                    enter.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    parol.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    foggot.setVisibility(View.GONE);
                    text.setVisibility(View.GONE);
                }
                else {
                    Toast.makeText(MainActivity.this,"не верный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}