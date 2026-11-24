package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class azq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1731a;
    public final DsBottomBar b;
    public final ConstraintLayout c;
    public final LottieView d;
    public final DsNavigationBarBasic e;
    public final ContentLoadingProgressBar f;
    public final DsPhoneTextField g;
    public final MaterialTextView h;
    public final MaterialTextView i;

    public azq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, ConstraintLayout constraintLayout2, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic, ContentLoadingProgressBar contentLoadingProgressBar, DsPhoneTextField dsPhoneTextField, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f1731a = constraintLayout;
        this.b = dsBottomBar;
        this.c = constraintLayout2;
        this.d = lottieView;
        this.e = dsNavigationBarBasic;
        this.f = contentLoadingProgressBar;
        this.g = dsPhoneTextField;
        this.h = materialTextView;
        this.i = materialTextView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1731a;
    }
}
