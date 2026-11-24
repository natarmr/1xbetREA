package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xi90 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xi90 f40934a = new xi90(1, t2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/personal/impl/databinding/FragmentPersonalDataBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.errorView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.errorView);
        if (lottieView != null) {
            i = R.id.navigationBar;
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBarBasic != null) {
                i = R.id.progress;
                View viewF = yum0.f(view, R.id.progress);
                if (viewF != null) {
                    ProgressBar progressBar = (ProgressBar) viewF;
                    nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                    i = R.id.rvPersonalInfoList;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvPersonalInfoList);
                    if (recyclerView != null) {
                        return new t2r(nq8Var, (ConstraintLayout) view, recyclerView, lottieView, dsNavigationBarBasic);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
