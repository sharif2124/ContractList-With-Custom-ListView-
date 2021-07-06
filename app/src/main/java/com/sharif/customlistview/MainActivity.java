package com.sharif.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        Phone p1 = new Phone("Sharif","01981256456",R.drawable.ic_launcher_background);
        Phone p2 = new Phone("Arif","019812345",R.drawable.ic_launcher_background);
        Phone p3 = new Phone("Rahim","019866656",R.drawable.ic_launcher_background);
        Phone p4 = new Phone("Karim","01711256456",R.drawable.ic_launcher_background);
        Phone p5 = new Phone("Sakib","01671256456",R.drawable.ic_launcher_background);
        Phone p6 = new Phone("Mustafiz","0181256456",R.drawable.ic_launcher_background);
        Phone p7 = new Phone("Rubel","01481256456",R.drawable.ic_launcher_background);
        Phone p8 = new Phone("Aminul","01511256456",R.drawable.ic_launcher_background);
        Phone p9 = new Phone("Sojib","01715256456",R.drawable.ic_launcher_background);
        Phone p10 = new Phone("Habib","01303256456",R.drawable.ic_launcher_background);
        ArrayList<Phone> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
        arrayList.add(p6);
        arrayList.add(p7);
        arrayList.add(p8);
        arrayList.add(p9);
        arrayList.add(p10);

        Custom_Adapter custom_adapter = new Custom_Adapter(MainActivity.this,arrayList);
        lv.setAdapter(custom_adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayList.get(position).Name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}