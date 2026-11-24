package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dxe0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dxe0 extends yx5 {
    public final h9o0 K1;
    public hri L1;
    public gl5 M1;
    public rl70 N1;
    public pek0 O1;
    public ii P1;
    public wdk0 Q1;
    public kd30 R1;
    public ndk0 S1;
    public final s0r U1;
    public final khf0 V1;
    public final a8z W1;
    public final n0o0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(dxe0.class, "binding", "getBinding()Lorg/xplatform/registration_default/impl/databinding/FragmentRegistrationDefaultComposeBinding;", 0), new ez40(dxe0.class, "params", "getParams()Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;", 0)};
    public static final lme0 Y1 = new lme0((byte) 3);
    public static final String a2 = dxe0.class.getName();

    public dxe0() {
        super(R.layout.fragment_registration_default_compose);
        this.K1 = h9o0.f12688a;
        this.U1 = ltt0.o(this, cxe0.f5119a);
        this.V1 = new khf0("PARAMS_REGISTRATION_KEY");
        this.W1 = xbc.a0(this, sre0.f32672a.b(eze0.class), null, new zwe0(this, (byte) 0), 14);
        this.X1 = maz.b(new zwe0(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        if (this.M1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        byte b = 1;
        byte b2 = 2;
        gl5.k(this, "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY_" + ((RegistrationDefaultScreenParams) this.V1.n(this, Z1[1])).f46869a, new zwe0(this, b2), new bxe0(this, (byte) 0));
        byte b3 = 4;
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new axe0(this, b3));
        byte b4 = 5;
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new axe0(this, b4));
        if (this.N1 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        byte b5 = 6;
        sj3.A0(this, "PICKER_DIALOG_TAG", new axe0(this, b5));
        ccq0.V(this, "REQUEST_USER_EXIST_DIALOG_KEY", new zwe0(this, b5));
        if (this.N1 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        sj3.A0(this, "PICKER_DIALOG_TAG", new axe0(this, (byte) 7));
        sj3.A0(this, "KEY_CHOOSE_BONUS", new axe0(this, (byte) 8));
        sj3.A0(this, "REQUEST_BIRTHDAY_CALENDAR_KEY", new axe0(this, b));
        sj3.A0(this, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY", new axe0(this, b2));
        sj3.A0(this, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY", new axe0(this, (byte) 3));
        ccq0.V(this, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", new zwe0(this, b));
        ccq0.T(this, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", new zwe0(this, b3));
        qcc.X(this, new zwe0(this, b4));
    }

    @Override // a.yx5
    public final void C0() {
        iri iriVar = (iri) this.X1.getValue();
        this.L1 = (hri) iriVar.N.get();
        this.M1 = new gl5((byte) 17);
        this.N1 = iriVar.I;
        this.O1 = iriVar.J;
        this.P1 = iriVar.K;
        this.Q1 = iriVar.L;
        this.R1 = iriVar.M;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.U1.n(Z1[0], this);
        objN.getClass();
        pkd.i(((a4r) objN).b, null, new ugd(1997557709, true, new axe0(this, (byte) 0)));
    }

    public final k3t0 G0() {
        return (k3t0) this.W1.getValue();
    }

    public final void H0(String str) {
        wdk0 wdk0Var = this.Q1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        rek0 rek0Var = rek0.b;
        if (str.length() == 0) {
            str = H(R.string.error_check_input);
            str.getClass();
        }
        wdk0.k(wdk0Var, new xdk0(rek0Var, str, null, null, null, null, 124), this, null, null, false, null, 1020);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        ndk0 ndk0Var = this.S1;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        this.S1 = null;
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        n0().getWindow().setSoftInputMode(32);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        n0().getWindow().setSoftInputMode(16);
        super.e0();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
