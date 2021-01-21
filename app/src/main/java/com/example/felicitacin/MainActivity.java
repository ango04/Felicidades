package com.example.felicitacin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"Miraculous&Christmas.ttf");//cojo la fuente
        TextView titulo = findViewById(R.id.titulo);//cojo la etiqueta
        titulo.setTypeface(miFuente);//le digo a la etiqueta que utilice esa fuente

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();
    }
}