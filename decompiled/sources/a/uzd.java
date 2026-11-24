package a;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uzd;", "La/yx5;", "<init>", "()V", "a/qud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uzd extends yx5 {
    public final hnm0 K1;
    public gl5 L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public final a8z P1;
    public final kiu0 Q1;
    public final khf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(uzd.class, "binding", "getBinding()Lorg/xplatform/login/new_place/impl/databinding/FragmentConfirmationNewPlaceBinding;", 0), new ez40(uzd.class, Payload.TYPE, "getType()Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;", 0)};
    public static final qud S1 = new qud();

    public uzd() {
        super(R.layout.fragment_confirmation_new_place);
        this.K1 = hnm0.f13359a;
        this.O1 = ltt0.o(this, tzd.f34798a);
        rzd rzdVar = new rzd(this, (byte) 10);
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, rzdVar);
        svc svcVar = new svc(new rzd(this, (byte) 11), (byte) 15);
        a8z a8zVarA = maz.a(wezVar, new svc(new svc(this, (byte) 16), (byte) 17));
        this.Q1 = agc.G(this, sre0.f32672a.b(g1e.class), new wpb(a8zVarA, (byte) 22), new wpb(a8zVarA, (byte) 23), svcVar);
        this.R1 = new khf0("CONFIRM_PHONE_BY_SMS_FRAGMENT_TYPE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().b.setFirstButtonVisibility(false);
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenTypeI0 = I0();
        ConfirmationNewPlaceScreenType.Simple simple = confirmationNewPlaceScreenTypeI0 instanceof ConfirmationNewPlaceScreenType.Simple ? (ConfirmationNewPlaceScreenType.Simple) confirmationNewPlaceScreenTypeI0 : null;
        String strH = (simple == null || !simple.d) ? H(R.string.sms_activate_code_hint) : H(R.string.enter_your_answer);
        strH.getClass();
        H0().f.setLabelText(strH);
        qcc.X(this, new rzd(this, (byte) 4));
        mc50.a(H0().d, new rzd(this, (byte) 5));
        H0().f.a(new da0(new szd(this, (byte) 0)));
        DsBottomBar.v(H0().b, new rzd(this, (byte) 6));
        DsBottomBar.w(H0().b, new rzd(this, (byte) 7));
        DsBottomBar.u(H0().b, new rzd(this, (byte) 8));
        knm0.i(H0().b, false);
        dyb.O(H0().g, new szd(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        bdi bdiVar = (bdi) this.P1.getValue();
        bdiVar.getClass();
        this.L1 = new gl5((byte) 17);
        this.M1 = bdiVar.q;
        this.N1 = bdiVar.r;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        g1e g1eVarJ0 = J0();
        yje yjeVar = null;
        byte b = 1;
        byte b2 = 0;
        dnq dnqVar = new dnq(new s6n0(g1eVarJ0.B, new t0e(g1eVarJ0, yjeVar, b)), new u0e(g1eVarJ0, yjeVar, b), (byte) 0);
        Class<uzd> cls = uzd.class;
        c48 c48Var = new c48(2, this, cls, "onUiState", "onUiState(Lorg/xplatform/login/new_place/impl/presentation/ConfirmationNewPlaceViewModel$UiState;)V", 4, (byte) 27);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd(dnqVar, clzVarW, c48Var, (yje) null), 3);
        g1e g1eVarJ1 = J0();
        dnq dnqVar2 = new dnq(new s6n0(g1eVarJ1.y, new t0e(g1eVarJ1, yjeVar, b2)), new u0e(g1eVarJ1, yjeVar, b2), (byte) 0);
        c48 c48Var2 = new c48(2, this, cls, "onTimerState", "onTimerState(Lorg/xplatform/login/new_place/impl/presentation/ConfirmationNewPlaceViewModel$TimerState;)V", 4, (byte) 28);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cxd(dnqVar2, clzVarW2, c48Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = J0().C;
        lkz lkzVar2 = lkz.f20223a;
        fob fobVar = new fob(this, null, (byte) 14);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new cxd(ol60Var, clzVarW3, fobVar, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.M1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final jzq H0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (jzq) objN;
    }

    public final ConfirmationNewPlaceScreenType I0() {
        return (ConfirmationNewPlaceScreenType) this.R1.n(this, U1[1]);
    }

    public final g1e J0() {
        return (g1e) this.Q1.getValue();
    }

    public final void K0() {
        L0(ConfirmationNewPlaceResultType.Canceled.f46935a);
        g1e g1eVarJ0 = J0();
        bby bbyVar = g1eVarJ0.E;
        if (bbyVar != null) {
            bbyVar.cancel(plc.b("Operation canceled by user", new art0()));
        }
        g1eVarJ0.B();
    }

    public final void L0(ConfirmationNewPlaceResultType confirmationNewPlaceResultType) {
        n0().r().t0(i120.V(new Pair("KEY_BUNDLE_CONFIRMATION_NEW_PLACE", confirmationNewPlaceResultType)), I0().getB());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        if (this.L1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new rzd(this, (byte) 0), new szd(this, (byte) 2));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new rzd(this, (byte) 14));
        ccq0.V(this, "TOKEN_EXPIRED_ERROR_KEY", new rzd(this, (byte) 15));
        ccq0.V(this, "INTERRUPT_DIALOG_REQUEST_KEY", new rzd(this, (byte) 16));
        ccq0.V(this, "LIMIT_OPERATION_ERROR_KEY", new rzd(this, (byte) 17));
        ccq0.T(this, "LIMIT_OPERATION_ERROR_KEY", new rzd(this, (byte) 18));
        ccq0.V(this, "NO_AUTHENTICATOR_KEY", new rzd(this, (byte) 1));
        ccq0.T(this, "NO_AUTHENTICATOR_KEY", new rzd(this, (byte) 2));
        ccq0.V(this, "AUTHENTICATOR_BLOCKED_KEY", new rzd(this, (byte) 3));
        ccq0.T(this, "AUTHENTICATOR_BLOCKED_KEY", new rzd(this, (byte) 9));
        ccq0.V(this, "REQUEST_CONSULTANT_KEY", new rzd(this, (byte) 12));
        ccq0.V(this, "REJECT_OPERATION_ERROR_KEY", new rzd(this, (byte) 13));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Window window;
        j120.Y(this);
        kxq kxqVarB = B();
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
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
        return this.K1;
    }
}
