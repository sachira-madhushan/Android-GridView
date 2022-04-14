package com.error404.motivationalquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.error404.motivationalquotes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        int[] images={R.drawable.a,R.drawable.a,R.drawable.e,R.drawable.d,R.drawable.f,R.drawable.g,R.drawable.a,R.drawable.a,R.drawable.e,R.drawable.d,R.drawable.f};

        Adapter grid= new Adapter(MainActivity.this,images);
        bind.gridView.setAdapter(grid);

        bind.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"You clicked on "+images[i],Toast.LENGTH_LONG).show();
            }
        });



    }
}