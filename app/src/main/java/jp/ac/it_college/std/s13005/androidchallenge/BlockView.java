package jp.ac.it_college.std.s13005.androidchallenge;

import android.app.Notification;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

import java.util.Random;

public class BlockView extends View{
    public BlockView(Context context) {super(context);}

    Random random = new Random(System.currentTimeMillis());

    int[][][] blocks = {
            {
                    {1,1},
                    {0,1},
                    {0,1}
            },
            {
                    {1,1},
                    {1,0},
                    {1,0}
            },
            {
                    {1,1},
                    {1,1}
            },
            {
                    {1,0},
                    {1,1},
                    {1,0}
            },
            {
                    {1,0},
                    {1,1},
                    {0,1}
            },
            {
                    {0,1},
                    {1,1},
                    {1,0}
            },
            {
                    {1},
                    {1},
                    {1},
                    {1}
            }
    };

    int[][] block = blocks[random.nextInt(blocks.length)];
    int posx, posy;
    int mapWidth = 20;
    int mapHeight = 20;
    int[][] map = new int[mapHeight][];


/*
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        Rect rect = new Rect(50, 100, 150, 200);
        canvas.drawRect(rect, paint);

    }
*/
}

