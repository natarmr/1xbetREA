package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.rules.impl.util.ContactsWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class lzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f20917a;
    public final LottieView b;
    public final ContactsWebView c;
    public final DsNavigationBarBasic d;
    public final ProgressBar e;

    public lzq(ConstraintLayout constraintLayout, LottieView lottieView, ContactsWebView contactsWebView, DsNavigationBarBasic dsNavigationBarBasic, ProgressBar progressBar) {
        this.f20917a = constraintLayout;
        this.b = lottieView;
        this.c = contactsWebView;
        this.d = dsNavigationBarBasic;
        this.e = progressBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20917a;
    }
}
