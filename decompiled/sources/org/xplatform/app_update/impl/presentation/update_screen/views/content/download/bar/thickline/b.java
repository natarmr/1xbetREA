package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.thickline;

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
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46334a;
    public int[] b;
    public float c;
    public float d;
    public final float e;
    public RectF f;
    public final Paint g;
    public ColorStateList h;
    public float i;
    public int j;
    public int k;
    public int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null);
        context.getClass();
        this.f46334a = getLayoutDirection() == 1;
        TypedValue typedValue = j5d.f15927a;
        this.b = new int[]{j5d.a(context, R.attr.uikitUpdateGradientEnd, false), j5d.a(context, R.attr.uikitUpdateGradientStart, false)};
        this.e = context.getResources().getDimension(R.dimen.size_28);
        this.f = new RectF();
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.FILL);
        this.g = paint;
        this.j = -1;
        this.l = 100;
        setId(R.id.thickLineDownloadBar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, upd0.f36061a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        setValueFrom(typedArrayObtainStyledAttributes.getInt(6, 0));
        setValueTo(typedArrayObtainStyledAttributes.getInt(5, 100));
        this.j = typedArrayObtainStyledAttributes.getInt(4, 0);
        setPrimaryLineCornersRadius(typedArrayObtainStyledAttributes.getDimension(9, 0.0f));
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(7);
        if (colorStateList != null) {
            setPrimaryLineColor(colorStateList);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float a(float f) {
        boolean z = this.f46334a;
        float f2 = this.e;
        if (z) {
            float f3 = this.c;
            if (f >= 0.5f) {
                f3 -= f2;
            }
            return f3 / 50.0f;
        }
        float f4 = this.c;
        if (f <= 0.5f) {
            f4 -= f2;
        }
        return f4 / 50.0f;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            this.g.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.c == 0.0f) {
            this.c = getMeasuredWidth() / 2.0f;
        }
        if (this.d == 0.0f) {
            this.d = getMeasuredHeight() / 2.0f;
        }
        int i = this.j;
        if (i == -1) {
            return;
        }
        int i2 = this.k;
        float f = (i - i2) / (this.l - i2);
        boolean z = this.f46334a;
        if (z) {
            f = 1.0f - f;
        }
        RectF rectF = this.f;
        float fA = this.e;
        if (z) {
            if (f == 1.0f) {
                width = getWidth() - fA;
            } else {
                int i3 = i - this.m;
                if (i3 > 1) {
                    float width2 = getWidth() - fA;
                    while (i3 >= 1) {
                        float f2 = this.c;
                        if (i3 <= 50) {
                            f2 -= fA;
                        }
                        width2 -= f2 / 50.0f;
                        i3--;
                    }
                    fA = width2;
                } else if (f != 1.0f) {
                    fA = rectF.left - a(f);
                }
                this.m = this.j;
                width = fA;
            }
            rectF.set(width, this.d - (getHeight() / 2), getWidth(), this.d + (getHeight() / 2));
        } else {
            float paddingStart = getPaddingStart();
            float height = this.d - (getHeight() / 2);
            if (f != 0.0f) {
                int i4 = this.j - this.m;
                if (i4 > 1) {
                    fA = this.f.right;
                    while (i4 >= 1) {
                        fA += a(i4 / 100.0f);
                        i4--;
                    }
                } else if (f != 0.0f) {
                    fA = a(f) + this.f.right;
                }
                this.m = this.j;
            }
            rectF.set(paddingStart, height, fA, this.d + (getHeight() / 2));
        }
        if (this.j >= this.k) {
            RectF rectF2 = this.f;
            float f3 = this.i;
            canvas.drawRoundRect(rectF2, f3, f3, this.g);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ThickLineDownloadBar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ThickLineDownloadBar$SavedState thickLineDownloadBar$SavedState = (ThickLineDownloadBar$SavedState) parcelable;
        setValue(thickLineDownloadBar$SavedState.b);
        setValueFrom(thickLineDownloadBar$SavedState.c);
        setValueTo(thickLineDownloadBar$SavedState.d);
        this.f = thickLineDownloadBar$SavedState.e;
        ColorStateList colorStateList = thickLineDownloadBar$SavedState.f;
        if (colorStateList != null) {
            setPrimaryLineColor(colorStateList);
        }
        setPrimaryLineCornersRadius(thickLineDownloadBar$SavedState.g);
        super.onRestoreInstanceState(thickLineDownloadBar$SavedState.f46333a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new ThickLineDownloadBar$SavedState(super.onSaveInstanceState(), this.j, this.k, this.l, this.f, this.h, this.i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.g;
        if (paint.getShader() != null) {
            return;
        }
        boolean z = this.f46334a;
        paint.setShader(new LinearGradient(z ? getRight() : 0.0f, 0.0f, z ? 0.0f : i, 0.0f, this.b, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void setPrimaryLineColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        if (colorStateList.equals(this.h)) {
            return;
        }
        this.h = colorStateList;
        this.g.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        invalidate();
    }

    public final void setPrimaryLineCornersRadius(float f) {
        if (f == this.i) {
            return;
        }
        this.i = f;
        requestLayout();
    }

    public final void setValue(int i) {
        int i2 = this.k;
        if (i > new IntRange(i2, this.l, 1).b || i2 > i || i < this.j) {
            return;
        }
        this.j = i;
        invalidate();
    }

    public final void setValueFrom(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        invalidate();
    }

    public final void setValueTo(int i) {
        if (this.l == i) {
            return;
        }
        this.l = i;
        invalidate();
    }
}
