package com.example.darkshadow.cprogrammingtutorial;

import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;

/**
 * Created by darkshadow on 3/20/18.
 */

public class switchview {
    ScrollView tutorialview;
    ListView chapterlistview;
    public void sView(int viewNo){
        if(viewNo==0){
            tutorialview.setVisibility(View.VISIBLE);
            chapterlistview.setVisibility(View.GONE);
        }
        else {
            tutorialview.setVisibility(View.GONE);
            chapterlistview.setVisibility(View.VISIBLE);
        }
        //return viewNo;
    }
}

