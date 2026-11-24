package org.xplatform.ui_core.viewcomponents.views;

import a.aqd0;
import a.j5d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class TicketDivider extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f47214a;
    public final Paint b;
    public final Paint c;
    public final Path d;
    public final Path e;
    public boolean f;
    public final RectF g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public TicketDivider(Context context) {
        super(context);
        this.f47214a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = new Path();
        this.e = new Path();
        this.f = true;
        this.g = new RectF();
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aqd0.z);
            typedArrayObtainStyledAttributes.getClass();
            this.h = typedArrayObtainStyledAttributes.getColor(6, getResources().getColor(R.color.static_white));
            this.i = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.static_white));
            TypedValue typedValue = j5d.f15927a;
            Context context = getContext();
            context.getClass();
            this.j = typedArrayObtainStyledAttributes.getColor(1, j5d.a(context, R.attr.uikitSeparator, false));
            Context context2 = getContext();
            context2.getClass();
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) TypedValue.applyDimension(1, 2.0f, context2.getResources().getDisplayMetrics()));
            Context context3 = getContext();
            context3.getClass();
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, (int) TypedValue.applyDimension(1, 2.0f, context3.getResources().getDisplayMetrics()));
            Context context4 = getContext();
            context4.getClass();
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(1, 2.0f, context4.getResources().getDisplayMetrics()));
            typedArrayObtainStyledAttributes.recycle();
        }
        b();
        setLayerType(1, null);
    }

    public final void b() {
        Paint paint = this.f47214a;
        paint.setAlpha(0);
        paint.setAntiAlias(true);
        paint.setColor(this.h);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.b;
        paint2.setAlpha(0);
        paint2.setAntiAlias(true);
        paint2.setColor(this.i);
        paint2.setStyle(style);
        Paint paint3 = this.c;
        paint3.setAlpha(0);
        paint3.setAntiAlias(true);
        paint3.setColor(this.j);
        paint3.setStrokeWidth(this.k);
        paint3.setPathEffect(new DashPathEffect(new float[]{this.l, this.m}, 0.0f));
        this.f = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        boolean z = this.f;
        Path path = this.e;
        Path path2 = this.d;
        if (z) {
            float paddingLeft = getPaddingLeft();
            float width = getWidth() - getPaddingRight();
            float paddingTop = getPaddingTop();
            float height = (getHeight() - getPaddingBottom()) / 2.0f;
            float height2 = (getHeight() - getPaddingBottom()) / 2.0f;
            path2.reset();
            path2.moveTo(paddingLeft, paddingTop);
            path2.lineTo(width, paddingTop);
            float f = height - height2;
            float f2 = height + height2;
            RectF rectF = this.g;
            rectF.set(width - height2, f, width + height2, f2);
            path2.arcTo(rectF, 270.0f, -90.0f, false);
            path2.lineTo(paddingLeft, height);
            rectF.set(paddingLeft - height2, f, paddingLeft + height2, f2);
            path2.arcTo(rectF, 0.0f, -90.0f, false);
            path2.close();
            float paddingLeft2 = getPaddingLeft();
            float width2 = getWidth() - getPaddingRight();
            float height3 = getHeight() - getPaddingBottom();
            float f3 = height3 / 2.0f;
            path.reset();
            path.moveTo(paddingLeft2, height3);
            path.lineTo(width2, height3);
            float f4 = f3 - f3;
            float f5 = f3 + f3;
            rectF.set(width2 - f3, f4, width2 + f3, f5);
            path.arcTo(rectF, 90.0f, 90.0f, false);
            float f6 = paddingLeft2 + f3;
            path.lineTo(f6, f3);
            rectF.set(paddingLeft2 - f3, f4, f6, f5);
            path.arcTo(rectF, 0.0f, 90.0f, false);
            path.close();
            this.f = false;
        }
        float paddingLeft3 = getPaddingLeft();
        float width3 = getWidth() - getPaddingRight();
        float height4 = (getHeight() - getPaddingBottom()) / 2.0f;
        float f7 = this.m;
        canvas.drawPath(path2, this.f47214a);
        canvas.drawPath(path, this.b);
        canvas.drawLine(paddingLeft3 + height4 + f7, height4, (width3 - height4) - f7, height4, this.c);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.h = i;
        this.i = i;
        b();
    }

    public final void setBottomViewBackgroundColor(int i) {
        this.i = i;
        b();
    }

    public TicketDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47214a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = new Path();
        this.e = new Path();
        this.f = true;
        this.g = new RectF();
        a(attributeSet);
    }
}
