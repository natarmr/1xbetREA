package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c4b0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c4b0 f3717a = new c4b0(1, v2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicChampsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
        if (dSLottieEmptyContainer != null) {
            i = R.id.recycler;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler);
            if (recyclerView != null) {
                i = R.id.shimmer;
                View viewF = yum0.f(view, R.id.shimmer);
                if (viewF != null) {
                    int i2 = R.id.shimmerSportFive;
                    if (((DsShimmerView) yum0.f(viewF, R.id.shimmerSportFive)) != null) {
                        i2 = R.id.shimmerSportFour;
                        if (((DsShimmerView) yum0.f(viewF, R.id.shimmerSportFour)) != null) {
                            i2 = R.id.shimmerSportOne;
                            if (((DsShimmerView) yum0.f(viewF, R.id.shimmerSportOne)) != null) {
                                i2 = R.id.shimmerSportSix;
                                if (((DsShimmerView) yum0.f(viewF, R.id.shimmerSportSix)) != null) {
                                    i2 = R.id.shimmerSportThree;
                                    if (((DsShimmerView) yum0.f(viewF, R.id.shimmerSportThree)) != null) {
                                        i2 = R.id.shimmerSportTwo;
                                        if (((DsShimmerView) yum0.f(viewF, R.id.shimmerSportTwo)) != null) {
                                            return new v2r((ConstraintLayout) view, dSLottieEmptyContainer, recyclerView, new ewe((ConstraintLayout) viewF, (byte) 2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                    return null;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
