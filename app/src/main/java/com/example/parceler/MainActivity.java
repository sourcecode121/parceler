package com.example.parceler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.parceler.model.User;

import org.parceler.Parcels;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    private User user;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User(1, "First", "Last", 40);

        intent = NewActivity.newIntent(MainActivity.this);
        intent.putExtra("Info", Parcels.wrap(user));

        Button button = (Button) findViewById(R.id.button_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
