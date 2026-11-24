package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nph0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nph0 f23915a = new nph0(1, n4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentSecuritySectionBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnTakeGift;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.btnTakeGift);
        if (dsBottomBar != null) {
            i = R.id.errorView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.errorView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.flProgress;
                if (((FrameLayout) yum0.f(view, R.id.flProgress)) != null) {
                    i = R.id.fragmentSecurityNavigationBar;
                    DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.fragmentSecurityNavigationBar);
                    if (dsNavigationBarBasic != null) {
                        i = R.id.llSecurityContent;
                        LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.llSecurityContent);
                        if (linearLayout != null) {
                            i = R.id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                            if (recyclerView != null) {
                                i = R.id.swipeRefreshLayout;
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) yum0.f(view, R.id.swipeRefreshLayout);
                                if (swipeRefreshLayout != null) {
                                    return new n4r((ConstraintLayout) view, dsBottomBar, dSLottieEmptyContainer, dsNavigationBarBasic, linearLayout, recyclerView, swipeRefreshLayout);
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
