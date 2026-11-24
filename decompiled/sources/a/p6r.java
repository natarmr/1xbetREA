package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class p6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f26470a;
    public final ConstraintLayout b;
    public final LottieView c;
    public final DsNavigationBar d;
    public final TextView e;
    public final nq8 f;
    public final FixedWebView g;

    public p6r(FrameLayout frameLayout, ConstraintLayout constraintLayout, LottieView lottieView, DsNavigationBar dsNavigationBar, TextView textView, nq8 nq8Var, FixedWebView fixedWebView) {
        this.f26470a = frameLayout;
        this.b = constraintLayout;
        this.c = lottieView;
        this.d = dsNavigationBar;
        this.e = textView;
        this.f = nq8Var;
        this.g = fixedWebView;
    }

    public static p6r a(View view) {
        int i = R.id.clErrorData;
        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.clErrorData);
        if (constraintLayout != null) {
            i = R.id.errorView;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.errorView);
            if (lottieView != null) {
                i = R.id.ivErrorData;
                if (((ImageView) yum0.f(view, R.id.ivErrorData)) != null) {
                    i = R.id.lineErrorDataBottom;
                    if (((Guideline) yum0.f(view, R.id.lineErrorDataBottom)) != null) {
                        i = R.id.lineErrorDataLeft;
                        if (((Guideline) yum0.f(view, R.id.lineErrorDataLeft)) != null) {
                            i = R.id.lineErrorDataRight;
                            if (((Guideline) yum0.f(view, R.id.lineErrorDataRight)) != null) {
                                i = R.id.lineErrorDataTop;
                                if (((Guideline) yum0.f(view, R.id.lineErrorDataTop)) != null) {
                                    i = R.id.navigationBar;
                                    DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                                    if (dsNavigationBar != null) {
                                        i = R.id.tvErrorData;
                                        TextView textView = (TextView) yum0.f(view, R.id.tvErrorData);
                                        if (textView != null) {
                                            i = R.id.webProgress;
                                            View viewF = yum0.f(view, R.id.webProgress);
                                            if (viewF != null) {
                                                ProgressBar progressBar = (ProgressBar) viewF;
                                                nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                                                i = R.id.webView;
                                                FixedWebView fixedWebView = (FixedWebView) yum0.f(view, R.id.webView);
                                                if (fixedWebView != null) {
                                                    return new p6r((FrameLayout) view, constraintLayout, lottieView, dsNavigationBar, textView, nq8Var, fixedWebView);
                                                }
                                            }
                                        }
                                    }
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

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26470a;
    }
}
