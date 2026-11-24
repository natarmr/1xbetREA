package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ea1;", "La/iw5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ea1 extends iw5 {
    public fiu0 l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(ea1.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final gfk0 n2 = new gfk0((byte) 16);
    public final phf0 k2 = new phf0("PLAY_FOR_REAL_REQUEST_KEY");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(ja1.class), new da1(this, (byte) 0));

    @Override // a.iw5, a.yo8, a.sd3, a.sik
    public final Dialog C0(Bundle bundle) {
        return super.C0(bundle);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        ea1 ea1Var;
        fetVar.e0(2080305364);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            ea1Var = this;
            Object c21Var = new c21(1, ea1Var, ea1.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/aggregator/game/impl/game/presentation/models/AggregatorPlayForRealSideEffect;)V", 0, (byte) 12);
            fetVar.o0(c21Var);
            objP = c21Var;
        } else {
            ea1Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(ea1Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new ee0(k3t0VarP0, ea1Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, ea1Var, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(1190747525, new ri1(((i3t0) ea1Var.P0()).y(fetVar), ea1Var, (byte) 24), fetVar), 8);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.m2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ca1.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ca1 ca1Var = (ca1) (ze3Var instanceof ca1 ? ze3Var : null);
            if (ca1Var != null) {
                ctf0 ctf0Var = ca1Var.b;
                iqt iqtVar = ca1Var.c;
                cad cadVar = ca1Var.f3986a;
                kc60 kc60Var = ca1Var.d;
                ctf0Var.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = ctf0Var;
                gr00Var.b = iqtVar;
                gr00Var.c = cadVar;
                gr00Var.d = kc60Var;
                gr00Var.e = new t5i(gr00Var, (byte) 20);
                this.l2 = new fiu0(Collections.singletonMap(ja1.class, (t5i) gr00Var.e));
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(ca1.class, "Cannot create dependency "));
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        P0().x(aa1.f501a);
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        vcc.f0(i120.V(new Pair("RESULT_PLAY_FOR_REAL_DISMISS_KEY", null)), this, this.k2.n(this, o2[0]));
    }
}
