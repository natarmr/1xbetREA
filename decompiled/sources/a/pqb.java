package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class pqb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rqb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pqb(rqb rqbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rqbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rqb rqbVar = this.k;
        switch (b) {
            case 0:
                pqb pqbVar = new pqb(rqbVar, yjeVar, (byte) 0);
                pqbVar.j = obj;
                return pqbVar;
            case 1:
                pqb pqbVar2 = new pqb(rqbVar, yjeVar, (byte) 1);
                pqbVar2.j = obj;
                return pqbVar2;
            default:
                pqb pqbVar3 = new pqb(rqbVar, yjeVar, (byte) 2);
                pqbVar3.j = obj;
                return pqbVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pqb) create((frb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pqb) create((yqb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pqb) create((erb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        rqb rqbVar = this.k;
        switch (b) {
            case 0:
                frb frbVar = (frb) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bj5 bj5Var = rqb.U1;
                rqbVar.G0().i.setVisibility(0);
                rqbVar.G0().i.setText(frbVar.e);
                rqbVar.G0().h.setText(rqbVar.H(R.string.sms_hint));
                DsPhoneTextField dsPhoneTextField = rqbVar.G0().g;
                kbn kbnVar = frbVar.f10010a;
                dsPhoneTextField.setCodeText("+" + kbnVar.d);
                DsPhoneTextField dsPhoneTextField2 = rqbVar.G0().g;
                cm90 cm90Var = kbnVar.e;
                dsPhoneTextField2.setPhonePlaceholder(cm90Var.d);
                rqbVar.G0().g.setPhoneMask(cm90Var.d);
                if (kbnVar.f) {
                    rqbVar.G0().g.setCodeStartIcon(kbnVar.c);
                } else {
                    rqbVar.G0().g.setCodeStartIcon("");
                }
                rqbVar.G0().f.setVisibility(frbVar.b ? 0 : 8);
                rqbVar.G0().b.setFirstButtonText(R.string.send_sms);
                rqbVar.G0().b.setFirstButtonEnabled(frbVar.c);
                rqbVar.G0().e.setTitle(rqbVar.H(R.string.change_phone));
                return Unit.f46060a;
            case 1:
                yqb yqbVar = (yqb) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (yqbVar != null) {
                    if (yqbVar instanceof wqb) {
                        bj5 bj5Var2 = rqb.U1;
                        rqbVar.G0().c.setVisibility(0);
                        rqbVar.G0().b.setVisibility(0);
                        rqbVar.G0().d.setVisibility(8);
                    } else if (yqbVar instanceof xqb) {
                        bj5 bj5Var3 = rqb.U1;
                        rqbVar.G0().d.v(((xqb) yqbVar).f41308a);
                        rqbVar.G0().d.setVisibility(0);
                        rqbVar.G0().c.setVisibility(8);
                        rqbVar.G0().b.setVisibility(8);
                        rqbVar.G0().f.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                erb erbVar = (erb) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (erbVar != null) {
                    boolean z = erbVar instanceof arb;
                    rqb rqbVar2 = this.k;
                    if (z) {
                        d7a d7aVar = ((arb) erbVar).f1337a;
                        bj5 bj5Var4 = rqb.U1;
                        if (rqbVar2.N1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        String strH = rqbVar2.H(R.string.change_phone);
                        strH.getClass();
                        gl5.p(rqbVar2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
                    } else if (erbVar instanceof brb) {
                        wdk0 wdk0Var = rqbVar2.P1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((brb) erbVar).f3071a, null, null, null, null, 124), rqbVar2, null, null, true, null, 972);
                    } else if (erbVar instanceof crb) {
                        bj5 bj5Var5 = rqb.U1;
                        ii iiVar = rqbVar2.O1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH2 = rqbVar2.H(R.string.error);
                        String strH3 = rqbVar2.H(R.string.request_error);
                        String strH4 = rqbVar2.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC = rqbVar2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (erbVar instanceof zqb) {
                        j120.Y(rqbVar2);
                    } else if (erbVar instanceof drb) {
                        bj5 bj5Var6 = rqb.U1;
                        ii iiVar2 = rqbVar2.O1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH5 = rqbVar2.H(R.string.change_phone);
                        String strH6 = rqbVar2.H(R.string.error_not_recognize_phone);
                        String strH7 = rqbVar2.H(R.string.ok_new);
                        strH7.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC2 = rqbVar2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
