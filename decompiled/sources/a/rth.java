package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.game.core.InterceptTouchRecyclerView;
import org.xplatform.cyber.game.core.game_background.presentation.view.TopCropFillImageView;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.toolbar.statical.DsNavigationBarStatic;

/* JADX INFO: loaded from: classes3.dex */
public final class rth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31078a;
    public final ComposeView b;
    public final TopCropFillImageView c;
    public final DsLottieEmpty d;
    public final DsNavigationBarStatic e;
    public final InterceptTouchRecyclerView f;

    public rth(ConstraintLayout constraintLayout, ComposeView composeView, TopCropFillImageView topCropFillImageView, DsLottieEmpty dsLottieEmpty, DsNavigationBarStatic dsNavigationBarStatic, InterceptTouchRecyclerView interceptTouchRecyclerView) {
        this.f31078a = constraintLayout;
        this.b = composeView;
        this.c = topCropFillImageView;
        this.d = dsLottieEmpty;
        this.e = dsNavigationBarStatic;
        this.f = interceptTouchRecyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31078a;
    }
}
