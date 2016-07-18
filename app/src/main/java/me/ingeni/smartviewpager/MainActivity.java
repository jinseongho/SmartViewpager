package me.ingeni.smartviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SmartViewPager smartViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartViewPager = (SmartViewPager) findViewById(R.id.smart_view_pager);
    }
}
