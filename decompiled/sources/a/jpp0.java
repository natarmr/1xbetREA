package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jpp0;", "La/yx5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jpp0 extends yx5 {
    public final a8z K1;
    public final n0o0 L1;
    public final s0r M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(jpp0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final s2m0 O1 = new s2m0();

    public jpp0() {
        super(R.layout.compose_fragment);
        this.K1 = maz.a(wez.b, new mhp0((byte) 18));
        this.L1 = maz.b(new hpp0(this, (byte) 0));
        this.M1 = ltt0.o(this, ipp0.f15176a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(qi2.class), null, new hpp0(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(913603520, true, new iob0((Object) this, (byte) 10)));
        ccq0.V(this, "REMOVE_ALL_TEAM_RESULT", new hpp0(this, (byte) 2));
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
