package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/e4p0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e4p0 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final n0o0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(e4p0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final m6m0 O1 = new m6m0((byte) 13);

    public e4p0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.L1 = ltt0.o(this, d4p0.f5466a);
        this.M1 = maz.b(new c4p0(this, (byte) 0));
        this.N1 = xbc.a0(this, sre0.f32672a.b(q4p0.class), null, new c4p0(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(1908474747, true, new abn0(this, (byte) 27)));
        ccq0.V(this, "REMOVE_ALL_TEAM_BET_TEAMS", new c4p0(this, (byte) 4));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.K1;
    }
}
