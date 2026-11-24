package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class d2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f5370a;
    public final RecyclerView b;
    public final LottieView c;
    public final DsNavigationBarBasic d;
    public final nq8 e;

    public d2r(nq8 nq8Var, ConstraintLayout constraintLayout, RecyclerView recyclerView, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic) {
        this.f5370a = constraintLayout;
        this.b = recyclerView;
        this.c = lottieView;
        this.d = dsNavigationBarBasic;
        this.e = nq8Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5370a;
    }
}
