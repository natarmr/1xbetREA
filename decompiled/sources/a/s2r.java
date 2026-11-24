package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final class s2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f31516a;
    public final ConstraintLayout b;
    public final LottieView c;
    public final DsNavigationBar d;
    public final TextView e;
    public final nq8 f;
    public final PaymentWebView g;

    public s2r(FrameLayout frameLayout, ConstraintLayout constraintLayout, LottieView lottieView, DsNavigationBar dsNavigationBar, TextView textView, nq8 nq8Var, PaymentWebView paymentWebView) {
        this.f31516a = frameLayout;
        this.b = constraintLayout;
        this.c = lottieView;
        this.d = dsNavigationBar;
        this.e = textView;
        this.f = nq8Var;
        this.g = paymentWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31516a;
    }
}
