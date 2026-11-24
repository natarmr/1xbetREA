package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hi5 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hi5 f13097a = new hi5(1, hyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/balancemanagement/impl/databinding/FragmentBalanceManagementContentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.layoutBalanceManagementShimmer;
        View viewF = yum0.f(view, R.id.layoutBalanceManagementShimmer);
        if (viewF != null) {
            int i2 = R.id.shimmerBlock1;
            View viewF2 = yum0.f(viewF, R.id.shimmerBlock1);
            if (viewF2 != null) {
                ewe.a(viewF2);
                i2 = R.id.shimmerBlock2;
                View viewF3 = yum0.f(viewF, R.id.shimmerBlock2);
                if (viewF3 != null) {
                    ewe.a(viewF3);
                    i2 = R.id.view1;
                    if (((DsShimmerView) yum0.f(viewF, R.id.view1)) != null) {
                        i2 = R.id.view1Container;
                        if (((Flow) yum0.f(viewF, R.id.view1Container)) != null) {
                            i2 = R.id.view2;
                            if (((DsShimmerView) yum0.f(viewF, R.id.view2)) != null) {
                                i2 = R.id.view2Container;
                                if (((Flow) yum0.f(viewF, R.id.view2Container)) != null) {
                                    i2 = R.id.view3;
                                    if (((DsShimmerView) yum0.f(viewF, R.id.view3)) != null) {
                                        i2 = R.id.view3Container;
                                        if (((Flow) yum0.f(viewF, R.id.view3Container)) != null) {
                                            ewe eweVar = new ewe((ConstraintLayout) viewF, (byte) 9);
                                            i = R.id.lottieEmptyView;
                                            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
                                            if (dSLottieEmptyContainer != null) {
                                                i = R.id.rvHistory;
                                                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvHistory);
                                                if (recyclerView != null) {
                                                    i = R.id.swipeRefreshView;
                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) yum0.f(view, R.id.swipeRefreshView);
                                                    if (swipeRefreshLayout != null) {
                                                        return new hyq((FrameLayout) view, eweVar, dSLottieEmptyContainer, recyclerView, swipeRefreshLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
            return null;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
