package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hk30 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hk30 f13191a = new hk30(1, a2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/special_event/impl/databinding/FragmentMedalStatisticBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.iHeader;
        View viewF = yum0.f(view, R.id.iHeader);
        if (viewF != null) {
            int i2 = R.id.ivBronze;
            if (((ImageView) yum0.f(viewF, R.id.ivBronze)) != null) {
                i2 = R.id.ivGold;
                if (((ImageView) yum0.f(viewF, R.id.ivGold)) != null) {
                    i2 = R.id.ivRank;
                    if (((ImageView) yum0.f(viewF, R.id.ivRank)) != null) {
                        i2 = R.id.ivSilver;
                        if (((ImageView) yum0.f(viewF, R.id.ivSilver)) != null) {
                            i2 = R.id.ivTotal;
                            if (((ImageView) yum0.f(viewF, R.id.ivTotal)) != null) {
                                i2 = R.id.tvCountry;
                                if (((TextView) yum0.f(viewF, R.id.tvCountry)) != null) {
                                    ewe eweVar = new ewe((ConstraintLayout) viewF, (byte) 7);
                                    i = R.id.iShimmer;
                                    View viewF2 = yum0.f(view, R.id.iShimmer);
                                    if (viewF2 != null) {
                                        vr9 vr9Var = new vr9((LinearLayout) viewF2, (byte) 4);
                                        i = R.id.levLottie;
                                        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.levLottie);
                                        if (dSLottieEmptyContainer != null) {
                                            i = R.id.rvMedalStatistic;
                                            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvMedalStatistic);
                                            if (recyclerView != null) {
                                                i = R.id.srlRefresh;
                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) yum0.f(view, R.id.srlRefresh);
                                                if (swipeRefreshLayout != null) {
                                                    i = R.id.toolbar;
                                                    DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.toolbar);
                                                    if (dsNavigationBarBasic != null) {
                                                        i = R.id.touchArea;
                                                        View viewF3 = yum0.f(view, R.id.touchArea);
                                                        if (viewF3 != null) {
                                                            return new a2r((ConstraintLayout) view, eweVar, vr9Var, dSLottieEmptyContainer, recyclerView, swipeRefreshLayout, dsNavigationBarBasic, viewF3);
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
            }
            hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
            return null;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
