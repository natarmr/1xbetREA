package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class oam0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24934a;
    public final DsBottomBar b;
    public final ComposeView c;
    public final DSLottieEmptyContainer d;
    public final RecyclerView e;

    public oam0(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, ComposeView composeView, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView) {
        this.f24934a = constraintLayout;
        this.b = dsBottomBar;
        this.c = composeView;
        this.d = dSLottieEmptyContainer;
        this.e = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24934a;
    }
}
