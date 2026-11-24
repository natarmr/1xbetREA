package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class bte {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f3178a;
    public final int b;
    public final DsShimmerView c;

    public bte(ViewGroup viewGroup, int i) {
        this.f3178a = viewGroup;
        this.b = i;
        Context context = viewGroup.getContext();
        context.getClass();
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        jmu0.i(dsShimmerView, dsShimmerView.getResources().getDimensionPixelSize(R.dimen.radius_16));
        dsShimmerView.setVisibility(8);
        this.c = dsShimmerView;
    }

    public final void a() {
        DsShimmerView dsShimmerView = this.c;
        if (dsShimmerView.getVisibility() == 0) {
            ViewGroup viewGroup = this.f3178a;
            dsShimmerView.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        }
    }

    public final void b(int i) {
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
    }

    public final void c() {
        this.c.setVisibility(0);
        x0x.s(this.f3178a);
    }
}
