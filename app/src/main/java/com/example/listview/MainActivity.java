package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String data[]={"Suman","Hariom","Kanhaiya","laxaman","Raushan","Rajnish","Tathastu","Amit","Shubham","Suman","Hariom","Kanhaiya","laxaman","Raushan","Rajnish","Tathastu","Amit","Shubham"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.Listview);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=(TextView)view;

                Toast.makeText(MainActivity.this,txt.getText().toString(),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
