package jp.ac.it_college.std.s13005.androidchallenge;

import android.app.Notification;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by s13005 on 14/08/19.
 */
public class BlockView extends View{
    public BlockView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        Rect rect = new Rect(50, 100, 150, 200);
        canvas.drawRect(rect, paint);

    }

}

