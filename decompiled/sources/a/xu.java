package a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"La/xu;", "La/yx5;", "<init>", "()V", "a/gfk0", "", "inputTextValue", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xu extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public final s0r M1;
    public final a8z N1;
    public final kiu0 O1;
    public final phf0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(xu.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentAddTwoFactorAuthenticationBinding;", 0), new ez40(xu.class, "resetHashResultKey", "getResetHashResultKey()Ljava/lang/String;", 0)};
    public static final gfk0 Q1 = new gfk0((byte) 11);

    public xu() {
        super(R.layout.fragment_add_two_factor_authentication);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.M1 = ltt0.o(this, vu.f38029a);
        su suVar = new su(this, (byte) 0);
        wez wezVar = wez.b;
        this.N1 = maz.a(wezVar, suVar);
        o5 o5Var = new o5(new su(this, (byte) 1), (byte) 21);
        a8z a8zVarA = maz.a(wezVar, new o5(new o5(this, (byte) 22), (byte) 23));
        this.O1 = agc.G(this, sre0.f32672a.b(pv.class), new k8(a8zVarA, (byte) 14), new k8(a8zVarA, (byte) 15), o5Var);
        this.P1 = new phf0("resetHashKey");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        mc50.a(H0().g, new su(this, (byte) 3));
        dyb.O(H0().c, new t0(1, this, xu.class, "onOpenAuthenticatorClicked", "onOpenAuthenticatorClicked(Landroid/view/View;)V", 0, (byte) 18));
        DsBottomBar.u(H0().b, new su(this, (byte) 4));
        uvw.R(H0().b, this, null);
        final byte b = 0;
        dyb.O(H0().e, new Function1(this) { // from class: a.uu
            public final /* synthetic */ xu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                xu xuVar = this.b;
                switch (b2) {
                    case 0:
                        gfk0 gfk0Var = xu.Q1;
                        ((View) obj).getClass();
                        pv pvVarJ0 = xuVar.J0();
                        pvVarJ0.w(jiu0.a(pvVarJ0), new t0(1, pvVarJ0, pv.class, "onLaunchJobError", "onLaunchJobError(Ljava/lang/Throwable;)V", 0, (byte) 22), new oa(pvVarJ0, (yje) null, (byte) 1));
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        gfk0 gfk0Var2 = xu.Q1;
                        iqt0Var.getClass();
                        xuVar.J0().n.a(iqt0Var);
                        break;
                }
                return Unit.f46060a;
            }
        });
        I0().getClass();
        final byte b2 = 1;
        F().u0("REQUEST_CAPTCHA_CODE_DIALOG_KEY", this, new hi("REQUEST_CAPTCHA_CODE_DIALOG_KEY", new su(this, (byte) 5), new Function1(this) { // from class: a.uu
            public final /* synthetic */ xu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                xu xuVar = this.b;
                switch (b3) {
                    case 0:
                        gfk0 gfk0Var = xu.Q1;
                        ((View) obj).getClass();
                        pv pvVarJ0 = xuVar.J0();
                        pvVarJ0.w(jiu0.a(pvVarJ0), new t0(1, pvVarJ0, pv.class, "onLaunchJobError", "onLaunchJobError(Ljava/lang/Throwable;)V", 0, (byte) 22), new oa(pvVarJ0, (yje) null, (byte) 1));
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        gfk0 gfk0Var2 = xu.Q1;
                        iqt0Var.getClass();
                        xuVar.J0().n.a(iqt0Var);
                        break;
                }
                return Unit.f46060a;
            }
        }));
        b1j.t(H0().f, new ugd(130881865, true, new tu(this)));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = J0().o;
        yje yjeVar = null;
        wu wuVar = new wu(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1(p7m0Var, clzVarW, wuVar, (yje) null), 3);
        ol60 ol60Var = J0().p;
        wu wuVar2 = new wu(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new m1((gmq) ol60Var, clzVarW2, wuVar2, (yje) null, (byte) 0), 3);
    }

    public final void G0(int i, fet fetVar) {
        fetVar.g0(339850541);
        int i2 = (fetVar.g(this) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e("");
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            pz40 pz40VarF = ydx.F(J0().o, fetVar);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 12.0f, 16.0f, 0.0f, 8);
            c6q0 c6q0Var = ((jv) pz40VarF.getValue()).f;
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new k1(this, pz40Var, (byte) 18);
                fetVar.o0(objP2);
            }
            wvb.t(mm40VarN, c6q0Var, 7, null, (Function1) objP2, fetVar, 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tu(this, i);
        }
    }

    public final lxq H0() {
        Object objN = this.M1.n(R1[0], this);
        objN.getClass();
        return (lxq) objN;
    }

    public final b6i I0() {
        return (b6i) this.N1.getValue();
    }

    public final pv J0() {
        return (pv) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "ERROR_REQUEST_KEY", new su(this, (byte) 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
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
        hxm0.m(H0().f20827a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(H0().f20827a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        Object value;
        super.g0();
        pv pvVarJ0 = J0();
        boolean zR = v3c.R(D(), "com.google.android.apps.authenticator2");
        ctf0 ctf0Var = pvVarJ0.i;
        String str = String.format(Locale.ENGLISH, ctf0Var.f(R.string.google_authenticator, new Object[0]), Arrays.copyOf(new Object[]{ctf0Var.f(zR ? R.string.open_app : R.string.install, new Object[0])}, 1));
        p7m0 p7m0Var = pvVarJ0.o;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, jv.a((jv) value, false, str, null, false, false, null, 61)));
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
