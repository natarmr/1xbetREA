package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class kaj extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17965a;
    public final Paint b;
    public final Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kaj(Context context) {
        super(context, null, 0);
        context.getClass();
        int iB = m5d.b(R.attr.uikitSeparator, context);
        this.f17965a = getResources().getDimensionPixelSize(R.dimen.space_2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_6);
        int iB2 = m5d.b(R.attr.uikitBackgroundContent, context);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.space_1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(iB2);
        paint.setStyle(Paint.Style.FILL);
        float f = dimensionPixelSize3;
        paint.setStrokeWidth(f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.b = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(iB);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(f);
        paint2.setPathEffect(new DashPathEffect(new float[]{dimensionPixelSize, dimensionPixelSize2}, 0.0f));
        this.c = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float left = getLeft();
        int i = this.f17965a;
        float right = getRight() - i;
        canvas.drawLine(getLeft(), getTop(), getRight(), getTop(), this.b);
        canvas.drawLine(left + i, getTop(), right, getTop(), this.c);
    }
}
