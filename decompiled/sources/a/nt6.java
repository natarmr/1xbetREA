package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nt6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nt6 f24080a = new nt6(1, xyj0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bet_constructor/impl/databinding/SimpleMakeBetFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.balanceView;
        MakeBetBalanceViewDs makeBetBalanceViewDs = (MakeBetBalanceViewDs) yum0.f(view, R.id.balanceView);
        if (makeBetBalanceViewDs != null) {
            i = R.id.barrierTaxBottom;
            if (((Barrier) yum0.f(view, R.id.barrierTaxBottom)) != null) {
                i = R.id.barrierTaxTop;
                if (((Barrier) yum0.f(view, R.id.barrierTaxTop)) != null) {
                    i = R.id.betInput;
                    BetInputView betInputView = (BetInputView) yum0.f(view, R.id.betInput);
                    if (betInputView != null) {
                        i = R.id.snackbarContainer;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) yum0.f(view, R.id.snackbarContainer);
                        if (coordinatorLayout != null) {
                            i = R.id.taxSpoiler;
                            TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) yum0.f(view, R.id.taxSpoiler);
                            if (taxExpandableSpoiler != null) {
                                i = R.id.tvPossibleWinValue;
                                TextView textView = (TextView) yum0.f(view, R.id.tvPossibleWinValue);
                                if (textView != null) {
                                    return new xyj0((ConstraintLayout) view, makeBetBalanceViewDs, betInputView, coordinatorLayout, taxExpandableSpoiler, textView);
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
