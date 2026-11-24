package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pvc extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pvc f27656a = new pvc(1, q6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/promotions/news/impl/databinding/FragmentWebCmsBannerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.appBarLayout;
        if (((AppBarLayout) yum0.f(view, R.id.appBarLayout)) != null) {
            i = R.id.bannerImage;
            LoadableImageView loadableImageView = (LoadableImageView) yum0.f(view, R.id.bannerImage);
            if (loadableImageView != null) {
                i = R.id.collapsingToolbarLayout;
                if (((CollapsingToolbarLayout) yum0.f(view, R.id.collapsingToolbarLayout)) != null) {
                    i = R.id.lottieEmptyView;
                    LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                    if (lottieView != null) {
                        i = R.id.navigationBar;
                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                        if (dsNavigationBar != null) {
                            i = R.id.progressView;
                            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progressView);
                            if (frameLayout != null) {
                                i = R.id.webView;
                                FixedWebView fixedWebView = (FixedWebView) yum0.f(view, R.id.webView);
                                if (fixedWebView != null) {
                                    return new q6r((ConstraintLayout) view, loadableImageView, lottieView, dsNavigationBar, frameLayout, fixedWebView);
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
