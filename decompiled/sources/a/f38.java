package a;

import com.google.android.material.textview.MaterialTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class f38 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h38 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f38(h38 h38Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = h38Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        h38 h38Var = this.k;
        switch (b) {
            case 0:
                f38 f38Var = new f38(h38Var, yjeVar, (byte) 0);
                f38Var.j = obj;
                return f38Var;
            default:
                f38 f38Var2 = new f38(h38Var, yjeVar, (byte) 1);
                f38Var2.j = obj;
                return f38Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((f38) create((v38) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((f38) create((u38) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                v38 v38Var = (v38) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                yk5 yk5Var = h38.V1;
                h38 h38Var = this.k;
                MaterialTextView materialTextView = h38Var.G0().h;
                boolean z = v38Var.f;
                String str = v38Var.b;
                kbn kbnVar = v38Var.f36720a;
                cm90 cm90Var = kbnVar.e;
                String str2 = kbnVar.d;
                materialTextView.setVisibility(z ? 0 : 8);
                h38Var.G0().h.setText(v38Var.g);
                h38Var.G0().f.setText(h38Var.H(R.string.add_new_phone_number_description));
                if (str2.length() > 0) {
                    h38Var.G0().e.setCodeText("+" + str2);
                }
                CharSequence phone = h38Var.G0().e.getPhone();
                if ((phone == null || phone.length() == 0) && str.length() > 0) {
                    h38Var.G0().e.setPhoneText(str);
                }
                h38Var.G0().e.setPhonePlaceholder(cm90Var.d);
                h38Var.G0().e.setPhoneMask(cm90Var.d);
                if (kbnVar.f) {
                    h38Var.G0().e.setCodeStartIcon(kbnVar.c);
                } else {
                    h38Var.G0().e.setCodeStartIcon("");
                }
                h38Var.G0().d.setVisibility(v38Var.c ? 0 : 8);
                h38Var.G0().g.setVisibility(v38Var.e ? 0 : 8);
                h38Var.G0().b.setFirstButtonEnabled(v38Var.d);
                h38Var.G0().c.setTitle(v38Var.h);
                return Unit.f46060a;
            default:
                u38 u38Var = (u38) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (u38Var != null) {
                    boolean z2 = u38Var instanceof p38;
                    h38 h38Var2 = this.k;
                    if (z2) {
                        int i = ((p38) u38Var).f26287a;
                        yk5 yk5Var2 = h38.V1;
                        rl70 rl70Var = ((iai) h38Var2.Q1.getValue()).f14439a;
                        androidx.fragment.app.e eVarC = h38Var2.C();
                        eVarC.getClass();
                        rl70Var.e(eVarC, new PickerParams.Phone(Integer.valueOf(i), true, true), AnalyticsEntryPoint.b);
                    } else if (u38Var instanceof m38) {
                        yk5 yk5Var3 = h38.V1;
                        h38Var2.G0().e.setPhoneText(null);
                    } else if (u38Var instanceof o38) {
                        o38 o38Var = (o38) u38Var;
                        d7a d7aVar = o38Var.f24570a;
                        String str3 = o38Var.b;
                        yk5 yk5Var4 = h38.V1;
                        if (h38Var2.N1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        gl5.p(h38Var2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, str3);
                    } else if (u38Var instanceof q38) {
                        wdk0 wdk0Var = h38Var2.P1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((q38) u38Var).f28038a, null, null, null, null, 124), h38Var2, null, null, true, null, 1004);
                    } else if (u38Var instanceof r38) {
                        yk5 yk5Var5 = h38.V1;
                        ii iiVar = h38Var2.O1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        if (h38Var2.M1 == null) {
                            Intrinsics.h("logoutDialogFactory");
                            throw null;
                        }
                        String strH = h38Var2.H(R.string.attention);
                        String strH2 = h38Var2.H(R.string.close_the_activation_process_and_logout);
                        String strH3 = h38Var2.H(R.string.interrupt);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, h38Var2.H(R.string.cancel), (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1520);
                        tx00.l2.getClass();
                        tx00 tx00VarG = evz.g(dialogFields, false, false, false);
                        androidx.fragment.app.e eVarC2 = h38Var2.C();
                        eVarC2.getClass();
                        iiVar.c(tx00VarG, eVarC2);
                    } else if (u38Var instanceof s38) {
                        yk5 yk5Var6 = h38.V1;
                        ii iiVar2 = h38Var2.O1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = h38Var2.H(R.string.error);
                        String strH5 = h38Var2.H(R.string.request_error);
                        String strH6 = h38Var2.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC3 = h38Var2.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    } else if (u38Var instanceof n38) {
                        j120.Y(h38Var2);
                    } else if (u38Var instanceof t38) {
                        yk5 yk5Var7 = h38.V1;
                        ii iiVar3 = h38Var2.O1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        CharSequence title = h38Var2.G0().c.getTitle();
                        if (title == null) {
                            title = h38Var2.H(R.string.binding_phone);
                            title.getClass();
                        }
                        String strH7 = h38Var2.H(R.string.error_not_recognize_phone);
                        String strH8 = h38Var2.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields(title, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC4 = h38Var2.C();
                        eVarC4.getClass();
                        iiVar3.d(dialogFields3, eVarC4);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
