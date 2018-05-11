package com.example.android.tablayout;

import android.support.design.widget.TabLayout;
import com.example.android.tablayout.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager simpleViewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleViewPager = (ViewPager) findViewById(R.id.simpleViewPager);
        tabLayout = (TabLayout) findViewById(R.id.simpleTabLayout);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        simpleViewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(simpleViewPager);
    }
}
