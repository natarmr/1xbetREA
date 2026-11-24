package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.Collections;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tx00;", "La/u0i;", "<init>", "()V", "a/evz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tx00 extends u0i {
    public fiu0 f2;
    public final a8z g2 = xbc.b0(this, sre0.f32672a.b(wx00.class), new rx00(this, 0));
    public final cgx0 h2 = new cgx0("INVISIBLE");
    public final cgx0 i2 = new cgx0("SHOW_DEFAULT_MESSAGE");
    public final cgx0 j2 = new cgx0("REVERSE_BUTTON");
    public final phf0 k2 = new phf0("EXTRA_REQUEST_KEY");
    public static final /* synthetic */ iiy[] m2 = {new ez40(tx00.class, "isInvisibleDialog", "isInvisibleDialog()Z", 0), new ez40(tx00.class, "showDefaultMessage", "getShowDefaultMessage()Z", 0), new ez40(tx00.class, "reverseNeutralButton", "getReverseNeutralButton()Z", 0), new ez40(tx00.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final evz l2 = new evz();

    @Override // a.u0i, a.sik
    public final Dialog C0(Bundle bundle) {
        Window window;
        View decorView;
        Dialog dialogC0 = super.C0(bundle);
        if (this.h2.n(this, m2[0]).booleanValue() && (window = dialogC0.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setVisibility(4);
        }
        return dialogC0;
    }

    @Override // a.u0i
    public final void L0() throws Exception {
        gmq gmqVarW = U0().w();
        yje yjeVar = null;
        sx00 sx00Var = new sx00(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00(gmqVarW, clzVarW, sx00Var, (yje) null), 3);
        gmq gmqVarC = ((i3t0) U0()).C();
        sx00 sx00Var2 = new sx00(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zd00((i89) gmqVarC, clzVarW2, sx00Var2, (yje) null), 3);
    }

    @Override // a.u0i
    public final void M0() {
        if (!this.j2.n(this, m2[2]).booleanValue()) {
            U0().x(mx00.f22530a);
        } else {
            U0().x(lx00.f20790a);
            super.M0();
        }
    }

    @Override // a.u0i
    public final void N0() {
        if (this.j2.n(this, m2[2]).booleanValue()) {
            U0().x(mx00.f22530a);
        } else {
            U0().x(lx00.f20790a);
            super.N0();
        }
    }

    @Override // a.u0i
    public final void O0() {
        U0().x(nx00.f24260a);
    }

    public final k3t0 U0() {
        return (k3t0) this.g2.getValue();
    }

    @Override // a.u0i, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qx00.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qx00 qx00Var = (qx00) (ze3Var instanceof qx00 ? ze3Var : null);
            if (qx00Var != null) {
                iiy[] iiyVarArr = m2;
                Boolean boolN = this.h2.n(this, iiyVarArr[0]);
                String strValueOf = this.i2.n(this, iiyVarArr[1]).booleanValue() ? "" : String.valueOf(K0().b);
                pv00 pv00Var = qx00Var.o;
                mne mneVar = qx00Var.d;
                duj dujVar = qx00Var.f;
                ctf0 ctf0Var = qx00Var.k;
                sv3 sv3Var = qx00Var.g;
                gii0 gii0Var = qx00Var.h;
                nr nrVar = qx00Var.f29458a;
                rqj0 rqj0Var = qx00Var.c;
                aqt aqtVar = qx00Var.j;
                zsr zsrVar = qx00Var.n;
                kt2 kt2Var = qx00Var.l;
                rv3 rv3Var = qx00Var.m;
                v6k v6kVar = qx00Var.i;
                btt0 btt0Var = qx00Var.p;
                b3c0 b3c0Var = qx00Var.q;
                iw20 iw20Var = qx00Var.e;
                s64 s64Var = qx00Var.b;
                kib0 kib0Var = qx00Var.r;
                psc pscVar = qx00Var.s;
                sue sueVar = qx00Var.t;
                epi0 epi0Var = qx00Var.u;
                ok50 ok50Var = qx00Var.v;
                sqx sqxVar = qx00Var.w;
                kib0Var.getClass();
                sueVar.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                sv3Var.getClass();
                ctf0Var.getClass();
                kt2Var.getClass();
                rv3Var.getClass();
                zsrVar.getClass();
                aqtVar.getClass();
                b3c0Var.getClass();
                this.f2 = new fiu0(Collections.singletonMap(wx00.class, (tii) new v5i(mneVar, iw20Var, v6kVar, pv00Var, kib0Var, sueVar, epi0Var, ok50Var, boolN, strValueOf, nrVar, s64Var, gii0Var, dujVar, rqj0Var, btt0Var, sv3Var, ctf0Var, zsrVar, pscVar, sqxVar).v));
                return;
            }
        }
        jf4.n(b1j.i(qx00.class, "Cannot create dependency "));
    }
}
