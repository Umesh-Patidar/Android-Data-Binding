package com.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.databinding.adapter.VersionRecyclerViewAdapter;
import com.databinding.databinding.ActivityMainBinding;
import com.databinding.model.DataModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        populateData();
    }

    private void populateData() {
        ArrayList<DataModel> arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Cup Cake", "1.5", R.drawable.ic_cupcake));
        arrayList.add(new DataModel("Donut", "1.6", R.drawable.ic_donut ));
        arrayList.add(new DataModel("Eclair", "2.0", R.drawable.ic_eclaire));
        arrayList.add(new DataModel("Froyo", "2.2", R.drawable.ic_froyo ));
        arrayList.add(new DataModel("Gingerbread", "2.3", R.drawable.ic_gingerbird));
        arrayList.add(new DataModel("Honeycomb", "3.0", R.drawable.ic_honeycomb));
        arrayList.add(new DataModel("Ice Cream Sandwich", "4.0", R.drawable.ic_ice_cream));
        arrayList.add(new DataModel("Jelly Bean", "4.1", R.drawable.ic_jelly_bin));


        VersionRecyclerViewAdapter versionRecyclerViewAdapter = new VersionRecyclerViewAdapter(MainActivity.this, arrayList);
        activityMainBinding.setMyAdapter(versionRecyclerViewAdapter);
    }
}
