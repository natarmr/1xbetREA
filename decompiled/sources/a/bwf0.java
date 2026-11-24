package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bwf0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bwf0 f3322a = new bwf0(1, f4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentResponsibleGamblingWebBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.errorView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.errorView);
        if (lottieView != null) {
            i = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
            if (materialToolbar != null) {
                i = R.id.webProgress;
                View viewF = yum0.f(view, R.id.webProgress);
                if (viewF != null) {
                    ProgressBar progressBar = (ProgressBar) viewF;
                    nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                    i = R.id.webView;
                    FixedWebView fixedWebView = (FixedWebView) yum0.f(view, R.id.webView);
                    if (fixedWebView != null) {
                        return new f4r((FrameLayout) view, lottieView, materialToolbar, nq8Var, fixedWebView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
