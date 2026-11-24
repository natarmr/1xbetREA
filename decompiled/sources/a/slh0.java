package a;

import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/slh0;", "La/yx5;", "<init>", "()V", "a/cge0", "La/nmh0;", CommonConstant.ReqAccessTokenParam.STATE_LABEL, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class slh0 extends yx5 {
    public final f9o0 K1;
    public final s0r L1;
    public final a8z M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(slh0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cge0 O1 = new cge0((byte) 15);

    public slh0() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, rlh0.f30698a);
        this.M1 = xbc.a0(this, sre0.f32672a.b(qmh0.class), null, new qlh0(this, (byte) 0), 14);
        this.N1 = maz.a(wez.b, new qlh0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1790914799, true, new dke0(this, (byte) 26)));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.t0(this, "CHOOSE_QUESTION_DIALOG_KEY", new gwg0(this, (byte) 13));
        ccq0.V(this, "EXIT_WITH_ERROR_DIALOG_KEY", new qlh0(this, (byte) 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        qcc.d0(this, false);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        qcc.d0(this, true);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
