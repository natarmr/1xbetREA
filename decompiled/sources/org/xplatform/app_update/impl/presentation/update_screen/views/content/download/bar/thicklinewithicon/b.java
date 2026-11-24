package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thicklinewithicon;

import a.j5d;
import a.upd0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46336a;
    public Drawable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int[] h;
    public float i;
    public float j;
    public RectF k;
    public final Paint l;
    public ColorStateList m;
    public RectF n;
    public final Paint o;
    public ColorStateList p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;
    public int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null);
        context.getClass();
        this.f46336a = getLayoutDirection() == 1;
        this.c = -1;
        this.d = -1;
        TypedValue typedValue = j5d.f15927a;
        this.h = new int[]{j5d.a(context, R.attr.uikitUpdateGradientEnd, false), j5d.a(context, R.attr.uikitUpdateGradientStart, false)};
        this.k = new RectF();
        Paint paint = new Paint(5);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.l = paint;
        this.n = new RectF();
        Paint paint2 = new Paint(5);
        paint2.setStyle(style);
        this.o = paint2;
        this.s = -1.0f;
        this.w = 100;
        setId(R.id.thickLineWithIconDownloadBar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, upd0.f36061a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        setValueFrom(typedArrayObtainStyledAttributes.getInt(6, 0));
        setValueTo(typedArrayObtainStyledAttributes.getInt(5, 100));
        this.u = typedArrayObtainStyledAttributes.getInt(4, 0);
        setSecondaryLineCornersRadius(typedArrayObtainStyledAttributes.getDimension(9, 0.0f));
        setSecondaryLineHeight(typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0));
        setSecondaryLineWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, 0));
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(7);
        if (colorStateList != null) {
            setPrimaryLineColor(colorStateList);
        }
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(8);
        if (colorStateList2 != null) {
            setSecondaryLineColor(colorStateList2);
        }
        setThumbWithinSecondaryLineBounds(typedArrayObtainStyledAttributes.getBoolean(21, false));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(14);
        if (drawable != null) {
            setThumbDrawable(drawable);
        }
        if (this.b != null) {
            b(typedArrayObtainStyledAttributes.getDimensionPixelOffset(20, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void a(Drawable drawable, int i, int i2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i2);
        } else {
            float fMax = Math.max(i, i2) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void b(int i, int i2) {
        if (this.c == i && this.d == i2) {
            return;
        }
        if (i < 0) {
            i = this.f * 2;
        }
        this.c = i;
        if (i2 < 0) {
            i2 = this.f * 2;
        }
        this.d = i2;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.m;
        if (colorStateList != null) {
            this.l.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        }
        ColorStateList colorStateList2 = this.p;
        if (colorStateList2 != null) {
            this.o.setColor(colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()));
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.i == 0.0f) {
            this.i = getMeasuredWidth() / 2.0f;
        }
        if (this.j == 0.0f) {
            this.j = getMeasuredHeight() / 2.0f;
        }
        float f = this.u;
        int i = this.v;
        float f2 = (f - i) / (this.w - i);
        boolean z = this.f46336a;
        if (z) {
            f2 = 1.0f - f2;
        }
        this.n.set(this.i - (getWidth() / 2), this.j - (this.q / 2), this.i + (getWidth() / 2), this.j + (this.q / 2));
        float f3 = this.s;
        if (f3 == -1.0f) {
            f3 = this.q / 2.0f;
        }
        canvas.drawRoundRect(this.n, f3, f3, this.o);
        RectF rectF = this.k;
        if (z) {
            rectF.set(((this.i + (getWidth() / 2)) - this.t) - ((1.0f - f2) * (getWidth() - (this.e * 2))), this.j - (this.q / 2), this.i + (getWidth() / 2), this.j + (this.q / 2));
        } else {
            rectF.set(getPaddingStart(), this.j - (this.q / 2), ((getWidth() - (this.e * 2)) * f2) + getPaddingStart() + this.t, this.j + (this.q / 2));
        }
        if (this.u >= this.v) {
            float f4 = this.s;
            if (f4 == -1.0f) {
                f4 = this.q / 2.0f;
            }
            canvas.drawRoundRect(this.k, f4, f4, this.l);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            float width = (f2 * (getWidth() - (this.e * 2))) + getPaddingStart() + this.e;
            float fHeight = this.j - (drawable.getBounds().height() / 2.0f);
            float fWidth = width - (drawable.getBounds().width() / 2.0f);
            int iSave = canvas.save();
            canvas.translate(fWidth, fHeight);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ThickLineWithIconDownloadBar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ThickLineWithIconDownloadBar$SavedState thickLineWithIconDownloadBar$SavedState = (ThickLineWithIconDownloadBar$SavedState) parcelable;
        setValue(thickLineWithIconDownloadBar$SavedState.i);
        setValueFrom(thickLineWithIconDownloadBar$SavedState.j);
        setValueTo(thickLineWithIconDownloadBar$SavedState.k);
        this.k = thickLineWithIconDownloadBar$SavedState.b;
        this.n = thickLineWithIconDownloadBar$SavedState.d;
        ColorStateList colorStateList = thickLineWithIconDownloadBar$SavedState.c;
        if (colorStateList != null) {
            setPrimaryLineColor(colorStateList);
        }
        ColorStateList colorStateList2 = thickLineWithIconDownloadBar$SavedState.e;
        if (colorStateList2 != null) {
            setSecondaryLineColor(colorStateList2);
        }
        setSecondaryLineHeight(thickLineWithIconDownloadBar$SavedState.f);
        setSecondaryLineWidth(thickLineWithIconDownloadBar$SavedState.g);
        setSecondaryLineCornersRadius(thickLineWithIconDownloadBar$SavedState.h);
        b(thickLineWithIconDownloadBar$SavedState.l, thickLineWithIconDownloadBar$SavedState.m);
        this.e = thickLineWithIconDownloadBar$SavedState.n;
        setThumbRadius(thickLineWithIconDownloadBar$SavedState.o);
        setThumbWithinSecondaryLineBounds(thickLineWithIconDownloadBar$SavedState.p);
        super.onRestoreInstanceState(thickLineWithIconDownloadBar$SavedState.f46335a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new ThickLineWithIconDownloadBar$SavedState(super.onSaveInstanceState(), this.k, this.m, this.n, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.l;
        if (paint.getShader() != null) {
            return;
        }
        boolean z = this.f46336a;
        paint.setShader(new LinearGradient(z ? getRight() : 0.0f, 0.0f, z ? 0.0f : i, 0.0f, this.h, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void setPrimaryLineColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        if (colorStateList.equals(this.m)) {
            return;
        }
        this.m = colorStateList;
        this.l.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        invalidate();
    }

    public final void setSecondaryLineColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        if (colorStateList.equals(this.p)) {
            return;
        }
        this.p = colorStateList;
        this.o.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        invalidate();
    }

    public final void setSecondaryLineCornersRadius(float f) {
        if (f == this.s) {
            return;
        }
        this.s = f;
        requestLayout();
    }

    public final void setSecondaryLineHeight(int i) {
        if (this.q == i) {
            return;
        }
        this.q = i;
        requestLayout();
    }

    public final void setSecondaryLineWidth(int i) {
        if (this.r == i) {
            return;
        }
        this.r = i;
        requestLayout();
    }

    public final void setThumbDrawable(Drawable drawable) {
        drawable.getClass();
        if (Intrinsics.d(this.b, drawable)) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.getClass();
        Drawable drawableMutate2 = drawable.mutate();
        drawableMutate2.getClass();
        a(drawableMutate2, this.c, this.d);
        this.b = drawableMutate;
        invalidate();
    }

    public final void setThumbRadius(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        int i2 = i * 2;
        this.c = i2;
        this.d = i2;
        Drawable drawable = this.b;
        if (drawable != null) {
            a(drawable, i2, i2);
        }
        requestLayout();
    }

    public final void setThumbWithinSecondaryLineBounds(boolean z) {
        int i;
        this.g = z;
        if (z) {
            int i2 = this.c;
            i = i2 != -1 ? i2 / 2 : this.f;
        } else {
            i = 0;
        }
        if (this.e == i) {
            return;
        }
        this.e = i;
        if (this.t == 0) {
            this.t = i * 2;
        }
        requestLayout();
    }

    public final void setValue(int i) {
        int i2 = this.v;
        if (i > new IntRange(i2, this.w, 1).b || i2 > i || i < this.u) {
            return;
        }
        this.u = i;
        invalidate();
    }

    public final void setValueFrom(int i) {
        if (this.v == i) {
            return;
        }
        this.v = i;
        invalidate();
    }

    public final void setValueTo(int i) {
        if (this.w == i) {
            return;
        }
        this.w = i;
        invalidate();
    }
}
