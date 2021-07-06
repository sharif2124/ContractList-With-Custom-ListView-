package com.sharif.customlistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class Custom_Adapter extends ArrayAdapter {
    private Context context;
    private ArrayList<Phone> arrayList;
    public Custom_Adapter(@NonNull Context context, ArrayList<Phone>arrayList) {
        super(context, R.layout.single_row,arrayList);
        this.context=context;
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView= inflater.inflate(R.layout.single_row,parent,false);

        TextView name = convertView.findViewById(R.id.name);
        TextView number = convertView.findViewById(R.id.number);
        ImageView imageView = convertView.findViewById(R.id.imageView3);

      name.setText(arrayList.get(position).Name.toString());
      number.setText(arrayList.get(position).PhoneNumber.toString());
     imageView.setImageResource(arrayList.get(position).Image);

        Log.e(TAG, "getView: GetVioew Called" );


        return convertView;
    }
}
