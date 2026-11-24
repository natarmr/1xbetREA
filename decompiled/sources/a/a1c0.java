package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/a1c0;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a1c0 extends yx5 {
    public final s0r K1;
    public final n0o0 L1;
    public final a8z M1;
    public jh70 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(a1c0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final rl70 O1 = new rl70();

    public a1c0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, y0c0.f41799a);
        this.L1 = maz.b(new v0c0(this, (byte) 2));
        this.M1 = xbc.a0(this, sre0.f32672a.b(b2c0.class), null, new v0c0(this, (byte) 3), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        gl5 gl5Var = G0().u;
        byte b = 0;
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new v0c0(this, (byte) 1), new w0c0(this, (byte) 0));
        qcc.X(this, new v0c0(this, b));
        Object objN = this.K1.n(P1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(1869518551, true, new x0c0(this, b)));
    }

    @Override // a.yx5
    public final void C0() {
        this.N1 = G0().x;
    }

    public final mpi G0() {
        return (mpi) this.L1.getValue();
    }

    public final k3t0 H0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.s0(this, "LOCATION_CHOICE_ITEM_KEY", new w0c0(this, (byte) 1));
        sj3.s0(this, "GENDER_CHOICE_ITEM_KEY", new w0c0(this, (byte) 2));
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new x0c0(this, (byte) 1));
        ccq0.V(this, "ERROR_DIALOG_REQUEST_KEY", new v0c0(this, (byte) 4));
        ccq0.V(this, "EXIT_DIALOG_REQUEST_KEY", new v0c0(this, (byte) 5));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().x(t0c0.f33113a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getN1() {
        return false;
    }
}
