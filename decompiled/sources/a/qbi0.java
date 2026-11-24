package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class qbi0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rbi0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbi0(rbi0 rbi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rbi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rbi0 rbi0Var = this.k;
        switch (b) {
            case 0:
                qbi0 qbi0Var = new qbi0(rbi0Var, yjeVar, (byte) 0);
                qbi0Var.j = obj;
                return qbi0Var;
            default:
                qbi0 qbi0Var2 = new qbi0(rbi0Var, yjeVar, (byte) 1);
                qbi0Var2.j = obj;
                return qbi0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qbi0) create((uci0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qbi0) create((tci0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                uci0 uci0Var = (uci0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gle0 gle0Var = rbi0.U1;
                rbi0 rbi0Var = this.k;
                rbi0Var.H0().i.setText(uci0Var.g);
                DsNavigationBar dsNavigationBar = rbi0Var.H0().g;
                String strH = rbi0Var.H(uci0Var.f);
                strH.getClass();
                dsNavigationBar.setTitle(strH);
                rbi0Var.H0().j.setVisibility(uci0Var.j ? 0 : 8);
                rbi0Var.H0().k.setVisibility(8);
                rbi0Var.H0().h.setVisibility(uci0Var.k ? 0 : 8);
                rbi0Var.H0().d.setVisibility(uci0Var.b ? 0 : 8);
                rbi0Var.H0().f.setVisibility(uci0Var.c ? 0 : 8);
                rbi0Var.H0().e.setVisibility(uci0Var.d ? 0 : 8);
                rbi0Var.H0().c.setVisibility(uci0Var.e ? 0 : 8);
                rbi0Var.H0().b.setVisibility(uci0Var.f35431a ? 0 : 8);
                return Unit.f46060a;
            default:
                tci0 tci0Var = (tci0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = tci0Var instanceof kci0;
                rbi0 rbi0Var2 = this.k;
                if (z) {
                    if (rbi0Var2.L1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    kci0 kci0Var = (kci0) tci0Var;
                    gl5.p(rbi0Var2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", kci0Var.b, kci0Var.f18062a);
                } else if (tci0Var instanceof jci0) {
                    String str = ((jci0) tci0Var).f16279a;
                    gle0 gle0Var2 = rbi0.U1;
                    ii iiVarG0 = rbi0Var2.G0();
                    String strH2 = rbi0Var2.H(R.string.error);
                    String strH3 = rbi0Var2.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str, (CharSequence) strH3, (String) null, (String) null, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = rbi0Var2.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                } else if (tci0Var instanceof qci0) {
                    String str2 = ((qci0) tci0Var).f28484a;
                    gle0 gle0Var3 = rbi0.U1;
                    wdk0 wdk0Var = rbi0Var2.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str2, null, null, null, null, 124), rbi0Var2, null, null, true, null, 1004);
                } else if (tci0Var instanceof sci0) {
                    gle0 gle0Var4 = rbi0.U1;
                    ii iiVarG1 = rbi0Var2.G0();
                    String strH4 = rbi0Var2.H(R.string.caution);
                    String strH5 = rbi0Var2.H(R.string.voice_voice_description);
                    String strH6 = rbi0Var2.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, rbi0Var2.H(R.string.cancel), (String) null, "REQUEST_VOICE_SMS_CONFIRMATION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = rbi0Var2.C();
                    eVarC2.getClass();
                    iiVarG1.d(dialogFields2, eVarC2);
                } else if (tci0Var instanceof nci0) {
                    gle0 gle0Var5 = rbi0.U1;
                    ii iiVarG2 = rbi0Var2.G0();
                    if (rbi0Var2.N1 == null) {
                        Intrinsics.h("logoutDialogFactory");
                        throw null;
                    }
                    String strH7 = rbi0Var2.H(R.string.attention);
                    String strH8 = rbi0Var2.H(R.string.close_the_activation_process_and_logout);
                    String strH9 = rbi0Var2.H(R.string.interrupt);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, rbi0Var2.H(R.string.cancel), (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1520);
                    tx00.l2.getClass();
                    tx00 tx00VarG = evz.g(dialogFields3, false, false, false);
                    androidx.fragment.app.e eVarC3 = rbi0Var2.C();
                    eVarC3.getClass();
                    iiVarG2.c(tx00VarG, eVarC3);
                } else if (tci0Var instanceof pci0) {
                    gle0 gle0Var6 = rbi0.U1;
                    ii iiVarG3 = rbi0Var2.G0();
                    String strH10 = rbi0Var2.H(R.string.error);
                    String strH11 = rbi0Var2.H(R.string.request_error);
                    String strH12 = rbi0Var2.H(R.string.ok_new);
                    strH12.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC4 = rbi0Var2.C();
                    eVarC4.getClass();
                    iiVarG3.d(dialogFields4, eVarC4);
                } else if (tci0Var instanceof oci0) {
                    gle0 gle0Var7 = rbi0.U1;
                    ii iiVarG4 = rbi0Var2.G0();
                    String strH13 = rbi0Var2.H(R.string.attention);
                    String strH14 = rbi0Var2.H(R.string.close_the_activation_process_new);
                    String strH15 = rbi0Var2.H(R.string.interrupt);
                    strH15.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, rbi0Var2.H(R.string.cancel), (String) null, "REQUEST_BACK_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = rbi0Var2.C();
                    eVarC5.getClass();
                    iiVarG4.d(dialogFields5, eVarC5);
                } else if (Intrinsics.d(tci0Var, mci0.f21554a)) {
                    gle0 gle0Var8 = rbi0.U1;
                    ii iiVarG5 = rbi0Var2.G0();
                    String strH16 = rbi0Var2.H(R.string.caution);
                    String strH17 = rbi0Var2.H(R.string.interrupt_authenticator_activation);
                    String strH18 = rbi0Var2.H(R.string.interrupt);
                    strH18.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH16, (CharSequence) strH17, (CharSequence) strH18, rbi0Var2.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = rbi0Var2.C();
                    eVarC6.getClass();
                    iiVarG5.d(dialogFields6, eVarC6);
                } else if (Intrinsics.d(tci0Var, rci0.f30241a)) {
                    gle0 gle0Var9 = rbi0.U1;
                    ii iiVarG6 = rbi0Var2.G0();
                    String strH19 = rbi0Var2.H(R.string.caution);
                    String strH20 = rbi0Var2.H(R.string.dialog_send_code_to_telegram_description);
                    String strH21 = rbi0Var2.H(R.string.ok_new);
                    strH21.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) strH19, (CharSequence) strH20, (CharSequence) strH21, rbi0Var2.H(R.string.cancel), (String) null, "REQUEST_TELEGRAM_CONFIRMATION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC7 = rbi0Var2.C();
                    eVarC7.getClass();
                    iiVarG6.d(dialogFields7, eVarC7);
                } else {
                    if (!Intrinsics.d(tci0Var, lci0.f19802a)) {
                        t9f.b();
                        return null;
                    }
                    gle0 gle0Var10 = rbi0.U1;
                    ii iiVarG7 = rbi0Var2.G0();
                    String strH22 = rbi0Var2.H(R.string.caution);
                    String strH23 = rbi0Var2.H(R.string.dialog_send_code_to_flash_call_description_correct);
                    String strH24 = rbi0Var2.H(R.string.ok_new);
                    strH24.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH22, (CharSequence) strH23, (CharSequence) strH24, rbi0Var2.H(R.string.cancel), (String) null, "REQUEST_FLASH_CALL_CONFIRMATION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC8 = rbi0Var2.C();
                    eVarC8.getClass();
                    iiVarG7.d(dialogFields8, eVarC8);
                }
                return Unit.f46060a;
        }
    }
}
