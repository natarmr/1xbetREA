package a;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nud;", "La/yx5;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nud extends yx5 {
    public final hnm0 K1;
    public final f9o0 L1;
    public wdk0 M1;
    public final phf0 N1;
    public final phf0 O1;
    public final zz2 P1;
    public final phf0 Q1;
    public final phf0 R1;
    public final yzn0 S1;
    public final es U1;
    public final es V1;
    public final s0r W1;
    public final a8z X1;
    public final ywq Y1;
    public ii Z1;
    public final kiu0 a2;
    public static final /* synthetic */ iiy[] c2 = {new ez40(nud.class, "token", "getToken()Ljava/lang/String;", 0), new ez40(nud.class, "guid", "getGuid()Ljava/lang/String;", 0), new ez40(nud.class, "confirmType", "getConfirmType()I", 0), new ez40(nud.class, "phoneNumber", "getPhoneNumber()Ljava/lang/String;", 0), new ez40(nud.class, "newPass", "getNewPass()Ljava/lang/String;", 0), new ez40(nud.class, "navigation", "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;", 0), new ez40(nud.class, "availableActivationTypeList", "getAvailableActivationTypeList()Ljava/util/List;", 0), new ez40(nud.class, "availableRepeatActivationTypeList", "getAvailableRepeatActivationTypeList()Ljava/util/List;", 0), new j0d0(nud.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentConfirmByAuthenticatorBinding;", 0)};
    public static final kud b2 = new kud();

    public nud() {
        super(R.layout.fragment_confirm_by_authenticator);
        this.K1 = hnm0.f13359a;
        this.L1 = new f9o0(R.attr.uikitBackgroundContent);
        this.N1 = new phf0("TOKEN_KEY");
        this.O1 = new phf0("GUID_KEY");
        this.P1 = new zz2("CONFIRM_TYPE_KEY");
        this.Q1 = new phf0("PHONE_NUMBER_KEY");
        this.R1 = new phf0("NEW_PASS_KEY");
        this.S1 = new yzn0("NAVIGATION_KEY");
        this.U1 = new es("ACTIVATION_SMS_REPEAT_LIST");
        this.V1 = new es("ACTIVATION_SMS_REPEAT_LIST");
        this.W1 = ltt0.o(this, lud.f20669a);
        jud judVar = new jud(this, (byte) 0);
        wez wezVar = wez.b;
        this.X1 = maz.a(wezVar, judVar);
        this.Y1 = m0(new yl3(this, (byte) 6), new xn((byte) 7));
        svc svcVar = new svc(new jud(this, (byte) 8), (byte) 4);
        a8z a8zVarA = maz.a(wezVar, new svc(new svc(this, (byte) 5), (byte) 6));
        this.a2 = agc.G(this, sre0.f32672a.b(svd.class), new wpb(a8zVarA, (byte) 14), new wpb(a8zVarA, (byte) 15), svcVar);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        egx egxVar = new egx(1);
        ConstraintLayout constraintLayout = H0().f10420a;
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(constraintLayout, egxVar);
        H0().e.b(new jud(this, (byte) 1));
        qcc.X(this, new jud(this, (byte) 2));
        H0().h.setFilters((InputFilter[]) qx3.q(new InputFilter.LengthFilter(10), H0().h.getFilters()));
        DsBottomBar dsBottomBar = H0().b;
        uvw.R(dsBottomBar, this, null);
        dsBottomBar.setThirdButtonEnabled(false);
        dsBottomBar.setFirstButtonVisibility(false);
        DsBottomBar.u(dsBottomBar, new jud(this, (byte) 3));
        DsBottomBar.v(dsBottomBar, new jud(this, (byte) 4));
        DsBottomBar.w(dsBottomBar, new jud(this, (byte) 5));
        I0().y(String.valueOf(H0().h.getText()));
        H0().h.a(new da0(new ejd(this, (byte) 4)));
    }

    @Override // a.yx5
    public final void C0() {
        vci vciVar = (vci) this.X1.getValue();
        this.M1 = vciVar.r;
        this.Z1 = vciVar.s;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        svd svdVarI0 = I0();
        dnq dnqVar = new dnq(new fnq(svdVarI0.A, new nvd(svdVarI0, null, (byte) 1)), new ovd(svdVarI0, null, (byte) 1), (byte) 0);
        mud mudVar = new mud(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new vxb(dnqVar, clzVarW, mudVar, (yje) null), 3);
        svd svdVarI1 = I0();
        dnq dnqVar2 = new dnq(new s6n0(svdVarI1.y, new nvd(svdVarI1, null, (byte) 0)), new ovd(svdVarI1, null, (byte) 0), (byte) 0);
        mud mudVar2 = new mud(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new vxb(dnqVar2, clzVarW2, mudVar2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = I0().z;
        mud mudVar3 = new mud(this, null, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new vxb(ol60Var, clzVarW3, mudVar3, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.Z1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final fzq H0() {
        Object objN = this.W1.n(c2[8], this);
        objN.getClass();
        return (fzq) objN;
    }

    public final svd I0() {
        return (svd) this.a2.getValue();
    }

    public final void J0() {
        ii iiVarG0 = G0();
        String strH = H(R.string.caution);
        String strH2 = H(R.string.close_the_activation_process_new);
        String strH3 = H(R.string.interrupt);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVarG0.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_TOKEN_EXPIRED_KEY", new jud(this, (byte) 9));
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new jud(this, (byte) 10));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new jud(this, (byte) 11));
        ccq0.V(this, "LIMIT_OPERATION_ERROR_KEY", new jud(this, (byte) 12));
        ccq0.T(this, "LIMIT_OPERATION_ERROR_KEY", new jud(this, (byte) 13));
        ccq0.V(this, "NO_AUTHENTICATOR_KEY", new jud(this, (byte) 14));
        ccq0.T(this, "NO_AUTHENTICATOR_KEY", new jud(this, (byte) 15));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new jud(this, (byte) 6));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new jud(this, (byte) 7));
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
        super.e0();
        H0().h.clearFocus();
        if (Build.VERSION.SDK_INT <= 29) {
            n0().getWindow().setSoftInputMode(16);
        }
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
