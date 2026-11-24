package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class a5i extends View implements u4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f272a;
    public final Drawable b;
    public boolean c;
    public boolean d;
    public Function0 e;
    public Function0 f;
    public boolean g;
    public boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final int q;
    public final int r;
    public final Paint s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5i(Context context) {
        super(context, null, 0);
        context.getClass();
        Drawable drawable = null;
        int iB = m5d.b(R.attr.uikitPrimary, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_glyph_minus_small);
        if (drawable2 != null) {
            drawable2.setTint(iB);
        } else {
            drawable2 = null;
        }
        this.f272a = drawable2;
        Drawable drawable3 = context.getDrawable(R.drawable.ic_glyph_plus_small);
        if (drawable3 != null) {
            drawable3.setTint(iB);
            drawable = drawable3;
        }
        this.b = drawable;
        this.c = true;
        this.d = true;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.i = dimensionPixelSize;
        this.j = getResources().getDimensionPixelSize(R.dimen.radius_6);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.space_6);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.l = getResources().getDimensionPixelSize(R.dimen.space_2);
        float f = dimensionPixelSize2;
        this.m = f;
        this.n = f;
        this.o = dimensionPixelSize2 + dimensionPixelSize + dimensionPixelOffset;
        this.p = f;
        int i = (dimensionPixelSize * 2) + dimensionPixelOffset;
        int i2 = dimensionPixelSize2 * 2;
        this.q = i + i2;
        this.r = i2 + dimensionPixelSize;
        Paint paint = new Paint();
        paint.setColor(m5d.b(R.attr.uikitBackgroundContent, context));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.s = paint;
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        setTag("DSTextFieldEndStepper");
    }

    private final void setFirstButtonEnabled(boolean z) {
        this.c = z;
        invalidate();
    }

    private final void setSecondButtonEnabled(boolean z) {
        this.d = z;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int layoutDirection = getLayoutDirection();
        float f = this.m;
        float f2 = this.o;
        Pair pair = layoutDirection == 1 ? new Pair(Float.valueOf(f2), Float.valueOf(f)) : new Pair(Float.valueOf(f), Float.valueOf(f2));
        float fFloatValue = ((Number) pair.f46059a).floatValue();
        float fFloatValue2 = ((Number) pair.b).floatValue();
        int i = this.i;
        float f3 = fFloatValue + i;
        float f4 = this.n;
        float f5 = f4 + i;
        int i2 = this.j;
        float f6 = i2;
        float f7 = i2;
        int i3 = this.c ? 255 : 128;
        Paint paint = this.s;
        paint.setAlpha(i3);
        canvas.drawRoundRect(fFloatValue, f4, f3, f5, f6, f7, paint);
        int i4 = this.k;
        Drawable drawable = this.f272a;
        if (drawable != null) {
            drawable.setAlpha(this.c ? 255 : 128);
            drawable.setBounds((int) (fFloatValue + i4), (int) (f4 + i4), (int) (f3 - i4), (int) (f5 - i4));
            drawable.draw(canvas);
        }
        float f8 = fFloatValue2 + i;
        float f9 = this.p;
        float f10 = f9 + i;
        float f11 = i2;
        float f12 = i2;
        paint.setAlpha(this.d ? 255 : 128);
        canvas.drawRoundRect(fFloatValue2, f9, f8, f10, f11, f12, paint);
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setAlpha(this.d ? 255 : 128);
            drawable2.setBounds((int) (fFloatValue2 + i4), (int) (f9 + i4), (int) (f8 - i4), (int) (f10 - i4));
            drawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.q, this.r);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (motionEvent == null || motionEvent.getPointerCount() > 1) {
            return super.onTouchEvent(motionEvent);
        }
        int layoutDirection = getLayoutDirection();
        float f = this.m;
        float f2 = this.o;
        Pair pair = layoutDirection == 1 ? new Pair(Float.valueOf(f2), Float.valueOf(f)) : new Pair(Float.valueOf(f), Float.valueOf(f2));
        float fFloatValue = ((Number) pair.f46059a).floatValue();
        float fFloatValue2 = ((Number) pair.b).floatValue();
        float measuredHeight = getMeasuredHeight();
        int i = this.l;
        float f3 = fFloatValue - i;
        int i2 = this.i;
        float f4 = fFloatValue + i + i2;
        float x = motionEvent.getX();
        if (f3 > x || x > f4) {
            z = false;
        } else {
            float y = motionEvent.getY();
            if (0.0f > y || y > measuredHeight) {
                z = false;
            } else {
                z = true;
            }
        }
        float f5 = fFloatValue2 - i;
        float f6 = fFloatValue2 + i + i2;
        float x2 = motionEvent.getX();
        if (f5 > x2 || x2 > f6) {
            z2 = false;
        } else {
            float y2 = motionEvent.getY();
            if (0.0f > y2 || y2 > measuredHeight) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (z || z2) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (action != 1) {
            return super.onTouchEvent(motionEvent);
        }
        if (z) {
            this.g = true;
            this.h = false;
            return performClick();
        }
        if (!z2) {
            return super.onTouchEvent(motionEvent);
        }
        this.g = false;
        this.h = true;
        return performClick();
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.g && this.c) {
            Function0 function0 = this.e;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (!this.h || !this.d) {
                return super.performClick();
            }
            Function0 function1 = this.f;
            if (function1 != null) {
                function1.invoke();
            }
        }
        return true;
    }

    public final void setMinusButtonClickListener(Function0<Unit> function0) {
        this.e = function0;
    }

    public final void setMinusButtonEnabled(boolean z) {
        setFirstButtonEnabled(z);
    }

    public final void setPlusButtonClickListener(Function0<Unit> function0) {
        this.f = function0;
    }

    public final void setPlusButtonEnabled(boolean z) {
        setSecondButtonEnabled(z);
    }

    @Override // a.u4i
    public final void a(boolean z) {
    }
}
