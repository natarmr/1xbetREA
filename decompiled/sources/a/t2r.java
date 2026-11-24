package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class t2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33229a;
    public final LottieView b;
    public final DsNavigationBarBasic c;
    public final nq8 d;
    public final RecyclerView e;

    public t2r(nq8 nq8Var, ConstraintLayout constraintLayout, RecyclerView recyclerView, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic) {
        this.f33229a = constraintLayout;
        this.b = lottieView;
        this.c = dsNavigationBarBasic;
        this.d = nq8Var;
        this.e = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33229a;
    }
}
