package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class xxf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ayf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxf0(ayf0 ayf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ayf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ayf0 ayf0Var = this.k;
        switch (b) {
            case 0:
                xxf0 xxf0Var = new xxf0(ayf0Var, yjeVar, (byte) 0);
                xxf0Var.j = obj;
                return xxf0Var;
            case 1:
                xxf0 xxf0Var2 = new xxf0(ayf0Var, yjeVar, (byte) 1);
                xxf0Var2.j = obj;
                return xxf0Var2;
            default:
                xxf0 xxf0Var3 = new xxf0(ayf0Var, yjeVar, (byte) 2);
                xxf0Var3.j = obj;
                return xxf0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xxf0) create((e190) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xxf0) create((kyf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xxf0) create((kbn) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        byte b = this.i;
        ayf0 ayf0Var = this.k;
        switch (b) {
            case 0:
                e190 e190Var = (e190) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (e190Var == null) {
                    t9f.b();
                    return null;
                }
                eke0 eke0Var = ayf0.S1;
                nyf0 nyf0VarH0 = ayf0Var.H0();
                String strValueOf = String.valueOf(ayf0Var.G0().b.getCode());
                String strValueOf2 = String.valueOf(ayf0Var.G0().b.getPhone());
                we50 we50Var = e190Var.f7029a;
                bby bbyVar2 = nyf0VarH0.E;
                if ((bbyVar2 == null || !bbyVar2.isActive()) && ((bbyVar = nyf0VarH0.D) == null || !bbyVar.isActive())) {
                    p7m0 p7m0Var = nyf0VarH0.G;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    nyf0VarH0.A.f(hfi0.SMS);
                    nyf0VarH0.E = sac.V(jiu0.a(nyf0VarH0), new cyf0(nyf0VarH0, (byte) 2), null, nyf0VarH0.q.b, new wn2(nyf0VarH0, strValueOf.concat(strValueOf2), strValueOf, strValueOf2, we50Var, null, (byte) 27), 10);
                }
                return Unit.f46060a;
            case 1:
                kyf0 kyf0Var = (kyf0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (kyf0Var != null) {
                    boolean z = kyf0Var instanceof iyf0;
                    ayf0 ayf0Var2 = this.k;
                    if (z) {
                        int i = ((iyf0) kyf0Var).f15587a;
                        eke0 eke0Var2 = ayf0.S1;
                        rl70 rl70Var = ayf0Var2.M1;
                        if (rl70Var == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = ayf0Var2.C();
                        eVarC.getClass();
                        rl70Var.e(eVarC, new PickerParams.Phone(Integer.valueOf(i), true, true), AnalyticsEntryPoint.b);
                    } else if (kyf0Var instanceof gyf0) {
                        String str = ((gyf0) kyf0Var).f12126a;
                        eke0 eke0Var3 = ayf0.S1;
                        ayf0Var2.G0().b.setPhoneText(str);
                    } else if (kyf0Var instanceof eyf0) {
                        eke0 eke0Var4 = ayf0.S1;
                        p7m0 p7m0Var2 = ((f190) ayf0Var2.R1.getValue()).d;
                        Boolean bool2 = Boolean.FALSE;
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, bool2);
                        ayf0Var2.G0().b.b.f(true);
                        ayf0Var2.G0().b.setPhoneErrorText(ayf0Var2.G().getString(R.string.error_phone));
                    } else if (kyf0Var instanceof fyf0) {
                        eke0 eke0Var5 = ayf0.S1;
                        ayf0Var2.G0().b.b.f(false);
                        ayf0Var2.G0().b.setPhoneErrorText("");
                    } else if (kyf0Var instanceof hyf0) {
                        d7a d7aVar = ((hyf0) kyf0Var).f13858a;
                        eke0 eke0Var6 = ayf0.S1;
                        if (ayf0Var2.L1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        String strH = ayf0Var2.H(R.string.restore_password);
                        strH.getClass();
                        gl5.p(ayf0Var2, "RESTORE_PHONE_REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
                    } else if (kyf0Var instanceof jyf0) {
                        String str2 = ((jyf0) kyf0Var).f17357a;
                        eke0 eke0Var7 = ayf0.S1;
                        wdk0 wdk0Var = ayf0Var2.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, str2, null, null, null, null, 124), ayf0Var2, null, null, false, null, 988);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                kbn kbnVar = (kbn) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                eke0 eke0Var8 = ayf0.S1;
                DsPhoneTextField dsPhoneTextField = ayf0Var.G0().b;
                String str3 = kbnVar.d;
                cm90 cm90Var = kbnVar.e;
                dsPhoneTextField.setCodeText(str3);
                if (kbnVar.f) {
                    dsPhoneTextField.setCodeStartIcon(kbnVar.c);
                } else {
                    dsPhoneTextField.setCodeStartIcon("");
                }
                dsPhoneTextField.setPhonePlaceholder(cm90Var.d);
                dsPhoneTextField.setPhoneMask(cm90Var.d);
                return Unit.f46060a;
        }
    }
}
