package com.minminaya.materialdesigndemo.bottom_sheet;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.minminaya.materialdesigndemo.R;

public class BottomSheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);

        LinearLayout bottomSheetViewgroup = (LinearLayout) findViewById(R.id.bottom_content);
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetViewgroup);

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }
}
