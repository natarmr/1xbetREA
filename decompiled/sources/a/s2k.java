package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final class s2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f31504a;
    public final DsShimmerView b;
    public final LinearLayout c;
    public final DsHeader d;

    public s2k(LinearLayout linearLayout, DsShimmerView dsShimmerView, LinearLayout linearLayout2, DsHeader dsHeader) {
        this.f31504a = linearLayout;
        this.b = dsShimmerView;
        this.c = linearLayout2;
        this.d = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31504a;
    }
}
