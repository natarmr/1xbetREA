package a;

import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s7v0;", "La/yx5;", "<init>", "()V", "a/wxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s7v0 extends yx5 {
    public fiu0 K1;
    public final khf0 L1;
    public final a8z M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(s7v0.class, "params", "getParams()Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;", 0), new j0d0(s7v0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wxs0 P1 = new wxs0((byte) 13);

    public s7v0() {
        super(R.layout.compose_fragment);
        this.L1 = new khf0("params_key");
        this.M1 = maz.a(wez.b, new q7v0(this, (byte) 0));
        this.N1 = xbc.b0(this, sre0.f32672a.b(c8v0.class), new q7v0(this, (byte) 1));
        this.O1 = ltt0.o(this, r7v0.f29997a);
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = new fiu0(Collections.singletonMap(c8v0.class, ((nzi) this.M1.getValue()).i));
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.O1.n(Q1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1121273727, true, new ggt0(this, (byte) 15)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getR1() {
        return true;
    }
}
