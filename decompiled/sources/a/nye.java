package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nye extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nye f24326a = new nye(1, wre.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/coupon/impl/databinding/CouponAutoBetDsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.balanceView;
        MakeBetBalanceViewDs makeBetBalanceViewDs = (MakeBetBalanceViewDs) yum0.f(view, R.id.balanceView);
        if (makeBetBalanceViewDs != null) {
            i = R.id.inputBarrier;
            if (((Barrier) yum0.f(view, R.id.inputBarrier)) != null) {
                i = R.id.possibleWinBarrier;
                if (((Barrier) yum0.f(view, R.id.possibleWinBarrier)) != null) {
                    i = R.id.possibleWinSum;
                    TextView textView = (TextView) yum0.f(view, R.id.possibleWinSum);
                    if (textView != null) {
                        i = R.id.siBetSum;
                        BetInputView betInputView = (BetInputView) yum0.f(view, R.id.siBetSum);
                        if (betInputView != null) {
                            i = R.id.siCoef;
                            BetInputView betInputView2 = (BetInputView) yum0.f(view, R.id.siCoef);
                            if (betInputView2 != null) {
                                i = R.id.taxSpoiler;
                                TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) yum0.f(view, R.id.taxSpoiler);
                                if (taxExpandableSpoiler != null) {
                                    return new wre((ConstraintLayout) view, makeBetBalanceViewDs, textView, betInputView, betInputView2, taxExpandableSpoiler);
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
