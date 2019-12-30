package com.justin.atm2019;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){
        EditText editUsername =findViewById(R.id.username);
        EditText editPassword =findViewById(R.id.password);
        String username =editUsername.getText().toString();
        String password =editPassword.getText().toString();
        if ("Justin".equals(username)&&"1234".equals(password)){
            setResult(RESULT_OK);
            finish();
        }else
            new AlertDialog.Builder(this)
                    .setTitle("failed")
                    .setMessage("wrong")
                    .setPositiveButton("ok",null)
                    .show();

    }
}
