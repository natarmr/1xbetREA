package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/rqb;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rqb extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public final a8z M1;
    public gl5 N1;
    public ii O1;
    public wdk0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final yzn0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(rqb.class, "viewBinding", "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentChangePhoneNumberBinding;", 0), new ez40(rqb.class, "confirmType", "getConfirmType()Lorg/xplatform/security/api/presentation/models/ChangePhoneNumberType;", 0)};
    public static final bj5 U1 = new bj5();

    public rqb() {
        super(R.layout.fragment_change_phone_number);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        oqb oqbVar = new oqb(this, (byte) 0);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, oqbVar);
        h79 h79Var = new h79(new oqb(this, (byte) 1), (byte) 18);
        a8z a8zVarA = maz.a(wezVar, new h79(new h79(this, (byte) 19), (byte) 20));
        this.Q1 = agc.G(this, sre0.f32672a.b(hrb.class), new wpb(a8zVarA, (byte) 2), new wpb(a8zVarA, (byte) 3), h79Var);
        this.R1 = ltt0.o(this, qqb.f29158a);
        this.S1 = new yzn0("CONFIRM_TYPE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        azq azqVarG0 = G0();
        DsPhoneTextField dsPhoneTextField = azqVarG0.g;
        dsPhoneTextField.b();
        dsPhoneTextField.a();
        dsPhoneTextField.setAfterTextFormattingCallback(new zhb(1, H0(), hrb.class, "enteredPhoneNumber", "enteredPhoneNumber(Ljava/lang/String;)V", 0, (byte) 6));
        azqVarG0.e.b(new oqb(this, (byte) 3));
        H0().x(String.valueOf(dsPhoneTextField.getPhone()));
        DsBottomBar dsBottomBar = azqVarG0.b;
        uvw.R(dsBottomBar, this, null);
        DsBottomBar.u(dsBottomBar, new yw9(this, azqVarG0, (byte) 9));
        if (this.N1 != null) {
            gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new oqb(this, (byte) 4), new lya(this, (byte) 12));
        } else {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        hci hciVar = (hci) this.M1.getValue();
        hciVar.getClass();
        this.N1 = new gl5((byte) 17);
        this.O1 = hciVar.t;
        this.P1 = hciVar.u;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        hrb hrbVarH0 = H0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new s6n0(hrbVarH0.x, new wib(hrbVarH0, yjeVar, (byte) 3)), new e00(hrbVarH0, yjeVar, (byte) 9), (byte) 0);
        pqb pqbVar = new pqb(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yxa(dnqVar, clzVarW, pqbVar, (yje) null), 3);
        p7m0 p7m0Var = H0().y;
        pqb pqbVar2 = new pqb(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new yxa(p7m0Var, clzVarW2, pqbVar2, (yje) null), 3);
        ol60 ol60Var = H0().z;
        pqb pqbVar3 = new pqb(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new yxa((gmq) ol60Var, clzVarW3, pqbVar3, (yje) null, (byte) 0), 3);
    }

    public final azq G0() {
        Object objN = this.R1.n(V1[0], this);
        objN.getClass();
        return (azq) objN;
    }

    public final hrb H0() {
        return (hrb) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new oqb(this, (byte) 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        kxq kxqVarB = B();
        if (kxqVarB != null) {
            View currentFocus = kxqVarB.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(kxqVarB);
            }
            j120.X(currentFocus);
        }
        hxm0.m(G0().f1731a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(G0().f1731a);
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
