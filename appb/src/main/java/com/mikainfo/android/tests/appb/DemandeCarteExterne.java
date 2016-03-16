package com.mikainfo.android.tests.appb;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DemandeCarteExterne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demande_carte_externe);

        Intent intent = getIntent();
        String textToShow = intent.getStringExtra("TEXTTOSHOW");

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(textToShow);


        Button send = (Button) findViewById(R.id.button);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent output = new Intent();
                output.putExtra("VALEUR_DE_RETOUR", "CA MARCHE");
                setResult(RESULT_OK, output);
                finish();

            }
        });


    }
}
