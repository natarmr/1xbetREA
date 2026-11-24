package a;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/exd;", "La/yx5;", "<init>", "()V", "a/usd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class exd extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public wdk0 M1;
    public ii N1;
    public final s0r O1;
    public final a8z P1;
    public final kiu0 Q1;
    public final ywq R1;
    public final khf0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(exd.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentConfirmRestoreByAuthenticatorBinding;", 0), new ez40(exd.class, Payload.TYPE, "getType()Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;", 0)};
    public static final usd U1 = new usd();

    public exd() {
        super(R.layout.fragment_confirm_restore_by_authenticator);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.O1 = ltt0.o(this, bxd.f3370a);
        axd axdVar = new axd(this, (byte) 4);
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, axdVar);
        byte b = 7;
        svc svcVar = new svc(new axd(this, (byte) 5), (byte) 7);
        a8z a8zVarA = maz.a(wezVar, new svc(new svc(this, (byte) 8), (byte) 9));
        this.Q1 = agc.G(this, sre0.f32672a.b(kyd.class), new wpb(a8zVarA, (byte) 16), new wpb(a8zVarA, (byte) 17), svcVar);
        this.R1 = m0(new yl3(this, b), new xn(b));
        this.S1 = new khf0(Payload.TYPE);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        H0().e.b(new axd(this, (byte) 0));
        qcc.X(this, new axd(this, (byte) 8));
        H0().h.setFilters((InputFilter[]) qx3.q(new InputFilter.LengthFilter(10), H0().h.getFilters()));
        DsBottomBar dsBottomBar = H0().b;
        uvw.R(dsBottomBar, this, null);
        dsBottomBar.setFirstButtonVisibility(false);
        dsBottomBar.setThirdButtonEnabled(false);
        DsBottomBar.u(dsBottomBar, new axd(this, (byte) 9));
        DsBottomBar.v(dsBottomBar, new axd(this, (byte) 10));
        DsBottomBar.w(dsBottomBar, new axd(this, (byte) 11));
        H0().h.a(new da0(new ejd(this, (byte) 6)));
    }

    @Override // a.yx5
    public final void C0() {
        xci xciVar = (xci) this.P1.getValue();
        this.M1 = xciVar.t;
        this.N1 = xciVar.u;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kyd kydVarI0 = I0();
        yje yjeVar = null;
        byte b = 1;
        byte b2 = 0;
        dnq dnqVar = new dnq(new fnq(kydVarI0.B, new gyd(kydVarI0, yjeVar, b)), new hyd(kydVarI0, yjeVar, b), (byte) 0);
        dxd dxdVar = new dxd(this, yjeVar, b2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new vxb(dnqVar, clzVarW, dxdVar, (yje) null), 3);
        kyd kydVarI1 = I0();
        dnq dnqVar2 = new dnq(new s6n0(kydVarI1.C, new gyd(kydVarI1, yjeVar, b2)), new hyd(kydVarI1, yjeVar, b2), (byte) 0);
        dxd dxdVar2 = new dxd(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cxd(dnqVar2, clzVarW2, dxdVar2, (yje) null), 3);
        ol60 ol60Var = I0().D;
        dxd dxdVar3 = new dxd(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new cxd(ol60Var, clzVarW3, dxdVar3, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.N1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final hzq H0() {
        Object objN = this.O1.n(V1[0], this);
        objN.getClass();
        return (hzq) objN;
    }

    public final kyd I0() {
        return (kyd) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_TOKEN_EXPIRED_KEY", new axd(this, (byte) 12));
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new axd(this, (byte) 13));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new axd(this, (byte) 14));
        ccq0.V(this, "LIMIT_OPERATION_ERROR_KEY", new axd(this, (byte) 15));
        ccq0.T(this, "LIMIT_OPERATION_ERROR_KEY", new axd(this, (byte) 1));
        ccq0.V(this, "NO_AUTHENTICATOR_KEY", new axd(this, (byte) 2));
        ccq0.T(this, "NO_AUTHENTICATOR_KEY", new axd(this, (byte) 3));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new axd(this, (byte) 6));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new axd(this, (byte) 7));
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
