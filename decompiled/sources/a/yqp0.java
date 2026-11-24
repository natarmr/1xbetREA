package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yqp0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yqp0 f43086a = new yqp0(1, t5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/special_event/impl/databinding/FragmentTeamsSelectorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.lottieEmptyView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                    if (recyclerView != null) {
                        i = R.id.shimmer;
                        View viewF = yum0.f(view, R.id.shimmer);
                        if (viewF != null) {
                            return new t5r((ConstraintLayout) view, dsBottomBar, dSLottieEmptyContainer, dsNavigationBarBasic, recyclerView, new vr9((LinearLayout) viewF, (byte) 3));
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
