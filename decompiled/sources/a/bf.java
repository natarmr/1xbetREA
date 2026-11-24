package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bf extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bf f2477a = new bf(1, hxq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/balancemanagement/impl/databinding/FragmentAccountNumberBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
        if (lottieView != null) {
            i = R.id.navigationBar;
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBarBasic != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progress);
                if (progressBar != null) {
                    i = R.id.webView;
                    FixedWebView fixedWebView = (FixedWebView) yum0.f(view, R.id.webView);
                    if (fixedWebView != null) {
                        return new hxq((ConstraintLayout) view, lottieView, dsNavigationBarBasic, progressBar, fixedWebView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
