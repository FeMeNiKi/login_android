package com.example.loginta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Usuario;

public class MainActivity extends AppCompatActivity {

    EditText edtLogin, edtSenha;
    Button btnAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtLogin = (EditText) findViewById(R.id.txtLogIn);
        edtSenha = (EditText) findViewById(R.id.txtSenha);
        btnAcessar = (Button) findViewById(R.id.cmdAcessar);
        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                //intencao.putExtra("login", edtLogin.getText().toString());
                //intencao.putExtra("senha",edtSenha.getText().toString());
                Usuario usuario = new Usuario();
                usuario.setLogin(edtLogin.getText().toString());
                usuario.setSenha(edtSenha.getText().toString());
                intencao.putExtra("nomeObjeto", usuario);
                startActivity(intencao);
            }
        });
    }
}