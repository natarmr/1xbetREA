package a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/l5c;", "La/yx5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l5c extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public ux00 M1;
    public ii N1;
    public wdk0 O1;
    public gl5 P1;
    public final s0r Q1;
    public final a8z R1;
    public final ywq S1;
    public final kiu0 U1;
    public final yzn0 V1;
    public static final /* synthetic */ iiy[] X1 = {new j0d0(l5c.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentCheckSmsCodeBinding;", 0), new ez40(l5c.class, Payload.TYPE, "getType()Lorg/xplatform/security/api/presentation/phone/confirm/CheckSmsCodeOperation;", 0)};
    public static final kl5 W1 = new kl5();

    public l5c() {
        super(R.layout.fragment_check_sms_code);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.Q1 = ltt0.o(this, j5c.f15925a);
        h5c h5cVar = new h5c(this, (byte) 4);
        wez wezVar = wez.b;
        this.R1 = maz.a(wezVar, h5cVar);
        byte b = 5;
        this.S1 = m0(new yl3(this, b), new xn((byte) 7));
        h79 h79Var = new h79(new h5c(this, b), (byte) 24);
        a8z a8zVarA = maz.a(wezVar, new h79(new h79(this, (byte) 25), (byte) 26));
        this.U1 = agc.G(this, sre0.f32672a.b(v7c.class), new wpb(a8zVarA, (byte) 6), new wpb(a8zVarA, (byte) 7), h79Var);
        this.V1 = new yzn0("CONFIRM_PHONE_BY_SMS_FRAGMENT_TYPE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        mc50.a(H0().c, new h5c(this, (byte) 0));
        qcc.X(this, new h5c(this, (byte) 6));
        H0().f.a(new jt6(new awh(this, (byte) 17), (byte) 11));
        dyb.O(H0().g, new i5c(this, (byte) 1));
        uvw.R(H0().b, this, null);
    }

    @Override // a.yx5
    public final void C0() {
        lci lciVar = (lci) this.R1.getValue();
        lciVar.getClass();
        this.M1 = new ux00();
        this.N1 = lciVar.I;
        this.O1 = lciVar.J;
        this.P1 = new gl5((byte) 17);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        v7c v7cVarI0 = I0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(v7cVarI0.Q, new wib(v7cVarI0, yjeVar, (byte) 5)), new e00(v7cVarI0, yjeVar, (byte) 10), (byte) 0);
        k5c k5cVar = new k5c(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new vxb(dnqVar, clzVarW, k5cVar, (yje) null), 3);
        ol60 ol60Var = I0().P;
        lkz lkzVar2 = lkz.f20223a;
        k5c k5cVar2 = new k5c(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new vxb(ol60Var, clzVarW2, k5cVar2, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.N1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final bzq H0() {
        Object objN = this.Q1.n(X1[0], this);
        objN.getClass();
        return (bzq) objN;
    }

    public final v7c I0() {
        return (v7c) this.U1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new h5c(this, (byte) 8));
        ccq0.T(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new h5c(this, (byte) 9));
        ccq0.V(this, "REQUEST_TOKEN_EXPIRED_KEY", new h5c(this, (byte) 10));
        ccq0.V(this, "REQUEST_CONSULTANT_KEY", new h5c(this, (byte) 11));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new h5c(this, (byte) 1));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new h5c(this, (byte) 2));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new h5c(this, (byte) 3));
        if (this.P1 != null) {
            gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new zxb((byte) 2), new i5c(this, (byte) 0));
        } else {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Window window;
        View currentFocus;
        IBinder windowToken;
        kxq kxqVarB = B();
        if (kxqVarB != null && (currentFocus = kxqVarB.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
            Context contextD = D();
            Object systemService = contextD != null ? contextD.getSystemService("input_method") : null;
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        kxq kxqVarB2 = B();
        if (kxqVarB2 != null && (window = kxqVarB2.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(H0().f3483a);
        super.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        hxm0.m(H0().f3483a);
        this.j1 = true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
