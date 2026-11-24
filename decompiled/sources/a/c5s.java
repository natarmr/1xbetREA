package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final class c5s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsShimmerView f3787a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5s(Context context) {
        super(context, null, 0);
        context.getClass();
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.radius_16));
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        this.f3787a = dsShimmerView;
        this.b = getResources().getDimensionPixelSize(R.dimen.size_100);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        addView(dsShimmerView);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jmu0.f(this.d, this.c, getMeasuredWidth() - this.d, this.c + this.b, this.f3787a, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (this.d * 2), 1073741824);
        int i3 = this.b;
        this.f3787a.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + this.c);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            x0x.s(this);
        } else {
            x0x.O(this);
        }
    }
}
