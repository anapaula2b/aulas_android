package br.edu.ifpb.appanap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class contatosActivity extends AppCompatActivity {
    private ImageButton email1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);

        this.email1 = (ImageButton) findViewById(R.id.email1);



    }
}