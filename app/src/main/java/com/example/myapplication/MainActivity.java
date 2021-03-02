package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button button; // on crée des objets de differents types qui sont dans le fichier XML
    private TextView mText;
    private EditText ed;
    int ValuetoGuess;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        ValuetoGuess = random.nextInt(50) + 100; // variable pour générer le nbre aléatoire
        mText = (TextView)findViewById(R.id.textView3); // on recupere le champ textview
        //button = (Button)findViewById(R.id.button);
        ed = (EditText)findViewById(R.id.editTextTextPersonName); // on recupere le champ Edit



        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(ed.getText().toString());
                if(val > ValuetoGuess)
                    mText.setText("Devinez plus bas");
                else if(val > ValuetoGuess)
                    mText.setText("Devinez plus haut");
                else
                    mText.setText("Felicitations !");
            }
        });*/
    }


    // pour cette methode , on ajoute dans le chammp id de button dans le fichier XML la valeur "testValeur" et on crée cette fonction

    public void testValeur(View v){
        int val = Integer.parseInt(ed.getText().toString()); // on recupere la saisie et on compare au nbre aleatoire généré
        if(val > ValuetoGuess)
            mText.setText("Devinez plus bas");
        else if(val < ValuetoGuess)
            mText.setText("Devinez plus haut");
        else if(val == ValuetoGuess)
            mText.setText("Felicitations !");
    }
}