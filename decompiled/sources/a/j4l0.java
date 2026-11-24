package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class j4l0 extends FrameLayout {
    public final TextPaint A;
    public final TextPaint B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xr20 f15890a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Paint f1;
    public int g;
    public float h;
    public float i;
    public String j;
    public String k;
    public String l;
    public int m;
    public int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public int t;
    public int u;
    public StaticLayout v;
    public StaticLayout w;
    public StaticLayout x;
    public final ImageView y;
    public final TextPaint z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4l0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f15890a = xr20.f41348a;
        this.j = "";
        this.k = "";
        this.l = "";
        this.o = getResources().getDimensionPixelSize(R.dimen.size_16);
        this.p = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.q = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.r = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.s = getResources().getDimensionPixelSize(R.dimen.space_4);
        ImageView imageView = new ImageView(context);
        imageView.setTag("MarketImageView");
        imageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        addView(imageView);
        this.y = imageView;
        TextPaint textPaint = new TextPaint();
        r7x.r(textPaint, context, this.b);
        textPaint.setAntiAlias(true);
        this.z = textPaint;
        TextPaint textPaint2 = new TextPaint();
        r7x.r(textPaint2, context, this.c);
        textPaint2.setAntiAlias(true);
        this.A = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        r7x.r(textPaint3, context, this.f);
        textPaint3.setAntiAlias(true);
        this.B = textPaint3;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(m5d.b(this.g, context));
        paint.setStyle(Paint.Style.FILL);
        paint.setPathEffect(new CornerPathEffect(getResources().getDimensionPixelSize(R.dimen.radius_10)));
        this.f1 = paint;
        setTag("SportCouponCardMarketViewTestTag");
        setWillNotDraw(false);
    }

    public static StaticLayout b(TextPaint textPaint, String str, int i, int i2, boolean z) {
        StaticLayout staticLayoutI = xdx.I(z ? f1t0.L(str) : str, textPaint, i, i2, TextUtils.TruncateAt.END, 0, null, 3568);
        if (str.length() > 0) {
            return staticLayoutI;
        }
        return null;
    }

    public final void a(float f, float f2, Canvas canvas, StaticLayout staticLayout) {
        if (getLayoutDirection() == 1) {
            f = (getMeasuredWidth() - f) - (staticLayout != null ? staticLayout.getWidth() : 0);
        }
        canvas.save();
        canvas.translate(f, f2);
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    public final String getMarketCoefficient() {
        return this.l;
    }

    public final String getMarketDescription() {
        return this.j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int height;
        canvas.getClass();
        if (this.g != 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f1);
        } else {
            canvas2 = canvas;
        }
        int i = ((this.y.getVisibility() == 0 && this.f15890a == xr20.f41348a) ? this.o + this.p : 0) + this.u;
        if (this.k.length() <= 0 || this.c == 0) {
            height = 0;
        } else {
            StaticLayout staticLayout = this.w;
            height = (staticLayout != null ? staticLayout.getHeight() : 0) + this.q;
        }
        StaticLayout staticLayout2 = this.v;
        int height2 = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        float f = height == 0 ? (this.n / 2) - (height2 / 2) : height;
        Integer numValueOf = Integer.valueOf((this.n / 2) - (height / 2));
        if (height2 != 0) {
            numValueOf = null;
        }
        float fIntValue = numValueOf != null ? numValueOf.intValue() : 0.0f;
        float f2 = i;
        a(f2, f, canvas2, this.v);
        a(f2, fIntValue, canvas2, this.w);
        int i2 = this.n / 2;
        StaticLayout staticLayout3 = this.x;
        if (staticLayout3 != null) {
            a((getMeasuredWidth() - this.m) - this.u, i2 - (staticLayout3.getHeight() / 2), canvas2, this.x);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView = this.y;
        if (imageView.getVisibility() == 0) {
            int i5 = this.n / 2;
            int i6 = this.o;
            int i7 = i5 - (i6 / 2);
            int i8 = (i6 / 2) + i5;
            int measuredWidth = this.f15890a == xr20.f41348a ? this.u : ((getMeasuredWidth() - this.m) - this.s) - i6;
            jmu0.f(measuredWidth, i7, i6 + measuredWidth, i8, imageView, this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int height;
        int size = View.MeasureSpec.getSize(i);
        ImageView imageView = this.y;
        int visibility = imageView.getVisibility();
        int i4 = this.s;
        int i5 = this.o;
        if (visibility == 0 && this.f15890a == xr20.f41348a) {
            i3 = this.p + i5;
        } else {
            i3 = (imageView.getVisibility() == 0 && this.f15890a == xr20.b) ? (i4 * 2) + i5 : 0;
        }
        int i6 = (size - i3) - (this.u * 2);
        int i7 = (int) (((double) i6) * 0.4d);
        float f = this.h;
        TextPaint textPaint = this.B;
        textPaint.setTextSize(f);
        float fMeasureText = textPaint.measureText(this.l);
        textPaint.setTextSize(fMeasureText > ((float) i7) ? this.i : this.h);
        int iMin = Math.min(i7, (int) fMeasureText);
        this.x = b(textPaint, this.l, iMin, 1, false);
        this.m = iMin;
        int visibility2 = imageView.getVisibility();
        int i8 = this.r;
        int i9 = (visibility2 == 0 && this.f15890a == xr20.b) ? (i4 * 2) + i5 : i8;
        if (this.c != 0) {
            this.w = b(this.A, this.k, (i6 - iMin) - i9, this.d, true);
        }
        this.v = b(this.z, this.j, (i6 - iMin) - i8, this.e, true);
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
        if (this.k.length() <= 0 || this.c == 0) {
            height = 0;
        } else {
            StaticLayout staticLayout = this.w;
            height = (staticLayout != null ? staticLayout.getHeight() : 0) + this.q;
        }
        StaticLayout staticLayout2 = this.v;
        int height2 = (this.t * 2) + (staticLayout2 != null ? staticLayout2.getHeight() : 0) + height;
        this.n = height2;
        setMeasuredDimension(size, height2);
    }

    public final void setBackgroundTintAttr(int i) {
        this.g = i;
        this.t = i != 0 ? getResources().getDimensionPixelSize(R.dimen.space_10) : 0;
        this.u = this.g != 0 ? getResources().getDimensionPixelSize(R.dimen.space_8) : 0;
        Context context = getContext();
        context.getClass();
        this.f1.setColor(m5d.b(this.g, context));
    }

    public final void setCoefficientMaxTextSize(float f) {
        this.h = f;
        this.B.setTextSize(f);
    }

    public final void setCoefficientMinTextSize(float f) {
        this.i = f;
    }

    public final void setCoefficientTextStyle(int i) {
        this.f = i;
        Context context = getContext();
        context.getClass();
        r7x.r(this.B, context, this.f);
    }

    public final void setDescriptionMaxLines(int i) {
        this.e = i;
        requestLayout();
    }

    public final void setDescriptionTextStyle(int i) {
        this.b = i;
        Context context = getContext();
        context.getClass();
        r7x.r(this.z, context, this.b);
    }

    public final void setHeaderMaxLines(int i) {
        this.d = i;
        requestLayout();
    }

    public final void setHeaderTextStyle(int i) {
        this.c = i;
        Context context = getContext();
        context.getClass();
        r7x.r(this.A, context, this.c);
    }

    public final void setMarketBlockedIconPosition(xr20 xr20Var) {
        xr20Var.getClass();
        this.f15890a = xr20Var;
    }

    public final void setMarketCoefficient(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.l = string;
        requestLayout();
    }

    public final void setMarketCoefficientState(j0d j0dVar) {
        int i;
        j0dVar.getClass();
        TextPaint textPaint = this.B;
        int alpha = textPaint.getAlpha();
        Context context = getContext();
        context.getClass();
        int iOrdinal = j0dVar.ordinal();
        if (iOrdinal == 0) {
            i = R.attr.uikitTextPrimary;
        } else if (iOrdinal == 1) {
            i = R.attr.uikitStaticGreen;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            i = R.attr.uikitStaticRed;
        }
        textPaint.setColor(m5d.b(i, context));
        textPaint.setAlpha(alpha);
        invalidate();
    }

    public final void setMarketDescription(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.j = string;
        requestLayout();
    }

    public final void setMarketHeader(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.k = string;
        requestLayout();
    }

    public final void setMarketStyle(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = getContext();
            context.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, bqd0.R);
            int i = (int) (typedArrayObtainStyledAttributes.getFloat(3, 1.0f) * 255.0f);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(14);
            this.z.setAlpha(i);
            this.B.setAlpha(i);
            this.A.setAlpha(i);
            if (this.g != 0) {
                this.f1.setAlpha(i);
            }
            ImageView imageView = this.y;
            imageView.setAlpha(i / 255.0f);
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(drawable != null ? 0 : 8);
            typedArrayObtainStyledAttributes.recycle();
            requestLayout();
        }
    }
}
