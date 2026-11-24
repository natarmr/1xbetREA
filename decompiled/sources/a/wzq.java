package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.views.BalanceView;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final class wzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f40032a;
    public final BalanceView b;
    public final LottieView c;
    public final MaterialToolbar d;
    public final TextView e;
    public final ProgressBar f;
    public final FixedWebView g;

    public wzq(FrameLayout frameLayout, BalanceView balanceView, LottieView lottieView, MaterialToolbar materialToolbar, TextView textView, ProgressBar progressBar, FixedWebView fixedWebView) {
        this.f40032a = frameLayout;
        this.b = balanceView;
        this.c = lottieView;
        this.d = materialToolbar;
        this.e = textView;
        this.f = progressBar;
        this.g = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40032a;
    }
}
