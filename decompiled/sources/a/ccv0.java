package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.special_event.impl.who_win.presentation.model.WhoWinScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ccv0;", "La/yx5;", "<init>", "()V", "a/uxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ccv0 extends yx5 {
    public pzi K1;
    public final a8z L1;
    public final s0r M1;
    public final boolean N1;
    public final khf0 O1;
    public final n0o0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(ccv0.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/ComposeScreenViewBinding;", 0), new j0d0(ccv0.class, "params", "getParams()Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;", 0)};
    public static final uxs0 Q1 = new uxs0((byte) 14);
    public static final String S1 = ccv0.class.getSimpleName();

    public ccv0() {
        super(R.layout.compose_screen_view);
        this.L1 = xbc.a0(this, sre0.f32672a.b(vcv0.class), null, new zbv0(this, (byte) 1), 14);
        this.M1 = ltt0.o(this, bcv0.f2372a);
        this.N1 = true;
        this.O1 = new khf0("BUNDLE_PARAMS");
        this.P1 = maz.b(new zbv0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[0], this);
        objN.getClass();
        pkd.k(((ekd) objN).b, ((qzi) this.P1.getValue()).k.f8531a, new ugd(1575792762, true, new iob0((Object) this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = (pzi) ((qzi) this.P1.getValue()).l.get();
    }

    public final WhoWinScreenParams G0() {
        return (WhoWinScreenParams) this.O1.n(this, R1[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.L1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.N1;
    }
}
