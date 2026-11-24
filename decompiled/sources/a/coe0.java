package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class coe0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final coe0 f4695a = new coe0(1, x3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/referral/impl/databinding/FragmentReferralProgramLoadDataBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.loader;
        LoaderView loaderView = (LoaderView) yum0.f(view, R.id.loader);
        if (loaderView != null) {
            i = R.id.lottieEmptyView;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
            if (lottieView != null) {
                i = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                if (materialToolbar != null) {
                    return new x3r((ConstraintLayout) view, loaderView, lottieView, materialToolbar);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
