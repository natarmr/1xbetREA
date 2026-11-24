package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dfc;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dfc extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(dfc.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gl5 N1 = new gl5((byte) 24);

    public dfc() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, cfc.f4253a);
        this.L1 = maz.a(wez.b, new bfc(this, (byte) 0));
        this.M1 = xbc.a0(this, sre0.f32672a.b(ffc.class), null, new bfc(this, (byte) 1), 14);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(463195477, true, new bna(this, (byte) 27)));
    }
}
