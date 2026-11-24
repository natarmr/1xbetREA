package a;

import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/w4e0;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w4e0 extends yx5 {
    public fiu0 K1;
    public final a8z L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(w4e0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final rl70 O1 = new rl70();

    public w4e0() {
        super(R.layout.compose_fragment);
        this.L1 = maz.a(wez.b, new u4e0(this, (byte) 0));
        this.M1 = xbc.b0(this, sre0.f32672a.b(u9e0.class), new u4e0(this, (byte) 1));
        this.N1 = ltt0.o(this, v4e0.f36774a);
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = new fiu0(Collections.singletonMap(u9e0.class, ((bri) this.L1.getValue()).i));
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1903223063, true, new nrc0(this, (byte) 17)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return true;
    }
}
