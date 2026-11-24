package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class zq6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44792a;
    public final MaterialButton b;
    public final ComposeView c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final LottieView f;
    public final DsNavigationBarBasic g;
    public final RecyclerView h;

    public zq6(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, FrameLayout frameLayout, FrameLayout frameLayout2, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic, RecyclerView recyclerView) {
        this.f44792a = constraintLayout;
        this.b = materialButton;
        this.c = composeView;
        this.d = frameLayout;
        this.e = frameLayout2;
        this.f = lottieView;
        this.g = dsNavigationBarBasic;
        this.h = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44792a;
    }
}
