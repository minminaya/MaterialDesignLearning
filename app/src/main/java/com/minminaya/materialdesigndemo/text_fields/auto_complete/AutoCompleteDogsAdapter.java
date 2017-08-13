package com.minminaya.materialdesigndemo.text_fields.auto_complete;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import com.minminaya.materialdesigndemo.App;
import com.minminaya.materialdesigndemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niwa on 2017/8/13.
 */

public class AutoCompleteDogsAdapter extends ArrayAdapter<Dog> {
    public List<Dog> dogs;
    public List<Dog> filteredDogs = new ArrayList<>();


    public AutoCompleteDogsAdapter(@NonNull Context context, List<Dog> objects) {
        super(context, 0, objects);
        this.dogs = objects;
    }

    @Override
    public int getCount() {
        return filteredDogs.size();
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return new DogsFilter(this, dogs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Dog dog = filteredDogs.get(position);

        View view = LayoutInflater.from(App.getINSTANCE()).inflate(R.layout.row_dogs, parent, false);

        TextView tv = (TextView) view.findViewById(R.id.text1);
        ImageView imageView = (ImageView) view.findViewById(R.id.img);

        tv.setText(dog.getName());
        imageView.setImageResource(dog.getDrawableRes());

        //可以在这里设置点击事件使AutoCompleteText界面更新
        return view;
    }

    @Nullable
    @Override
    public Dog getItem(int position) {
        return dogs.get(position);
    }


}
