package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x6u0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x6u0 f40382a = new x6u0(1, k6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/special_event/impl/databinding/FragmentVenuesBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.iShimmer;
        View viewF = yum0.f(view, R.id.iShimmer);
        if (viewF != null) {
            vr9 vr9Var = new vr9((LinearLayout) viewF, (byte) 5);
            i = R.id.levError;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.levError);
            if (dSLottieEmptyContainer != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.rvVenues;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvVenues);
                    if (recyclerView != null) {
                        return new k6r((ConstraintLayout) view, vr9Var, dSLottieEmptyContainer, dsNavigationBarBasic, recyclerView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
