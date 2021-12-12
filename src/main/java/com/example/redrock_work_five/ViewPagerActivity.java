package com.example.redrock_work_five;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    private final ArrayList<String> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        //初始化假数据
        data.add("测试页面1");//#Color_0
        data.add("测试页面2");//1
        data.add("测试页面3");//2
        data.add("测试页面4");//3

        ViewPager2 viewPager = findViewById(R.id.view_pager);

        viewPager.setAdapter(new PagerAdapter(data));

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                System.out.println( position );

                if ( position == 0 )
                    viewPager.setBackgroundColor( getResources().getColor( R.color.orange ) );
                if ( position == 1 )
                    viewPager.setBackgroundColor( getResources().getColor( R.color.aqua ) );
                if ( position == 2 )
                    viewPager.setBackgroundColor( getResources().getColor( R.color.yellow ) );
                if ( position == 3 )
                    viewPager.setBackgroundColor( getResources().getColor( R.color.bule ) );


            }
        });

        getSupportActionBar().hide();


    }
}