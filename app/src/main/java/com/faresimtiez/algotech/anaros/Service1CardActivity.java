package com.faresimtiez.algotech.anaros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Service1CardActivity extends AppCompatActivity {
    Button rdv_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service1_card);

        rdv_btn=(Button)findViewById(R.id.btn_service1);
        rdv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Service1CardActivity.this, ClientRDVm2Activity.class);
                startActivity(i);
            }
        });


        /*mViewpager = (ViewPager)findViewById(R.id.viewpager);
        mContents = new ArrayList<>();

        int images[]={R.drawable.ss1,R.drawable.ss2,R.drawable.ss3,R.drawable.ss4,R.drawable.ss5};
        String names[]={"Soin basique 3500 35 min","Soin spécifique 4000 60 min","Soin jeunesse du regard. 35 min","Soin Osmoclean 40-45 min","Soin cocoon automne/hiver. 50 min"};
        String desc[]={"desc 1","desc 2","desc 3","desc 4","desc 5"};

        for (int i=0;i<images.length;i++){
            ViewPagerModelS1 viewPagerModelS1 = new ViewPagerModelS1();

            viewPagerModelS1.images=images[i];
            viewPagerModelS1.desc=names[i];
            viewPagerModelS1.desc=names[i];

            mContents.add(viewPagerModelS1);
        }

        mAdapter = new ViewPagerAdapterS1(mContents, this);
        mViewpager.setPageTransformer(true, new ViewPagerStack());
        mViewpager.setOffscreenPageLimit(4);

        mViewpager.setAdapter(mAdapter);*/
    }

    /*private class ViewPagerStack implements ViewPager.PageTransformer{

        @Override
        public void transformPage(@NonNull View page, float position) {
            if (position>=0){
                page.setScaleX(0.7f - 0.05f * position);
                page.setScaleY(0.7f);

                page.setTranslationX(-page.getWidth()*position);
                page.setTranslationX(-30*position);
            }
        }
    }*/
}
