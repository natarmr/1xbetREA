package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/y9r0;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y9r0 extends iw5 {
    public static final String m2 = v9r0.class.getSimpleName();
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(lar0.class), new x9r0(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-951258055);
        pz40 pz40VarY = ((i3t0) ((k3t0) this.l2.getValue())).y(fetVar);
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        if (zI || objP == ukd.f35823a) {
            objP = new x9r0(this, (byte) 1);
            fetVar.o0(objP);
        }
        v3c.A((Function0) objP, null, null, fetVar, 0, 6);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, false, false, null, 0L, 62), cwr0.f, (ugd) null, u1c.M(-1902436758, new tft(pz40VarY, (byte) 29), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(z9r0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            z9r0 z9r0Var = (z9r0) (ze3Var instanceof z9r0 ? ze3Var : null);
            if (z9r0Var != null) {
                cad cadVar = z9r0Var.f44034a;
                k3r0 k3r0Var = z9r0Var.b;
                k3r0Var.getClass();
                this.k2 = new fiu0(Collections.singletonMap(lar0.class, (xvi) new nr(cadVar, k3r0Var).d));
                return;
            }
        }
        jf4.n(b1j.i(z9r0.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }
}
