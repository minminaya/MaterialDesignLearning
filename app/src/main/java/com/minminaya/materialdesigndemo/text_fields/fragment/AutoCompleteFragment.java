package com.minminaya.materialdesigndemo.text_fields.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.minminaya.materialdesigndemo.App;
import com.minminaya.materialdesigndemo.R;
import com.minminaya.materialdesigndemo.text_fields.auto_complete.AutoCompleteDogsAdapter;
import com.minminaya.materialdesigndemo.text_fields.auto_complete.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutoCompleteFragment extends Fragment {


    @BindView(R.id.auto_complete_text_default)
    AutoCompleteTextView autoCompleteTextDedault;

    @BindView(R.id.auto_complete_text)
    AutoCompleteTextView autoCompleteText;

    @BindView(R.id.auto_complete_text_custom)
    AutoCompleteTextView autoCompleteTextCustom;
    Unbinder unbinder;


    private List<Dog> dogs = new ArrayList<>();
    private AutoCompleteDogsAdapter autoCompleteDogsAdapter;

    public AutoCompleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_auto_complete, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int layoutItemId = android.R.layout.simple_dropdown_item_1line;
        String[] dogArr = getResources().getStringArray(R.array.dog_list);
        List<String> dogList = Arrays.asList(dogArr);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(App.getINSTANCE(), layoutItemId, dogList);

        autoCompleteText.setAdapter(adapter);
        autoCompleteTextDedault.setAdapter(adapter);



        //自定义的AutoCompleteTextView
        dogs.add(new Dog("Bichon Frise", R.mipmap.ic_launcher));
        dogs.add(new Dog("Bichon Frise1", R.mipmap.ic_launcher));
        dogs.add(new Dog("Bichon Frise2", R.mipmap.ic_launcher));
        dogs.add(new Dog("Bichon Frise3", R.mipmap.ic_launcher));

        autoCompleteDogsAdapter = new AutoCompleteDogsAdapter(App.getINSTANCE(), dogs);
        autoCompleteTextCustom.setAdapter(autoCompleteDogsAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
