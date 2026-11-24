package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jbs;", "La/yx5;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jbs extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final r34 M1;
    public final s0r N1;
    public fiu0 O1;
    public final a8z P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(jbs.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(jbs.class, "sportId", "getSportId()J", 0), new j0d0(jbs.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xak R1 = new xak((byte) 24);

    public jbs() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("game_id");
        this.M1 = new r34("sport_id");
        this.N1 = ltt0.o(this, ibs.f14506a);
        this.P1 = xbc.b0(this, sre0.f32672a.b(sbs.class), new yip(this, (byte) 29));
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(S1[2], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(1295059103, true, new jar(this, (byte) 11)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ucm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ucm0 ucm0Var = (ucm0) (ze3Var instanceof ucm0 ? ze3Var : null);
            if (ucm0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.L1.n(this, iiyVarArr[0]);
                Long lN = this.M1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = ucm0Var.f35438a;
                duj dujVar = ucm0Var.b;
                pmi0 pmi0Var = ucm0Var.c;
                r9u r9uVar = ucm0Var.e;
                pru pruVar = ucm0Var.d;
                ctf0 ctf0Var = ucm0Var.g;
                uyu uyuVar = ucm0Var.f;
                m1e m1eVar = ucm0Var.h;
                ntu ntuVar = ucm0Var.i;
                knf0 knf0Var = ucm0Var.j;
                gii0 gii0Var = ucm0Var.k;
                ocl oclVar = ucm0Var.l;
                wyu wyuVar = ucm0Var.m;
                nh70 nh70Var = ucm0Var.n;
                r9uVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                wyuVar.getClass();
                this.O1 = new fiu0(Collections.singletonMap(sbs.class, (rti) new cr(cadVar, pmi0Var, nh70Var, r9uVar, i1w0VarF, strN, lN, pruVar, dujVar, ctf0Var, uyuVar, m1eVar, ntuVar, knf0Var, gii0Var, oclVar, wyuVar).q));
                return;
            }
        }
        jf4.n(b1j.i(ucm0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.P1.getValue()).x(bbs.f2322a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        ((k3t0) this.P1.getValue()).x(cbs.f4075a);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
