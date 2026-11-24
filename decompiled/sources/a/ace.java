package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.rules.impl.util.ContactsWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ace extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ace f623a = new ace(1, lzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/rules/impl/databinding/FragmentContactsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.errorView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.errorView);
        if (lottieView != null) {
            i = R.id.frameWebView;
            ContactsWebView contactsWebView = (ContactsWebView) yum0.f(view, R.id.frameWebView);
            if (contactsWebView != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progress);
                    if (progressBar != null) {
                        return new lzq((ConstraintLayout) view, lottieView, contactsWebView, dsNavigationBarBasic, progressBar);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
