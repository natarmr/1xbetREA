package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class nir0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pir0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nir0(pir0 pir0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pir0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pir0 pir0Var = this.k;
        switch (b) {
            case 0:
                nir0 nir0Var = new nir0(pir0Var, yjeVar, (byte) 0);
                nir0Var.j = obj;
                return nir0Var;
            default:
                nir0 nir0Var2 = new nir0(pir0Var, yjeVar, (byte) 1);
                nir0Var2.j = obj;
                return nir0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nir0) create((cjr0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nir0) create((bjr0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                cjr0 cjr0Var = (cjr0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ijr0 ijr0Var = cjr0Var.b;
                hjr0 hjr0Var = ijr0Var instanceof hjr0 ? (hjr0) ijr0Var : null;
                boolean z = hjr0Var != null ? hjr0Var.d : false;
                pir0 pir0Var = this.k;
                if (z) {
                    gnm0.s(pir0Var.C());
                } else {
                    gnm0.i(pir0Var.C());
                }
                return Unit.f46060a;
            default:
                bjr0 bjr0Var = (bjr0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = bjr0Var instanceof tir0;
                pir0 pir0Var2 = this.k;
                if (z2) {
                    tir0 tir0Var = (tir0) bjr0Var;
                    j6m0 j6m0Var = pir0.W1;
                    if (tir0Var.d) {
                        int i = usr0.r2;
                        androidx.fragment.app.e eVarC = pir0Var2.C();
                        eVarC.getClass();
                        if (eVarC.J("TotoBetMakeBetBottomSheetDialog") == null) {
                            new usr0().H0(eVarC, "TotoBetMakeBetBottomSheetDialog");
                        }
                    } else {
                        m6m0 m6m0Var = ikr0.l2;
                        androidx.fragment.app.e eVarC2 = pir0Var2.C();
                        eVarC2.getClass();
                        String str = tir0Var.f34020a;
                        String str2 = tir0Var.b;
                        boolean z3 = tir0Var.c;
                        m6m0Var.getClass();
                        m6m0.m(eVarC2, str, str2, z3);
                    }
                } else if (Intrinsics.d(bjr0Var, uir0.f35747a)) {
                    j6m0 j6m0Var2 = pir0.W1;
                    ii iiVar = pir0Var2.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = pir0Var2.H(R.string.attention);
                    String strH2 = pir0Var2.H(R.string.make_bet_from_primary_balance);
                    String strH3 = pir0Var2.H(R.string.ok);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, pir0Var2.H(R.string.cancel), (String) null, "SHOW_CHANGE_BALANCE_ACTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC3 = pir0Var2.C();
                    eVarC3.getClass();
                    iiVar.d(dialogFields, eVarC3);
                } else if (Intrinsics.d(bjr0Var, wir0.f39232a)) {
                    j6m0 j6m0Var3 = pir0.W1;
                    ii iiVar2 = pir0Var2.O1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = pir0Var2.H(R.string.attention);
                    String strH5 = pir0Var2.H(R.string.toto_clear_warning);
                    String strH6 = pir0Var2.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, pir0Var2.H(R.string.cancel), (String) null, "REQUEST_TOTO_CLEAR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC4 = pir0Var2.C();
                    eVarC4.getClass();
                    iiVar2.d(dialogFields2, eVarC4);
                } else if (Intrinsics.d(bjr0Var, xir0.f40959a)) {
                    j6m0 j6m0Var4 = pir0.W1;
                    ii iiVar3 = pir0Var2.O1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH7 = pir0Var2.H(R.string.toto_card_filling_error);
                    String strH8 = pir0Var2.H(R.string.toto_warning_too_many_outcomes);
                    String strH9 = pir0Var2.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC5 = pir0Var2.C();
                    eVarC5.getClass();
                    iiVar3.d(dialogFields3, eVarC5);
                } else if (bjr0Var instanceof zir0) {
                    wdk0 wdk0Var = pir0Var2.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((zir0) bjr0Var).f44452a, null, null, null, null, 124), pir0Var2, null, null, false, null, 1020);
                } else if (bjr0Var instanceof sir0) {
                    j6m0 j6m0Var5 = pir0.W1;
                    ii iiVar4 = pir0Var2.O1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH10 = pir0Var2.H(R.string.attention);
                    String strH11 = pir0Var2.H(R.string.unacceptable_account_for_section);
                    String strH12 = pir0Var2.H(R.string.ok);
                    strH12.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC6 = pir0Var2.C();
                    eVarC6.getClass();
                    iiVar4.d(dialogFields4, eVarC6);
                } else if (bjr0Var instanceof ajr0) {
                    ajr0 ajr0Var = (ajr0) bjr0Var;
                    j6m0 j6m0Var6 = pir0.W1;
                    lgn0 lgn0Var = pir0Var2.Q1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH13 = pir0Var2.H(R.string.bet_processed_successfully);
                    strH13.getClass();
                    lgn0Var.c(new SuccessBetStringModel(strH13, null, null, null), new SuccessBetAlertModel(w6x.q(pir0Var2.H(R.string.toto_name), ": ", ajr0Var.c), ajr0Var.b, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(ajr0Var.f991a), "TOTO", iun.f15405a), pir0Var2);
                } else if (Intrinsics.d(bjr0Var, vir0.f37494a)) {
                    j6m0 j6m0Var7 = pir0.W1;
                    r9u r9uVar = pir0Var2.S1;
                    if (r9uVar == null) {
                        Intrinsics.h("getFeatureToggleUseCase");
                        throw null;
                    }
                    ygp ygpVar = ygp.B1;
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (j1q0Var.f15748a.d(ygpVar)) {
                        int i2 = ylr0.m2;
                        androidx.fragment.app.e eVarC7 = pir0Var2.C();
                        eVarC7.getClass();
                        yum0.m(eVarC7);
                    } else {
                        int i3 = amr0.m2;
                        androidx.fragment.app.e eVarC8 = pir0Var2.C();
                        eVarC8.getClass();
                        cvm0.l(eVarC8);
                    }
                } else {
                    if (!(bjr0Var instanceof yir0)) {
                        t9f.b();
                        return null;
                    }
                    j6m0 j6m0Var8 = pir0.W1;
                    roq0 roq0Var = pir0Var2.R1;
                    if (roq0Var == null) {
                        Intrinsics.h("tipsDialogScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC9 = pir0Var2.C();
                    eVarC9.getClass();
                    uuz uuzVar = fk60.b;
                    roq0.c(roq0Var, eVarC9, 19);
                }
                return Unit.f46060a;
        }
    }
}
