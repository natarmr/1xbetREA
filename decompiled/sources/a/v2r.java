package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class v2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36700a;
    public final DSLottieEmptyContainer b;
    public final RecyclerView c;
    public final ewe d;

    public v2r(ConstraintLayout constraintLayout, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, ewe eweVar) {
        this.f36700a = constraintLayout;
        this.b = dSLottieEmptyContainer;
        this.c = recyclerView;
        this.d = eweVar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36700a;
    }
}
