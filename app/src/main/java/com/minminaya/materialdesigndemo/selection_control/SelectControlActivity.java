package com.minminaya.materialdesigndemo.selection_control;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.minminaya.materialdesigndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectControlActivity extends AppCompatActivity {

    @BindView(R.id.radio_btn)
    RadioButton radioBtn;
    @BindView(R.id.switch2)
    SwitchCompat switch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_control);
        ButterKnife.bind(this);
        radioBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
    }
}
