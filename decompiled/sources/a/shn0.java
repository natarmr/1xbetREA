package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class shn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final shn0 f32221a = new shn0(1, r0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/verification/sum_sub/impl/databinding/FragmentIframeSumSubBinding;", 0);

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
                i = R.id.verificationToolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.verificationToolbar);
                if (materialToolbar != null) {
                    i = R.id.webView;
                    FixedWebView fixedWebView = (FixedWebView) yum0.f(view, R.id.webView);
                    if (fixedWebView != null) {
                        return new r0r((ConstraintLayout) view, lottieView, frameLayout, materialToolbar, fixedWebView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
