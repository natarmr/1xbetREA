package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"La/cqh0;", "La/yx5;", "<init>", "()V", "a/gne0", "La/crh0;", CommonConstant.ReqAccessTokenParam.STATE_LABEL, "", "refreshState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cqh0 extends yx5 {
    public final s0r K1;
    public final n0o0 L1;
    public final kiu0 M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(cqh0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gne0 N1 = new gne0((byte) 15);

    public cqh0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, bqh0.f3031a);
        this.L1 = maz.b(new aqh0(this, (byte) 8));
        yxf0 yxf0Var = new yxf0(new aqh0(this, (byte) 0), (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 27), (byte) 28));
        this.M1 = agc.G(this, sre0.f32672a.b(irh0.class), new fxf0(a8zVarA, (byte) 26), new fxf0(a8zVarA, (byte) 27), yxf0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(53185185, true, new uph0(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().I;
        tye0 tye0Var = new tye0(this, null, (byte) 24);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kmg0((gmq) ol60Var, clzVarW, tye0Var, (yje) null, (char) 0), 3);
    }

    public final zsi G0() {
        return (zsi) this.L1.getValue();
    }

    public final irh0 H0() {
        return (irh0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_GIFT_DIALOG_KEY", new aqh0(this, (byte) 6));
        ccq0.T(this, "REQUEST_GIFT_DIALOG_KEY", new aqh0(this, (byte) 7));
        ccq0.V(this, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY", new aqh0(this, (byte) 2));
        ccq0.V(this, "REQUEST_BIND_PHONE_DIALOG_KEY", new aqh0(this, (byte) 1));
        ccq0.V(this, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY", new aqh0(this, (byte) 3));
        ccq0.T(this, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new aqh0(this, (byte) 4));
        ccq0.V(this, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new aqh0(this, (byte) 5));
        G0().getClass();
        int i = 1;
        F().u0("REQUEST_CAPTCHA_CODE_DIALOG_KEY", this, new hi("REQUEST_CAPTCHA_CODE_DIALOG_KEY", new lph0(0, H0(), irh0.class, "onCaptchaCancelled", "onCaptchaCancelled()V", 0, (byte) 1), new jjh0(i, H0(), irh0.class, "onCaptchaConfirmed", "onCaptchaConfirmed(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V", 0, (byte) 15)));
        Fragment fragment = this.y;
        if (fragment != null) {
            fragment.F().u0("RESET_HASH_SECRET_KEY", this, new ex60(this, (byte) 26));
        }
    }
}
