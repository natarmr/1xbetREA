package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/pwu0;", "La/iw5;", "<init>", "()V", "a/svs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pwu0 extends iw5 {
    public fiu0 k2;
    public final r34 l2 = new r34("balance_id");
    public final r34 m2 = new r34("product_id");
    public final phf0 n2 = new phf0("EXTRA_REQUEST_KEY");
    public Function0 o2 = new o1u0((byte) 23);
    public final a8z p2 = xbc.b0(this, sre0.f32672a.b(vwu0.class), new nwu0(this, 0));
    public static final /* synthetic */ iiy[] r2 = {new ez40(pwu0.class, "balanceId", "getBalanceId()J", 0), new ez40(pwu0.class, "productId", "getProductId()J", 0), new ez40(pwu0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final svs0 q2 = new svs0((byte) 11);

    @Override // a.iw5, a.yo8, a.sd3, a.sik
    public final Dialog C0(Bundle bundle) {
        this.o2 = new nwu0(this, (byte) 1);
        return super.C0(bundle);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1822547350);
        a8z a8zVar = this.p2;
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new npt0(this, (byte) 19);
            fetVar.o0(objP);
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new otp0(k3t0Var, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(521554137, new qjr0(pz40VarY, (byte) 4), fetVar), (ugd) null, u1c.M(-614390309, new wis0(pz40VarY, this, (byte) 2), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qwu0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qwu0 qwu0Var = (qwu0) (ze3Var instanceof qwu0 ? ze3Var : null);
            if (qwu0Var != null) {
                cad cadVar = qwu0Var.f29452a;
                r9u r9uVar = qwu0Var.b;
                duj dujVar = qwu0Var.c;
                ctf0 ctf0Var = qwu0Var.d;
                ctf0Var.getClass();
                r9uVar.getClass();
                this.k2 = new fiu0(Collections.singletonMap(vwu0.class, (yxi) new ali(cadVar, dujVar, ctf0Var).d));
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(qwu0.class, "Cannot create dependency "));
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().K = true;
        L0().N(3);
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        this.o2.invoke();
    }
}
