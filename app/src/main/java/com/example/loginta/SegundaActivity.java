package com.example.loginta;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Usuario;

public class SegundaActivity extends AppCompatActivity {

    TextView tvLogin, tvSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);
        tvLogin = (TextView) findViewById(R.id.lblLogIn);
        tvSenha = (TextView) findViewById(R.id.lblSenha);
        Bundle dados = getIntent().getExtras();

        //String loginUsuario, senhaUsuario;
        //loginUsuario = dados.getString("login");
        //senhaUsuario = dados.getString("senha");

        Usuario usuario = (Usuario) dados.getSerializable("nomeObjeto");
        tvLogin.setText(usuario.getLogin());
        tvSenha.setText(usuario.getSenha());
    }
}