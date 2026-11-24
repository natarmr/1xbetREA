package a;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class q790 implements rg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28240a;
    public final /* synthetic */ qog0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yx5 e;

    public /* synthetic */ q790(qog0 qog0Var, String str, yx5 yx5Var, String str2, byte b) {
        this.f28240a = b;
        this.b = qog0Var;
        this.c = str;
        this.e = yx5Var;
        this.d = str2;
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        String currentUrl;
        String currentUrl2;
        byte b = this.f28240a;
        qog0 qog0Var = this.b;
        yx5 yx5Var = this.e;
        String str = this.c;
        String str2 = this.d;
        switch (b) {
            case 0:
                r790 r790Var = (r790) yx5Var;
                if (n7x.p(arrayList)) {
                    try {
                        m0x0.S(r790Var.o0(), str, str2);
                    } catch (Exception e) {
                        try {
                            PaymentWebView paymentWebView = r790Var.U1;
                            if (paymentWebView == null || (currentUrl = paymentWebView.getCurrentUrl()) == null) {
                                currentUrl = "";
                            }
                        } catch (Throwable unused) {
                        }
                        xi70 xi70Var = r790.Z1;
                        k3t0 k3t0VarI0 = r790Var.I0();
                        String message = e.getMessage();
                        k3t0VarI0.x(new b490(str, message != null ? message : "", currentUrl));
                    }
                } else {
                    xi70 xi70Var2 = r790.Z1;
                    ii iiVar = r790Var.G0().s;
                    DialogFields dialogFields = new DialogFields((CharSequence) r790Var.G0().o.b.a(R.string.confirmation, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.permission_message_data_text, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.permission_allow_button_text, Arrays.copyOf(new Object[0], 0)), r790Var.G0().o.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = r790Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                }
                qog0Var.f29072a.remove(this);
                break;
            default:
                o890 o890Var = (o890) yx5Var;
                if (n7x.p(arrayList)) {
                    try {
                        str.getClass();
                        Context contextO0 = o890Var.o0();
                        str2.getClass();
                        m0x0.S(contextO0, str, str2);
                    } catch (Exception e2) {
                        try {
                            jh70 jh70Var = o890.f2;
                            currentUrl2 = o890Var.K0().g.getCurrentUrl();
                        } catch (Exception unused2) {
                            currentUrl2 = "";
                        }
                        jh70 jh70Var2 = o890.f2;
                        p990 p990VarM0 = o890Var.M0();
                        if (str == null) {
                            str = "";
                        }
                        String message2 = e2.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        currentUrl2.getClass();
                        String strSubstring = str.substring(0, Math.min(str.length(), 10));
                        String host = Uri.parse(currentUrl2).getHost();
                        p990VarM0.k.f37210a.a("dep_download_error", xp20.f(new Pair("durl", strSubstring), new Pair("host", host != null ? host : ""), new Pair("error", message2)));
                    }
                } else {
                    jh70 jh70Var3 = o890.f2;
                    ii iiVar2 = (ii) o890Var.J0().get();
                    String strH = o890Var.H(R.string.confirmation);
                    String strH2 = o890Var.H(R.string.permission_message_data_text);
                    String strH3 = o890Var.H(R.string.permission_allow_button_text);
                    strH3.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, o890Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = o890Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                }
                qog0Var.f29072a.remove(this);
                break;
        }
    }
}
