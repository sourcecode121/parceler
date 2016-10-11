package com.example.parceler;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.parceler.model.User;

import org.parceler.Parcels;

/**
 * Created by Anand on 11/10/2016.
 */

public class NewActivity extends AppCompatActivity {

    private TextView userId;
    private TextView userFirstName;
    private TextView userLastName;
    private TextView userAge;

    public static Intent newIntent(Context context) {
        return new Intent(context, NewActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        User user = Parcels.unwrap(getIntent().getParcelableExtra("Info"));

        userId = (TextView) findViewById(R.id.user_id);
        userFirstName = (TextView) findViewById(R.id.user_first_name);
        userLastName = (TextView) findViewById(R.id.user_last_name);
        userAge = (TextView) findViewById(R.id.user_age);

        userId.setText(Integer.toString(user.getId()));
        userFirstName.setText(user.getFirstName());
        userLastName.setText(user.getLastName());
        userAge.setText(Integer.toString(user.getAge()));
    }
}
