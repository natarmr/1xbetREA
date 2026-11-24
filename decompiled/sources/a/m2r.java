package a;

import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final class m2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21077a;
    public final DsBottomBar b;
    public final LottieView c;
    public final ScrollView d;
    public final DsPhoneTextField e;
    public final nq8 f;
    public final DsTextField g;
    public final DsTextField h;

    public m2r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, LottieView lottieView, ScrollView scrollView, DsPhoneTextField dsPhoneTextField, nq8 nq8Var, DsTextField dsTextField, DsTextField dsTextField2) {
        this.f21077a = constraintLayout;
        this.b = dsBottomBar;
        this.c = lottieView;
        this.d = scrollView;
        this.e = dsPhoneTextField;
        this.f = nq8Var;
        this.g = dsTextField;
        this.h = dsTextField2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21077a;
    }
}
