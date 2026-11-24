package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/arw;", "La/yx5;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class arw extends yx5 {
    public final phf0 K1;
    public final r34 L1;
    public final s0r M1;
    public fiu0 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(arw.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(arw.class, "sportId", "getSportId()J", 0), new j0d0(arw.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final sqt Q1 = new sqt();

    public arw() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("GAME_ID");
        this.L1 = new r34("SPORT_ID");
        this.M1 = ltt0.o(this, zqw.f44828a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(krw.class), new bdv(this, (byte) 24));
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[2], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1326594059, true, new xxv(this, (byte) 14)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(prw.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            prw prwVar = (prw) (ze3Var instanceof prw ? ze3Var : null);
            if (prwVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.K1.n(this, iiyVarArr[0]);
                Long lN = this.L1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = prwVar.f27486a;
                duj dujVar = prwVar.b;
                gii0 gii0Var = prwVar.c;
                m1e m1eVar = prwVar.d;
                ocl oclVar = prwVar.e;
                ctf0 ctf0Var = prwVar.f;
                knf0 knf0Var = prwVar.g;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.N1 = new fiu0(Collections.singletonMap(krw.class, (tii) new o3c(cadVar, dujVar, gii0Var, strN, lN, i1w0VarF, m1eVar, oclVar, ctf0Var, knf0Var).k));
                return;
            }
        }
        jf4.n(b1j.i(prw.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.O1.getValue()).x(vqw.f37872a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.O1.getValue()).x(wqw.f39612a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
