package a;

import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class c6q implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f3830a;
    public final DsSegmentedGroup b;
    public final CoordinatorLayout c;
    public final TextView d;
    public final ViewPager2 e;

    public c6q(CoordinatorLayout coordinatorLayout, DsSegmentedGroup dsSegmentedGroup, CoordinatorLayout coordinatorLayout2, TextView textView, ViewPager2 viewPager2) {
        this.f3830a = coordinatorLayout;
        this.b = dsSegmentedGroup;
        this.c = coordinatorLayout2;
        this.d = textView;
        this.e = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3830a;
    }
}
