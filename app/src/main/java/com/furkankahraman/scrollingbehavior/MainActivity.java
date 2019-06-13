package com.furkankahraman.scrollingbehavior;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tab_layout = findViewById(R.id.tab_layout);
        final ViewPager viewpager = findViewById(R.id.viewpager);
        tab_layout.addTab(tab_layout.newTab().setText("1"));
        tab_layout.addTab(tab_layout.newTab().setText("2"));
        tab_layout.addTab(tab_layout.newTab().setText("3"));
        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {


                switch (tab.getPosition()) {
                    case 0:
                        Log.i("Log", "0");
                        viewpager.setBackgroundColor(Color.GREEN);
                        break; // optional

                    case 1:
                        Log.i("Log", "0");
                        viewpager.setBackgroundColor(Color.RED);
                        break; // optional

                    case 2:
                        Log.i("Log", "0");
                        viewpager.setBackgroundColor(Color.BLUE);
                        break; // optional

                    // You can have any number of case statements.
                    default: // Optional
                        // Statements
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
