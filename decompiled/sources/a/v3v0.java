package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class v3v0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f36749a;
    public final LottieView b;
    public final MaterialToolbar c;
    public final TextView d;
    public final ProgressBar e;
    public final FixedWebView f;

    public v3v0(FrameLayout frameLayout, LottieView lottieView, MaterialToolbar materialToolbar, TextView textView, ProgressBar progressBar, FixedWebView fixedWebView) {
        this.f36749a = frameLayout;
        this.b = lottieView;
        this.c = materialToolbar;
        this.d = textView;
        this.e = progressBar;
        this.f = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36749a;
    }
}
