package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/x9c0;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x9c0 extends yx5 {
    public final f9o0 K1;
    public final s0r L1;
    public wdk0 M1;
    public opi N1;
    public final a8z O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(x9c0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final rl70 Q1 = new rl70();

    public x9c0() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, w9c0.f38773a);
        this.O1 = maz.a(wez.b, new v9c0(this, (byte) 1));
        this.P1 = xbc.a0(this, sre0.f32672a.b(pac0.class), null, new v9c0(this, (byte) 2), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new v9c0(this, (byte) 0));
        b1j.t(G0().f919a, new ugd(-1859019468, true, new lma0(this, (byte) 19)));
    }

    @Override // a.yx5
    public final void C0() {
        qpi qpiVar = (qpi) this.O1.getValue();
        qpiVar.getClass();
        this.M1 = qpiVar.f29120a;
        this.N1 = (opi) qpiVar.m.get();
    }

    public final aid G0() {
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 H0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(G0().f919a);
        super.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        hxm0.m(G0().f919a);
        this.j1 = true;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
