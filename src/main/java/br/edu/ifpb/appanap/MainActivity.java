package br.edu.ifpb.appanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button comecar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.comecar = (Button) findViewById(R.id.comecar);

        this.comecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu =
                        new Intent(MainActivity.this,
                                menuActivity.class);
                startActivity(menu);
            }
        });

    }

}