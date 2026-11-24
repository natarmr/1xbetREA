package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fvj0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fvj0 f10218a = new fvj0(1, m6q.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetFragmentSimpleBetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.betInputView;
        BetInputView betInputView = (BetInputView) yum0.f(view, R.id.betInputView);
        if (betInputView != null) {
            i = R.id.makeBetBalance;
            MakeBetBalanceViewDs makeBetBalanceViewDs = (MakeBetBalanceViewDs) yum0.f(view, R.id.makeBetBalance);
            if (makeBetBalanceViewDs != null) {
                i = R.id.possibleWinTv;
                TextView textView = (TextView) yum0.f(view, R.id.possibleWinTv);
                if (textView != null) {
                    i = R.id.taxSpoiler;
                    TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) yum0.f(view, R.id.taxSpoiler);
                    if (taxExpandableSpoiler != null) {
                        return new m6q((LinearLayout) view, betInputView, makeBetBalanceViewDs, textView, taxExpandableSpoiler);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
