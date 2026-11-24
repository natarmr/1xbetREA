package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/r6j0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r6j0 extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(r6j0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gle0 N1 = new gle0();

    public r6j0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, q6j0.f28202a);
        this.L1 = maz.a(wez.b, new p6j0(this, (byte) 1));
        this.M1 = xbc.a0(this, sre0.f32672a.b(u6j0.class), null, new p6j0(this, (byte) 2), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1645095300, true, new uph0(this, (byte) 19)));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_AUTHENTICATOR_DISABLE_DIALOG_KEY", new p6j0(this, (byte) 0));
    }
}
