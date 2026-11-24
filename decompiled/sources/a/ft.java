package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ft;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ft extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(ft.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final qek0 N1 = new qek0();

    public ft() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, at.f1412a);
        this.L1 = maz.a(wez.b, new zs(this, (byte) 4));
        this.M1 = xbc.a0(this, sre0.f32672a.b(mt.class), null, new zs(this, (byte) 5), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1823764556, true, new iob0((Object) this, (byte) 28)));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_SAVE_AUTH_DIALOG_KEY", new zs(this, (byte) 6));
        ccq0.T(this, "REQUEST_SAVE_AUTH_DIALOG_KEY", new zs(this, (byte) 7));
        ccq0.V(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new zs(this, (byte) 0));
        ccq0.T(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new zs(this, (byte) 1));
        ccq0.V(this, "REQUEST_APPLY_BIOMETRY_AUTH_DIALOG_KEY", new zs(this, (byte) 2));
        ccq0.T(this, "REQUEST_APPLY_BIOMETRY_AUTH_DIALOG_KEY", new zs(this, (byte) 3));
    }
}
