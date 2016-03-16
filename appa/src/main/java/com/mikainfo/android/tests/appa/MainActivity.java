package com.mikainfo.android.tests.appa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button send = (Button) findViewById(R.id.button);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent askB = new Intent("com.mikainfo.android.tests.appb.DemandeCarteExterne");

                Bundle args = new Bundle();
                args.putString("TEXTTOSHOW", "it works");;
                askB.putExtras(args);
                startActivityForResult(askB, 1);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 1) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // The user picked a contact.
                // The Intent's data Uri identifies which contact was selected.

                // Do something with the contact here (bigger example below)
                String textToShow = data.getStringExtra("VALEUR_DE_RETOUR");

                TextView tv = (TextView) findViewById(R.id.textView2);
                tv.setText(textToShow);
            }

        }
    }


}
