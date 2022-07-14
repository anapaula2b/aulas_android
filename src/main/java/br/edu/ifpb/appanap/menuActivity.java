package br.edu.ifpb.appanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity {

    private Button redes;
    private Button contatos;
    private Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        this.redes = (Button) findViewById(R.id.redes);
        this.contatos = (Button) findViewById(R.id.contatos);
        this.email = (Button) findViewById(R.id.email);

        this.redes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu =
                        new Intent(menuActivity.this,
                                redesActivity.class);
                startActivity(menu);
            }


        });
        this.contatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu =
                        new Intent(menuActivity.this,
                                contatosActivity.class);
                startActivity(menu);
            }


        });
        this.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu =
                        new Intent(menuActivity.this,
                                emailActivity.class);
                startActivity(menu);
            }


        });
    }
}