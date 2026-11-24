package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class k6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17784a;
    public final vr9 b;
    public final DSLottieEmptyContainer c;
    public final DsNavigationBarBasic d;
    public final RecyclerView e;

    public k6r(ConstraintLayout constraintLayout, vr9 vr9Var, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBarBasic dsNavigationBarBasic, RecyclerView recyclerView) {
        this.f17784a = constraintLayout;
        this.b = vr9Var;
        this.c = dSLottieEmptyContainer;
        this.d = dsNavigationBarBasic;
        this.e = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17784a;
    }
}
