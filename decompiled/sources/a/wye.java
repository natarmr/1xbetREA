package a;

import android.text.TextWatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes.dex */
public final class wye extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xye k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wye(xye xyeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xyeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xye xyeVar = this.k;
        switch (b) {
            case 0:
                wye wyeVar = new wye(xyeVar, yjeVar, (byte) 0);
                wyeVar.j = obj;
                return wyeVar;
            case 1:
                wye wyeVar2 = new wye(xyeVar, yjeVar, (byte) 1);
                wyeVar2.j = obj;
                return wyeVar2;
            default:
                wye wyeVar3 = new wye(xyeVar, yjeVar, (byte) 2);
                wyeVar3.j = obj;
                return wyeVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wye) create((br00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wye) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wye) create((s6c0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xye xyeVar = this.k;
        switch (b) {
            case 0:
                br00 br00Var = (br00) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(br00Var, ar00.f1321a)) {
                    gnm0.s(xyeVar.C());
                } else {
                    if (!Intrinsics.d(br00Var, zq00.f44786a)) {
                        t9f.b();
                        return null;
                    }
                    gnm0.i(xyeVar.C());
                }
                return Unit.f46060a;
            case 1:
                String str = (String) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                n0o0 n0o0Var = xyeVar.S1;
                nwd nwdVar = xye.U1;
                if (!String.valueOf(xyeVar.G0().c.getText()).equals(str)) {
                    xyeVar.G0().c.c((TextWatcher) n0o0Var.getValue());
                    xyeVar.G0().c.setText(str);
                    xyeVar.G0().c.a((TextWatcher) n0o0Var.getValue());
                }
                xyeVar.G0().b.setEnabled(str.length() > 0);
                return Unit.f46060a;
            default:
                s6c0 s6c0Var = (s6c0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (s6c0Var != null) {
                    boolean z = s6c0Var instanceof l6c0;
                    xye xyeVar2 = this.k;
                    if (z) {
                        wdk0 wdk0Var = xyeVar2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, ((l6c0) s6c0Var).f19501a, xyeVar2, null, null, false, null, 1020);
                    } else if (s6c0Var instanceof q6c0) {
                        q6c0 q6c0Var = (q6c0) s6c0Var;
                        nwd nwdVar2 = xye.U1;
                        lgn0 lgn0Var = xyeVar2.N1;
                        if (lgn0Var == null) {
                            Intrinsics.h("successBetAlertManager");
                            throw null;
                        }
                        String strH = xyeVar2.H(R.string.bet_processed_successfully);
                        strH.getClass();
                        SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, q6c0Var.e, null);
                        String strQ = w6x.q(xyeVar2.H(R.string.promo), ": ", xyeVar2.H(lgb.V(q6c0Var.d)));
                        String str2 = q6c0Var.c;
                        String strH2 = xyeVar2.H(R.string.coefficient);
                        strH2.getClass();
                        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strQ, str2, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(q6c0Var.f28193a), "PROMO", kotlin.collections.a.c(new SuccessBetInfoItem.Simple(strH2, q6c0Var.b))), acb.P(xyeVar2));
                        xyeVar2.G0().c.setText("");
                    } else if (s6c0Var instanceof n6c0) {
                        iw20 iw20Var = xyeVar2.O1;
                        if (iw20Var == null) {
                            Intrinsics.h("promoCodesNavigator");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = xyeVar2.C();
                        eVarC.getClass();
                        iw20Var.j(eVarC, ((n6c0) s6c0Var).f22991a);
                    } else if (s6c0Var instanceof j6c0) {
                        ii iiVar = xyeVar2.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH3 = xyeVar2.H(R.string.error);
                        String str3 = ((j6c0) s6c0Var).f15978a;
                        String strH4 = xyeVar2.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) str3, (CharSequence) strH4, xyeVar2.H(R.string.cancel), (String) null, "REQUEST_BET_EXISTS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC2 = xyeVar2.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
