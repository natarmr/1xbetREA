package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class z4i extends View implements u4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43772a;
    public int b;
    public Drawable c;
    public i5i d;
    public final int e;
    public final int f;
    public final Paint g;
    public PorterDuffColorFilter h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4i(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = i5i.BASIC;
        this.e = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.f = getResources().getDimensionPixelSize(R.dimen.radius_6);
        Paint paint = new Paint();
        paint.setColor(m5d.b(R.attr.uikitBackgroundContent, context));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.g = paint;
        setTag("DSTextFieldEndIcon");
    }

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        i5i.f14193a.getClass();
        i5i i5iVarC = kud.c(typedArray);
        this.d = i5iVarC;
        int iOrdinal = i5iVarC.ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_20);
            this.f43772a = getResources().getDimensionPixelSize(R.dimen.size_44);
            this.b = getResources().getDimensionPixelSize(R.dimen.size_24);
            Context context = getContext();
            context.getClass();
            this.h = new PorterDuffColorFilter(m5d.b(R.attr.uikitSecondary, context), PorterDuff.Mode.SRC_IN);
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_6);
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.space_6);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_6);
            this.f43772a = getResources().getDimensionPixelSize(R.dimen.size_44);
            this.b = getResources().getDimensionPixelSize(R.dimen.size_44);
            Context context2 = getContext();
            context2.getClass();
            this.h = new PorterDuffColorFilter(m5d.b(R.attr.uikitPrimary, context2), PorterDuff.Mode.SRC_IN);
        }
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2);
        setEndIconDrawableRes(typedArray.getResourceId(13, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int paddingLeft;
        int paddingTop;
        int width;
        int height;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.d == i5i.FILLED) {
            float paddingLeft2 = getPaddingLeft();
            float paddingTop2 = getPaddingTop();
            float width2 = getWidth() - getPaddingRight();
            float height2 = getHeight() - getPaddingBottom();
            float f = this.f;
            canvas2 = canvas;
            canvas2.drawRoundRect(paddingLeft2, paddingTop2, width2, height2, f, f, this.g);
            float f2 = this.e;
            paddingLeft = (int) (paddingLeft2 + f2);
            paddingTop = (int) (paddingTop2 + f2);
            width = (int) (width2 - f2);
            height = (int) (height2 - f2);
        } else {
            canvas2 = canvas;
            paddingLeft = getPaddingLeft();
            paddingTop = getPaddingTop();
            width = getWidth() - getPaddingRight();
            height = getHeight() - getPaddingBottom();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(this.h);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(paddingLeft, paddingTop, width, height);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.draw(canvas2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f43772a, this.b);
    }

    public final void setEndIconDrawable(Drawable drawable) {
        this.c = drawable;
        invalidate();
    }

    public final void setEndIconDrawableRes(int i) {
        if (i == 0) {
            return;
        }
        this.c = getContext().getDrawable(i);
        invalidate();
    }

    @Override // a.u4i
    public final void a(boolean z) {
    }
}
