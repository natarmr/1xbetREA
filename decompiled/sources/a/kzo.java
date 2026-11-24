package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BalanceView;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kzo extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kzo f19161a = new kzo(1, wzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/fast_games/impl/databinding/FragmentFastGamesBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.balanceView;
        BalanceView balanceView = (BalanceView) yum0.f(view, R.id.balanceView);
        if (balanceView != null) {
            i = R.id.clToolbarContainer;
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
                                    return new wzq((FrameLayout) view, balanceView, lottieView, materialToolbar, textView, progressBar, fixedWebView);
                                }
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
