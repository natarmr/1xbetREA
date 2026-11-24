package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes.dex */
public final class ozq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f26112a;
    public final FrameLayout b;
    public final DsButton c;
    public final DsButton d;
    public final DsButton e;
    public final DsButton f;
    public final ConstraintLayout g;
    public final ConstraintLayout h;
    public final e0f i;
    public final e0f j;
    public final View k;
    public final Group l;
    public final LinearLayout m;
    public final Group n;
    public final FrameLayout o;
    public final DsShimmerView p;
    public final DsSegmentedGroup q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final ViewPager2 u;

    public ozq(NestedScrollView nestedScrollView, FrameLayout frameLayout, DsButton dsButton, DsButton dsButton2, DsButton dsButton3, DsButton dsButton4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, e0f e0fVar, e0f e0fVar2, View view, Group group, LinearLayout linearLayout, Group group2, FrameLayout frameLayout2, DsShimmerView dsShimmerView, DsSegmentedGroup dsSegmentedGroup, TextView textView, TextView textView2, TextView textView3, ViewPager2 viewPager2) {
        this.f26112a = nestedScrollView;
        this.b = frameLayout;
        this.c = dsButton;
        this.d = dsButton2;
        this.e = dsButton3;
        this.f = dsButton4;
        this.g = constraintLayout;
        this.h = constraintLayout2;
        this.i = e0fVar;
        this.j = e0fVar2;
        this.k = view;
        this.l = group;
        this.m = linearLayout;
        this.n = group2;
        this.o = frameLayout2;
        this.p = dsShimmerView;
        this.q = dsSegmentedGroup;
        this.r = textView;
        this.s = textView2;
        this.t = textView3;
        this.u = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26112a;
    }
}
