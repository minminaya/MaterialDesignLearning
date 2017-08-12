package com.minminaya.materialdesigndemo.selection_control;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.minminaya.materialdesigndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckBoxActivity extends AppCompatActivity {

    @BindView(R.id.checkbox_default)
    CheckBox checkboxDefault;
    @BindView(R.id.checkbox_custom)
    CheckBox checkboxCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        ButterKnife.bind(this);
        checkboxDefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d("CheckBoxActivity", "当前CheckBox状态:" + b);
            }
        });
    }

    @OnClick({R.id.checkbox_default, R.id.checkbox_custom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.checkbox_default:
                Log.d("CheckBoxActivity", "当前checkbox_default点击了" );
                break;
            case R.id.checkbox_custom:
                break;
        }
    }
}
