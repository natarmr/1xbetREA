package org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection;

import a.jmu0;
import a.maz;
import a.n0o0;
import a.q3d;
import a.wqv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final class LargeBannerGamesShimmerCollection extends FrameLayout {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47217a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final n0o0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public LargeBannerGamesShimmerCollection(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47217a = getResources().getDimensionPixelSize(R.dimen.radius_24);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_188);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_282);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        this.f = maz.b(new wqv(context, this, (byte) 21));
    }

    private final List<DsShimmerView> getShimmers() {
        return (List) this.f.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = this.e;
        for (Object obj : getShimmers()) {
            int i7 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            int i8 = i6 + this.c;
            LargeBannerGamesShimmerCollection largeBannerGamesShimmerCollection = this;
            jmu0.f(i6, 0, i8, this.b, (DsShimmerView) obj, largeBannerGamesShimmerCollection);
            if (i5 != q3d.i(largeBannerGamesShimmerCollection.getShimmers())) {
                i8 += largeBannerGamesShimmerCollection.d;
            }
            i6 = i8;
            i5 = i7;
            this = largeBannerGamesShimmerCollection;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Iterator<T> it = getShimmers().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i3 = this.b;
            int i4 = this.c;
            if (!zHasNext) {
                int i5 = this.e * 2;
                setMeasuredDimension((this.d * 2) + i5 + (i4 * 3), i3);
                return;
            }
            ((View) it.next()).measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeBannerGamesShimmerCollection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeBannerGamesShimmerCollection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
