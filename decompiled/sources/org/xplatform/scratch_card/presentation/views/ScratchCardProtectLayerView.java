package org.xplatform.scratch_card.presentation.views;

import a.epv0;
import a.yxg0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ScratchCardProtectLayerView extends View {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f46911a;
    public final Paint b;
    public final Path c;
    public final Paint d;
    public final Drawable e;
    public Bitmap f;
    public Canvas g;
    public boolean h;
    public boolean i;
    public float j;
    public float k;
    public int l;

    /* JADX WARN: Illegal instructions before constructor call */
    public ScratchCardProtectLayerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46911a = new yxg0((byte) 19);
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        this.d = new Paint(4);
        this.e = epv0.U(R.drawable.sc_protective_layer, context);
        this.h = true;
        this.i = true;
        setBackground(epv0.U(android.R.color.transparent, context));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final Function0<Unit> getOnMapErased() {
        return this.f46911a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (this.h) {
            Canvas canvas2 = this.g;
            if (canvas2 == null) {
                Intrinsics.h("canvas");
                throw null;
            }
            canvas2.drawPath(this.c, this.b);
            float measuredWidth = (getMeasuredWidth() - this.l) / 2.0f;
            float measuredHeight = (getMeasuredHeight() - this.l) / 2.0f;
            Bitmap bitmap = this.f;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, measuredWidth, measuredHeight, this.d);
            } else {
                Intrinsics.h("bitmap");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.l = getMeasuredWidth() > getMeasuredHeight() ? getMeasuredHeight() : getMeasuredWidth();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b.setStrokeWidth(this.l * 0.2f);
        int i5 = this.l;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i5, config);
        bitmapCreateBitmap.getClass();
        this.f = bitmapCreateBitmap;
        int i6 = this.l;
        Bitmap.createBitmap(i6, i6, config).getClass();
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            Intrinsics.h("bitmap");
            throw null;
        }
        this.g = new Canvas(bitmap);
        Drawable drawable = this.e;
        if (drawable != null) {
            int i7 = this.l;
            drawable.setBounds(0, 0, i7, i7);
            Canvas canvas = this.g;
            if (canvas != null) {
                drawable.draw(canvas);
            } else {
                Intrinsics.h("canvas");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.h || !this.i) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY() - ((this.l * 0.2f) / 2.0f);
        int action = motionEvent.getAction();
        Path path = this.c;
        if (action == 0) {
            path.moveTo(x, y);
            this.j = x;
            this.k = y;
        } else if (action == 1) {
            this.h = false;
            this.f46911a.invoke();
        } else if (action == 2) {
            float f = this.j;
            float f2 = this.k;
            path.quadTo(f, f2, (x + f) / 2.0f, (y + f2) / 2.0f);
            this.j = x;
            this.k = y;
        }
        invalidate();
        return true;
    }

    public final void setOnMapErased(Function0<Unit> function0) {
        function0.getClass();
        this.f46911a = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchCardProtectLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchCardProtectLayerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
