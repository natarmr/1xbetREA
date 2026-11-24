package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.costrule.SettoeMezzoRuleView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f6o f9022a = new f6o(3, d8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticSettoemezzoCostRuleItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_settoemezzo_cost_rule_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.vEightRule;
        SettoeMezzoRuleView settoeMezzoRuleView = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vEightRule);
        if (settoeMezzoRuleView != null) {
            i = R.id.vFirstRule;
            SettoeMezzoRuleView settoeMezzoRuleView2 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vFirstRule);
            if (settoeMezzoRuleView2 != null) {
                i = R.id.vFiveRule;
                SettoeMezzoRuleView settoeMezzoRuleView3 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vFiveRule);
                if (settoeMezzoRuleView3 != null) {
                    i = R.id.vFourthRule;
                    SettoeMezzoRuleView settoeMezzoRuleView4 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vFourthRule);
                    if (settoeMezzoRuleView4 != null) {
                        i = R.id.vNineRule;
                        SettoeMezzoRuleView settoeMezzoRuleView5 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vNineRule);
                        if (settoeMezzoRuleView5 != null) {
                            i = R.id.vSecondRule;
                            SettoeMezzoRuleView settoeMezzoRuleView6 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vSecondRule);
                            if (settoeMezzoRuleView6 != null) {
                                i = R.id.vSevenRule;
                                SettoeMezzoRuleView settoeMezzoRuleView7 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vSevenRule);
                                if (settoeMezzoRuleView7 != null) {
                                    i = R.id.vSixRule;
                                    SettoeMezzoRuleView settoeMezzoRuleView8 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vSixRule);
                                    if (settoeMezzoRuleView8 != null) {
                                        i = R.id.vTenRule;
                                        SettoeMezzoRuleView settoeMezzoRuleView9 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vTenRule);
                                        if (settoeMezzoRuleView9 != null) {
                                            i = R.id.vThirdRule;
                                            SettoeMezzoRuleView settoeMezzoRuleView10 = (SettoeMezzoRuleView) yum0.f(viewInflate, R.id.vThirdRule);
                                            if (settoeMezzoRuleView10 != null) {
                                                return new d8o0((ConstraintLayout) viewInflate, settoeMezzoRuleView, settoeMezzoRuleView2, settoeMezzoRuleView3, settoeMezzoRuleView4, settoeMezzoRuleView5, settoeMezzoRuleView6, settoeMezzoRuleView7, settoeMezzoRuleView8, settoeMezzoRuleView9, settoeMezzoRuleView10);
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
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
