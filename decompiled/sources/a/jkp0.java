package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jkp0;", "La/yx5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jkp0 extends yx5 {
    public final phf0 K1;
    public final phf0 L1;
    public final s0r M1;
    public nwi N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(jkp0.class, "teamId", "getTeamId()Ljava/lang/String;", 0), new ez40(jkp0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new j0d0(jkp0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final s2m0 Q1 = new s2m0();

    public jkp0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("team_id");
        this.L1 = new phf0("game_id");
        this.M1 = ltt0.o(this, ikp0.f14939a);
        this.O1 = xbc.a0(this, sre0.f32672a.b(ykp0.class), null, new nxo0(this, (byte) 15), 14);
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[2], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-224994617, true, new l7p0(this, (byte) 5)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hkp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hkp0 hkp0Var = (hkp0) (ze3Var instanceof hkp0 ? ze3Var : null);
            if (hkp0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.K1.n(this, iiyVarArr[0]);
                String strN2 = this.L1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                strN2.getClass();
                cad cadVar = hkp0Var.f13219a;
                duj dujVar = hkp0Var.b;
                gii0 gii0Var = hkp0Var.c;
                m1e m1eVar = hkp0Var.d;
                wyu wyuVar = hkp0Var.e;
                ocl oclVar = hkp0Var.f;
                ctf0 ctf0Var = hkp0Var.g;
                knf0 knf0Var = hkp0Var.h;
                nh70 nh70Var = hkp0Var.i;
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.N1 = (nwi) ((n5d0) new o3c(cadVar, nh70Var, i1w0VarF, dujVar, gii0Var, m1eVar, oclVar, ctf0Var, knf0Var, strN, strN2).k).get();
                return;
            }
        }
        jf4.n(b1j.i(hkp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
