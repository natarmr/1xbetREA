package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/f840;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f840 extends yx5 {
    public final a8z K1;
    public final a8z L1;
    public final s0r M1;
    public final boolean N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(f840.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final atz O1 = new atz();

    public f840() {
        super(R.layout.compose_fragment);
        this.K1 = maz.a(wez.b, new d840(this, (byte) 0));
        this.L1 = xbc.a0(this, sre0.f32672a.b(m940.class), null, new d840(this, (byte) 1), 14);
        this.M1 = ltt0.o(this, e840.f7356a);
        this.N1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_DELETE_MESSAGE_KEY", new d840(this, (byte) 2));
        ccq0.T(this, "REQUEST_DELETE_MESSAGE_KEY", new d840(this, (byte) 3));
        ccq0.V(this, "REQUEST_DELETE_ALL_MESSAGES_KEY", new d840(this, (byte) 4));
        ccq0.T(this, "REQUEST_DELETE_ALL_MESSAGES_KEY", new d840(this, (byte) 5));
        C().u0("AGGREGATOR_PROMO_CODE_MESSAGE_REQUEST_KEY", this, new viq(this, (byte) 22));
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-231190965, true, new b120(this, (byte) 24)));
    }

    public final rli G0() {
        return (rli) this.K1.getValue();
    }

    public final k3t0 H0() {
        return (k3t0) this.L1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
