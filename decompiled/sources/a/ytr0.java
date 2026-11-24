package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ytr0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ytr0 extends yx5 {
    public final zz2 K1;
    public final r34 L1;
    public final s0r M1;
    public gni N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(ytr0.class, "idOutcomes", "getIdOutcomes()I", 0), new ez40(ytr0.class, "sportId", "getSportId()J", 0), new j0d0(ytr0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final m6m0 P1 = new m6m0((byte) 25);

    public ytr0() {
        super(R.layout.compose_fragment);
        this.K1 = new zz2("ID_OUTCOMES");
        this.L1 = new r34("SPORT_ID");
        this.M1 = ltt0.o(this, xtr0.f41477a);
        this.O1 = xbc.a0(this, sre0.f32672a.b(cur0.class), null, new qir0(this, (byte) 7), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(Q1[2], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(1883596477, true, new p6r0(this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ge80.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ge80 ge80Var = (ge80) (ze3Var instanceof ge80 ? ze3Var : null);
            if (ge80Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = Q1;
                Integer numN = this.K1.n(this, iiyVarArr[0]);
                Long lN = this.L1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                cad cadVar = ge80Var.f11141a;
                ctf0 ctf0Var = ge80Var.g;
                gkr0 gkr0Var = ge80Var.b;
                btt0 btt0Var = ge80Var.c;
                gii0 gii0Var = ge80Var.d;
                sd80 sd80Var = ge80Var.e;
                knf0 knf0Var = ge80Var.f;
                ctf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                gkr0Var.getClass();
                sd80Var.getClass();
                knf0Var.getClass();
                this.N1 = (gni) ((n5d0) new o3c(cadVar, numN, lN, i1w0VarF, ctf0Var, btt0Var, gii0Var, gkr0Var, sd80Var, knf0Var).k).get();
                return;
            }
        }
        jf4.n(b1j.i(ge80.class, "Cannot create dependency "));
    }
}
