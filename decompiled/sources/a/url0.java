package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/url0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class url0 extends yx5 {
    public final s0r K1;
    public final n0o0 L1;
    public tui M1;
    public final a8z N1;
    public wdk0 O1;
    public ii P1;
    public final khf0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(url0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(url0.class, "screenParams", "getScreenParams()Lorg/xplatform/feed/navigation/SportFilterScreenParams;", 0)};
    public static final cge0 R1 = new cge0((byte) 28);

    public url0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, trl0.f34425a);
        this.L1 = maz.b(new srl0(this, (byte) 5));
        this.N1 = xbc.a0(this, sre0.f32672a.b(vsl0.class), null, new srl0(this, (byte) 6), 14);
        this.Q1 = new khf0("SCREEN_PARAMS_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new srl0(this, (byte) 0));
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-1619581025, true, new edk0(this, (byte) 15)));
    }

    @Override // a.yx5
    public final void C0() {
        uui uuiVar = (uui) this.L1.getValue();
        this.M1 = (tui) uuiVar.n.get();
        this.O1 = uuiVar.l;
        this.P1 = uuiVar.m;
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_CHANGES_DIALOG_KEY", new srl0(this, (byte) 1));
        ccq0.T(this, "REQUEST_CHANGES_DIALOG_KEY", new srl0(this, (byte) 2));
        ccq0.V(this, "REQUEST_CLEAR_SELECTED_SPORTS_KEY", new srl0(this, (byte) 3));
        ccq0.V(this, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", new srl0(this, (byte) 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hxm0.m(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(brl0.f3085a);
    }
}
