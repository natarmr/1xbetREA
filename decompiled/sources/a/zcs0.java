package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zcs0;", "La/yx5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zcs0 extends yx5 {
    public final a8z K1;
    public final a8z L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(zcs0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final s2m0 O1 = new s2m0();

    public zcs0() {
        super(R.layout.compose_fragment);
        yqr0 yqr0Var = new yqr0((byte) 22);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, yqr0Var);
        this.L1 = maz.a(wezVar, new xcs0(this, (byte) 0));
        this.M1 = xbc.a0(this, sre0.f32672a.b(ul2.class), null, new xcs0(this, (byte) 1), 14);
        this.N1 = ltt0.o(this, ycs0.f42397a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REMOVE_ALL_COEF_TRACK_RESULT", new xcs0(this, (byte) 2));
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new xcs0(this, (byte) 3));
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        byte b = 15;
        pkd.i(((aid) objN).b, new shd(b), new ugd(879055052, true, new iob0(this, b)));
        ccq0.V(this, "REMOVE_ALL_COEF_TRACK_RESULT", new xcs0(this, (byte) 5));
        ccq0.V(this, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", new xcs0(this, (byte) 6));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    public final ogi H0() {
        return (ogi) this.L1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return true;
    }
}
