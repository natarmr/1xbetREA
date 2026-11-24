package a;

import com.google.android.material.textview.MaterialTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class vid0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wid0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vid0(wid0 wid0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wid0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wid0 wid0Var = this.k;
        switch (b) {
            case 0:
                vid0 vid0Var = new vid0(wid0Var, yjeVar, (byte) 0);
                vid0Var.j = obj;
                return vid0Var;
            default:
                vid0 vid0Var2 = new vid0(wid0Var, yjeVar, (byte) 1);
                vid0Var2.j = obj;
                return vid0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vid0) create((fjd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vid0) create((ejd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                fjd0 fjd0Var = (fjd0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                jh70 jh70Var = wid0.R1;
                wid0 wid0Var = this.k;
                MaterialTextView materialTextView = wid0Var.G0().d;
                String str = fjd0Var.f9635a;
                String strI = wid0Var.I(R.string.by_email_send_code_confirmation_v2, str);
                strI.getClass();
                materialTextView.setText(etm0.m(str, strI));
                return Unit.f46060a;
            default:
                ejd0 ejd0Var = (ejd0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ejd0Var != null) {
                    boolean z = ejd0Var instanceof bjd0;
                    wid0 wid0Var2 = this.k;
                    if (z) {
                        jh70 jh70Var2 = wid0.R1;
                        ii iiVar = wid0Var2.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = wid0Var2.H(R.string.caution);
                        String strH2 = wid0Var2.H(R.string.close_the_activation_process_new);
                        String strH3 = wid0Var2.H(R.string.interrupt);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, wid0Var2.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = wid0Var2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (ejd0Var instanceof zid0) {
                        String str2 = ((zid0) ejd0Var).f44435a;
                        jh70 jh70Var3 = wid0.R1;
                        ii iiVar2 = wid0Var2.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = wid0Var2.H(R.string.error);
                        String strH5 = wid0Var2.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str2, (CharSequence) strH5, (String) null, (String) null, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC2 = wid0Var2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (ejd0Var instanceof djd0) {
                        wdk0 wdk0Var = wid0Var2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((djd0) ejd0Var).f6180a, null, null, null, null, 124), wid0Var2, null, null, true, null, 1004);
                    } else if (ejd0Var instanceof cjd0) {
                        jh70 jh70Var4 = wid0.R1;
                        ii iiVar3 = wid0Var2.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = wid0Var2.H(R.string.error);
                        String strH7 = wid0Var2.H(R.string.request_error);
                        String strH8 = wid0Var2.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC3 = wid0Var2.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    } else if (ejd0Var instanceof ajd0) {
                        j120.Y(wid0Var2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
