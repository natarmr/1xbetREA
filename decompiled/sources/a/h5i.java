package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class h5i extends View implements e5i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12480a;
    public int b;
    public Drawable c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5i(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = getResources().getDimensionPixelSize(R.dimen.size_20);
    }

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        i5i.f14193a.getClass();
        int iOrdinal = kud.c(typedArray).ordinal();
        int iB = 0;
        if (iOrdinal == 0) {
            this.f12480a = getResources().getDimensionPixelSize(R.dimen.size_28);
            this.b = getResources().getDimensionPixelSize(R.dimen.size_20);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
            dimensionPixelSize2 = 0;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            this.f12480a = getResources().getDimensionPixelSize(R.dimen.size_28);
            this.b = getResources().getDimensionPixelSize(R.dimen.size_44);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_8);
            dimensionPixelSize = 0;
        }
        setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize, 0);
        setDrawable(typedArray.getResourceId(33, 0));
        int type = typedArray.getType(34);
        if (type == 1) {
            Context context = getContext();
            context.getClass();
            iB = m5d.b(typedArray.getResourceId(34, 0), context);
        } else if (type == 28 || type == 29) {
            iB = typedArray.getColor(34, 0);
        }
        setTint(iB);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight() / 2;
        int i = this.d;
        int i2 = measuredHeight - (i / 2);
        int i3 = i + i2;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAutoMirrored(false);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(getPaddingLeft(), i2, getMeasuredWidth() - getPaddingRight(), i3);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f12480a, this.b);
    }

    public void setDrawable(int i) {
        if (i == 0) {
            return;
        }
        this.c = getContext().getDrawable(i);
        invalidate();
    }

    public void setTint(int i) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTint(i);
            invalidate();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setDrawable(Drawable drawable) {
        this.c = drawable;
        invalidate();
    }
}
