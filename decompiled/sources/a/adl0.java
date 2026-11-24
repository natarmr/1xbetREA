package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class adl0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final adl0 f686a = new adl0(1, a5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/special_event/impl/databinding/FragmentSportGameFilterSelectionBinding;", 0);

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
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.toolbar;
                    DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.toolbar);
                    if (dsNavigationBarBasic != null) {
                        return new a5r((ConstraintLayout) view, dsBottomBar, dSLottieEmptyContainer, recyclerView, dsNavigationBarBasic);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
