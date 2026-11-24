package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class t4i extends View implements e5i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33320a;
    public boolean b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final int f;
    public final int g;
    public int h;
    public i5i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4i(Context context) {
        super(context, null, 0);
        context.getClass();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.c = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.d = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        this.e = paint3;
        this.f = getResources().getDimensionPixelSize(R.dimen.size_2);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.i = i5i.BASIC;
    }

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        i5i.f14193a.getClass();
        i5i i5iVarC = kud.c(typedArray);
        this.i = i5iVarC;
        int iOrdinal = i5iVarC.ordinal();
        Paint paint = this.e;
        Paint paint2 = this.d;
        Paint paint3 = this.c;
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            paint3.setColor(m5d.b(R.attr.uikitSecondary40, context));
            Context context2 = getContext();
            context2.getClass();
            paint2.setColor(m5d.b(R.attr.uikitPrimary, context2));
            Context context3 = getContext();
            context3.getClass();
            paint.setColor(m5d.b(R.attr.uikitWarning, context3));
            this.h = 0;
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        Context context4 = getContext();
        context4.getClass();
        paint3.setColor(m5d.b(R.attr.uikitInputBackground60, context4));
        Context context5 = getContext();
        context5.getClass();
        paint2.setColor(m5d.b(R.attr.uikitInputBackground60, context5));
        Context context6 = getContext();
        context6.getClass();
        paint.setColor(m5d.b(R.attr.uikitWarningTint, context6));
        this.h = getResources().getDimensionPixelSize(R.dimen.radius_10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f33320a) {
            paint = this.e;
        } else {
            paint = this.b ? this.d : this.c;
        }
        Paint paint2 = paint;
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0) {
            canvas.drawRect(0.0f, getMeasuredHeight() - (this.b ? this.f : this.g), getMeasuredWidth(), getMeasuredHeight(), paint2);
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        int i = this.h;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i, i, paint2);
    }
}
