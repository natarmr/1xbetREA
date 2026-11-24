package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yb30;", "La/yx5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yb30 extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final r34 M1;
    public final boolean N1;
    public final s0r O1;
    public final a8z P1;
    public jli Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(yb30.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(yb30.class, "sportId", "getSportId()J", 0), new j0d0(yb30.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final htz R1 = new htz();

    public yb30() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("GAME_ID");
        this.M1 = new r34("SPORT_ID");
        this.N1 = true;
        this.O1 = ltt0.o(this, xb30.f40581a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(xc30.class), null, new rx00(this, (byte) 21), 14);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wb30.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wb30 wb30Var = (wb30) (ze3Var instanceof wb30 ? ze3Var : null);
            if (wb30Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.L1.n(this, iiyVarArr[0]);
                Long lN = this.M1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = wb30Var.f38857a;
                gii0 gii0Var = wb30Var.b;
                duj dujVar = wb30Var.d;
                sjl0 sjl0Var = wb30Var.c;
                ctf0 ctf0Var = wb30Var.k;
                r9u r9uVar = wb30Var.l;
                pru pruVar = wb30Var.f;
                pmi0 pmi0Var = wb30Var.e;
                zb30 zb30Var = wb30Var.g;
                OnexDatabase onexDatabase = wb30Var.h;
                m1e m1eVar = wb30Var.i;
                uyu uyuVar = wb30Var.m;
                ocl oclVar = wb30Var.j;
                knf0 knf0Var = wb30Var.n;
                wyu wyuVar = wb30Var.o;
                gii0Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                sjl0Var.getClass();
                zb30Var.getClass();
                onexDatabase.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.Q1 = (jli) ((n5d0) new cr(cadVar, pmi0Var, i1w0VarF, gii0Var, pruVar, ctf0Var, dujVar, r9uVar, strN, zb30Var, m1eVar, uyuVar, oclVar, lN, knf0Var, wyuVar).q).get();
                return;
            }
        }
        jf4.n(b1j.i(wb30.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.O1.n(S1[2], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(2140821575, true, new b120(this, (byte) 13)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
