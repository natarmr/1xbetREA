package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class lrh0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20532a;
    public final int b;
    public final int c;
    public final Paint d;

    public lrh0(float f, int i, int i2, int i3) {
        this.f20532a = f;
        this.b = i2;
        this.c = i3;
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.d = paint;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        int iU = RecyclerView.U(view);
        int i = this.c;
        int i2 = this.b;
        if (iU == 0) {
            rect.set(i2, i2, i2, i / 2);
            return;
        }
        yge0 adapter = recyclerView.getAdapter();
        if (adapter != null && iU == adapter.d() - 1) {
            rect.set(i2, i / 2, i2, i2);
        } else {
            int i3 = i / 2;
            rect.set(i2, i3, i2, i3);
        }
    }

    @Override // a.fhe0
    public final void g(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        Canvas canvas2;
        canvas.getClass();
        the0Var.getClass();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            int iU = RecyclerView.U(childAt);
            float left = childAt.getLeft();
            float f = this.b;
            float f2 = left - f;
            float right = childAt.getRight() + f;
            float top = childAt.getTop() - f;
            int i2 = this.c;
            float f3 = top - (iU == 0 ? 0 : i2 / 2);
            float bottom = childAt.getBottom() + f;
            yge0 adapter = recyclerView.getAdapter();
            float f4 = bottom + ((adapter == null || iU != adapter.d() + (-1)) ? i2 / 2 : 0);
            float f5 = this.f20532a;
            Paint paint = this.d;
            if (iU == 0) {
                canvas.drawRoundRect(new RectF(f2, f3, right, f4), f5, f5, paint);
                canvas2 = canvas;
                canvas2.drawRect(f2, f3 + f5, right, f4, paint);
            } else {
                canvas2 = canvas;
                yge0 adapter2 = recyclerView.getAdapter();
                if (adapter2 == null || iU != adapter2.d() - 1) {
                    canvas2.drawRect(f2, f3, right, f4, paint);
                } else {
                    canvas2.drawRoundRect(new RectF(f2, f3, right, f4), f5, f5, paint);
                    canvas2.drawRect(f2, f3, right, f4 - f5, paint);
                }
            }
            i++;
            canvas = canvas2;
        }
    }
}
