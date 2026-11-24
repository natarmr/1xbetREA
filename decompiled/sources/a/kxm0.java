package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.core.betting.presentation.sub_games_filter.SubGamesFilterBottomSheetParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kxm0;", "La/iw5;", "<init>", "()V", "a/m6m0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kxm0 extends iw5 {
    public fiu0 k2;
    public final khf0 l2 = new khf0("params_key");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(wxm0.class), new ixm0(this, 0));
    public static final /* synthetic */ iiy[] o2 = {new ez40(kxm0.class, "params", "getParams()Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;", 0)};
    public static final m6m0 n2 = new m6m0((byte) 3);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1161208139);
        pz40 pz40VarY = ((i3t0) Q0()).y(fetVar);
        k3t0 k3t0VarQ0 = Q0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        byte b = 0;
        if (zI || objP == obj) {
            objP = new jxm0(this, b);
            fetVar.o0(objP);
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarQ0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new qkb0(k3t0VarQ0, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        boolean zI3 = fetVar.i(this);
        Object objP3 = fetVar.P();
        byte b2 = 1;
        if (zI3 || objP3 == obj) {
            objP3 = new ixm0(this, b2);
            fetVar.o0(objP3);
        }
        Function0 function0 = (Function0) objP3;
        boolean zI4 = fetVar.i(this);
        Object objP4 = fetVar.P();
        if (zI4 || objP4 == obj) {
            objP4 = new ixm0(this, (byte) 2);
            fetVar.o0(objP4);
        }
        v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
        L0().K = true;
        L0().N(3);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(1603708732, new rqc0(this, (byte) 29), fetVar), (ugd) null, u1c.M(-1504281222, new nhl0(pz40VarY, this, (byte) 10), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final SubGamesFilterBottomSheetParams P0() {
        return (SubGamesFilterBottomSheetParams) this.l2.n(this, o2[0]);
    }

    public final k3t0 Q0() {
        return (k3t0) this.m2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lxm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lxm0 lxm0Var = (lxm0) (ze3Var instanceof lxm0 ? ze3Var : null);
            if (lxm0Var != null) {
                SubGamesFilterBottomSheetParams subGamesFilterBottomSheetParamsP0 = P0();
                for (Fragment fragment = this; fragment != 0; fragment = fragment.y) {
                    if (fragment instanceof drs) {
                        xhi xhiVarQ = ((drs) fragment).q();
                        cad cadVar = lxm0Var.f20822a;
                        g2v g2vVar = lxm0Var.b;
                        ctf0 ctf0Var = lxm0Var.c;
                        ctf0Var.getClass();
                        this.k2 = new fiu0(Collections.singletonMap(wxm0.class, (rti) new uii(cadVar, xhiVarQ, subGamesFilterBottomSheetParamsP0, g2vVar, ctf0Var).f));
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(lxm0.class, "Cannot create dependency "));
    }
}
