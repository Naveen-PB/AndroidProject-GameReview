package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.menuProfile){
            Intent a = new Intent(getApplicationContext(), Profile.class);
            startActivity(a);

        }
        if (itemId == R.id.about_us){
            Intent a = new Intent(getApplicationContext(), About.class);
            startActivity(a);

        }
        if (itemId == R.id.logout){
            Intent a = new Intent(getApplicationContext(), Register.class);
            startActivity(a);

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.options_menu, menu);

        return true;
    }

}