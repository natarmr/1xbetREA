package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m6f0;", "La/of80;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m6f0 extends of80 {
    public fiu0 Y1;
    public wdk0 Z1;
    public ii a2;
    public gl5 b2;
    public final s0r c2;
    public final khf0 d2;
    public final kiu0 e2;
    public static final /* synthetic */ iiy[] g2 = {new j0d0(m6f0.class, "binding", "getBinding()Lorg/xplatform/registration/success/impl/databinding/BottomDialogRegistrarionSuccessBinding;", 0), new ez40(m6f0.class, "registrationSuccessParams", "getRegistrationSuccessParams()Lorg/xplatform/registration/success/api/RegistrationSuccessParams;", 0)};
    public static final gle0 f2 = new gle0();
    public static final String h2 = m6f0.class.getName();

    public m6f0() {
        super(R.layout.bottom_dialog_registrarion_success);
        this.c2 = ltt0.o(this, l6f0.f19504a);
        this.d2 = new khf0("KEY_PARAMS_REGISTRATION_SUCCESS");
        j6f0 j6f0Var = new j6f0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 10), (byte) 11));
        this.e2 = agc.G(this, sre0.f32672a.b(d7f0.class), new wbe0(a8zVarA, (byte) 12), new wbe0(a8zVarA, (byte) 13), j6f0Var);
    }

    @Override // a.of80
    public final void I0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(n6f0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            n6f0 n6f0Var = (n6f0) (ze3Var instanceof n6f0 ? ze3Var : null);
            if (n6f0Var != null) {
                RegistrationSuccessParams registrationSuccessParams = (RegistrationSuccessParams) this.d2.n(this, g2[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                epi0 epi0Var = n6f0Var.q;
                ngb0 ngb0Var = n6f0Var.p;
                je jeVar = n6f0Var.c;
                nr nrVar = n6f0Var.b;
                ctf0 ctf0Var = n6f0Var.d;
                rrc rrcVar = n6f0Var.e;
                eru eruVar = n6f0Var.f;
                xte0 xte0VarH = n6f0Var.f22995a.h();
                wdk0 wdk0Var = n6f0Var.g;
                ii iiVar = n6f0Var.h;
                f4u f4uVar = n6f0Var.m;
                kt2 kt2Var = n6f0Var.i;
                sv3 sv3Var = n6f0Var.j;
                lrc lrcVar = n6f0Var.k;
                bk3 bk3Var = n6f0Var.l;
                pru pruVar = n6f0Var.n;
                cad cadVar = n6f0Var.o;
                ok50 ok50Var = n6f0Var.r;
                ((uii) n6f0Var.s.f43005a).I();
                hn4 hn4Var = n6f0Var.t;
                ilp0 ilp0Var = n6f0Var.u;
                wsf0 wsf0Var = n6f0Var.v;
                rou rouVar = n6f0Var.w;
                cyh cyhVar = n6f0Var.x;
                z4w0 z4w0Var = n6f0Var.y;
                kwd kwdVar = n6f0Var.z;
                mi70 mi70Var = n6f0Var.A;
                sqx sqxVar = n6f0Var.B;
                cmt cmtVar = n6f0Var.C;
                ngb0Var.getClass();
                hn4Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                kt2Var.getClass();
                sv3Var.getClass();
                this.Y1 = new fiu0(Collections.singletonMap(d7f0.class, (fri) new lri(cadVar, epi0Var, ok50Var, hn4Var, ilp0Var, wsf0Var, registrationSuccessParams, nrVar, jeVar, ctf0Var, rrcVar, eruVar, xte0VarH, wdk0Var, iiVar, lrcVar, bk3Var, f4uVar, pruVar, i1w0VarF, rouVar, cyhVar, z4w0Var, kwdVar, mi70Var, sqxVar, cmtVar).z));
                this.Z1 = wdk0Var;
                this.a2 = iiVar;
                this.b2 = new gl5((byte) 17);
                return;
            }
        }
        jf4.n(b1j.i(n6f0.class, "Cannot create dependency "));
    }

    public final vn8 K0() {
        Object objN = this.c2.n(g2[0], this);
        objN.getClass();
        return (vn8) objN;
    }

    public final d7f0 L0() {
        return (d7f0) this.e2.getValue();
    }

    @Override // a.of80, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F0(2, R.style.AppTheme_Overlay_Dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        jg60 jg60VarK;
        Window window;
        view.getClass();
        Dialog dialog = this.S1;
        final byte b = 0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            bcm0.x(window, false);
        }
        Dialog dialog2 = this.S1;
        hgd hgdVar = dialog2 instanceof hgd ? (hgd) dialog2 : null;
        if (hgdVar != null && (jg60VarK = hgdVar.k()) != null) {
            bdx.O(jg60VarK, K(), new bue0((byte) 9));
        }
        ccq0.V(this, "KEY_REQUEST_LOCATION_ERROR", new j6f0(this, b));
        vdb.j0(this, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", new Function1(this) { // from class: a.k6f0
            public final /* synthetic */ m6f0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                byte b2 = b;
                m6f0 m6f0Var = this.b;
                switch (b2) {
                    case 0:
                        ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                        gle0 gle0Var = m6f0.f2;
                        confirmationNewPlaceResultType.getClass();
                        m6f0Var.L0().x(new d6f0(confirmationNewPlaceResultType));
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        gle0 gle0Var2 = m6f0.f2;
                        iqt0Var.getClass();
                        m6f0Var.L0().x(new c6f0(iqt0Var));
                        break;
                }
                return Unit.f46060a;
            }
        });
        if (this.b2 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        final byte b2 = 1;
        gl5.k(this, "KEY_REQUEST_CAPTCHA_CODE_DIALOG", new j6f0(this, (byte) 2), new Function1(this) { // from class: a.k6f0
            public final /* synthetic */ m6f0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                byte b3 = b2;
                m6f0 m6f0Var = this.b;
                switch (b3) {
                    case 0:
                        ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                        gle0 gle0Var = m6f0.f2;
                        confirmationNewPlaceResultType.getClass();
                        m6f0Var.L0().x(new d6f0(confirmationNewPlaceResultType));
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        gle0 gle0Var2 = m6f0.f2;
                        iqt0Var.getClass();
                        m6f0Var.L0().x(new c6f0(iqt0Var));
                        break;
                }
                return Unit.f46060a;
            }
        });
        pkd.h(K0().b, qek0.h, null, new ugd(-1524081180, true, new iob0((Object) this, (byte) 5)));
    }
}
