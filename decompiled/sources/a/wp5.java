package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class wp5 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39528a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final DsShimmerView i;
    public final DsShimmerView j;
    public final DsShimmerView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp5(Context context) {
        super(context, null);
        context.getClass();
        this.f39528a = getResources().getDimensionPixelSize(R.dimen.size_96);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_128);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_96);
        float dimension = getResources().getDimension(R.dimen.radius_24);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_80);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_12);
        float dimension2 = getResources().getDimension(R.dimen.radius_full);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_64);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_12);
        float dimension3 = getResources().getDimension(R.dimen.radius_full);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_4);
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        addView(dsShimmerView);
        this.i = dsShimmerView;
        DsShimmerView dsShimmerView2 = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(dimension2);
        gradientDrawable2.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite20, context)));
        dsShimmerView2.setBackground(gradientDrawable2);
        addView(dsShimmerView2);
        this.j = dsShimmerView2;
        DsShimmerView dsShimmerView3 = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(dimension3);
        gradientDrawable3.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite20, context)));
        dsShimmerView3.setBackground(gradientDrawable3);
        addView(dsShimmerView3);
        this.k = dsShimmerView3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x0x.s(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x0x.O(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.c;
        int i6 = this.h;
        int measuredWidth = (getMeasuredWidth() - this.d) / 2;
        this.j.layout(measuredWidth, i5 + i6, getMeasuredWidth() - measuredWidth, i5 + i6 + this.e);
        int i7 = this.g;
        int i8 = this.b;
        int measuredWidth2 = (getMeasuredWidth() - this.f) / 2;
        int measuredWidth3 = getMeasuredWidth() - measuredWidth2;
        this.k.layout(measuredWidth2, i8 - i7, measuredWidth3, i8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f39528a;
        this.i.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        this.j.measure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
        this.k.measure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
    }
}
