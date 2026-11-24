package org.xplatform.uikit_sport.express_card;

import a.hny;
import a.npo;
import a.t9f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class ExpressCardShimmer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsShimmerView f47294a;
    public final int b;
    public int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpressCardShimmer(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_138);
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        dsShimmerView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.c));
        Drawable background = dsShimmerView.getBackground();
        background.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setCornerRadius(dsShimmerView.getResources().getDimensionPixelSize(R.dimen.size_16));
        dsShimmerView.setBackground(gradientDrawable);
        this.f47294a = dsShimmerView;
        addView(dsShimmerView);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.c);
    }

    public final void setStyle(npo npoVar) {
        int dimensionPixelSize;
        npoVar.getClass();
        int iOrdinal = npoVar.ordinal();
        if (iOrdinal != 0) {
            dimensionPixelSize = this.b;
            if (iOrdinal == 1) {
                this.c = getResources().getDimensionPixelSize(R.dimen.size_132);
            } else if (iOrdinal == 2) {
                this.c = getResources().getDimensionPixelSize(R.dimen.size_148);
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                this.c = getResources().getDimensionPixelSize(R.dimen.size_152);
            }
        } else {
            this.c = getResources().getDimensionPixelSize(R.dimen.size_138);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_16);
        }
        DsShimmerView dsShimmerView = this.f47294a;
        Drawable background = dsShimmerView.getBackground();
        background.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        dsShimmerView.setBackground(gradientDrawable);
        ViewGroup.LayoutParams layoutParams = dsShimmerView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = this.c;
            dsShimmerView.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressCardShimmer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressCardShimmer(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
