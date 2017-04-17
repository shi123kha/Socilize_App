package com.example.artivatic.socilize;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.socialize.ActionBarUtils;
import com.socialize.Socialize;
import com.socialize.entity.Entity;
import com.socialize.ui.actionbar.ActionBarOptions;

/**
 * Created by artivatic on 9/4/17.
 */

public class DetailScreen extends Activity {
    TextView tv_detail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Socialize.onCreate(this, savedInstanceState);

        // Your entity key. May be passed as a Bundle parameter to your activity
        String entityKey = "FirstView";


        Entity entity = Entity.newInstance(entityKey, "Socialize");
        // Create an options instance to specify your theme
        ActionBarOptions options = new ActionBarOptions();
        // Set the colors for the Action Bar
        options.setStrokeColor(Color.parseColor("#591100")); // The line between the buttons
        options.setAccentColor(Color.parseColor("#ffa229")); // The accent line below the buttons
        options.setFillColor(Color.parseColor("#831400")); // The main color of the buttons
        options.setBackgroundColor(Color.parseColor("#591100")); // The background color seen on the left
        options.setHighlightColor(Color.parseColor("#b05e08")); // The thin highlight line above the buttons
        options.setTextColor(Color.parseColor("#ffba00")); // The text color for all buttons

        // Wrap your existing view with the action bar.
        // your_layout refers to the resource ID of your current layout.
        android.view.View actionBarWrapped = ActionBarUtils.showActionBar(this,
                R.layout.detail, entity, options);

        // Now set the view for your activity to be the wrapped view.
        setContentView(actionBarWrapped);


       // setContentView(R.layout.detail);
        tv_detail=(TextView)findViewById(R.id.detail);
        Bundle bundle = getIntent().getExtras();
        String describe =bundle.getString("describe");
        Log.e("describeee",""+describe);
        tv_detail.setText(describe);
    }
    @Override
    protected void onPause() {
        super.onPause();

        // Call Socialize in onPause
        Socialize.onPause(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Call Socialize in onResume
        Socialize.onResume(this);
    }

    @Override
    protected void onDestroy() {
        // Call Socialize in onDestroy before the activity is destroyed
        Socialize.onDestroy(this);

        super.onDestroy();
    }
}
