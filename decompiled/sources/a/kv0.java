package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kv0;", "La/iw5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kv0 extends iw5 {
    public fiu0 l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(kv0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final hfk0 n2 = new hfk0((byte) 14);
    public final phf0 k2 = new phf0("GAME_NICKNAME_REQUEST_KEY");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(pv0.class), new iv0(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1955258916);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object t90Var = new t90(1, this, kv0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/aggregator/game/impl/game/presentation/models/AggregatorGameNicknameSideEffect;)V", 0, (byte) 18);
            fetVar.o0(t90Var);
            objP = t90Var;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        byte b = 3;
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new ee0(k3t0VarP0, (kv0) this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        boolean zI3 = fetVar.i(this);
        Object objP3 = fetVar.P();
        if (zI3 || objP3 == obj) {
            objP3 = new iv0(this, (byte) 1);
            fetVar.o0(objP3);
        }
        v3c.z((Function0) objP3, null, null, fetVar, 0, 6);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-397008053, new v7i0(pz40VarY, b), fetVar), (ugd) null, u1c.M(-2121850291, new ri1(pz40VarY, this, (byte) 19), fetVar), 8);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hv0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hv0 hv0Var = (hv0) (ze3Var instanceof hv0 ? ze3Var : null);
            if (hv0Var != null) {
                cad cadVar = hv0Var.f13704a;
                ctf0 ctf0Var = hv0Var.b;
                ctf0Var.getClass();
                this.l2 = new fiu0(Collections.singletonMap(pv0.class, (t5i) new nr(cadVar, ctf0Var).d));
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(hv0.class, "Cannot create dependency "));
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        Bundle bundle = new Bundle();
        bundle.putString("RESULT_GAME_NICKNAME_DISMISS_KEY", null);
        vcc.f0(bundle, this, this.k2.n(this, o2[0]));
    }
}
