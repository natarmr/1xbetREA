package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fqm0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fqm0 f9983a = new fqm0(1, wth.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentStockBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            i = R.id.lottieEmptyView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieEmptyView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.shimmers;
                    View viewF = yum0.f(view, R.id.shimmers);
                    if (viewF != null) {
                        int i2 = R.id.vEmptyBannerFirst;
                        if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyBannerFirst)) != null) {
                            i2 = R.id.vEmptyBannerSecond;
                            if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyBannerSecond)) != null) {
                                i2 = R.id.vEmptyBannerThird;
                                if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyBannerThird)) != null) {
                                    i2 = R.id.vEmptyDescriptionFirst;
                                    if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyDescriptionFirst)) != null) {
                                        i2 = R.id.vEmptyDescriptionSecond;
                                        if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyDescriptionSecond)) != null) {
                                            i2 = R.id.vEmptyDescriptionThird;
                                            if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyDescriptionThird)) != null) {
                                                i2 = R.id.vEmptyTitleFirst;
                                                if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyTitleFirst)) != null) {
                                                    i2 = R.id.vEmptyTitleSecond;
                                                    if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyTitleSecond)) != null) {
                                                        i2 = R.id.vEmptyTitleThird;
                                                        if (((DsShimmerView) yum0.f(viewF, R.id.vEmptyTitleThird)) != null) {
                                                            return new wth((ConstraintLayout) view, composeView, dSLottieEmptyContainer, recyclerView, new ewe((ConstraintLayout) viewF, (byte) 1));
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
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
