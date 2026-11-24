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
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/r0c;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r0c extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public final a8z P1;
    public final kiu0 Q1;
    public final khf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(r0c.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentSendCodeEmailBinding;", 0), new ez40(r0c.class, "checkEmailScreenParams", "getCheckEmailScreenParams()Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;", 0)};
    public static final cl5 S1 = new cl5((byte) 23);

    public r0c() {
        super(R.layout.fragment_send_code_email);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.O1 = ltt0.o(this, p0c.f26142a);
        o0c o0cVar = new o0c(this, (byte) 5);
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, o0cVar);
        h79 h79Var = new h79(new o0c(this, (byte) 6), (byte) 21);
        a8z a8zVarA = maz.a(wezVar, new h79(new h79(this, (byte) 22), (byte) 23));
        this.Q1 = agc.G(this, sre0.f32672a.b(s1c.class), new wpb(a8zVarA, (byte) 4), new wpb(a8zVarA, (byte) 5), h79Var);
        this.R1 = new khf0("CHECK_EMAIL_SCREEN_PARAMS");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().c.b(new o0c(this, (byte) 0));
        qcc.X(this, new o0c(this, (byte) 2));
        DsBottomBar dsBottomBar = G0().b;
        uvw.R(dsBottomBar, this, null);
        DsBottomBar.v(dsBottomBar, new o0c(this, (byte) 3));
        DsBottomBar.u(dsBottomBar, new o0c(this, (byte) 4));
        dsBottomBar.setFirstButtonStyle(R.style.DSButton_Large_Secondary);
        dyb.O(G0().f, new lya(this, (byte) 14));
        G0().e.a(new da0(new zhb(1, H0(), s1c.class, "onEmailCodeChange", "onEmailCodeChange(Ljava/lang/CharSequence;)V", 0, (byte) 11)));
    }

    @Override // a.yx5
    public final void C0() {
        jci jciVar = (jci) this.P1.getValue();
        jciVar.getClass();
        this.M1 = jciVar.s;
        this.N1 = jciVar.t;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().x;
        yje yjeVar = null;
        q0c q0cVar = new q0c(this, yjeVar, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new vxb((gmq) p7m0Var, clzVarW, q0cVar, (yje) null, (char) 0), 3);
        p7m0 p7m0Var2 = H0().w;
        q0c q0cVar2 = new q0c(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new vxb(p7m0Var2, clzVarW2, q0cVar2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().v;
        q0c q0cVar3 = new q0c(this, yjeVar, (byte) 0);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new vxb(ol60Var, clzVarW3, q0cVar3, (yje) null), 3);
    }

    public final o4r G0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (o4r) objN;
    }

    public final s1c H0() {
        return (s1c) this.Q1.getValue();
    }

    public final void I0() {
        ii iiVar = this.M1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.caution);
        String strH2 = H(R.string.close_the_activation_process_new);
        String strH3 = H(R.string.interrupt);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new o0c(this, (byte) 7));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new o0c(this, (byte) 8));
        ccq0.V(this, "TOKEN_EXPIRED_ERROR_KEY", new o0c(this, (byte) 9));
        ccq0.V(this, "REQUEST_CONSULTANT_KEY", new o0c(this, (byte) 1));
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
