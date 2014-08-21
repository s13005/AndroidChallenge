package jp.ac.it_college.std.s13005.androidchallenge;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class GameActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.addView(new FrameActivity(this));


    }
}
