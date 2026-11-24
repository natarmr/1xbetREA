package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cmb;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cmb extends yx5 {
    public final a8z K1;
    public final n0o0 L1;
    public final s0r M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(cmb.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final yk5 O1 = new yk5();

    public cmb() {
        super(R.layout.compose_fragment);
        this.K1 = maz.a(wez.b, new e0b((byte) 21));
        this.L1 = maz.b(new amb(this, (byte) 0));
        this.M1 = ltt0.o(this, bmb.f2828a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(fk2.class), null, new amb(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(-643541162, true, new tx(this, (byte) 14)));
        ccq0.V(this, "REMOVE_ALL_TOURNAMENTS_RESULT", new amb(this, (byte) 3));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return true;
    }
}
