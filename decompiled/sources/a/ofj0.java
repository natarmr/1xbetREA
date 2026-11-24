package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ofj0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ofj0 extends yx5 {
    public rqj0 K1;
    public ii L1;
    public gl5 M1;
    public ux00 N1;
    public nwd O1;
    public wdk0 P1;
    public zav Q1;
    public fiu0 R1;
    public final a8z S1;
    public final s0r U1;
    public qgd V1;
    public xi70 W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(ofj0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cge0 X1 = new cge0((byte) 21);

    public ofj0() {
        super(R.layout.compose_fragment);
        this.S1 = xbc.b0(this, sre0.f32672a.b(ngj0.class), new jfj0(this, (byte) 0));
        this.U1 = ltt0.o(this, mfj0.f21697a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_OPEN_SITE_DIALOG_KEY", new jfj0(this, (byte) 1));
        sj3.s0(this, "DEV_PASS_REQUEST_KEY", new lfj0(this, (byte) 1));
        ccq0.V(this, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY", new jfj0(this, (byte) 2));
        ccq0.V(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new jfj0(this, (byte) 5));
        ccq0.T(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new jfj0(this, (byte) 6));
        ccq0.T(this, "REQUEST_DELETE_ACCOUNT", new jfj0(this, (byte) 7));
        if (this.M1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new jfj0(this, (byte) 3), new lfj0(this, (byte) 0));
        C().u0("REQUEST_QUICKBET_KEY", this, new kfj0(this, (byte) 0));
        n0().r().u0("REQUEST_SHOW_LOGOUT_DIALOG", this, new kfj0(this, (byte) 1));
        ccq0.V(this, "REQUEST_APP_INFO_DIALOG_KEY", new jfj0(this, (byte) 4));
        Object objN = this.U1.n(Y1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-1068245780, true, new uph0(this, (byte) 23)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(j0j0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            j0j0 j0j0Var = (j0j0) (ze3Var instanceof j0j0 ? ze3Var : null);
            if (j0j0Var != null) {
                uti utiVarA = j0j0Var.a(a4n0.f(this), ofj0.class.getSimpleName());
                this.K1 = utiVarA.f36255a;
                this.L1 = utiVarA.b;
                this.M1 = new gl5((byte) 17);
                this.N1 = new ux00();
                this.O1 = utiVarA.c;
                this.P1 = utiVarA.d;
                zav zavVarF = ((vqc) utiVarA.v0.f25390a).f();
                x1x.x(zavVarF);
                this.Q1 = zavVarF;
                this.R1 = utiVarA.a();
                this.V1 = utiVarA.i;
                this.W1 = utiVarA.Z.f();
                return;
            }
        }
        jf4.n(b1j.i(j0j0.class, "Cannot create dependency "));
    }

    public final ii G0() {
        ii iiVar = this.L1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final k3t0 H0() {
        return (k3t0) this.S1.getValue();
    }

    public final void I0(String str, String str2) {
        ii iiVarG0 = G0();
        String strH = H(R.string.ok_new);
        strH.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVarG0.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        n0().r().u0("SETTINGS_QR_SCANNER_REQUEST_KEY", this, new kfj0(this, (byte) 2));
        n0().r().u0("OTP_CONFIRMATION_RESULT_KEY", this, new kfj0(this, (byte) 3));
        vdb.j0(this, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", new lfj0(this, (byte) 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        n0().r().g("SETTINGS_QR_SCANNER_REQUEST_KEY");
        this.j1 = true;
    }
}
