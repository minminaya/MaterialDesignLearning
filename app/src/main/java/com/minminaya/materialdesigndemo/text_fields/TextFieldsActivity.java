package com.minminaya.materialdesigndemo.text_fields;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.blankj.utilcode.util.FragmentUtils;
import com.minminaya.materialdesigndemo.R;
import com.minminaya.materialdesigndemo.text_fields.fragment.AutoCompleteFragment;
import com.minminaya.materialdesigndemo.text_fields.fragment.FloatingLabelsFragment;
import com.minminaya.materialdesigndemo.text_fields.fragment.TextFieldsFrament;

public class TextFieldsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_fields);
        FragmentUtils.addFragment(getSupportFragmentManager(), new TextFieldsFrament(), R.id.text_fields_content);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.text_fields_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.floating_labels:
                FragmentUtils.removeAllFragments(getSupportFragmentManager());
                FragmentUtils.addFragment(getSupportFragmentManager(), new FloatingLabelsFragment(), R.id.text_fields_content);
                Log.d("TextFieldsActivity", "floating_labels");
                break;
            case R.id.auto_complete_text:
                FragmentUtils.removeAllFragments(getSupportFragmentManager());
                FragmentUtils.addFragment(getSupportFragmentManager(), new AutoCompleteFragment(), R.id.text_fields_content);
                break;
            case R.id.search_view:
                startActivity(new Intent(this, SearchActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
