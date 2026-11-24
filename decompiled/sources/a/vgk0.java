package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vgk0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vgk0 f37385a = new vgk0(1, jjk0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/social/impl/databinding/SocialWebViewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.social_web_view, (ViewGroup) null, false);
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) yum0.f(viewInflate, R.id.progress);
        if (progressBar != null) {
            i = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(viewInflate, R.id.toolbar);
            if (materialToolbar != null) {
                i = R.id.webView;
                FixedWebView fixedWebView = (FixedWebView) yum0.f(viewInflate, R.id.webView);
                if (fixedWebView != null) {
                    return new jjk0((ConstraintLayout) viewInflate, progressBar, materialToolbar, fixedWebView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
