package com.google.android.material.imageview;

import a.akj0;
import a.bkj0;
import a.blj0;
import a.clj0;
import a.dwi0;
import a.g7x;
import a.jiq0;
import a.ki30;
import a.pwi;
import a.rpd0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements blj0 {
    public final pwi d;
    public final RectF e;
    public final RectF f;
    public final Paint g;
    public final Paint h;
    public final Path i;
    public ColorStateList j;
    public ki30 k;
    public akj0 l;
    public float m;
    public final Path n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public boolean u;

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(dwi0.V(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.d = bkj0.f2751a;
        this.i = new Path();
        this.u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.e = new RectF();
        this.f = new RectF();
        this.n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, rpd0.P, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.j = g7x.A(10, context2, typedArrayObtainStyledAttributes);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.o = dimensionPixelSize;
        this.p = dimensionPixelSize;
        this.q = dimensionPixelSize;
        this.r = dimensionPixelSize;
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.l = akj0.h(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).c();
        setOutlineProvider(new clj0(this));
    }

    public final boolean a() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.e;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        akj0 akj0Var = this.l;
        pwi pwiVar = this.d;
        Path path = this.i;
        pwiVar.b(akj0Var, null, 1.0f, rectF, null, path);
        Path path2 = this.n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.r;
    }

    public final int getContentPaddingEnd() {
        int i = this.t;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return a() ? this.o : this.q;
    }

    public int getContentPaddingLeft() {
        int i = this.t;
        int i2 = this.s;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (a() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!a() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.o;
    }

    public int getContentPaddingRight() {
        int i = this.t;
        int i2 = this.s;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (a() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!a() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.q;
    }

    public final int getContentPaddingStart() {
        int i = this.s;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return a() ? this.q : this.o;
    }

    public int getContentPaddingTop() {
        return this.p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public akj0 getShapeAppearanceModel() {
        return this.l;
    }

    public ColorStateList getStrokeColor() {
        return this.j;
    }

    public float getStrokeWidth() {
        return this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.n, this.h);
        if (this.j == null) {
            return;
        }
        float f = this.m;
        Paint paint = this.g;
        paint.setStrokeWidth(f);
        int colorForState = this.j.getColorForState(getDrawableState(), this.j.getDefaultColor());
        if (this.m <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.u && isLayoutDirectionResolved()) {
            this.u = true;
            if (!isPaddingRelative() && this.s == Integer.MIN_VALUE && this.t == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // a.blj0
    public void setShapeAppearanceModel(akj0 akj0Var) {
        this.l = akj0Var;
        ki30 ki30Var = this.k;
        if (ki30Var != null) {
            ki30Var.setShapeAppearanceModel(akj0Var);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(jiq0.n0(i, getContext()));
    }

    public void setStrokeWidth(float f) {
        if (this.m != f) {
            this.m = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
