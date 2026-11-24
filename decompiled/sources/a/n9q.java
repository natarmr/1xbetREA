package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/n9q;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n9q extends yx5 {
    public static final /* synthetic */ iiy[] S1 = {new j0d0(n9q.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public final s0r K1;
    public ihi L1;
    public xi70 M1;
    public wdk0 N1;
    public d720 O1;
    public lgn0 P1;
    public ii Q1;
    public final a8z R1;

    public n9q() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, m9q.f21422a);
        this.R1 = xbc.a0(this, sre0.f32672a.b(ebq.class), null, new l9q(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "BET_ALREADY_DONE_REQUEST_KEY", new l9q(this, (byte) 1));
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new l9q(this, (byte) 2));
        C().u0("REQUEST_FINISH_MAKE_BET_DIALOG_KEY", this, new z9f(this, (byte) 26));
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-815035553, true, new f5o(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o9q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            o9q o9qVar = (o9q) (ze3Var instanceof o9q ? ze3Var : null);
            if (o9qVar != null) {
                tai taiVarA = o9qVar.a(a4n0.f(this));
                this.L1 = (ihi) taiVarA.j.get();
                this.M1 = ((rmd0) taiVarA.v).f();
                this.N1 = (wdk0) taiVarA.C;
                this.O1 = new d720((lbu) taiVarA.D, new lk5(taiVarA.g, taiVarA.h, (byte) 3));
                this.P1 = (lgn0) taiVarA.E;
                this.Q1 = (ii) taiVarA.F;
                return;
            }
        }
        jf4.n(b1j.i(o9q.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return false;
    }
}
