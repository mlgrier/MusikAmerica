package com.mlgrier.musikamerica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most);

        Button genresBtn = (Button) findViewById(R.id.genresBtn);
        genresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MostActivity.this, GenresActivity.class);
                startActivity(genresIntent);

            }
        });
    }
}
