package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class evj0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evj0 f8471a = new evj0(1, bd20.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/make_bet/impl/databinding/MakeBetSimpleFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.balanceView;
        MakeBetBalanceViewDs makeBetBalanceViewDs = (MakeBetBalanceViewDs) yum0.f(view, R.id.balanceView);
        if (makeBetBalanceViewDs != null) {
            i = R.id.barrierFastBet;
            if (((Barrier) yum0.f(view, R.id.barrierFastBet)) != null) {
                i = R.id.barrierFastBetText;
                if (((Barrier) yum0.f(view, R.id.barrierFastBetText)) != null) {
                    i = R.id.barrierTaxBottom;
                    if (((Barrier) yum0.f(view, R.id.barrierTaxBottom)) != null) {
                        i = R.id.barrierTaxTop;
                        if (((Barrier) yum0.f(view, R.id.barrierTaxTop)) != null) {
                            i = R.id.betInputView;
                            BetInputView betInputView = (BetInputView) yum0.f(view, R.id.betInputView);
                            if (betInputView != null) {
                                i = R.id.btnFastBet1;
                                DsButton dsButton = (DsButton) yum0.f(view, R.id.btnFastBet1);
                                if (dsButton != null) {
                                    i = R.id.btnFastBet2;
                                    DsButton dsButton2 = (DsButton) yum0.f(view, R.id.btnFastBet2);
                                    if (dsButton2 != null) {
                                        i = R.id.btnFastBet3;
                                        DsButton dsButton3 = (DsButton) yum0.f(view, R.id.btnFastBet3);
                                        if (dsButton3 != null) {
                                            i = R.id.btnRequestAdvance;
                                            DsButton dsButton4 = (DsButton) yum0.f(view, R.id.btnRequestAdvance);
                                            if (dsButton4 != null) {
                                                i = R.id.grAvailableAdvance;
                                                Group group = (Group) yum0.f(view, R.id.grAvailableAdvance);
                                                if (group != null) {
                                                    i = R.id.grFastBets;
                                                    Group group2 = (Group) yum0.f(view, R.id.grFastBets);
                                                    if (group2 != null) {
                                                        i = R.id.taxSpoiler;
                                                        TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) yum0.f(view, R.id.taxSpoiler);
                                                        if (taxExpandableSpoiler != null) {
                                                            i = R.id.tvAvailableAdvance;
                                                            TextView textView = (TextView) yum0.f(view, R.id.tvAvailableAdvance);
                                                            if (textView != null) {
                                                                i = R.id.tvEnableFastBet;
                                                                TextView textView2 = (TextView) yum0.f(view, R.id.tvEnableFastBet);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvFastBetSubTitle;
                                                                    if (((TextView) yum0.f(view, R.id.tvFastBetSubTitle)) != null) {
                                                                        i = R.id.tvFastBetTitle;
                                                                        if (((TextView) yum0.f(view, R.id.tvFastBetTitle)) != null) {
                                                                            i = R.id.tvPossibleWinValue;
                                                                            TextView textView3 = (TextView) yum0.f(view, R.id.tvPossibleWinValue);
                                                                            if (textView3 != null) {
                                                                                return new bd20((ConstraintLayout) view, makeBetBalanceViewDs, betInputView, dsButton, dsButton2, dsButton3, dsButton4, group, group2, taxExpandableSpoiler, textView, textView2, textView3);
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
