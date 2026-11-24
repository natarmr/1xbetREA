package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qr10;", "La/yx5;", "<init>", "()V", "a/evz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qr10 extends yx5 {
    public final a8z K1;
    public final a8z L1;
    public final a8z M1;
    public final a8z N1;
    public final a8z O1;
    public final a8z P1;
    public final s0r Q1;
    public final cgx0 R1;
    public final r34 S1;
    public final zz2 U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(qr10.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(qr10.class, "showNavBarArg", "getShowNavBarArg()Z", 0), new ez40(qr10.class, "animatedItemId", "getAnimatedItemId()J", 0), new ez40(qr10.class, "initialPage", "getInitialPage()I", 0)};
    public static final evz V1 = new evz();

    public qr10() {
        super(R.layout.compose_fragment);
        nr10 nr10Var = new nr10(this, (byte) 0);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, nr10Var);
        this.L1 = maz.a(wezVar, new nr10(this, (byte) 5));
        this.M1 = maz.a(wezVar, new nr10(this, (byte) 6));
        tre0 tre0Var = sre0.f32672a;
        this.N1 = xbc.a0(this, tre0Var.b(ur10.class), null, new nr10(this, (byte) 7), 14);
        this.O1 = xbc.a0(this, tre0Var.b(at9.class), null, new nr10(this, (byte) 8), 14);
        this.P1 = xbc.a0(this, tre0Var.b(n880.class), null, new nr10(this, (byte) 9), 14);
        this.Q1 = ltt0.o(this, pr10.f27443a);
        this.R1 = new cgx0("SHOW_NAV_BAR");
        this.S1 = new r34("CALLBACK_ANIMATED_ITEM_ID_KEY");
        this.U1 = new zz2("INITIAL_PAGE");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.Q1.n(W1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(438609582, true, new or10(this, (byte) 1)));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    public final bbi H0() {
        return (bbi) this.L1.getValue();
    }

    public final k3t0 I0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.A0(this, "REQUEST_SELECT_THEME_DIALOG_KEY", new or10(this, (byte) 0));
        ((cni) this.M1.getValue()).getClass();
        F().u0("REQUEST_CAPTCHA_CODE_DIALOG_KEY", this, new hi("REQUEST_CAPTCHA_CODE_DIALOG_KEY", new nr10(this, (byte) 10), new km00(this, (byte) 9)));
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new or10(this, (byte) 3));
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new or10(this, (byte) 4));
        ccq0.V(this, "CANCEL_REQUEST_DIALOG_KEY", new nr10(this, (byte) 1));
        byte b = 2;
        ccq0.T(this, "CANCEL_REQUEST_DIALOG_KEY", new nr10(this, b));
        sj3.A0(this, "SHOW_OPERATOR_RATING_DIALOG_KEY", new or10(this, b));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(q0());
        super.e0();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getN1() {
        return this.R1.n(this, W1[1]).booleanValue();
    }
}
