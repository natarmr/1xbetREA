package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ar9 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ar9 f1335a = new ar9(1, wyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/callback/impl/databinding/FragmentCallbackHistoryBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
        if (lottieView != null) {
            i = R.id.rvHistory;
            OptimizedScrollRecyclerView optimizedScrollRecyclerView = (OptimizedScrollRecyclerView) yum0.f(view, R.id.rvHistory);
            if (optimizedScrollRecyclerView != null) {
                i = R.id.shimmerContainer;
                View viewF = yum0.f(view, R.id.shimmerContainer);
                if (viewF != null) {
                    int i2 = R.id.shimmerFive;
                    if (((DsHeader) yum0.f(viewF, R.id.shimmerFive)) != null) {
                        i2 = R.id.shimmerFour;
                        if (((DsShimmerView) yum0.f(viewF, R.id.shimmerFour)) != null) {
                            i2 = R.id.shimmerOne;
                            if (((DsHeader) yum0.f(viewF, R.id.shimmerOne)) != null) {
                                i2 = R.id.shimmerSix;
                                if (((DsShimmerView) yum0.f(viewF, R.id.shimmerSix)) != null) {
                                    i2 = R.id.shimmerThree;
                                    if (((DsHeader) yum0.f(viewF, R.id.shimmerThree)) != null) {
                                        i2 = R.id.shimmerTwo;
                                        if (((DsShimmerView) yum0.f(viewF, R.id.shimmerTwo)) != null) {
                                            vr9 vr9Var = new vr9((LinearLayout) viewF, (byte) 0);
                                            i = R.id.tvEmptyHistoryMessage;
                                            TextView textView = (TextView) yum0.f(view, R.id.tvEmptyHistoryMessage);
                                            if (textView != null) {
                                                return new wyq((ConstraintLayout) view, lottieView, optimizedScrollRecyclerView, vr9Var, textView);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
