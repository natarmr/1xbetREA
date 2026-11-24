package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m060;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m060 extends yx5 {
    public final f9o0 K1;
    public final n0o0 L1;
    public final s0r M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(m060.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xuz O1 = new xuz();

    public m060() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = maz.b(new k060(this, (byte) 1));
        this.M1 = ltt0.o(this, l060.f19183a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(x060.class), null, new k060(this, (byte) 2), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(1201686984, true, new pi40(this, (byte) 21)));
        ccq0.V(this, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", new k060(this, (byte) 0));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
