package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class q0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f27916a;
    public final h6z b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final LottieView g;
    public final FrameLayout h;
    public final nq8 i;
    public final RecyclerView j;
    public final DsNavigationBar k;
    public final SwipeRefreshLayout l;

    public q0r(ConstraintLayout constraintLayout, h6z h6zVar, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout, LinearLayout linearLayout2, LottieView lottieView, FrameLayout frameLayout, nq8 nq8Var, RecyclerView recyclerView, DsNavigationBar dsNavigationBar, SwipeRefreshLayout swipeRefreshLayout) {
        this.f27916a = constraintLayout;
        this.b = h6zVar;
        this.c = materialButton;
        this.d = materialButton2;
        this.e = linearLayout;
        this.f = linearLayout2;
        this.g = lottieView;
        this.h = frameLayout;
        this.i = nq8Var;
        this.j = recyclerView;
        this.k = dsNavigationBar;
        this.l = swipeRefreshLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27916a;
    }
}
