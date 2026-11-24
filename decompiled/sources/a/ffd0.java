package a;

import com.google.android.material.textview.MaterialTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class ffd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gfd0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffd0(gfd0 gfd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gfd0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gfd0 gfd0Var = this.k;
        switch (b) {
            case 0:
                ffd0 ffd0Var = new ffd0(gfd0Var, yjeVar, (byte) 0);
                ffd0Var.j = obj;
                return ffd0Var;
            case 1:
                ffd0 ffd0Var2 = new ffd0(gfd0Var, yjeVar, (byte) 1);
                ffd0Var2.j = obj;
                return ffd0Var2;
            default:
                ffd0 ffd0Var3 = new ffd0(gfd0Var, yjeVar, (byte) 2);
                ffd0Var3.j = obj;
                return ffd0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ffd0) create((mfd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ffd0) create((xfd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ffd0) create((yfd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gfd0 gfd0Var = this.k;
        switch (b) {
            case 0:
                mfd0 mfd0Var = (mfd0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (mfd0Var != null) {
                    if (mfd0Var instanceof lfd0) {
                        mi70 mi70Var = gfd0.S1;
                        gfd0Var.H0().h.setVisibility(0);
                        long j = ((lfd0) mfd0Var).f19950a;
                        String str = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
                        String strI = gfd0Var.I(R.string.restore_password_confirm_timer_v2, str);
                        strI.getClass();
                        gfd0Var.H0().h.setText(etm0.m(str, strI));
                        gfd0Var.H0().b.setFirstButtonVisibility(false);
                    } else if (mfd0Var instanceof jfd0) {
                        mi70 mi70Var2 = gfd0.S1;
                        gfd0Var.H0().h.setVisibility(8);
                        gfd0Var.H0().b.setFirstButtonVisibility(true);
                    } else if (mfd0Var instanceof kfd0) {
                        mi70 mi70Var3 = gfd0.S1;
                        gfd0Var.H0().h.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                xfd0 xfd0Var = (xfd0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (xfd0Var != null) {
                    boolean z = xfd0Var instanceof nfd0;
                    gfd0 gfd0Var2 = this.k;
                    if (z) {
                        mi70 mi70Var4 = gfd0.S1;
                        gfd0Var2.H0().e.setErrorText("");
                        gfd0Var2.H0().e.f(false);
                    } else if (xfd0Var instanceof ofd0) {
                        j120.Y(gfd0Var2);
                    } else if (xfd0Var instanceof vfd0) {
                        mi70 mi70Var5 = gfd0.S1;
                        ii iiVarG0 = gfd0Var2.G0();
                        String strH = gfd0Var2.H(R.string.attention);
                        String strH2 = gfd0Var2.H(R.string.qr_auth_enabled);
                        String strH3 = gfd0Var2.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC = gfd0Var2.C();
                        eVarC.getClass();
                        iiVarG0.d(dialogFields, eVarC);
                    } else if (xfd0Var instanceof sfd0) {
                        mi70 mi70Var6 = gfd0.S1;
                        ii iiVarG1 = gfd0Var2.G0();
                        String strH4 = gfd0Var2.H(R.string.caution);
                        String strH5 = gfd0Var2.H(R.string.close_the_activation_process_new);
                        String strH6 = gfd0Var2.H(R.string.interrupt);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, gfd0Var2.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = gfd0Var2.C();
                        eVarC2.getClass();
                        iiVarG1.d(dialogFields2, eVarC2);
                    } else if (xfd0Var instanceof pfd0) {
                        boolean z2 = ((pfd0) xfd0Var).f26898a;
                        mi70 mi70Var7 = gfd0.S1;
                        gfd0Var2.H0().d.setVisibility(z2 ? 0 : 8);
                    } else if (xfd0Var instanceof tfd0) {
                        wdk0 wdk0Var = gfd0Var2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((tfd0) xfd0Var).f33859a, null, null, null, null, 124), gfd0Var2, null, null, false, null, 1020);
                    } else if (xfd0Var instanceof rfd0) {
                        String str2 = ((rfd0) xfd0Var).f30383a;
                        mi70 mi70Var8 = gfd0.S1;
                        gfd0Var2.H0().e.setErrorText(str2);
                        gfd0Var2.H0().e.f(str2.length() > 0);
                    } else if (xfd0Var instanceof qfd0) {
                        String str3 = ((qfd0) xfd0Var).f28627a;
                        mi70 mi70Var9 = gfd0.S1;
                        ii iiVarG2 = gfd0Var2.G0();
                        String strH7 = gfd0Var2.H(R.string.error);
                        String strH8 = gfd0Var2.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) str3, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = gfd0Var2.C();
                        eVarC3.getClass();
                        iiVarG2.d(dialogFields3, eVarC3);
                    } else if (xfd0Var instanceof wfd0) {
                        String str4 = ((wfd0) xfd0Var).f39067a;
                        mi70 mi70Var10 = gfd0.S1;
                        ii iiVarG3 = gfd0Var2.G0();
                        String strH9 = gfd0Var2.H(R.string.error);
                        String strH10 = gfd0Var2.H(R.string.ok_new);
                        strH10.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) str4, (CharSequence) strH10, (String) null, (String) null, "REQUEST_TOKEN_EXPIRED_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC4 = gfd0Var2.C();
                        eVarC4.getClass();
                        iiVarG3.d(dialogFields4, eVarC4);
                    } else if (xfd0Var instanceof ufd0) {
                        mi70 mi70Var11 = gfd0.S1;
                        ii iiVarG4 = gfd0Var2.G0();
                        String strH11 = gfd0Var2.H(R.string.error);
                        String strH12 = gfd0Var2.H(R.string.request_error);
                        String strH13 = gfd0Var2.H(R.string.ok_new);
                        strH13.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC5 = gfd0Var2.C();
                        eVarC5.getClass();
                        iiVarG4.d(dialogFields5, eVarC5);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                yfd0 yfd0Var = (yfd0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                mi70 mi70Var12 = gfd0.S1;
                MaterialTextView materialTextView = gfd0Var.H0().g;
                String str5 = yfd0Var.b;
                String strI2 = gfd0Var.I(R.string.conf_code_has_been_sent_on_email_v2, str5);
                strI2.getClass();
                materialTextView.setText(etm0.m(str5, strI2));
                gfd0Var.H0().f.setVisibility(yfd0Var.c ? 0 : 8);
                return Unit.f46060a;
        }
    }
}
