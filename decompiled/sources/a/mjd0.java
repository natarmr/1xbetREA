package a;

import com.google.android.material.textview.MaterialTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class mjd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ njd0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mjd0(njd0 njd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = njd0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        njd0 njd0Var = this.k;
        switch (b) {
            case 0:
                mjd0 mjd0Var = new mjd0(njd0Var, yjeVar, (byte) 0);
                mjd0Var.j = obj;
                return mjd0Var;
            default:
                mjd0 mjd0Var2 = new mjd0(njd0Var, yjeVar, (byte) 1);
                mjd0Var2.j = obj;
                return mjd0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mjd0) create((yjd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mjd0) create((xjd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                yjd0 yjd0Var = (yjd0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                nh70 nh70Var = njd0.S1;
                njd0 njd0Var = this.k;
                MaterialTextView materialTextView = njd0Var.H0().g;
                String str = yjd0Var.f42735a;
                String strI = njd0Var.I(R.string.code_has_been_sent_for_confirmation_v2, str);
                strI.getClass();
                materialTextView.setText(etm0.m(str, strI));
                njd0Var.H0().c.setVisibility(yjd0Var.c ? 0 : 8);
                njd0Var.H0().d.setVisibility(yjd0Var.e ? 0 : 8);
                njd0Var.H0().e.setVisibility(yjd0Var.d ? 0 : 8);
                njd0Var.H0().b.setVisibility(yjd0Var.f ? 0 : 8);
                return Unit.f46060a;
            default:
                xjd0 xjd0Var = (xjd0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = xjd0Var instanceof rjd0;
                njd0 njd0Var2 = this.k;
                if (z) {
                    nh70 nh70Var2 = njd0.S1;
                    ii iiVarG0 = njd0Var2.G0();
                    String strH = njd0Var2.H(R.string.caution);
                    String strH2 = njd0Var2.H(R.string.close_the_activation_process_new);
                    String strH3 = njd0Var2.H(R.string.interrupt);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, njd0Var2.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = njd0Var2.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                } else if (xjd0Var instanceof wjd0) {
                    nh70 nh70Var3 = njd0.S1;
                    ii iiVarG1 = njd0Var2.G0();
                    String strH4 = njd0Var2.H(R.string.caution);
                    String strH5 = njd0Var2.H(R.string.voice_voice_description);
                    String strH6 = njd0Var2.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, njd0Var2.H(R.string.cancel), (String) null, "REQUEST_VOICE_SMS_CONFIRMATION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = njd0Var2.C();
                    eVarC2.getClass();
                    iiVarG1.d(dialogFields2, eVarC2);
                } else if (xjd0Var instanceof qjd0) {
                    String str2 = ((qjd0) xjd0Var).f28833a;
                    nh70 nh70Var4 = njd0.S1;
                    ii iiVarG2 = njd0Var2.G0();
                    String strH7 = njd0Var2.H(R.string.error);
                    String strH8 = njd0Var2.H(R.string.ok_new);
                    strH8.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) str2, (CharSequence) strH8, (String) null, (String) null, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC3 = njd0Var2.C();
                    eVarC3.getClass();
                    iiVarG2.d(dialogFields3, eVarC3);
                } else if (xjd0Var instanceof ujd0) {
                    wdk0 wdk0Var = njd0Var2.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((ujd0) xjd0Var).f35773a, null, null, null, null, 124), njd0Var2, null, null, true, null, 1004);
                } else if (xjd0Var instanceof tjd0) {
                    nh70 nh70Var5 = njd0.S1;
                    ii iiVarG3 = njd0Var2.G0();
                    String strH9 = njd0Var2.H(R.string.error);
                    String strH10 = njd0Var2.H(R.string.request_error);
                    String strH11 = njd0Var2.H(R.string.ok_new);
                    strH11.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC4 = njd0Var2.C();
                    eVarC4.getClass();
                    iiVarG3.d(dialogFields4, eVarC4);
                } else if (Intrinsics.d(xjd0Var, vjd0.f37522a)) {
                    nh70 nh70Var6 = njd0.S1;
                    ii iiVarG4 = njd0Var2.G0();
                    String strH12 = njd0Var2.H(R.string.caution);
                    String strH13 = njd0Var2.H(R.string.dialog_send_code_to_telegram_description);
                    String strH14 = njd0Var2.H(R.string.ok_new);
                    strH14.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, njd0Var2.H(R.string.cancel), (String) null, "REQUEST_TELEGRAM_CONFIRMATION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = njd0Var2.C();
                    eVarC5.getClass();
                    iiVarG4.d(dialogFields5, eVarC5);
                } else {
                    if (!Intrinsics.d(xjd0Var, sjd0.f32299a)) {
                        t9f.b();
                        return null;
                    }
                    nh70 nh70Var7 = njd0.S1;
                    ii iiVarG5 = njd0Var2.G0();
                    String strH15 = njd0Var2.H(R.string.caution);
                    String strH16 = njd0Var2.H(R.string.dialog_send_code_to_flash_call_description_correct);
                    String strH17 = njd0Var2.H(R.string.ok_new);
                    strH17.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, njd0Var2.H(R.string.cancel), (String) null, "REQUEST_FLASH_CALL_CONFIRMATION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = njd0Var2.C();
                    eVarC6.getClass();
                    iiVarG5.d(dialogFields6, eVarC6);
                }
                return Unit.f46060a;
        }
    }
}
