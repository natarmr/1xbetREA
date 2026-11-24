package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/in50;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class in50 extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final r34 M1;
    public final s0r N1;
    public final boolean O1;
    public fiu0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(in50.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(in50.class, "sportId", "getSportId()J", 0), new j0d0(in50.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final atz R1 = new atz();

    public in50() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("game_id");
        this.M1 = new r34("sport_id");
        this.N1 = ltt0.o(this, hn50.f13335a);
        this.O1 = true;
        this.Q1 = xbc.b0(this, sre0.f32672a.b(ivq.class), new np30(this, (byte) 22));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(S1[2], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(1749202373, true, new pi40(this, (byte) 14)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(uuq.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            uuq uuqVar = (uuq) (ze3Var instanceof uuq ? ze3Var : null);
            if (uuqVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.L1.n(this, iiyVarArr[0]);
                Long lN = this.M1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = uuqVar.f36313a;
                duj dujVar = uuqVar.b;
                ctf0 ctf0Var = uuqVar.c;
                r9u r9uVar = uuqVar.e;
                pru pruVar = uuqVar.g;
                m1e m1eVar = uuqVar.f;
                uyu uyuVar = uuqVar.d;
                pmi0 pmi0Var = uuqVar.h;
                nmo nmoVar = uuqVar.i;
                ocl oclVar = uuqVar.j;
                wyu wyuVar = uuqVar.k;
                r9uVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                this.P1 = new fiu0(Collections.singletonMap(ivq.class, (ugi) new v7i(cadVar, pmi0Var, nmoVar, r9uVar, i1w0VarF, ctf0Var, pruVar, dujVar, strN, m1eVar, uyuVar, lN, oclVar, wyuVar).o));
                return;
            }
        }
        jf4.n(b1j.i(uuq.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.Q1.getValue()).x(buq.f3244a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        ((k3t0) this.Q1.getValue()).x(cuq.f4998a);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
