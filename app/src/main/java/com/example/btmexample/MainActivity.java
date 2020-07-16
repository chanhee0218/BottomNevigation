package com.example.btmexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private FragmentManager fm = getSupportFragmentManager();
    private BigFragment bigFragment=new BigFragment();
    private DabongYechanFragment dabongYechanFragment=new DabongYechanFragment();
    private LoveFragment loveFragment=new LoveFragment();
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.TextView);
        //잘봐라 프래그먼트 만드는 방법임
        // 깃 줬잖아...

        bottomNavigationView=findViewById(R.id.bottom_navigation_view);
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment,bigFragment).commitAllowingStateLoss();

            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.first:{
                            FragmentTransaction transaction = fm.beginTransaction();
                            transaction.replace(R.id.fragment, bigFragment).commitAllowingStateLoss();
                            // 이거 지워바 ㅋㅋ 이뭔 병 ~신 같은 경우냐
                            break;
                        }
                        case R.id.second:{
                            FragmentTransaction transaction = fm.beginTransaction();
                            transaction.replace(R.id.fragment,dabongYechanFragment).commitAllowingStateLoss();

                            break;
                        }
                        case R.id.third:{
                            FragmentTransaction transaction = fm.beginTransaction();
                            transaction.replace(R.id.fragment, loveFragment).commitAllowingStateLoss();

                            break;
                        }
                    }
                    return true;
                }
            });
            //
    }
}
