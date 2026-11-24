package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t590 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t590 f33357a = new t590(1, m590.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/promotions/databinding/PaymentConsultantFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
        if (lottieView != null) {
            i = R.id.progressView;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progressView);
            if (frameLayout != null) {
                i = R.id.promoWebToolbar;
                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.promoWebToolbar);
                if (dsNavigationBar != null) {
                    i = R.id.webView;
                    FixedWebView fixedWebView = (FixedWebView) yum0.f(view, R.id.webView);
                    if (fixedWebView != null) {
                        return new m590((ConstraintLayout) view, lottieView, frameLayout, dsNavigationBar, fixedWebView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
