package jp.ac.it_college.std.s13005.androidchallenge;

import android.app.Notification;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

import java.util.Random;

public class BlockView extends View {
    public BlockView(Context context) {
        super(context);
    }

    Random random = new Random(System.currentTimeMillis());

    int[][][] blocks = {
            {
                    {1, 1},
                    {0, 1},
                    {0, 1}
            },
            {
                    {1, 1},
                    {1, 0},
                    {1, 0}
            },
            {
                    {1, 1},
                    {1, 1}
            },
            {
                    {1, 0},
                    {1, 1},
                    {1, 0}
            },
            {
                    {1, 0},
                    {1, 1},
                    {0, 1}
            },
            {
                    {0, 1},
                    {1, 1},
                    {1, 0}
            },
            {
                    {1},
                    {1},
                    {1},
                    {1}
            }
    };

}