package a;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lyj0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lyj0 f20865a = new lyj0(1, u4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/toto_bet/impl/databinding/FragmentSimpleDsBetTotoBetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.balanceView;
        MakeBetBalanceViewDs makeBetBalanceViewDs = (MakeBetBalanceViewDs) yum0.f(view, R.id.balanceView);
        if (makeBetBalanceViewDs != null) {
            i = R.id.ellTax;
            TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) yum0.f(view, R.id.ellTax);
            if (taxExpandableSpoiler != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.space3;
                if (((Space) yum0.f(view, R.id.space3)) != null) {
                    i = R.id.stepInputView;
                    BetInputView betInputView = (BetInputView) yum0.f(view, R.id.stepInputView);
                    if (betInputView != null) {
                        return new u4r(constraintLayout, makeBetBalanceViewDs, taxExpandableSpoiler, constraintLayout, betInputView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
