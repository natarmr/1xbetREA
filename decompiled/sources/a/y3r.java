package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;

/* JADX INFO: loaded from: classes5.dex */
public final class y3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f41966a;
    public final AppBarLayout b;
    public final nq8 c;
    public final vd7 d;
    public final LoaderView e;
    public final MaterialButton f;
    public final FrameLayout g;

    public y3r(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, nq8 nq8Var, vd7 vd7Var, LoaderView loaderView, MaterialButton materialButton, FrameLayout frameLayout) {
        this.f41966a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = nq8Var;
        this.d = vd7Var;
        this.e = loaderView;
        this.f = materialButton;
        this.g = frameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41966a;
    }
}
