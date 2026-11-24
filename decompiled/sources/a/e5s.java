package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final class e5s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsHeader f7249a;
    public final DsShimmerView b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5s(Context context) {
        super(context, null, 0);
        context.getClass();
        DsHeader dsHeader = new DsHeader(new ContextThemeWrapper(context, R.style.Widget_GameCollectionHeader_Shimmer), null, 6);
        this.f7249a = dsHeader;
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.radius_16));
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        this.b = dsShimmerView;
        this.c = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_108);
        this.e = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        addView(dsHeader);
        addView(dsShimmerView);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jmu0.f(0, 0, getMeasuredWidth(), this.c, this.f7249a, this);
        jmu0.f(this.e, this.c, getMeasuredWidth() - this.e, this.c + this.d, this.b, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - (this.e * 2);
        int i3 = this.c;
        this.f7249a.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int i4 = this.d;
        this.b.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + i4);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f7249a.b(i == 0);
        if (i == 0) {
            x0x.s(this);
        } else {
            x0x.O(this);
        }
    }
}
