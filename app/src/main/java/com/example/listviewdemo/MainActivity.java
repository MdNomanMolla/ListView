package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listViewId);

        String[]countryNames=getResources().getStringArray(R.array.country_list);

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(MainActivity.this,R.layout.sample,R.id.textViewId,countryNames);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name=listView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,name+" "+i, Toast.LENGTH_SHORT).show();
            }
        });




    }

}
