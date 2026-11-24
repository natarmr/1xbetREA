package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ajp0;", "La/iw5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ajp0 extends iw5 {
    public fiu0 k2;
    public final phf0 l2 = new phf0("EXTRA_REQUEST_KEY");
    public final phf0 m2 = new phf0("EXTRA_TITLE");
    public final zz2 n2 = new zz2("EXTRA_GAME_ID");
    public final zz2 o2 = new zz2("EXTRA_PLAYER_ID");
    public final es p2 = new es("EXTRA_ITEMS");
    public final a8z q2 = xbc.b0(this, sre0.f32672a.b(hjp0.class), new nxo0(this, 13));
    public static final /* synthetic */ iiy[] s2 = {new ez40(ajp0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(ajp0.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(ajp0.class, "gameId", "getGameId()I", 0), new ez40(ajp0.class, "playerId", "getPlayerId()I", 0), new ez40(ajp0.class, "teamValuesIds", "getTeamValuesIds()Ljava/util/List;", 0)};
    public static final s9m0 r2 = new s9m0();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        ajp0 ajp0Var;
        fetVar.e0(1297249708);
        a8z a8zVar = this.q2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            ajp0Var = this;
            Object g0p0Var = new g0p0(1, ajp0Var, ajp0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/bet_constructor/impl/team_selector/presentation/models/TeamSelectorBottomSheetSideEffect;)V", 0, (byte) 12);
            fetVar.o0(g0p0Var);
            objP = g0p0Var;
        } else {
            ajp0Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(ajp0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new qkb0(k3t0Var, ajp0Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, ajp0Var, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(1486063197, new gcn0(ajp0Var, (byte) 8), fetVar), (ugd) null, u1c.M(-509239525, new nhl0((gjp0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue(), ajp0Var, (byte) 18), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jjp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jjp0 jjp0Var = (jjp0) (ze3Var instanceof jjp0 ? ze3Var : null);
            if (jjp0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                List listN = this.p2.n(this, s2[4]);
                i1w0VarF.getClass();
                cad cadVar = jjp0Var.f16629a;
                ctf0 ctf0Var = jjp0Var.b;
                ctf0Var.getClass();
                this.k2 = new kki(cadVar, listN, ctf0Var).A();
                return;
            }
        }
        jf4.n(b1j.i(jjp0.class, "Cannot create dependency "));
    }
}
