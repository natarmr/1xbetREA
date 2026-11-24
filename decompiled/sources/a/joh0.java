package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/joh0;", "La/yx5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class joh0 extends yx5 {
    public final n0o0 K1;
    public final s0r L1;
    public final kiu0 M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(joh0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final eke0 N1 = new eke0();

    public joh0() {
        super(R.layout.compose_fragment);
        this.K1 = maz.b(new hoh0(this, (byte) 8));
        this.L1 = ltt0.o(this, ioh0.f15117a);
        yxf0 yxf0Var = new yxf0(new hoh0(this, (byte) 0), (byte) 20);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 21), (byte) 22));
        this.M1 = agc.G(this, sre0.f32672a.b(iph0.class), new fxf0(a8zVarA, (byte) 22), new fxf0(a8zVarA, (byte) 23), yxf0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(1755950061, true, new dke0(this, (byte) 29)));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().J;
        tye0 tye0Var = new tye0(this, null, (byte) 23);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kmg0(ol60Var, clzVarW, tye0Var, (yje) null, (byte) 0), 3);
    }

    public final zsi G0() {
        return (zsi) this.K1.getValue();
    }

    public final iph0 H0() {
        return (iph0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_GIFT_DIALOG_KEY", new hoh0(this, (byte) 4));
        ccq0.T(this, "REQUEST_GIFT_DIALOG_KEY", new hoh0(this, (byte) 5));
        ccq0.V(this, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY", new hoh0(this, (byte) 1));
        ccq0.V(this, "REQUEST_BIND_PHONE_DIALOG_KEY", new hoh0(this, (byte) 3));
        ccq0.V(this, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY", new hoh0(this, (byte) 2));
        ccq0.T(this, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new hoh0(this, (byte) 6));
        ccq0.V(this, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new hoh0(this, (byte) 7));
        G0().getClass();
        Class<iph0> cls = iph0.class;
        F().u0("REQUEST_CAPTCHA_CODE_DIALOG_KEY", this, new hi("REQUEST_CAPTCHA_CODE_DIALOG_KEY", new b0c0(0, H0(), cls, "onCaptchaCancelled", "onCaptchaCancelled()V", 0, (byte) 26), new jjh0(1, H0(), cls, "onCaptchaConfirmed", "onCaptchaConfirmed(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V", 0, (byte) 5)));
        F().u0("RESET_HASH_SECRET_KEY", this, new ex60(this, (byte) 23));
    }
}
