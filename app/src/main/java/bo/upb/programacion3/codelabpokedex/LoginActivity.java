package bo.upb.programacion3.codelabpokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import bo.upb.programacion3.codelabpokedex.ui.UserLogged;

public class LoginActivity extends AppCompatActivity {

    private Context context;
    private EditText usuario;
    private EditText contrasena;
    private Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.context = this;
        initUI();
        initEvents();


    }

    private void initUI() {
        this.usuario = findViewById(R.id.nombreUsuario);
        this.contrasena = findViewById(R.id.contrasenaUsuario);
        this.ingresar = findViewById(R.id.botonIngresar);
    }
    private void initEvents() {
        this.ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = usuario.getText().toString();
                String password = contrasena.getText().toString();


            }
        });
    }
    public void goToMain(View view){
       // UserLogged userLogged = (UserLogged) base.getData();
        String json = new Gson().toJson(userLogged);
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(String.valueOf(usuario), json);
        startActivity(intent);
    }

}
