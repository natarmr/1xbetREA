package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class y2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41919a;
    public final DSLottieEmptyContainer b;
    public final nq8 c;
    public final RecyclerView d;

    public y2r(ConstraintLayout constraintLayout, DSLottieEmptyContainer dSLottieEmptyContainer, nq8 nq8Var, RecyclerView recyclerView) {
        this.f41919a = constraintLayout;
        this.b = dSLottieEmptyContainer;
        this.c = nq8Var;
        this.d = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41919a;
    }
}
