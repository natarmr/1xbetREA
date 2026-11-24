package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cqw;", "La/yx5;", "<init>", "()V", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cqw extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final r34 M1;
    public final yzn0 N1;
    public final s0r O1;
    public fiu0 P1;
    public final a8z Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(cqw.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(cqw.class, "sportId", "getSportId()J", 0), new ez40(cqw.class, "screenType", "getScreenType()Lorg/xplatform/remoteconfig/domain/models/StatisticsMainScreenStyle;", 0), new j0d0(cqw.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final rqt S1 = new rqt();

    public cqw() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("GAME_ID");
        this.M1 = new r34("SPORT_ID");
        this.N1 = new yzn0("SCREEN_TYPE");
        this.O1 = ltt0.o(this, bqw.f3053a);
        this.Q1 = xbc.b0(this, sre0.f32672a.b(qqw.class), new bdv(this, (byte) 23));
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(U1[3], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-1104969891, true, new xxv(this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ipw.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ipw ipwVar = (ipw) (ze3Var instanceof ipw ? ze3Var : null);
            if (ipwVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                String strN = this.L1.n(this, iiyVarArr[0]);
                Long lN = this.M1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = ipwVar.f15183a;
                gii0 gii0Var = ipwVar.b;
                wyu wyuVar = ipwVar.f;
                uyu uyuVar = ipwVar.g;
                pru pruVar = ipwVar.h;
                r9u r9uVar = ipwVar.i;
                ctf0 ctf0Var = ipwVar.d;
                m1e m1eVar = ipwVar.c;
                ocl oclVar = ipwVar.e;
                OnexDatabase onexDatabase = ipwVar.k;
                pmi0 pmi0Var = ipwVar.j;
                knf0 knf0Var = ipwVar.l;
                gii0Var.getClass();
                wyuVar.getClass();
                r9uVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                onexDatabase.getClass();
                knf0Var.getClass();
                this.P1 = new fiu0(Collections.singletonMap(qqw.class, (tii) new v7i(cadVar, pmi0Var, gii0Var, strN, lN, wyuVar, uyuVar, pruVar, r9uVar, ctf0Var, m1eVar, i1w0VarF, oclVar, knf0Var).o));
                return;
            }
        }
        jf4.n(b1j.i(ipw.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.Q1.getValue()).x(ypw.f43052a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.Q1.getValue()).x(zpw.f44781a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
