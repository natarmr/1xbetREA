package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class igd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jgd0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ igd0(jgd0 jgd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jgd0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jgd0 jgd0Var = this.k;
        switch (b) {
            case 0:
                igd0 igd0Var = new igd0(jgd0Var, yjeVar, (byte) 0);
                igd0Var.j = obj;
                return igd0Var;
            default:
                igd0 igd0Var2 = new igd0(jgd0Var, yjeVar, (byte) 1);
                igd0Var2.j = obj;
                return igd0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((igd0) create((khd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((igd0) create((lhd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = 0;
        switch (this.i) {
            case 0:
                khd0 khd0Var = (khd0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (khd0Var != null) {
                    boolean z = khd0Var instanceof zgd0;
                    jgd0 jgd0Var = this.k;
                    if (z) {
                        xi70 xi70Var = jgd0.V1;
                        jgd0Var.H0().e.setErrorText("");
                    } else if (khd0Var instanceof ahd0) {
                        j120.Y(jgd0Var);
                    } else if (khd0Var instanceof ihd0) {
                        xi70 xi70Var2 = jgd0.V1;
                        ii iiVarG0 = jgd0Var.G0();
                        String strH = jgd0Var.H(R.string.attention);
                        String strH2 = jgd0Var.H(R.string.qr_auth_enabled);
                        String strH3 = jgd0Var.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC = jgd0Var.C();
                        eVarC.getClass();
                        iiVarG0.d(dialogFields, eVarC);
                    } else if (khd0Var instanceof fhd0) {
                        xi70 xi70Var3 = jgd0.V1;
                        ii iiVarG1 = jgd0Var.G0();
                        String strH4 = jgd0Var.H(R.string.caution);
                        String strH5 = jgd0Var.H(R.string.close_the_activation_process_new);
                        String strH6 = jgd0Var.H(R.string.interrupt);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, jgd0Var.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = jgd0Var.C();
                        eVarC2.getClass();
                        iiVarG1.d(dialogFields2, eVarC2);
                    } else if (khd0Var instanceof chd0) {
                        boolean z2 = ((chd0) khd0Var).f4354a;
                        xi70 xi70Var4 = jgd0.V1;
                        jgd0Var.H0().d.setVisibility(z2 ? 0 : 8);
                    } else if (khd0Var instanceof ghd0) {
                        wdk0 wdk0Var = jgd0Var.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((ghd0) khd0Var).f11292a, null, null, null, null, 124), jgd0Var, null, null, false, null, 1020);
                    } else if (khd0Var instanceof ehd0) {
                        String str = ((ehd0) khd0Var).f7802a;
                        xi70 xi70Var5 = jgd0.V1;
                        jgd0Var.H0().e.setErrorText(str);
                        jgd0Var.H0().e.f(true);
                    } else if (khd0Var instanceof dhd0) {
                        String str2 = ((dhd0) khd0Var).f6085a;
                        xi70 xi70Var6 = jgd0.V1;
                        ii iiVarG2 = jgd0Var.G0();
                        String strH7 = jgd0Var.H(R.string.error);
                        String strH8 = jgd0Var.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) str2, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = jgd0Var.C();
                        eVarC3.getClass();
                        iiVarG2.d(dialogFields3, eVarC3);
                    } else if (khd0Var instanceof jhd0) {
                        String str3 = ((jhd0) khd0Var).f16521a;
                        xi70 xi70Var7 = jgd0.V1;
                        ii iiVarG3 = jgd0Var.G0();
                        String strH9 = jgd0Var.H(R.string.error);
                        String strH10 = jgd0Var.H(R.string.ok_new);
                        strH10.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) str3, (CharSequence) strH10, (String) null, (String) null, "REQUEST_TOKEN_EXPIRED_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC4 = jgd0Var.C();
                        eVarC4.getClass();
                        iiVarG3.d(dialogFields4, eVarC4);
                    } else if (khd0Var instanceof hhd0) {
                        xi70 xi70Var8 = jgd0.V1;
                        ii iiVarG4 = jgd0Var.G0();
                        String strH11 = jgd0Var.H(R.string.error);
                        String strH12 = jgd0Var.H(R.string.request_error);
                        String strH13 = jgd0Var.H(R.string.ok_new);
                        strH13.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC5 = jgd0Var.C();
                        eVarC5.getClass();
                        iiVarG4.d(dialogFields5, eVarC5);
                    } else if (khd0Var instanceof bhd0) {
                        xi70 xi70Var9 = jgd0.V1;
                        jgd0Var.H0().e.setText(((bhd0) khd0Var).f2601a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                lhd0 lhd0Var = (lhd0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xi70 xi70Var10 = jgd0.V1;
                jgd0 jgd0Var2 = this.k;
                jgd0Var2.H0().g.setText(lhd0Var.f20050a);
                jgd0Var2.H0().f.setVisibility(lhd0Var.c ? 0 : 8);
                if (!lhd0Var.d.equals(mgd0.f21737a)) {
                    t9f.b();
                    return null;
                }
                jgd0Var2.H0().b.setFirstButtonVisibility(false);
                qgd0 qgd0Var = lhd0Var.e;
                if (qgd0Var.equals(ogd0.f25214a)) {
                    jgd0Var2.H0().b.setSecondButtonVisibility(false);
                } else {
                    if (!(qgd0Var instanceof pgd0)) {
                        t9f.b();
                        return null;
                    }
                    jgd0Var2.H0().b.setSecondButtonVisibility(true);
                    jgd0Var2.H0().b.setSecondButtonStyle(R.style.DSButton_Large_Secondary);
                    jgd0Var2.H0().b.setSecondButtonText(((pgd0) qgd0Var).f26950a);
                    DsBottomBar.v(jgd0Var2.H0().b, new gvb0(jgd0Var2, qgd0Var, (byte) 11));
                }
                rgd0 rgd0Var = lhd0Var.f;
                jgd0Var2.H0().b.setThirdButtonVisibility(true);
                jgd0Var2.H0().b.setThirdButtonText(rgd0Var.f30429a);
                jgd0Var2.H0().b.setThirdButtonEnabled(rgd0Var.b);
                DsBottomBar.w(jgd0Var2.H0().b, new ggd0(jgd0Var2, b));
                ygd0 ygd0Var = lhd0Var.g;
                if (ygd0Var.equals(wgd0.f39111a)) {
                    jgd0Var2.H0().h.setVisibility(8);
                } else {
                    if (!(ygd0Var instanceof xgd0)) {
                        t9f.b();
                        return null;
                    }
                    jgd0Var2.H0().h.setVisibility(0);
                    jgd0Var2.H0().h.setText(((xgd0) ygd0Var).f40833a);
                }
                return Unit.f46060a;
        }
    }
}
