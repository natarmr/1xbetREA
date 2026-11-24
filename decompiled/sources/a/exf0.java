package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class exf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hxf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ exf0(hxf0 hxf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hxf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hxf0 hxf0Var = this.k;
        switch (b) {
            case 0:
                exf0 exf0Var = new exf0(hxf0Var, yjeVar, (byte) 0);
                exf0Var.j = obj;
                return exf0Var;
            default:
                exf0 exf0Var2 = new exf0(hxf0Var, yjeVar, (byte) 1);
                exf0Var2.j = obj;
                return exf0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((exf0) create((e190) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((exf0) create((pxf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                e190 e190Var = (e190) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (e190Var == null) {
                    t9f.b();
                    return null;
                }
                zie0 zie0Var = hxf0.V1;
                hxf0 hxf0Var = this.k;
                sxf0 sxf0VarH0 = hxf0Var.H0();
                String strValueOf = String.valueOf(hxf0Var.G0().d.getText());
                we50 we50Var = e190Var.f7029a;
                bby bbyVar = sxf0VarH0.v;
                byte b = 1;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var = sxf0VarH0.s;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    sxf0VarH0.v = sac.V(jiu0.a(sxf0VarH0), new ixf0(sxf0VarH0, b), new tie0(sxf0VarH0, (byte) 26), sxf0VarH0.l.b, new rxf0(sxf0VarH0, strValueOf, we50Var, null), 8);
                }
                return Unit.f46060a;
            default:
                pxf0 pxf0Var = (pxf0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (pxf0Var != null) {
                    boolean z = pxf0Var instanceof mxf0;
                    hxf0 hxf0Var2 = this.k;
                    if (z) {
                        d7a d7aVar = ((mxf0) pxf0Var).f22553a;
                        zie0 zie0Var2 = hxf0.V1;
                        if (hxf0Var2.M1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        String strH = hxf0Var2.H(R.string.restore_password);
                        strH.getClass();
                        gl5.p(hxf0Var2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
                    } else if (pxf0Var instanceof nxf0) {
                        String str = ((nxf0) pxf0Var).f24282a;
                        zie0 zie0Var3 = hxf0.V1;
                        wdk0 wdk0Var = hxf0Var2.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), hxf0Var2, null, null, false, null, 988);
                    } else if (pxf0Var instanceof kxf0) {
                        zie0 zie0Var4 = hxf0.V1;
                        hxf0Var2.G0().d.setVisibility(8);
                        hxf0Var2.G0().e.setVisibility(0);
                        hxf0Var2.G0().b.setVisibility(8);
                        hxf0Var2.G0().c.setVisibility(0);
                        kxf0 kxf0Var = (kxf0) pxf0Var;
                        hxf0Var2.G0().c.setText(z1x.G(kxf0Var.b, kxf0Var.f19053a));
                    } else if (pxf0Var instanceof oxf0) {
                        zie0 zie0Var5 = hxf0.V1;
                        ii iiVar = hxf0Var2.N1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH2 = hxf0Var2.H(R.string.error);
                        String strH3 = hxf0Var2.H(R.string.request_error);
                        String strH4 = hxf0Var2.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC = hxf0Var2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (pxf0Var instanceof lxf0) {
                        zie0 zie0Var6 = hxf0.V1;
                        hxf0Var2.G0().d.setText(((lxf0) pxf0Var).f20814a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
