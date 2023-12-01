package com.example.ademi_rakimbekova_hw6_2m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editMail, editPassword;
    private Button btnGo;
    private TextView vhod, welcome, register, forgotPassword, press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editMail = findViewById(R.id.mail);
        editPassword = findViewById(R.id.password);
        btnGo = findViewById(R.id.button);
        vhod = findViewById(R.id.textView);
        welcome = findViewById(R.id.welcome);
        register = findViewById(R.id.signin);
        forgotPassword = findViewById(R.id.forgot);
        press = findViewById(R.id.press);

        oneMethod();
        twoMETHOD();
    }
    private void oneMethod(){
        editMail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (editMail.getText().toString().isEmpty()){
                        btnGo.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                    }else {
                        btnGo.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        editPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (editPassword.getText().toString().isEmpty()){
                    btnGo.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else {
                    btnGo.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    private void twoMETHOD(){
        btnGo.setOnClickListener(view -> {
            if(editMail.getText().toString().equals("admin")&& editPassword.getText().toString().equals("admin")){
                btnGo.setVisibility(View.GONE);
                editPassword.setVisibility(View.GONE);
                editMail.setVisibility(View.GONE);
                vhod.setVisibility(View.GONE);
                forgotPassword.setVisibility(View.GONE);
                press.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Неверная почта или пароль.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}




