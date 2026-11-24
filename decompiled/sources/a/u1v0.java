package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u1v0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1v0 f34919a = new u1v0(1, sjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/captcha/databinding/DialogWebCaptchaBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_web_captcha, (ViewGroup) null, false);
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) yum0.f(viewInflate, R.id.progress);
        if (progressBar != null) {
            i = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(viewInflate, R.id.toolbar);
            if (materialToolbar != null) {
                i = R.id.webView;
                FixedWebView fixedWebView = (FixedWebView) yum0.f(viewInflate, R.id.webView);
                if (fixedWebView != null) {
                    return new sjk((FrameLayout) viewInflate, progressBar, materialToolbar, fixedWebView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
