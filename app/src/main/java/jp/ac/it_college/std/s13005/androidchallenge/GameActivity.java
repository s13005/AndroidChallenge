package jp.ac.it_college.std.s13005.androidchallenge;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.util.Log;
import android.widget.LinearLayout;

public class GameActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.addView(new BlockView(this));

    }

    public BlockView blockView(Context context){

        BlockView blockView = new BlockView(this);
        return blockView;
    }

}
