package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s3v0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3v0 f31577a = new s3v0(1, v3v0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/web_rules/impl/databinding/WebRulesFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.clToolbarContainer;
        if (((ConstraintLayout) yum0.f(view, R.id.clToolbarContainer)) != null) {
            i = R.id.errorView;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.errorView);
            if (lottieView != null) {
                i = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                if (materialToolbar != null) {
                    i = R.id.toolbarTitle;
                    TextView textView = (TextView) yum0.f(view, R.id.toolbarTitle);
                    if (textView != null) {
                        i = R.id.webProgressBar;
                        ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.webProgressBar);
                        if (progressBar != null) {
                            i = R.id.webView;
                            FixedWebView fixedWebView = (FixedWebView) yum0.f(view, R.id.webView);
                            if (fixedWebView != null) {
                                return new v3v0((FrameLayout) view, lottieView, materialToolbar, textView, progressBar, fixedWebView);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
