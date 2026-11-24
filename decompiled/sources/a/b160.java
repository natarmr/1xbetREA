package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/b160;", "La/yx5;", "<init>", "()V", "a/evz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b160 extends yx5 {
    public final a8z K1;
    public final n0o0 L1;
    public final s0r M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(b160.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final evz O1 = new evz();

    public b160() {
        super(R.layout.compose_fragment);
        this.K1 = maz.a(wez.b, new th50((byte) 12));
        this.L1 = maz.b(new z060(this, (byte) 0));
        this.M1 = ltt0.o(this, a160.f56a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(v360.class), null, new z060(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(507916916, true, new pi40(this, (byte) 22)));
        ujd ujdVarD = G0().b.d();
        x1x.x(ujdVarD);
        ujdVarD.c(this, new xq2(), new y060(this, (byte) 2));
        x1x.x(G0().Z.b());
        afm0.s(this, new y060(this, (byte) 3));
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new z060(this, (byte) 2));
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new z060(this, (byte) 3));
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new viq(this, (byte) 25));
        o2t.d(F(), this, "", new y060(this, (byte) 4));
    }

    public final emi G0() {
        return (emi) this.L1.getValue();
    }

    public final k3t0 H0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        o2t.a(F());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        wdk0.l(G0().c0, this, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        wdk0.a(G0().c0, this);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return true;
    }
}
