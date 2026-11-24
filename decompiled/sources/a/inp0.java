package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/inp0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class inp0 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public final boolean M1;
    public owi N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(inp0.class, "teamId", "getTeamId()Ljava/lang/String;", 0), new j0d0(inp0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final j6m0 P1 = new j6m0((byte) 15);

    public inp0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("team_id_bundle_key");
        this.L1 = ltt0.o(this, hnp0.f13360a);
        this.M1 = true;
        this.O1 = xbc.a0(this, sre0.f32672a.b(qnp0.class), null, new nxo0(this, (byte) 18), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-506458359, true, new l7p0(this, (byte) 7)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(gnp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            gnp0 gnp0Var = (gnp0) (ze3Var instanceof gnp0 ? ze3Var : null);
            if (gnp0Var != null) {
                String strN = this.K1.n(this, Q1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = gnp0Var.f11599a;
                gii0 gii0Var = gnp0Var.b;
                duj dujVar = gnp0Var.c;
                ocl oclVar = gnp0Var.d;
                m1e m1eVar = gnp0Var.e;
                knf0 knf0Var = gnp0Var.f;
                ctf0 ctf0Var = gnp0Var.g;
                pru pruVar = gnp0Var.h;
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                this.N1 = (owi) ((n5d0) new pwi(cadVar, gii0Var, strN, i1w0VarF, dujVar, oclVar, m1eVar, knf0Var, ctf0Var, pruVar).k).get();
                return;
            }
        }
        jf4.n(b1j.i(gnp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
