package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/on1;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class on1 extends yx5 {
    public p7i K1;
    public wdk0 L1;
    public ynb M1;
    public ii N1;
    public final phf0 O1;
    public final s0r P1;
    public final n0o0 Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(on1.class, "bundleSearchScreenTypeValue", "getBundleSearchScreenTypeValue()Ljava/lang/String;", 0), new j0d0(on1.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final hfk0 S1 = new hfk0((byte) 18);

    public on1() {
        super(R.layout.fragment_aggregator_search);
        this.O1 = new phf0("SEARCH_SCREEN_TYPE");
        this.P1 = ltt0.o(this, nn1.f23798a);
        this.Q1 = maz.b(new jn1(this, (byte) 0));
        this.R1 = xbc.a0(this, sre0.f32672a.b(dp1.class), null, new jn1(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new gne(this, (byte) 7));
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new jn1(this, (byte) 2));
        Object objN = this.P1.n(U1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-1072061571, true, new o00(this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        q7i q7iVar = (q7i) this.Q1.getValue();
        this.K1 = (p7i) q7iVar.k0.get();
        this.L1 = q7iVar.c0;
        ynb ynbVarI = ((yzn0) q7iVar.b0.b).i();
        x1x.x(ynbVarI);
        this.M1 = ynbVarI;
        this.N1 = q7iVar.a0;
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
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

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getN1() {
        return true;
    }
}
