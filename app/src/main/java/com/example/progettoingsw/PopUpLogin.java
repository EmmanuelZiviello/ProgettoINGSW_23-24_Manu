package com.example.progettoingsw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class PopUpLogin extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_login);



        MaterialButton bottoneAcquirente = (MaterialButton) findViewById(R.id.bottoneAcquirente);
        bottoneAcquirente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //PopUpLogin schermata_richiesta_login = new PopUpLogin();
                //schermata_richiesta_login.setVisible(true);
                Intent intent = new Intent(PopUpLogin.this, CampiFacoltativiRegistrazione.class);
                startActivity(intent);

            }
        });

    }

}
