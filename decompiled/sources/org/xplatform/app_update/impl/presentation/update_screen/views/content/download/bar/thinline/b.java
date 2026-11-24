package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thinline;

import a.acq0;
import a.j5d;
import a.maz;
import a.n0o0;
import a.tx3;
import a.upd0;
import a.utj;
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
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46338a;
    public final n0o0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int[] j;
    public RectF k;
    public final Paint l;
    public ColorStateList m;
    public RectF n;
    public final Paint o;
    public ColorStateList p;
    public int q;
    public int r;
    public float s;
    public float t;
    public int u;
    public int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null);
        context.getClass();
        boolean z = getLayoutDirection() == 1;
        this.f46338a = z;
        this.b = maz.b(acq0.f640a);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.radius_10);
        TypedValue typedValue = j5d.f15927a;
        this.j = new int[]{j5d.a(context, R.attr.uikitUpdateGradientEnd, false), j5d.a(context, R.attr.uikitUpdateGradientStart, false)};
        this.k = new RectF();
        Paint paint = new Paint(5);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.l = paint;
        this.n = new RectF();
        Paint paint2 = new Paint(5);
        paint2.setStyle(style);
        this.o = paint2;
        this.w = 100;
        setId(R.id.thinLineDownloadBar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, upd0.f36061a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        setValueFrom(typedArrayObtainStyledAttributes.getInt(6, 0));
        setValueTo(typedArrayObtainStyledAttributes.getInt(5, 100));
        this.u = typedArrayObtainStyledAttributes.getInt(4, 0);
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
        b(typedArrayObtainStyledAttributes.getDimensionPixelOffset(20, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, 0));
        ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(13);
        if (colorStateList3 != null) {
            setThumbColor(colorStateList3);
        }
        setThumbShadowColor(typedArrayObtainStyledAttributes.getColor(17, 0));
        setThumbStrokeColor(typedArrayObtainStyledAttributes.getColorStateList(18));
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(19, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
        utj thumb = getThumb();
        if (thumb.k == z) {
            return;
        }
        thumb.k = z;
    }

    private final utj getThumb() {
        return (utj) this.b.getValue();
    }

    public final void a(int[] iArr) {
        if (!Arrays.equals(getThumb().l, iArr)) {
            getThumb().l = iArr;
        }
        getThumb().getClass();
        if (!Arrays.equals((float[]) null, (float[]) null)) {
            getThumb().getClass();
        }
        invalidate();
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
        int i3 = i / 2;
        if (i3 != this.f) {
            utj thumb = getThumb();
            float f = i3;
            if (thumb.h != f) {
                thumb.h = f;
            }
            this.f = i3;
        }
        getThumb().setBounds(0, 0, this.c, this.d);
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
        float paddingStart;
        int width;
        int i;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.s == 0.0f) {
            this.s = getMeasuredWidth() / 2.0f;
        }
        if (this.t == 0.0f) {
            this.t = getMeasuredHeight() / 2.0f;
        }
        float f = this.u;
        int i2 = this.v;
        float f2 = (f - i2) / (this.w - i2);
        boolean z = this.f46338a;
        if (z) {
            f2 = 1.0f - f2;
        }
        this.n.set(this.s - (getWidth() / 2), this.t - (this.q / 2), this.s + (getWidth() / 2), this.t + (this.q / 2));
        canvas.drawRect(this.n, this.o);
        int i3 = z ? 0 : this.e * 2;
        RectF rectF = this.k;
        if (z) {
            rectF.set((this.s + (getWidth() / 2)) - ((1.0f - f2) * (getWidth() - (this.e * 2))), this.t - (this.q / 2), this.s + (getWidth() / 2), this.t + (this.q / 2));
        } else {
            rectF.set(getPaddingStart(), this.t - (this.q / 2), ((getWidth() - (this.e * 2)) * f2) + getPaddingStart() + i3, this.t + (this.q / 2));
        }
        if (this.u >= this.v) {
            float fWidth = this.k.width();
            float fHeight = this.k.height();
            int[] iArrU = this.j;
            if (z) {
                iArrU = tx3.U(iArrU);
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, fWidth, fHeight, iArrU, (float[]) null, Shader.TileMode.CLAMP);
            Paint paint = this.l;
            paint.setShader(linearGradient);
            canvas.drawRect(this.k, paint);
        }
        int i4 = this.f;
        if (z) {
            i4 = -i4;
        }
        if (this.i) {
            paddingStart = getPaddingStart() - i4;
            width = getWidth();
            i = this.e;
        } else {
            paddingStart = getPaddingStart() + this.e;
            width = getWidth();
            i = this.e;
        }
        float f3 = (f2 * (width - (i * 2))) + paddingStart;
        float fHeight2 = this.t - (getThumb().getBounds().height() / 2.0f);
        float fWidth2 = f3 - (getThumb().getBounds().width() / 2.0f);
        int iSave = canvas.save();
        canvas.translate(fWidth2, fHeight2);
        try {
            getThumb().draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ThinLineDownloadBar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ThinLineDownloadBar$SavedState thinLineDownloadBar$SavedState = (ThinLineDownloadBar$SavedState) parcelable;
        setValue(thinLineDownloadBar$SavedState.h);
        setValueFrom(thinLineDownloadBar$SavedState.i);
        setValueTo(thinLineDownloadBar$SavedState.j);
        this.k = thinLineDownloadBar$SavedState.b;
        ColorStateList colorStateList = thinLineDownloadBar$SavedState.c;
        if (colorStateList != null) {
            setPrimaryLineColor(colorStateList);
        }
        this.n = thinLineDownloadBar$SavedState.d;
        ColorStateList colorStateList2 = thinLineDownloadBar$SavedState.e;
        if (colorStateList2 != null) {
            setSecondaryLineColor(colorStateList2);
        }
        setSecondaryLineHeight(thinLineDownloadBar$SavedState.f);
        setSecondaryLineWidth(thinLineDownloadBar$SavedState.g);
        b(thinLineDownloadBar$SavedState.k, thinLineDownloadBar$SavedState.l);
        this.e = thinLineDownloadBar$SavedState.m;
        setThumbRadius(thinLineDownloadBar$SavedState.n);
        setThumbWithinSecondaryLineBounds(thinLineDownloadBar$SavedState.p);
        this.g = thinLineDownloadBar$SavedState.o;
        this.i = thinLineDownloadBar$SavedState.q;
        super.onRestoreInstanceState(thinLineDownloadBar$SavedState.f46337a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new ThinLineDownloadBar$SavedState(super.onSaveInstanceState(), this.k, this.m, this.n, this.p, this.q, this.r, this.u, this.v, this.w, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final void setDynamicThumbRadius(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
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

    public final void setThumbColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        utj thumb = getThumb();
        thumb.getClass();
        colorStateList.getClass();
        if (!Intrinsics.d(thumb.f, colorStateList)) {
            thumb.f = colorStateList;
            int[] state = thumb.getState();
            state.getClass();
            thumb.onStateChange(state);
        }
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
        utj thumb = getThumb();
        float f = i;
        if (thumb.h != f) {
            thumb.h = f;
        }
        getThumb().setBounds(0, 0, this.c, this.d);
        requestLayout();
    }

    public final void setThumbShadowColor(int i) {
        utj thumb = getThumb();
        if (thumb.j != i) {
            thumb.j = i;
        }
        invalidate();
    }

    public final void setThumbStrokeColor(ColorStateList colorStateList) {
        utj thumb = getThumb();
        if (!Intrinsics.d(thumb.g, colorStateList)) {
            thumb.g = colorStateList;
            int[] state = thumb.getState();
            state.getClass();
            thumb.onStateChange(state);
        }
        invalidate();
    }

    public final void setThumbStrokeWidth(float f) {
        utj thumb = getThumb();
        if (thumb.i != f) {
            thumb.i = f;
            ((Paint) thumb.b.getValue()).setStrokeWidth(f);
        }
        invalidate();
    }

    public final void setThumbWithinSecondaryLineBounds(boolean z) {
        int i;
        this.h = z;
        if (z) {
            int i2 = this.c;
            i = i2 != 0 ? i2 / 2 : this.f;
        } else {
            i = 0;
        }
        if (this.e == i) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public final void setValue(int i) {
        int i2 = this.v;
        if (i > new IntRange(i2, this.w, 1).b || i2 > i || i < this.u) {
            return;
        }
        this.u = i;
        if (this.i) {
            int i3 = this.g;
            int i4 = this.f;
            setThumbRadius((((i3 - i4) * i) / 100) + i4);
        }
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
