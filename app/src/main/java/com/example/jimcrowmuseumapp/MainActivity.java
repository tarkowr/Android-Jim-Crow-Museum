package com.example.jimcrowmuseumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLaunchExhibits(View view){
        finish();
        startActivity(new Intent(MainActivity.this, ItemListActivity.class));
    }

    public void onClickLearnMore(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ferris.edu/HTMLS/news/jimcrow/")));
    }
}
