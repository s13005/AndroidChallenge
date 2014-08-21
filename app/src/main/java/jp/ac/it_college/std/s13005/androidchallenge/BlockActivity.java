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
public class BlockActivity extends View{
    public BlockActivity(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.argb(255, 255, 255, 255));

        Rect rect = new Rect(10, 20, 30, 40);
        canvas.drawRect(rect, paint);

        RectF rectF = new RectF(40.5f, 20.5f, 60.5f, 40.5f);
        canvas.drawRect(rectF, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(10, 50, 30, 80, paint);
        
    }
}
