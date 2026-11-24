package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class wth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39740a;
    public final ComposeView b;
    public final DSLottieEmptyContainer c;
    public final RecyclerView d;
    public final ewe e;

    public wth(ConstraintLayout constraintLayout, ComposeView composeView, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, ewe eweVar) {
        this.f39740a = constraintLayout;
        this.b = composeView;
        this.c = dSLottieEmptyContainer;
        this.d = recyclerView;
        this.e = eweVar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39740a;
    }
}
