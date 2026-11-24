package org.xplatform.ui_core.viewcomponents.views;

import a.etd0;
import a.i7q;
import a.maz;
import a.n0o0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class RadialProgressView extends View {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47211a;
    public final float b;
    public long c;
    public float d;
    public float e;
    public boolean f;
    public float g;
    public final RectF h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    public RadialProgressView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47211a = 2000.0f;
        this.b = 500.0f;
        this.h = new RectF();
        this.i = maz.b(new etd0((byte) 2));
        this.j = maz.b(new etd0((byte) 3));
        this.k = maz.b(new i7q(context, (byte) 28));
        this.l = maz.b(new i7q(context, (byte) 29));
    }

    private final AccelerateInterpolator getAccelerateInterpolator() {
        return (AccelerateInterpolator) this.j.getValue();
    }

    private final DecelerateInterpolator getDecelerateInterpolator() {
        return (DecelerateInterpolator) this.i.getValue();
    }

    private final Paint getProgressPaint() {
        return (Paint) this.k.getValue();
    }

    private final int getSize() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int measuredWidth = (getMeasuredWidth() - getSize()) / 2;
        int measuredHeight = (getMeasuredHeight() - getSize()) / 2;
        float f = measuredWidth;
        float f2 = measuredHeight;
        float size = measuredWidth + getSize();
        float size2 = measuredHeight + getSize();
        RectF rectF = this.h;
        rectF.set(f, f2, size, size2);
        canvas.drawArc(rectF, this.d, this.e, false, getProgressPaint());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.c;
        if (j > 17) {
            j = 17;
        }
        this.c = jCurrentTimeMillis;
        float f3 = ((360 * j) / this.f47211a) + this.d;
        this.d = f3 - (((int) (f3 / 360.0f)) * 360);
        float f4 = this.g + j;
        this.g = f4;
        float f5 = this.b;
        if (f4 >= f5) {
            this.g = f5;
        }
        this.e = this.f ? (getAccelerateInterpolator().getInterpolation(this.g / f5) * 266.0f) + 4.0f : 4.0f - ((1.0f - getDecelerateInterpolator().getInterpolation(this.g / f5)) * 270.0f);
        if (this.g == f5) {
            boolean z = this.f;
            if (z) {
                this.d += 270.0f;
                this.e = -266.0f;
            }
            this.f = !z;
            this.g = 0.0f;
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialProgressView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
