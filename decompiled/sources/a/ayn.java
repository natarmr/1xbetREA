package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ayn;", "La/sik;", "<init>", "()V", "a/sek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ayn extends sik {
    public fiu0 Y1;
    public final cgx0 Z1 = new cgx0("VISIBLE_CAN_SKIP_BUTTON_EXTRA", true);
    public final cgx0 a2 = new cgx0("CLEAR_CREDENTIALS", true);
    public final a8z b2 = xbc.b0(this, sre0.f32672a.b(byn.class), new zxn(this, (byte) 0));
    public static final /* synthetic */ iiy[] d2 = {new ez40(ayn.class, "canSkipLogin", "getCanSkipLogin()Z", 0), new ez40(ayn.class, "clearUserCredentials", "getClearUserCredentials()Z", 0)};
    public static final sek c2 = new sek();

    public final k3t0 I0() {
        return (k3t0) this.b2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        jg60 jg60VarK;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yxn.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yxn yxnVar = (yxn) (ze3Var instanceof yxn ? ze3Var : null);
            if (yxnVar != null) {
                iiy[] iiyVarArr = d2;
                cyn cynVar = new cyn(this.Z1.n(this, iiyVarArr[0]).booleanValue(), this.a2.n(this, iiyVarArr[1]).booleanValue());
                pv00 pv00Var = yxnVar.f;
                mne mneVar = yxnVar.c;
                duj dujVar = yxnVar.d;
                nr nrVar = yxnVar.f43430a;
                rqj0 rqj0Var = yxnVar.b;
                zsr zsrVar = yxnVar.e;
                ctf0 ctf0Var = yxnVar.g;
                zsrVar.getClass();
                ctf0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = cynVar;
                g45Var.b = nrVar;
                g45Var.c = zsrVar;
                g45Var.d = dujVar;
                g45Var.e = rqj0Var;
                g45Var.f = mneVar;
                g45Var.g = pv00Var;
                g45Var.h = ctf0Var;
                g45Var.i = new yei(g45Var, (byte) 20);
                this.Y1 = new fiu0(Collections.singletonMap(byn.class, (yei) g45Var.i));
                F0(0, R.style.AppTheme_Dialog_FullScreen);
                super.W(bundle);
                v62 v62Var = new v62(this, (byte) 8);
                kxq kxqVarB = B();
                if (kxqVarB == null || (jg60VarK = kxqVarB.k()) == null) {
                    return;
                }
                jg60VarK.b(v62Var);
                return;
            }
        }
        jf4.n(b1j.i(yxn.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        b1j.t(composeView, new ugd(1643890504, true, new mxm(this, (byte) 26)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        Window window = D0().getWindow();
        if (window != null) {
            ofm0.z(window, o0(), R.attr.uikitBackgroundContent, android.R.attr.statusBarColor, 8);
        }
        this.j1 = true;
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        I0().x(txn.f34709a);
    }
}
