package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/h38;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h38 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public ux00 M1;
    public gl5 N1;
    public ii O1;
    public wdk0 P1;
    public final a8z Q1;
    public final kiu0 R1;
    public final s0r S1;
    public final yzn0 U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(h38.class, "viewBinding", "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentBindPhoneNumberBinding;", 0), new ez40(h38.class, "confirmType", "getConfirmType()Lorg/xplatform/security/api/presentation/models/BindPhoneNumberType;", 0)};
    public static final yk5 V1 = new yk5();

    public h38() {
        super(R.layout.fragment_bind_phone_number);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        e38 e38Var = new e38(this, (byte) 1);
        wez wezVar = wez.b;
        this.Q1 = maz.a(wezVar, e38Var);
        p46 p46Var = new p46(new e38(this, (byte) 2), (byte) 21);
        a8z a8zVarA = maz.a(wezVar, new p46(new p46(this, (byte) 22), (byte) 23));
        this.R1 = agc.G(this, sre0.f32672a.b(d48.class), new rt6(a8zVarA, (byte) 8), new rt6(a8zVarA, (byte) 9), p46Var);
        this.S1 = ltt0.o(this, g38.f10599a);
        this.U1 = new yzn0("CONFIRM_TYPE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        qcc.X(this, new e38(this, (byte) 3));
        pyq pyqVarG0 = G0();
        DsPhoneTextField dsPhoneTextField = pyqVarG0.e;
        DsBottomBar dsBottomBar = pyqVarG0.b;
        dsPhoneTextField.b();
        dsPhoneTextField.a();
        dsPhoneTextField.setAfterTextFormattingCallback(new ye7(1, H0(), d48.class, "enteredPhoneNumber", "enteredPhoneNumber(Ljava/lang/String;)V", 0, (byte) 14));
        pyqVarG0.c.b(new e38(this, (byte) 4));
        byte b = 0;
        dsPhoneTextField.setCodeFocusable(false);
        d48 d48VarH0 = H0();
        String strValueOf = String.valueOf(dsPhoneTextField.getPhone());
        if (strValueOf.length() == 0 && (strValueOf = (String) d48VarH0.b.a("SAVED_PHONE_NUMBER")) == null) {
            strValueOf = "";
        }
        d48VarH0.x(strValueOf);
        dsPhoneTextField.setCodeClickListener(new q10(this, (byte) 6));
        uvw.R(dsBottomBar, this, null);
        DsBottomBar.u(dsBottomBar, new gj4(this, pyqVarG0, (byte) 18));
        if (this.N1 != null) {
            gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new e38(this, (byte) 5), new d38(this, b));
        } else {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        iai iaiVar = (iai) this.Q1.getValue();
        pv00 pv00Var = iaiVar.i;
        this.M1 = new ux00();
        this.N1 = new gl5((byte) 17);
        this.O1 = iaiVar.j;
        this.P1 = iaiVar.k;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        d48 d48VarH0 = H0();
        yje yjeVar = null;
        byte b = 0;
        dnq dnqVar = new dnq(new s6n0(d48VarH0.B, new z38(d48VarH0, yjeVar, b)), new e00(d48VarH0, yjeVar, (byte) 7), (byte) 0);
        f38 f38Var = new f38(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new u47(dnqVar, clzVarW, f38Var, (yje) null), 3);
        ol60 ol60Var = H0().C;
        f38 f38Var2 = new f38(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new u47(ol60Var, clzVarW2, f38Var2, (yje) null), 3);
    }

    public final pyq G0() {
        Object objN = this.S1.n(W1[0], this);
        objN.getClass();
        return (pyq) objN;
    }

    public final d48 H0() {
        return (d48) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        final byte b = 0;
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new Function2(this) { // from class: a.c38
            public final /* synthetic */ h38 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                h38 h38Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b2) {
                    case 0:
                        yk5 yk5Var = h38.V1;
                        int iH = f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST");
                        d48 d48VarH0 = h38Var.H0();
                        sac.V(jiu0.a(d48VarH0), b48.f1947a, null, d48VarH0.d.f22085a, new bh0(d48VarH0, iH, null, (byte) 4), 10);
                        break;
                    default:
                        yk5 yk5Var2 = h38.V1;
                        h38Var.H0().B(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST"));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new Function2(this) { // from class: a.c38
            public final /* synthetic */ h38 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                h38 h38Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        yk5 yk5Var = h38.V1;
                        int iH = f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST");
                        d48 d48VarH0 = h38Var.H0();
                        sac.V(jiu0.a(d48VarH0), b48.f1947a, null, d48VarH0.d.f22085a, new bh0(d48VarH0, iH, null, (byte) 4), 10);
                        break;
                    default:
                        yk5 yk5Var2 = h38.V1;
                        h38Var.H0().B(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST"));
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new e38(this, (byte) 0));
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
        hxm0.m(G0().f27809a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(G0().f27809a);
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
