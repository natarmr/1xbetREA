package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class t1w implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33188a;
    public final AppBarLayout b;
    public final DsAuthorizationButtons c;
    public final View d;
    public final ConstraintLayout e;
    public final ConstraintLayout f;
    public final ConstraintLayout g;
    public final CoordinatorLayout h;
    public final FrameLayout i;
    public final DsNavigationBar j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final LottieView n;
    public final RecyclerView o;
    public final SwipeRefreshLayout p;
    public final TextView q;
    public final TextView r;
    public final TextView s;

    public t1w(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, DsAuthorizationButtons dsAuthorizationButtons, View view, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, DsNavigationBar dsNavigationBar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LottieView lottieView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f33188a = constraintLayout;
        this.b = appBarLayout;
        this.c = dsAuthorizationButtons;
        this.d = view;
        this.e = constraintLayout2;
        this.f = constraintLayout3;
        this.g = constraintLayout4;
        this.h = coordinatorLayout;
        this.i = frameLayout;
        this.j = dsNavigationBar;
        this.k = linearLayout;
        this.l = linearLayout2;
        this.m = linearLayout3;
        this.n = lottieView;
        this.o = recyclerView;
        this.p = swipeRefreshLayout;
        this.q = textView;
        this.r = textView2;
        this.s = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33188a;
    }
}
