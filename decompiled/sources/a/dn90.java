package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/dn90;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dn90 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(jn90.class), new pl70(this, 19));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        dn90 dn90Var;
        fetVar.e0(736931623);
        a8z a8zVar = this.l2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            dn90Var = this;
            Object yi90Var = new yi90(1, dn90Var, dn90.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/dialogs/pick_sub_game/PickDuelSubGameSideEffect;)V", 0, (byte) 1);
            fetVar.o0(yi90Var);
            objP = yi90Var;
        } else {
            dn90Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(dn90Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new khx(k3t0Var, dn90Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, dn90Var, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), o050.e, (ugd) null, u1c.M(956583254, new in80(((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar), dn90Var, (byte) 1), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(en90.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            en90 en90Var = (en90) (ze3Var instanceof en90 ? ze3Var : null);
            if (en90Var != null) {
                for (Fragment fragment = this; fragment != null; fragment = fragment.y) {
                    if (fragment instanceof ka9) {
                        ioi ioiVarH0 = ((ka9) fragment).H0();
                        cad cadVar = en90Var.f8083a;
                        o8f o8fVar = en90Var.b;
                        o8fVar.getClass();
                        this.k2 = new fiu0(Collections.singletonMap(jn90.class, (eni) new ali(cadVar, ioiVarH0, o8fVar).d));
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(en90.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }
}
