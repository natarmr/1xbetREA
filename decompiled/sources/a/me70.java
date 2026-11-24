package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.presentation.balance.OnexGamesBalanceView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class me70 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final me70 f21631a = new me70(1, pe70.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/core/databinding/OnexGameBalanceFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.balanceShimmer;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) yum0.f(view, R.id.balanceShimmer);
        if (shimmerFrameLayout != null) {
            i = R.id.balanceShimmerOld;
            if (((ShimmerFrameLayout) yum0.f(view, R.id.balanceShimmerOld)) != null) {
                i = R.id.onexGameBalance;
                OnexGamesBalanceView onexGamesBalanceView = (OnexGamesBalanceView) yum0.f(view, R.id.onexGameBalance);
                if (onexGamesBalanceView != null) {
                    return new pe70((ConstraintLayout) view, shimmerFrameLayout, onexGamesBalanceView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
