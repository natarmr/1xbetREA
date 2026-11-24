package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/oph0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oph0 extends yx5 {
    public final hnm0 K1;
    public final i9o0 L1;
    public final n0o0 M1;
    public final s0r N1;
    public final kiu0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(oph0.class, "viewBinding", "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentSecuritySectionBinding;", 0)};
    public static final gle0 Q1 = new gle0();

    public oph0() {
        super(R.layout.fragment_security_section);
        this.K1 = hnm0.f13359a;
        this.L1 = i9o0.f14396a;
        this.M1 = maz.b(new kph0(this, (byte) 9));
        this.N1 = ltt0.o(this, nph0.f23915a);
        yxf0 yxf0Var = new yxf0(new kph0(this, (byte) 10), (byte) 23);
        yxf0 yxf0Var2 = new yxf0(this, (byte) 24);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new yxf0(yxf0Var2, (byte) 25));
        this.O1 = agc.G(this, sre0.f32672a.b(zuh0.class), new fxf0(a8zVarA, (byte) 24), new fxf0(a8zVarA, (byte) 25), yxf0Var);
        this.P1 = maz.a(wezVar, new kph0(this, (byte) 11));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().d.b(new kph0(this, (byte) 2));
        H0().f.setAdapter((xnh0) this.P1.getValue());
        vvw.o(H0().f, false, 3);
        DsBottomBar.u(H0().b, new kph0(this, (byte) 3));
        H0().g.setOnRefreshListener(new ex60(I0(), (byte) 24));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = I0().E;
        yje yjeVar = null;
        byte b = 0;
        mph0 mph0Var = new mph0(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kmg0(ol60Var, clzVarW, mph0Var, (yje) null), 3);
        p7m0 p7m0Var = I0().F;
        yng0 yng0Var = new yng0(this, yjeVar, (byte) 6);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new kmg0(p7m0Var, clzVarW2, yng0Var, (yje) null), 3);
        zuh0 zuh0VarI0 = I0();
        dnq dnqVar = new dnq(new s6n0(zuh0VarI0.H, new uuh0(zuh0VarI0, yjeVar, b)), new sye0(zuh0VarI0, yjeVar, (byte) 5), (byte) 0);
        mph0 mph0Var2 = new mph0(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new kmg0(dnqVar, clzVarW3, mph0Var2, (yje) null), 3);
    }

    public final zsi G0() {
        return (zsi) this.M1.getValue();
    }

    public final n4r H0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (n4r) objN;
    }

    public final zuh0 I0() {
        return (zuh0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_GIFT_DIALOG_KEY", new kph0(this, (byte) 4));
        ccq0.T(this, "REQUEST_GIFT_DIALOG_KEY", new kph0(this, (byte) 5));
        ccq0.V(this, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY", new kph0(this, (byte) 1));
        ccq0.V(this, "REQUEST_BIND_PHONE_DIALOG_KEY", new kph0(this, (byte) 6));
        ccq0.V(this, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY", new kph0(this, (byte) 0));
        ccq0.T(this, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new kph0(this, (byte) 7));
        ccq0.V(this, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", new kph0(this, (byte) 8));
        G0().getClass();
        int i = 1;
        F().u0("REQUEST_CAPTCHA_CODE_DIALOG_KEY", this, new hi("REQUEST_CAPTCHA_CODE_DIALOG_KEY", new lph0(0, I0(), zuh0.class, "onCaptchaCancelled", "onCaptchaCancelled()V", 0, (byte) 0), new jjh0(i, I0(), zuh0.class, "onCaptchaConfirmed", "onCaptchaConfirmed(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V", 0, (byte) 13)));
        F().u0("RESET_HASH_SECRET_KEY", this, new ex60(this, (byte) 25));
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.L1;
    }
}
