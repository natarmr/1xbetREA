package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nmu0;", "La/yx5;", "<init>", "()V", "a/svs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nmu0 extends yx5 {
    public final a8z K1;
    public final a8z L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(nmu0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final svs0 O1 = new svs0((byte) 9);

    public nmu0() {
        super(R.layout.compose_fragment);
        o1u0 o1u0Var = new o1u0((byte) 15);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, o1u0Var);
        this.L1 = maz.a(wezVar, new kmu0(this, (byte) 1));
        this.M1 = xbc.a0(this, sre0.f32672a.b(yn2.class), null, new kmu0(this, (byte) 2), 14);
        this.N1 = ltt0.o(this, mmu0.f22061a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(-1890188730, true, new iob0((Object) this, (byte) 17)));
        ujd ujdVarD = G0().P.d();
        x1x.x(ujdVarD);
        ujdVarD.c(this, new xq2(), new lmu0(this, (byte) 2));
        ccq0.V(this, "REMOVE_ALL_VIEWED_RESULT", new kmu0(this, (byte) 4));
    }

    public final qgi G0() {
        return (qgi) this.L1.getValue();
    }

    public final k3t0 H0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getL1() {
        return true;
    }
}
