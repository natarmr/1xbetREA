package a;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xyd;", "La/yx5;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xyd extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public gl5 M1;
    public ii N1;
    public wdk0 O1;
    public final s0r P1;
    public final a8z Q1;
    public final kiu0 R1;
    public final khf0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(xyd.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentSendConfirmationEmailBinding;", 0), new ez40(xyd.class, "confirmSendEmailScreenParams", "getConfirmSendEmailScreenParams()Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;", 0)};
    public static final kud U1 = new kud();

    public xyd() {
        super(R.layout.fragment_send_confirmation_email);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.P1 = ltt0.o(this, vyd.f38242a);
        uyd uydVar = new uyd(this, (byte) 3);
        wez wezVar = wez.b;
        this.Q1 = maz.a(wezVar, uydVar);
        svc svcVar = new svc(new uyd(this, (byte) 4), (byte) 12);
        a8z a8zVarA = maz.a(wezVar, new svc(new svc(this, (byte) 13), (byte) 14));
        this.R1 = agc.G(this, sre0.f32672a.b(kzd.class), new wpb(a8zVarA, (byte) 20), new wpb(a8zVarA, (byte) 21), svcVar);
        this.S1 = new khf0("TYPE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.b(new uyd(this, (byte) 5));
        DsBottomBar.u(G0().b, new uyd(this, (byte) 6));
        if (this.M1 != null) {
            gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new uyd(this, (byte) 7), new ejd(this, (byte) 8));
        } else {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        zci zciVar = (zci) this.Q1.getValue();
        zciVar.getClass();
        this.M1 = new gl5((byte) 17);
        this.N1 = zciVar.q;
        this.O1 = zciVar.r;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kzd kzdVarH0 = H0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(kzdVarH0.s, new wib(kzdVarH0, yjeVar, (byte) 8)), new e00(kzdVarH0, yjeVar, (byte) 12), (byte) 0);
        wyd wydVar = new wyd(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd(dnqVar, clzVarW, wydVar, (yje) null), 3);
        ol60 ol60Var = H0().r;
        wyd wydVar2 = new wyd(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cxd(ol60Var, clzVarW2, wydVar2, (yje) null), 3);
    }

    public final q4r G0() {
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        return (q4r) objN;
    }

    public final kzd H0() {
        return (kzd) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new uyd(this, (byte) 0));
        ccq0.T(this, "REQUEST_BACK_DIALOG_KEY", new uyd(this, (byte) 1));
        ccq0.V(this, "TOKEN_EXPIRED_ERROR_KEY", new uyd(this, (byte) 2));
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
        if (Build.VERSION.SDK_INT <= 29) {
            n0().getWindow().setSoftInputMode(16);
        }
        super.e0();
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
