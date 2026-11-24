package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class r0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29644a;
    public final LottieView b;
    public final FrameLayout c;
    public final MaterialToolbar d;
    public final FixedWebView e;

    public r0r(ConstraintLayout constraintLayout, LottieView lottieView, FrameLayout frameLayout, MaterialToolbar materialToolbar, FixedWebView fixedWebView) {
        this.f29644a = constraintLayout;
        this.b = lottieView;
        this.c = frameLayout;
        this.d = materialToolbar;
        this.e = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29644a;
    }
}
