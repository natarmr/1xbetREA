package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/oxo0;", "La/iw5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oxo0 extends iw5 {
    public fiu0 k2;
    public final phf0 l2 = new phf0("EXTRA_REQUEST_KEY");
    public final zz2 m2 = new zz2("EXTRA_CURRENT_TEAM");
    public final zz2 n2 = new zz2("EXTRA_GAME_ID");
    public final zz2 o2 = new zz2("EXTRA_PLAYER_ID");
    public final a8z p2 = xbc.b0(this, sre0.f32672a.b(wxo0.class), new nxo0(this, 0));
    public static final /* synthetic */ iiy[] r2 = {new ez40(oxo0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(oxo0.class, "currentTeam", "getCurrentTeam()I", 0), new ez40(oxo0.class, "gameId", "getGameId()I", 0), new ez40(oxo0.class, "playerId", "getPlayerId()I", 0)};
    public static final s2m0 q2 = new s2m0();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        oxo0 oxo0Var;
        fetVar.e0(-140375295);
        a8z a8zVar = this.p2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            oxo0Var = this;
            Object tfo0Var = new tfo0(1, oxo0Var, oxo0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/bet_constructor/impl/bets/presentation/models/TeamActionSideEffect;)V", 0, (byte) 21);
            fetVar.o0(tfo0Var);
            objP = tfo0Var;
        } else {
            oxo0Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(oxo0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new qkb0(k3t0Var, oxo0Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, oxo0Var, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), xia0.e, (ugd) null, u1c.M(-1589177742, new nhl0((vxo0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue(), oxo0Var, (byte) 16), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mxo0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mxo0 mxo0Var = (mxo0) (ze3Var instanceof mxo0 ? ze3Var : null);
            if (mxo0Var != null) {
                iiy[] iiyVarArr = r2;
                sxo0 sxo0Var = new sxo0(this.m2.n(this, iiyVarArr[1]).intValue(), this.n2.n(this, iiyVarArr[2]).intValue(), this.o2.n(this, iiyVarArr[3]).intValue());
                cad cadVar = mxo0Var.f22567a;
                ctf0 ctf0Var = mxo0Var.b;
                ctf0Var.getClass();
                this.k2 = new fiu0(Collections.singletonMap(wxo0.class, (xvi) new pmi(cadVar, sxo0Var, ctf0Var).e));
                return;
            }
        }
        jf4.n(b1j.i(mxo0.class, "Cannot create dependency "));
    }
}
