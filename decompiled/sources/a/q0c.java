package a;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.android.material.textview.MaterialTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class q0c extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r0c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0c(r0c r0cVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r0cVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r0c r0cVar = this.k;
        switch (b) {
            case 0:
                q0c q0cVar = new q0c(r0cVar, yjeVar, (byte) 0);
                q0cVar.j = obj;
                return q0cVar;
            case 1:
                q0c q0cVar2 = new q0c(r0cVar, yjeVar, (byte) 1);
                q0cVar2.j = obj;
                return q0cVar2;
            default:
                q0c q0cVar3 = new q0c(r0cVar, yjeVar, (byte) 2);
                q0cVar3.j = obj;
                return q0cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q0c) create((e1c) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((q0c) create((w0c) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((q0c) create((f1c) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        r0c r0cVar = this.k;
        switch (b) {
            case 0:
                e1c e1cVar = (e1c) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (e1cVar != null) {
                    boolean z = e1cVar instanceof d1c;
                    r0c r0cVar2 = this.k;
                    if (z) {
                        wdk0 wdk0Var = r0cVar2.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        qek0 qek0Var = qek0.f28589a;
                        String strH = r0cVar2.H(R.string.email_success_activ);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), r0cVar2, null, null, false, null, 1020);
                    } else if (e1cVar instanceof a1c) {
                        wdk0 wdk0Var2 = r0cVar2.N1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        rek0 rek0Var = rek0.b;
                        String strH2 = r0cVar2.H(R.string.to_many_requests_try_later);
                        strH2.getClass();
                        wdk0.k(wdk0Var2, new xdk0(rek0Var, strH2, null, null, null, null, 124), r0cVar2, null, null, false, new Integer(R.dimen.space_16), 508);
                    } else if (e1cVar instanceof z0c) {
                        cl5 cl5Var = r0c.S1;
                        DsTextField dsTextField = r0cVar2.G0().e;
                        String str = ((z0c) e1cVar).f43559a;
                        dsTextField.setErrorText(str);
                        r0cVar2.G0().e.f(str.length() > 0);
                    } else if (e1cVar instanceof c1c) {
                        String str2 = ((c1c) e1cVar).f3567a;
                        cl5 cl5Var2 = r0c.S1;
                        ii iiVar = r0cVar2.M1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH3 = r0cVar2.H(R.string.error);
                        String strH4 = r0cVar2.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) str2, (CharSequence) strH4, (String) null, (String) null, "TOKEN_EXPIRED_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC = r0cVar2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (e1cVar instanceof x0c) {
                        cl5 cl5Var3 = r0c.S1;
                        r0cVar2.G0().e.setErrorText(null);
                        r0cVar2.G0().e.f(false);
                    } else if (e1cVar instanceof b1c) {
                        cl5 cl5Var4 = r0c.S1;
                        ii iiVar2 = r0cVar2.M1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH5 = r0cVar2.H(R.string.error);
                        String strH6 = r0cVar2.H(R.string.request_error);
                        String strH7 = r0cVar2.H(R.string.ok_new);
                        strH7.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC2 = r0cVar2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (e1cVar instanceof y0c) {
                        j120.Y(r0cVar2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                w0c w0cVar = (w0c) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (w0cVar != null) {
                    if (w0cVar instanceof u0c) {
                        cl5 cl5Var5 = r0c.S1;
                        r0cVar.G0().h.setVisibility(0);
                        r0cVar.G0().b.setFirstButtonVisibility(false);
                        long j = ((u0c) w0cVar).f34848a;
                        String str3 = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
                        MaterialTextView materialTextView = r0cVar.G0().h;
                        String strI = r0cVar.I(R.string.restore_password_confirm_timer_v2, str3);
                        strI.getClass();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int iV = StringsKt.V(strI, str3, 0, false, 6);
                        spannableStringBuilder.append((CharSequence) strI).setSpan(new StyleSpan(1), iV, str3.length() + iV, 33);
                        materialTextView.setText(spannableStringBuilder);
                    } else if (w0cVar instanceof v0c) {
                        cl5 cl5Var6 = r0c.S1;
                        r0cVar.G0().h.setVisibility(8);
                        r0cVar.G0().b.setFirstButtonVisibility(true);
                    } else if (w0cVar instanceof t0c) {
                        cl5 cl5Var7 = r0c.S1;
                        r0cVar.G0().h.setVisibility(8);
                        r0cVar.G0().b.setFirstButtonVisibility(false);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                f1c f1cVar = (f1c) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                cl5 cl5Var8 = r0c.S1;
                o4r o4rVarG0 = r0cVar.G0();
                MaterialTextView materialTextView2 = o4rVarG0.g;
                String str4 = f1cVar.f8758a;
                String strI2 = r0cVar.I(R.string.conf_code_has_been_sent_on_email_v2, str4);
                strI2.getClass();
                materialTextView2.setText(z1x.G(str4, strI2));
                DsBottomBar dsBottomBar = o4rVarG0.b;
                dsBottomBar.setSecondButtonEnabled(f1cVar.c);
                o4rVarG0.c.setTitle(f1cVar.e);
                dsBottomBar.setSecondButtonText(f1cVar.f);
                o4rVarG0.f.setVisibility(f1cVar.g ? 0 : 8);
                o4rVarG0.d.setVisibility(f1cVar.h ? 0 : 8);
                return Unit.f46060a;
        }
    }
}
