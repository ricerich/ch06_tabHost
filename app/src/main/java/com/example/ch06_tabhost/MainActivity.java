package com.example.ch06_tabhost;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tab1 = tabHost.newTabSpec("DOG").setIndicator("강아지");//메뉴 만들기
        tab1.setContent(R.id.tab1);//메뉴와 내용을 연결
        tabHost.addTab(tab1);

        TabSpec tab2 = tabHost.newTabSpec("CAT").setIndicator("고양이");//메뉴 만들기
        tab2.setContent(R.id.tab2);//메뉴와 내용을 연결
        tabHost.addTab(tab2);

        TabSpec tab3 = tabHost.newTabSpec("RABBIT").setIndicator("토끼");//메뉴 만들기
        tab3.setContent(R.id.tab3);//메뉴와 내용을 연결
        tabHost.addTab(tab3);

        TabSpec tab4 = tabHost.newTabSpec("HORSE").setIndicator("말");//메뉴 만들기
        tab4.setContent(R.id.tab4);//메뉴와 내용을 연결
        tabHost.addTab(tab4);

//        TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
//        tabSpecSong.setContent(R.id.tabSong);
//        tabHost.addTab(tabSpecSong);
//
//        TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
//        tabSpecArtist.setContent(R.id.tabArtist);
//        tabHost.addTab(tabSpecArtist);
//
//        TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
//        tabSpecAlbum.setContent(R.id.tabAlbum);
//        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(2);
    }
}
