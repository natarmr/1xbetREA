package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class ne70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oe70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne70(oe70 oe70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = oe70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oe70 oe70Var = this.k;
        switch (b) {
            case 0:
                ne70 ne70Var = new ne70(oe70Var, yjeVar, (byte) 0);
                ne70Var.j = obj;
                return ne70Var;
            default:
                ne70 ne70Var2 = new ne70(oe70Var, yjeVar, (byte) 1);
                ne70Var2.j = obj;
                return ne70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ne70) create((qe70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ne70) create((we70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        oe70 oe70Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                qe70 qe70Var = (qe70) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = qe70Var.f28569a;
                iiy[] iiyVarArr = oe70.Q1;
                if (z) {
                    oe70Var.G0().b.b();
                } else {
                    oe70Var.G0().b.c();
                }
                oe70Var.G0().b.setVisibility(z ? 0 : 8);
                oe70Var.G0().c.setVisibility(z ? 8 : 0);
                oe70Var.G0().c.setBalance(qe70Var.b);
                oe70Var.G0().c.setEnabled(qe70Var.c);
                oe70Var.G0().c.setChevronVisible(qe70Var.d);
                return Unit.f46060a;
            default:
                we70 we70Var = (we70) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (we70Var != null) {
                    if (we70Var instanceof ue70) {
                        boolean z2 = ((ue70) we70Var).f35511a;
                        iiy[] iiyVarArr2 = oe70.Q1;
                        peg0 peg0Var = oe70Var.N1;
                        if (peg0Var == null) {
                            Intrinsics.h("changeBalanceFeature");
                            throw null;
                        }
                        ynb ynbVarI = ((yzn0) peg0Var.b).i();
                        bm5 bm5Var = bm5.d;
                        androidx.fragment.app.e eVarC = oe70Var.C();
                        eVarC.getClass();
                        ynb.b(ynbVarI, bm5Var, null, eVarC, z2, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 206);
                    } else if (we70Var instanceof re70) {
                        iiy[] iiyVarArr3 = oe70.Q1;
                        ii iiVar = oe70Var.M1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = oe70Var.H(R.string.change_balance_account);
                        String strH2 = oe70Var.H(R.string.not_enough_money_bonus_balance_message);
                        String strH3 = oe70Var.H(R.string.ok);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, oe70Var.H(R.string.change_balance_account), (String) null, "CHANGE_ACCOUNT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC2 = oe70Var.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (we70Var instanceof se70) {
                        iiy[] iiyVarArr4 = oe70.Q1;
                        ii iiVar2 = oe70Var.M1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = oe70Var.H(R.string.attention);
                        String strH5 = oe70Var.H(R.string.game_not_allowed_from_bonus_account_warning_message_web_game);
                        String strH6 = oe70Var.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = oe70Var.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    } else if (we70Var instanceof te70) {
                        iiy[] iiyVarArr5 = oe70.Q1;
                        ii iiVar3 = oe70Var.M1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH7 = oe70Var.H(R.string.not_enough_money);
                        String strH8 = oe70Var.H(R.string.insufficient_bonus_balance_for_increase_dialog_body);
                        String strH9 = oe70Var.H(R.string.ok);
                        strH9.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC4 = oe70Var.C();
                        eVarC4.getClass();
                        iiVar3.d(dialogFields3, eVarC4);
                    } else if (we70Var instanceof ve70) {
                        iiy[] iiyVarArr6 = oe70.Q1;
                        ii iiVar4 = oe70Var.M1;
                        if (iiVar4 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH10 = oe70Var.H(R.string.attention);
                        String strH11 = oe70Var.H(R.string.selected_balance_unavailable_description);
                        String strH12 = oe70Var.H(R.string.ok);
                        strH12.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, "SECTION_BALANCE_EXPIRED_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC5 = oe70Var.C();
                        eVarC5.getClass();
                        iiVar4.d(dialogFields4, eVarC5);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
