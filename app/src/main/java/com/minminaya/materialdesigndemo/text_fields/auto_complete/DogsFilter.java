package com.minminaya.materialdesigndemo.text_fields.auto_complete;

import android.widget.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niwa on 2017/8/13.
 */

public class DogsFilter extends Filter {
    AutoCompleteDogsAdapter adapter;

    List<Dog> originalList;
    List<Dog> filteredList;

    public DogsFilter(AutoCompleteDogsAdapter adapter, List<Dog> originalList) {
        super();
        this.adapter = adapter;
        this.originalList = originalList;
        this.filteredList = new ArrayList<>();
    }
    /**
     * 处理数据
     * */
    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        filteredList.clear();


        FilterResults results = new FilterResults();
        if (constraint == null || constraint.length() == 0) {
            filteredList.addAll(originalList);
        } else {
            String filterPattern = constraint.toString().toLowerCase().trim();
            // Your filtering logic goes in here
            for (Dog dog :
                    originalList) {
                if (dog.getName().toLowerCase().contains(filterPattern)) {
                    filteredList.add(dog);
                }
            }
        }

        results.values = filteredList;
        results.count = filteredList.size();

        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapter.filteredDogs.clear();
        adapter.filteredDogs.addAll((List)results.values);
        adapter.notifyDataSetChanged();
    }
}
