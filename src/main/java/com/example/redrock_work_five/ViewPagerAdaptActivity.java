package com.example.redrock_work_five;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.redrock_work_five.fragments.Fragement_One;
import com.example.redrock_work_five.fragments.Fragement_Two;
import com.example.redrock_work_five.fragments.Fragment_Four;
import com.example.redrock_work_five.fragments.Fragment_Three;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class ViewPagerAdaptActivity extends AppCompatActivity {

    private TabLayout tab;
    private ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_view_pager_fragment);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager_fragment);

        tab = findViewById( R.id.tab );

        getSupportActionBar().hide();

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add( new Fragement_One());
        fragments.add( new Fragement_Two());
        fragments.add( new Fragment_Three());
        fragments.add( new Fragment_Four());

        data.add("第一页");
        data.add("第二页");
        data.add("第三页");
        data.add("第四页");

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(this,fragments);

        viewPager2.setAdapter(adapter);

        viewPager2.setOffscreenPageLimit(1);

        new TabLayoutMediator(tab, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                tab.setText( data.get(position) );

            }
        }).attach();

    }

}
