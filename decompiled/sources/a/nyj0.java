package a;

import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class nyj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oyj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nyj0(oyj0 oyj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = oyj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oyj0 oyj0Var = this.k;
        switch (b) {
            case 0:
                nyj0 nyj0Var = new nyj0(oyj0Var, yjeVar, (byte) 0);
                nyj0Var.j = obj;
                return nyj0Var;
            case 1:
                nyj0 nyj0Var2 = new nyj0(oyj0Var, yjeVar, (byte) 1);
                nyj0Var2.j = obj;
                return nyj0Var2;
            case 2:
                nyj0 nyj0Var3 = new nyj0(oyj0Var, yjeVar, (byte) 2);
                nyj0Var3.j = obj;
                return nyj0Var3;
            case 3:
                nyj0 nyj0Var4 = new nyj0(oyj0Var, yjeVar, (byte) 3);
                nyj0Var4.j = obj;
                return nyj0Var4;
            default:
                nyj0 nyj0Var5 = new nyj0(oyj0Var, yjeVar, (byte) 4);
                nyj0Var5.j = obj;
                return nyj0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nyj0) create((pd7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((nyj0) create((rur0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((nyj0) create((pn5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((nyj0) create((hwj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nyj0) create((eh5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        oyj0 oyj0Var = this.k;
        switch (b) {
            case 0:
                pd7 pd7Var = (pd7) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gle0 gle0Var = oyj0.U1;
                BetInputView betInputView = oyj0Var.G0().e;
                String str = pd7Var.b;
                int i = BetInputView.v;
                betInputView.w(null, str);
                BetInputView betInputView2 = oyj0Var.G0().e;
                boolean z = pd7Var.f26794a;
                betInputView2.y(z);
                if (!z) {
                    SpannableString spannableStringC = pd7Var.c.c(oyj0Var.o0());
                    oyj0Var.G0().e.setBetLimitsText(spannableStringC);
                    oyj0Var.G0().e.x(spannableStringC.toString(), pd7Var.e);
                    oyj0Var.G0().e.setMakeBetButtonEnabled(pd7Var.d);
                }
                return Unit.f46060a;
            case 1:
                rur0 rur0Var = (rur0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gle0 gle0Var2 = oyj0.U1;
                if (rur0Var.c) {
                    oyj0Var.G0().c.e();
                    oyj0Var.G0().c.setVisibility(0);
                    if (rur0Var.d.length() > 0) {
                        oyj0Var.G0().c.f();
                    }
                }
                return Unit.f46060a;
            case 2:
                pn5 pn5Var = (pn5) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gle0 gle0Var3 = oyj0.U1;
                MakeBetBalanceViewDs makeBetBalanceViewDs = oyj0Var.G0().b;
                if (pn5Var.c) {
                    MakeBetBalanceViewDs makeBetBalanceViewDs2 = oyj0Var.G0().b;
                    String strH = oyj0Var.H(R.string.change_balance_account);
                    strH.getClass();
                    makeBetBalanceViewDs2.setChangeBalanceBtnText(strH);
                } else {
                    MakeBetBalanceViewDs makeBetBalanceViewDs3 = oyj0Var.G0().b;
                    String strH2 = oyj0Var.H(R.string.refill_account);
                    strH2.getClass();
                    makeBetBalanceViewDs3.setChangeBalanceBtnText(strH2);
                }
                oyj0Var.R1 = new rd7(pn5Var.c, (Object) oyj0Var, (byte) 19);
                if (pn5Var.d) {
                    makeBetBalanceViewDs.v();
                } else {
                    makeBetBalanceViewDs.x();
                    makeBetBalanceViewDs.setModel(pn5Var.f27268a);
                }
                return Unit.f46060a;
            case 3:
                hwj0 hwj0Var = (hwj0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                gle0 gle0Var4 = oyj0.U1;
                boolean z2 = hwj0Var instanceof fwj0;
                oyj0 oyj0Var2 = this.k;
                if (z2) {
                    fwj0 fwj0Var = (fwj0) hwj0Var;
                    Fragment fragment = oyj0Var2.y;
                    ikr0 ikr0Var = fragment instanceof ikr0 ? (ikr0) fragment : null;
                    if (ikr0Var != null) {
                        ikr0Var.X0(false);
                    }
                    wdk0 wdk0Var = oyj0Var2.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, fwj0Var.f10264a, null, null, null, null, 124), oyj0Var2, null, null, false, null, 1020);
                    Fragment fragment2 = oyj0Var2.y;
                    yo8 yo8Var = fragment2 instanceof yo8 ? (yo8) fragment2 : null;
                    if (yo8Var != null) {
                        yo8Var.x0();
                    }
                } else if (hwj0Var instanceof ewj0) {
                    ewj0 ewj0Var = (ewj0) hwj0Var;
                    Fragment fragment3 = oyj0Var2.y;
                    ikr0 ikr0Var2 = fragment3 instanceof ikr0 ? (ikr0) fragment3 : null;
                    if (ikr0Var2 != null) {
                        ikr0Var2.X0(false);
                    }
                    wdk0 wdk0Var2 = oyj0Var2.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, ewj0Var.f8530a, oyj0Var2, null, oyj0Var2.G0().d, false, null, 1012);
                    View view = oyj0Var2.l1;
                    if (view != null) {
                        view.setElevation(oyj0Var2.G().getDimension(R.dimen.elevation_16));
                    }
                } else if (hwj0Var instanceof gwj0) {
                    gwj0 gwj0Var = (gwj0) hwj0Var;
                    Fragment fragment4 = oyj0Var2.y;
                    ikr0 ikr0Var3 = fragment4 instanceof ikr0 ? (ikr0) fragment4 : null;
                    if (ikr0Var3 != null) {
                        ikr0Var3.X0(false);
                    }
                    lgn0 lgn0Var = oyj0Var2.Q1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH3 = oyj0Var2.H(R.string.bet_processed_successfully);
                    strH3.getClass();
                    SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH3, null, null, null);
                    String strQ = w6x.q(oyj0Var2.H(R.string.toto_name), ": ", gwj0Var.d);
                    String str2 = gwj0Var.b;
                    String strH4 = oyj0Var2.H(R.string.bet_sum);
                    strH4.getClass();
                    pn40 pn40Var = pn40.f27267a;
                    lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strQ, str2, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(gwj0Var.f12031a), "TOTO", kotlin.collections.a.c(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, oyj0Var2.o0()), strH4, pn40.c(gwj0Var.c, p3u0.c), gwj0Var.e, true))), oyj0Var2.p0().p0());
                    Fragment fragment5 = oyj0Var2.y;
                    yo8 yo8Var2 = fragment5 instanceof yo8 ? (yo8) fragment5 : null;
                    if (yo8Var2 != null) {
                        yo8Var2.x0();
                    }
                } else if (hwj0Var instanceof dwj0) {
                    dwj0 dwj0Var = (dwj0) hwj0Var;
                    Fragment fragment6 = oyj0Var2.y;
                    ikr0 ikr0Var4 = fragment6 instanceof ikr0 ? (ikr0) fragment6 : null;
                    if (ikr0Var4 != null) {
                        ikr0Var4.X0(false);
                    }
                    String str3 = dwj0Var.f6802a;
                    ii iiVar = oyj0Var2.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = oyj0Var2.H(R.string.error);
                    String strH6 = oyj0Var2.H(R.string.replenish);
                    strH6.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH5, (CharSequence) str3, (CharSequence) strH6, oyj0Var2.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC = oyj0Var2.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    if (!Intrinsics.d(hwj0Var, cwj0.f5084a)) {
                        t9f.b();
                        return null;
                    }
                    Fragment fragment7 = oyj0Var2.y;
                    ikr0 ikr0Var5 = fragment7 instanceof ikr0 ? (ikr0) fragment7 : null;
                    if (ikr0Var5 != null) {
                        ikr0Var5.X0(true);
                    }
                    oyj0Var2.G0().e.setMakeBetButtonEnabled(false);
                }
                return Unit.f46060a;
            default:
                eh5 eh5Var = (eh5) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                gle0 gle0Var5 = oyj0.U1;
                if (Intrinsics.d(eh5Var, wg5.f39096a)) {
                    oyj0Var.G0().b.u();
                } else if (Intrinsics.d(eh5Var, ah5.f856a)) {
                    oyj0Var.G0().b.w();
                }
                return Unit.f46060a;
        }
    }
}
