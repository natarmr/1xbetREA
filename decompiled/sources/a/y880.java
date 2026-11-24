package a;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y880 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y880 f42184a = new y880(1, m2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/callback/impl/databinding/FragmentOrderCallBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.lottieEmptyViewOrderCall;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyViewOrderCall);
            if (lottieView != null) {
                i = R.id.mainContent;
                ScrollView scrollView = (ScrollView) yum0.f(view, R.id.mainContent);
                if (scrollView != null) {
                    i = R.id.phoneTextField;
                    DsPhoneTextField dsPhoneTextField = (DsPhoneTextField) yum0.f(view, R.id.phoneTextField);
                    if (dsPhoneTextField != null) {
                        i = R.id.progress;
                        View viewF = yum0.f(view, R.id.progress);
                        if (viewF != null) {
                            ProgressBar progressBar = (ProgressBar) viewF;
                            nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                            i = R.id.tfLanguage;
                            DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfLanguage);
                            if (dsTextField != null) {
                                i = R.id.tfMessage;
                                DsTextField dsTextField2 = (DsTextField) yum0.f(view, R.id.tfMessage);
                                if (dsTextField2 != null) {
                                    return new m2r((ConstraintLayout) view, dsBottomBar, lottieView, scrollView, dsPhoneTextField, nq8Var, dsTextField, dsTextField2);
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
}
