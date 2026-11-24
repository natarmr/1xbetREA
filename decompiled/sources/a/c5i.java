package a;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class c5i extends View implements u4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f3773a;
    public PorterDuffColorFilter b;
    public int c;
    public int d;
    public boolean e;

    @Override // a.u4i
    public final void a(boolean z) {
        this.e = z;
        setVisibility(z ? 0 : 8);
        invalidate();
    }

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        Object g0g0Var;
        i5i.f14193a.getClass();
        int iOrdinal = kud.c(typedArray).ordinal();
        if (iOrdinal == 0) {
            this.c = getResources().getDimensionPixelSize(R.dimen.size_24);
            this.d = getResources().getDimensionPixelSize(R.dimen.size_20);
            setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.space_4), getResources().getDimensionPixelSize(R.dimen.space_2), getResources().getDimensionPixelSize(R.dimen.space_4), getResources().getDimensionPixelSize(R.dimen.space_2));
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            this.c = getResources().getDimensionPixelSize(R.dimen.size_40);
            this.d = getResources().getDimensionPixelSize(R.dimen.size_44);
            setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.space_12), getResources().getDimensionPixelSize(R.dimen.space_14), getResources().getDimensionPixelSize(R.dimen.space_12), getResources().getDimensionPixelSize(R.dimen.space_14));
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = typedArray.getDrawable(16);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            g0g0Var = this.f3773a;
        }
        this.f3773a = (Drawable) g0g0Var;
        this.e = typedArray.getBoolean(31, false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.e) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int measuredWidth = getMeasuredWidth() - getPaddingRight();
            int measuredHeight = getMeasuredHeight() - getPaddingBottom();
            Drawable drawable = this.f3773a;
            if (drawable != null) {
                drawable.setColorFilter(this.b);
            }
            Drawable drawable2 = this.f3773a;
            if (drawable2 != null) {
                drawable2.setBounds(paddingLeft, paddingTop, measuredWidth, measuredHeight);
            }
            Drawable drawable3 = this.f3773a;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.c, this.d);
        setTag("DsTextFieldErrorIcon");
    }

    public final void setErrorDrawable(Drawable drawable) {
        this.f3773a = drawable;
    }

    public final void setErrorDrawableRes(int i) {
        this.f3773a = getContext().getDrawable(i);
    }
}
