package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/n7g0;", "La/iw5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n7g0 extends iw5 {
    public fiu0 k2;
    public final phf0 l2 = new phf0("GAME_ID");
    public final r34 m2 = new r34("SPORT_ID");
    public final phf0 n2 = new phf0("TEAM_ID");
    public final a8z o2;
    public static final /* synthetic */ iiy[] q2 = {new ez40(n7g0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(n7g0.class, "sportId", "getSportId()J", 0), new ez40(n7g0.class, "teamId", "getTeamId()Ljava/lang/String;", 0), new j0d0(n7g0.class, "binding", "getBinding()Lorg/xplatform/statistic/stat_results/impl/databinding/BottomsheetResultsGridNavigationBinding;", 0)};
    public static final cge0 p2 = new cge0((byte) 9);

    public n7g0() {
        ltt0.o(this, m7g0.f21320a);
        this.o2 = xbc.b0(this, sre0.f32672a.b(o7g0.class), new a7g0(this, (byte) 1));
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-125214643);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), vbw0.d, (ugd) null, u1c.M(298148030, new in80((b5g0) ((i3t0) ((k3t0) this.o2.getValue())).y(fetVar).getValue(), this, (byte) 17), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v6g0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v6g0 v6g0Var = (v6g0) (ze3Var instanceof v6g0 ? ze3Var : null);
            if (v6g0Var != null) {
                iiy[] iiyVarArr = q2;
                this.k2 = v6g0Var.a(this.m2.n(this, iiyVarArr[1]).longValue(), a4n0.f(this), this.l2.n(this, iiyVarArr[0]), this.n2.n(this, iiyVarArr[2])).o();
                return;
            }
        }
        jf4.n(b1j.i(v6g0.class, "Cannot create dependency "));
    }
}
