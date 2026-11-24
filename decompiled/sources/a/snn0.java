package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/snn0;", "La/iw5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class snn0 extends iw5 {
    public fiu0 k2;
    public final r34 l2 = new r34("SWAP_PLAYERS_TEAM_DIALOG_PLAYER_ID_KEY");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(ynn0.class), new jfm0(this, 15));
    public static final /* synthetic */ iiy[] o2 = {new ez40(snn0.class, "playerId", "getPlayerId()J", 0)};
    public static final j6m0 n2 = new j6m0((byte) 7);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        snn0 snn0Var;
        fetVar.e0(-1659877037);
        a8z a8zVar = this.m2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            snn0Var = this;
            Object ndn0Var = new ndn0(1, snn0Var, snn0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/dialogs/swap_team/SwapPlayersTeamSideEffect;)V", 0, (byte) 10);
            fetVar.o0(ndn0Var);
            objP = ndn0Var;
        } else {
            snn0Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(snn0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new qkb0(k3t0Var, snn0Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, snn0Var, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), ju70.h, (ugd) null, u1c.M(-1420536062, new nhl0(((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar), snn0Var, (byte) 13), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tnn0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof tnn0)) {
                ze3Var = null;
            }
            tnn0 tnn0Var = (tnn0) ze3Var;
            if (tnn0Var != null) {
                androidx.fragment.app.e eVarF = F();
                while (eVarF != null) {
                    for (int iP = eVarF.P() - 1; iP >= 0; iP--) {
                        Fragment fragmentJ = eVarF.J(eVarF.O(iP).i);
                        if (fragmentJ instanceof ka9) {
                            ioi ioiVarH0 = ((ka9) fragmentJ).H0();
                            Long lN = this.l2.n(this, o2[0]);
                            cad cadVar = tnn0Var.f34245a;
                            ctf0 ctf0Var = tnn0Var.b;
                            ctf0Var.getClass();
                            this.k2 = new fiu0(Collections.singletonMap(ynn0.class, (rti) new kki(cadVar, ioiVarH0, ctf0Var, lN).f));
                            return;
                        }
                    }
                    Fragment fragment = this.y;
                    eVarF = fragment != null ? fragment.F() : null;
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(tnn0.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }
}
