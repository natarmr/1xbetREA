package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0011²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"La/z3f0;", "La/yx5;", "<init>", "()V", "a/zie0", "", "La/z0f0;", "currentList", "", "isLoading", "", "selectedTabIndex", "La/a4x;", "La/s4i;", "tabs", "isFieldsLoading", "firstValidationFailedIndex", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z3f0 extends yx5 {
    public final e9o0 K1;
    public jri L1;
    public final s0r M1;
    public final a8z N1;
    public final a8z O1;
    public gl5 P1;
    public rl70 Q1;
    public pek0 R1;
    public ii S1;
    public wdk0 U1;
    public kd30 V1;
    public nh70 W1;
    public ndk0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(z3f0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final zie0 Y1 = new zie0();
    public static final String a2 = z3f0.class.getName();

    public z3f0() {
        super(R.layout.fragment_registration_simple);
        int i = R.attr.uikitBackgroundContent;
        this.K1 = new e9o0(i, i, 12);
        this.M1 = ltt0.o(this, y3f0.f41951a);
        this.N1 = maz.a(wez.b, new u3f0(this, (byte) 2));
        this.O1 = xbc.a0(this, sre0.f32672a.b(x5f0.class), null, new u3f0(this, (byte) 4), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        if (this.P1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY", new u3f0(this, (byte) 3), new v3f0(this, (byte) 0));
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new t3f0(this, (byte) 3));
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new t3f0(this, (byte) 4));
        if (this.W1 == null) {
            Intrinsics.h("pickerDialogScreenFactory");
            throw null;
        }
        sj3.A0(this, "PICKER_DIALOG_FRAGMENT_TAG", new t3f0(this, (byte) 5));
        ccq0.V(this, "REQUEST_USER_EXIST_DIALOG_KEY", new u3f0(this, (byte) 6));
        if (this.Q1 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        sj3.A0(this, "PICKER_DIALOG_TAG", new t3f0(this, (byte) 6));
        sj3.A0(this, "REQUEST_BIRTHDAY_CALENDAR_KEY", new t3f0(this, (byte) 7));
        sj3.A0(this, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY", new t3f0(this, (byte) 1));
        sj3.A0(this, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY", new t3f0(this, (byte) 2));
        ccq0.V(this, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", new u3f0(this, (byte) 0));
        ccq0.T(this, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", new u3f0(this, (byte) 1));
        qcc.X(this, new u3f0(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        kri kriVar = (kri) this.N1.getValue();
        this.L1 = (jri) kriVar.L.get();
        this.P1 = new gl5((byte) 17);
        this.Q1 = kriVar.G;
        this.R1 = kriVar.H;
        this.S1 = kriVar.I;
        this.U1 = kriVar.J;
        this.V1 = kriVar.K;
        this.W1 = kriVar.D;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.M1.n(Z1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1661161394, true, new t3f0(this, (byte) 0)));
    }

    public final wdk0 G0() {
        wdk0 wdk0Var = this.U1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final k3t0 H0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        ndk0 ndk0Var = this.X1;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        this.X1 = null;
        this.j1 = true;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
