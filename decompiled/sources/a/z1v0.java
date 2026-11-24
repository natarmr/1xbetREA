package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z1v0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1v0 f43641a = new z1v0(1, tjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/captcha/databinding/DialogWebCaptchaDesignSystemBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_web_captcha_design_system, (ViewGroup) null, false);
        int i = R.id.navigationBar;
        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(viewInflate, R.id.navigationBar);
        if (dsNavigationBarBasic != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) yum0.f(viewInflate, R.id.progress);
            if (progressBar != null) {
                i = R.id.webView;
                FixedWebView fixedWebView = (FixedWebView) yum0.f(viewInflate, R.id.webView);
                if (fixedWebView != null) {
                    return new tjk((FrameLayout) viewInflate, dsNavigationBarBasic, progressBar, fixedWebView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
