package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nxh;", "La/yx5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nxh extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public bfi M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(nxh.class, "raceId", "getRaceId()Ljava/lang/String;", 0), new j0d0(nxh.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kwd P1 = new kwd();

    public nxh() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("RACE_ID");
        this.L1 = ltt0.o(this, mxh.f22555a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(wxh.class), null, new e8g(this, (byte) 22), 14);
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-903966572, true, new yfg(this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lxh.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lxh lxhVar = (lxh) (ze3Var instanceof lxh ? ze3Var : null);
            if (lxhVar != null) {
                String strN = this.K1.n(this, Q1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = lxhVar.f20815a;
                duj dujVar = lxhVar.b;
                gii0 gii0Var = lxhVar.c;
                m1e m1eVar = lxhVar.d;
                ocl oclVar = lxhVar.e;
                ctf0 ctf0Var = lxhVar.f;
                knf0 knf0Var = lxhVar.g;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.M1 = (bfi) ((n5d0) new o3c(cadVar, gii0Var, dujVar, oclVar, m1eVar, i1w0VarF, ctf0Var, strN, knf0Var).k).get();
                return;
            }
        }
        jf4.n(b1j.i(lxh.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
