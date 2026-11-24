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

/* JADX INFO: loaded from: classes5.dex */
public final class g6c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h6c0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6c0(h6c0 h6c0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = h6c0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        h6c0 h6c0Var = this.k;
        switch (b) {
            case 0:
                g6c0 g6c0Var = new g6c0(h6c0Var, yjeVar, (byte) 0);
                g6c0Var.j = obj;
                return g6c0Var;
            case 1:
                g6c0 g6c0Var2 = new g6c0(h6c0Var, yjeVar, (byte) 1);
                g6c0Var2.j = obj;
                return g6c0Var2;
            case 2:
                g6c0 g6c0Var3 = new g6c0(h6c0Var, yjeVar, (byte) 2);
                g6c0Var3.j = obj;
                return g6c0Var3;
            default:
                g6c0 g6c0Var4 = new g6c0(h6c0Var, yjeVar, (byte) 3);
                g6c0Var4.j = obj;
                return g6c0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g6c0) create((ffe) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g6c0) create((wq00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((g6c0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g6c0) create((r6c0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        h6c0 h6c0Var = this.k;
        switch (b) {
            case 0:
                n0o0 n0o0Var = h6c0Var.V1;
                ffe ffeVar = (ffe) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(ffeVar, cfe.f4257a)) {
                    nh70 nh70Var = h6c0.W1;
                    h6c0Var.H0().c.setEnabled(true);
                    g7c0 g7c0VarI0 = h6c0Var.I0();
                    String strValueOf = String.valueOf(h6c0Var.H0().c.getText());
                    p7m0 p7m0Var = g7c0VarI0.D;
                    p7m0Var.getClass();
                    p7m0Var.o(null, strValueOf);
                    h6c0Var.H0().c.a((TextWatcher) n0o0Var.getValue());
                } else {
                    if (!Intrinsics.d(ffeVar, efe.f7718a)) {
                        t9f.b();
                        return null;
                    }
                    nh70 nh70Var2 = h6c0.W1;
                    h6c0Var.H0().c.setEnabled(false);
                    h6c0Var.H0().b.setEnabled(false);
                    h6c0Var.H0().c.c((TextWatcher) n0o0Var.getValue());
                }
                return Unit.f46060a;
            case 1:
                wq00 wq00Var = (wq00) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(wq00Var, vq00.f37833a)) {
                    gnm0.s(h6c0Var.C());
                } else {
                    if (!Intrinsics.d(wq00Var, uq00.f36094a)) {
                        t9f.b();
                        return null;
                    }
                    gnm0.i(h6c0Var.C());
                }
                return Unit.f46060a;
            case 2:
                String str = (String) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                n0o0 n0o0Var2 = h6c0Var.V1;
                nh70 nh70Var3 = h6c0.W1;
                if (!String.valueOf(h6c0Var.H0().c.getText()).equals(str)) {
                    h6c0Var.H0().c.c((TextWatcher) n0o0Var2.getValue());
                    h6c0Var.H0().c.setText(str);
                    h6c0Var.H0().c.a((TextWatcher) n0o0Var2.getValue());
                }
                h6c0Var.H0().b.setEnabled(str.length() > 0);
                return Unit.f46060a;
            default:
                r6c0 r6c0Var = (r6c0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (r6c0Var != null) {
                    boolean z = r6c0Var instanceof k6c0;
                    h6c0 h6c0Var2 = this.k;
                    if (z) {
                        wdk0 wdk0Var = h6c0Var2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((k6c0) r6c0Var).f17762a, null, null, null, null, 124), h6c0Var2, null, h6c0.G0(h6c0Var2).Q0().r, false, null, 1012);
                    } else if (r6c0Var instanceof p6c0) {
                        p6c0 p6c0Var = (p6c0) r6c0Var;
                        nh70 nh70Var4 = h6c0.W1;
                        lgn0 lgn0Var = h6c0Var2.O1;
                        if (lgn0Var == null) {
                            Intrinsics.h("successBetAlertManager");
                            throw null;
                        }
                        String strH = h6c0Var2.H(R.string.bet_processed_successfully);
                        strH.getClass();
                        SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, p6c0Var.d, null);
                        String strQ = w6x.q(h6c0Var2.H(R.string.promo), ": ", h6c0Var2.H(R.string.single));
                        String str2 = p6c0Var.c;
                        String strH2 = h6c0Var2.H(R.string.coefficient);
                        strH2.getClass();
                        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strQ, str2, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(p6c0Var.f26448a), "PROMO", kotlin.collections.a.c(new SuccessBetInfoItem.Simple(strH2, p6c0Var.b))), h6c0.G0(h6c0Var2).p0());
                        h6c0.G0(h6c0Var2).x0();
                        h6c0Var2.H0().c.setText(null);
                    } else if (r6c0Var instanceof i6c0) {
                        ii iiVar = h6c0Var2.N1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH3 = h6c0Var2.H(R.string.error);
                        String str3 = ((i6c0) r6c0Var).f14233a;
                        String strH4 = h6c0Var2.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) str3, (CharSequence) strH4, h6c0Var2.H(R.string.cancel), (String) null, "REQUEST_BET_EXISTS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC = h6c0Var2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (r6c0Var instanceof o6c0) {
                        iw20 iw20Var = h6c0Var2.P1;
                        if (iw20Var == null) {
                            Intrinsics.h("promoCodesNavigator");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC2 = h6c0Var2.C();
                        eVarC2.getClass();
                        iw20Var.j(eVarC2, ((o6c0) r6c0Var).f24728a);
                    } else if (r6c0Var instanceof m6c0) {
                        wdk0 wdk0Var2 = h6c0Var2.M1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var2, ((m6c0) r6c0Var).f21263a, h6c0Var2, null, h6c0.G0(h6c0Var2).Q0().r, false, null, 1012);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
