package org.xplatform.core.presentation.balance;

import a.aem0;
import a.fq60;
import a.jmu0;
import a.m5d;
import a.p3u0;
import a.pn40;
import a.ql5;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class OnexGamesBalanceView extends FrameLayout {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f46461a;
    public Function0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final float p;
    public final float q;
    public RectF r;
    public RectF s;
    public int t;
    public final ImageView u;
    public final ImageView v;
    public final TextView w;
    public final Paint x;
    public final Rect y;
    public final Rect z;

    /* JADX WARN: Illegal instructions before constructor call */
    public OnexGamesBalanceView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46461a = new fq60((byte) 24);
        this.b = new fq60((byte) 25);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_10);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_14);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_26);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_28);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_30);
        this.l = getResources().getDimensionPixelSize(R.dimen.space_32);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_14);
        this.m = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.n = dimensionPixelSize2;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.o = dimensionPixelSize3;
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.text_8);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.text_12);
        float dimension = getResources().getDimension(R.dimen.text_12);
        this.p = getResources().getDimension(R.dimen.radius_8);
        this.q = getResources().getDimension(R.dimen.radius_12);
        int iC = m5d.c(R.color.static_white, context);
        int iC2 = m5d.c(R.color.static_black_40, context);
        this.r = new RectF();
        this.s = new RectF();
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        imageView.setImageResource(R.drawable.ic_glyph_chevron_down_small);
        imageView.setImageTintList(ColorStateList.valueOf(iC));
        addView(imageView);
        this.u = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize2));
        imageView2.setImageResource(R.drawable.replenish_view);
        addView(imageView2);
        this.v = imageView2;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        textView.setMaxLines(1);
        textView.setTextSize(dimension);
        textView.setTextAppearance(R.style.TextAppearance_Caption_Medium_L);
        textView.setTextColor(iC);
        textView.setTextDirection(3);
        aem0.r(textView, dimensionPixelSize4, dimensionPixelSize5, 1, 0);
        addView(textView);
        this.w = textView;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(iC2);
        paint.setStyle(Paint.Style.FILL);
        this.x = paint;
        this.y = new Rect();
        this.z = new Rect();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        RectF rectF = this.s;
        float f = this.q;
        Paint paint = this.x;
        canvas.drawRoundRect(rectF, f, f, paint);
        RectF rectF2 = this.r;
        float f2 = this.p;
        canvas.drawRoundRect(rectF2, f2, f2, paint);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Pair pair;
        ImageView imageView;
        ImageView imageView2;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.t;
        int measuredWidth = getMeasuredWidth() - this.t;
        int i6 = this.o;
        this.s = new RectF(new Rect(i5, 0, measuredWidth, i6));
        boolean z2 = getLayoutDirection() == 0;
        ImageView imageView3 = this.u;
        boolean z3 = imageView3.getVisibility() == 0;
        int i7 = this.n;
        int i8 = (i6 - i7) / 2;
        int i9 = i8 + i7;
        ImageView imageView4 = this.v;
        int i10 = this.f;
        int i11 = this.g;
        int i12 = this.c;
        TextView textView = this.w;
        if (z2 && z3) {
            int i13 = this.t + i12;
            pair = new Pair(Integer.valueOf(i13), Integer.valueOf(textView.getMeasuredWidth() + imageView3.getMeasuredWidth() + i11 + i13));
        } else {
            int i14 = this.h;
            if (z2 && !z3) {
                int i15 = this.t + i12;
                pair = new Pair(Integer.valueOf(i15), Integer.valueOf(textView.getMeasuredWidth() + i14 + i15));
            } else if (z2 || !z3) {
                int measuredWidth2 = imageView4.getMeasuredWidth() + this.t + i10;
                pair = new Pair(Integer.valueOf(measuredWidth2), Integer.valueOf(textView.getMeasuredWidth() + i14 + measuredWidth2));
            } else {
                int measuredWidth3 = imageView4.getMeasuredWidth() + this.t + i10;
                pair = new Pair(Integer.valueOf(measuredWidth3), Integer.valueOf(imageView3.getMeasuredWidth() + textView.getMeasuredWidth() + i11 + measuredWidth3));
            }
        }
        this.r = new RectF(new Rect(((Number) pair.f46059a).intValue(), i8, ((Number) pair.b).intValue(), i9));
        int measuredHeight = textView.getMeasuredHeight();
        int i16 = (i6 - measuredHeight) / 2;
        int i17 = i16 + measuredHeight;
        int visibility = imageView3.getVisibility();
        int i18 = this.t;
        if (visibility == 0) {
            int measuredWidth4 = imageView3.getMeasuredWidth() + i18 + this.e;
            jmu0.f(measuredWidth4, i16, textView.getMeasuredWidth() + measuredWidth4, i17, textView, this);
        } else {
            int i19 = i18 + i10;
            jmu0.f(i19, i16, textView.getMeasuredWidth() + i19, i17, textView, this);
        }
        if (imageView3.getVisibility() == 0) {
            int i20 = this.t + this.d;
            int i21 = this.m;
            int i22 = (i6 - i21) / 2;
            imageView = imageView3;
            jmu0.f(i20, i22, imageView3.getMeasuredWidth() + i20, i21 + i22, imageView, this);
        } else {
            imageView = imageView3;
            jmu0.f(0, 0, 0, 0, imageView, this);
        }
        int i23 = (i6 - i7) / 2;
        int i24 = i23 + i7;
        int visibility2 = imageView.getVisibility();
        int i25 = this.t;
        if (visibility2 == 0) {
            int measuredWidth5 = imageView.getMeasuredWidth() + i25 + this.i + textView.getMeasuredWidth();
            imageView2 = imageView4;
            jmu0.f(measuredWidth5, i23, imageView4.getMeasuredWidth() + measuredWidth5, i24, imageView2, this);
        } else {
            imageView2 = imageView4;
            int measuredWidth6 = textView.getMeasuredWidth() + i25 + this.j;
            jmu0.f(measuredWidth6, i23, imageView2.getMeasuredWidth() + measuredWidth6, i24, imageView2, this);
        }
        RectF rectF = this.r;
        this.y.set((int) rectF.left, 0, (int) rectF.right, getMeasuredHeight());
        this.z.set(imageView2.getLeft(), 0, imageView2.getRight(), getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        ImageView imageView = this.u;
        if (imageView.getVisibility() == 0) {
            measureChild(imageView, i, i2);
        }
        ImageView imageView2 = this.v;
        measureChild(imageView2, i, i2);
        int size = View.MeasureSpec.getSize(i);
        int visibility = imageView.getVisibility();
        int i3 = this.l;
        int i4 = this.k;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(visibility == 0 ? ((size - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth()) - i4 : (size - imageView2.getMeasuredWidth()) - i3, Integer.MIN_VALUE);
        TextView textView = this.w;
        measureChild(textView, iMakeMeasureSpec, i2);
        if (imageView.getVisibility() == 0) {
            measuredWidth = imageView2.getMeasuredWidth() + textView.getMeasuredWidth() + imageView.getMeasuredWidth() + i4;
        } else {
            measuredWidth = textView.getMeasuredWidth() + i3 + imageView2.getMeasuredWidth();
        }
        this.t = (View.MeasureSpec.getSize(i) - measuredWidth) / 2;
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.o);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getPointerCount() > 1 || !isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int action = motionEvent.getAction();
        Rect rect = this.z;
        Rect rect2 = this.y;
        if (action == 0) {
            return rect2.contains(x, (int) motionEvent.getY()) || rect.contains(x, (int) motionEvent.getY());
        }
        if (action != 1) {
            return super.onTouchEvent(motionEvent);
        }
        if (rect2.contains(x, (int) motionEvent.getY())) {
            this.f46461a.invoke();
            return true;
        }
        if (!rect.contains(x, (int) motionEvent.getY())) {
            return false;
        }
        this.b.invoke();
        return true;
    }

    public final void setBalance(ql5 ql5Var) {
        ql5Var.getClass();
        pn40 pn40Var = pn40.f27267a;
        String strD = pn40.d(ql5Var.b, ql5Var.f, p3u0.c);
        this.w.setText(strD);
        invalidate();
        requestLayout();
        setTag(strD);
    }

    public final void setChevronVisible(boolean z) {
        this.u.setVisibility(z ? 0 : 8);
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.u.setEnabled(z);
        this.v.setEnabled(z);
        this.w.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
    }

    public final void setOnBalanceClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.f46461a = function0;
    }

    public final void setOnReplenishClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.b = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnexGamesBalanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnexGamesBalanceView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
