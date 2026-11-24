package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/esc;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class esc extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(ksc.class), new h8a(this, 17));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        esc escVar;
        fetVar.e0(1655025776);
        a8z a8zVar = this.l2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            escVar = this;
            Object encVar = new enc(1, escVar, esc.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/dialogs/clear_teams/ClearTeamsSideEffect;)V", 0, (byte) 8);
            fetVar.o0(encVar);
            objP = encVar;
        } else {
            escVar = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(escVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new ee0(k3t0Var, escVar, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, escVar, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), j120.c, (ugd) null, u1c.M(990764319, new ab4((Object) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar), (Object) escVar, (byte) 25), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fsc.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fsc fscVar = (fsc) (ze3Var instanceof fsc ? ze3Var : null);
            if (fscVar != null) {
                for (Fragment fragment = this; fragment != null; fragment = fragment.y) {
                    if (fragment instanceof ka9) {
                        ioi ioiVarH0 = ((ka9) fragment).H0();
                        cad cadVar = fscVar.f10057a;
                        ctf0 ctf0Var = fscVar.b;
                        ctf0Var.getClass();
                        this.k2 = new fiu0(Collections.singletonMap(ksc.class, (pai) new mii0(cadVar, ioiVarH0, ctf0Var).e));
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(fsc.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }
}
