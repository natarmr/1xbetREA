package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/z880;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z880 extends yx5 {
    public fiu0 K1;
    public gl5 L1;
    public rl70 M1;
    public wdk0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public final phf0 Q1;
    public final cgx0 R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(z880.class, "binding", "getBinding()Lorg/xplatform/callback/impl/databinding/FragmentOrderCallBinding;", 0), new ez40(z880.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(z880.class, "showNavBarArg", "getShowNavBarArg()Z", 0)};
    public static final xi70 U1 = new xi70();

    public z880() {
        super(R.layout.fragment_order_call);
        pl70 pl70Var = new pl70(this, (byte) 5);
        gg70 gg70Var = new gg70(this, (byte) 22);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new gg70(gg70Var, (byte) 23));
        this.O1 = agc.G(this, sre0.f32672a.b(aa80.class), new ph70(a8zVarA, (byte) 18), new ph70(a8zVarA, (byte) 19), pl70Var);
        this.P1 = ltt0.o(this, y880.f42184a);
        this.Q1 = new phf0("BUNDLE_REQUEST_KEY");
        this.R1 = new cgx0("SHOW_NAV_BAR");
        this.S1 = maz.a(wezVar, new i280((byte) 9));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        if (this.L1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new cz60(0, H0(), aa80.class, "onCaptchaCancel", "onCaptchaCancel()V", 0, (byte) 6), new gk70(1, H0(), aa80.class, "onConfirmCaptcha", "onConfirmCaptcha(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V", 0, (byte) 26));
        final byte b = 0;
        sj3.A0(this, "REQUEST_SELECT_THEME_DIALOG_KEY", new Function2(this) { // from class: a.x880
            public final /* synthetic */ z880 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00ce A[LOOP:2: B:25:0x00ce->B:43:?, LOOP_START] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String str;
                bt9 bt9Var;
                Object value;
                d980 d980Var;
                List list;
                Object value2;
                d980 d980Var2;
                byte b2 = b;
                z880 z880Var = this.b;
                switch (b2) {
                    case 0:
                        xi70 xi70Var = z880.U1;
                        int iH = f140.h((Bundle) obj2, (String) obj, "REQUEST_SELECT_THEME_DIALOG_KEY");
                        aa80 aa80VarH0 = z880Var.H0();
                        aa80VarH0.t.W(iH);
                        aa80VarH0.B(true);
                        p7m0 p7m0Var = aa80VarH0.z;
                        a980 a980Var = ((d980) p7m0Var.getValue()).d;
                        if (a980Var != null && (str = a980Var.c) != null) {
                            aa80VarH0.A(Integer.valueOf(iH), str, ((d980) p7m0Var.getValue()).c.f3951a);
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        xi70 xi70Var2 = z880.U1;
                        int iH2 = f140.h(bundle2, (String) obj, "KEY_PICKER_MODEL_REQUEST");
                        PickerParams pickerParams = (PickerParams) bundle2.getParcelable("PICKER_PARAMS_KEY");
                        if (pickerParams != null) {
                            aa80 aa80VarH1 = z880Var.H0();
                            Object obj3 = null;
                            if (pickerParams instanceof PickerParams.Phone) {
                                sac.V(jiu0.a(aa80VarH1), o980.f24868a, null, aa80VarH1.g.f22085a, new a48(aa80VarH1, iH2, true, null, (byte) 2), 10);
                            } else if (pickerParams instanceof PickerParams.Language) {
                                p7m0 p7m0Var2 = aa80VarH1.z;
                                for (Object obj4 : ((d980) p7m0Var2.getValue()).e.f2196a) {
                                    if (((bt9) obj4).f3171a == iH2) {
                                        obj3 = obj4;
                                        bt9Var = (bt9) obj3;
                                        if (bt9Var != null) {
                                            do {
                                                value = p7m0Var2.getValue();
                                                d980Var = (d980) value;
                                                list = d980Var.e.f2196a;
                                                list.getClass();
                                            } while (!p7m0Var2.m(value, d980.a(d980Var, false, null, null, null, new b980(list, bt9Var), false, false, 111)));
                                        }
                                    }
                                }
                                bt9Var = (bt9) obj3;
                                if (bt9Var != null) {
                                    do {
                                        value = p7m0Var2.getValue();
                                        d980Var = (d980) value;
                                        list = d980Var.e.f2196a;
                                        list.getClass();
                                    } while (!p7m0Var2.m(value, d980.a(d980Var, false, null, null, null, new b980(list, bt9Var), false, false, 111)));
                                }
                            }
                        }
                        break;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        xi70 xi70Var3 = z880.U1;
                        int iH3 = f140.h(bundle3, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST");
                        boolean z = bundle3.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST");
                        aa80 aa80VarH2 = z880Var.H0();
                        p7m0 p7m0Var3 = aa80VarH2.z;
                        do {
                            value2 = p7m0Var3.getValue();
                            d980Var2 = (d980) value2;
                        } while (!p7m0Var3.m(value2, d980.a(d980Var2, false, null, c980.a(d980Var2.c, "", null, 5), null, null, false, false, 123)));
                        sac.V(jiu0.a(aa80VarH2), o980.f24868a, null, aa80VarH2.g.f22085a, new a48(aa80VarH2, iH3, z, null, (byte) 2), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new Function2(this) { // from class: a.x880
            public final /* synthetic */ z880 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00ce A[LOOP:2: B:25:0x00ce->B:43:?, LOOP_START] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String str;
                bt9 bt9Var;
                Object value;
                d980 d980Var;
                List list;
                Object value2;
                d980 d980Var2;
                byte b3 = b2;
                z880 z880Var = this.b;
                switch (b3) {
                    case 0:
                        xi70 xi70Var = z880.U1;
                        int iH = f140.h((Bundle) obj2, (String) obj, "REQUEST_SELECT_THEME_DIALOG_KEY");
                        aa80 aa80VarH0 = z880Var.H0();
                        aa80VarH0.t.W(iH);
                        aa80VarH0.B(true);
                        p7m0 p7m0Var = aa80VarH0.z;
                        a980 a980Var = ((d980) p7m0Var.getValue()).d;
                        if (a980Var != null && (str = a980Var.c) != null) {
                            aa80VarH0.A(Integer.valueOf(iH), str, ((d980) p7m0Var.getValue()).c.f3951a);
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        xi70 xi70Var2 = z880.U1;
                        int iH2 = f140.h(bundle2, (String) obj, "KEY_PICKER_MODEL_REQUEST");
                        PickerParams pickerParams = (PickerParams) bundle2.getParcelable("PICKER_PARAMS_KEY");
                        if (pickerParams != null) {
                            aa80 aa80VarH1 = z880Var.H0();
                            Object obj3 = null;
                            if (pickerParams instanceof PickerParams.Phone) {
                                sac.V(jiu0.a(aa80VarH1), o980.f24868a, null, aa80VarH1.g.f22085a, new a48(aa80VarH1, iH2, true, null, (byte) 2), 10);
                            } else if (pickerParams instanceof PickerParams.Language) {
                                p7m0 p7m0Var2 = aa80VarH1.z;
                                for (Object obj4 : ((d980) p7m0Var2.getValue()).e.f2196a) {
                                    if (((bt9) obj4).f3171a == iH2) {
                                        obj3 = obj4;
                                        bt9Var = (bt9) obj3;
                                        if (bt9Var != null) {
                                            do {
                                                value = p7m0Var2.getValue();
                                                d980Var = (d980) value;
                                                list = d980Var.e.f2196a;
                                                list.getClass();
                                            } while (!p7m0Var2.m(value, d980.a(d980Var, false, null, null, null, new b980(list, bt9Var), false, false, 111)));
                                        }
                                    }
                                }
                                bt9Var = (bt9) obj3;
                                if (bt9Var != null) {
                                    do {
                                        value = p7m0Var2.getValue();
                                        d980Var = (d980) value;
                                        list = d980Var.e.f2196a;
                                        list.getClass();
                                    } while (!p7m0Var2.m(value, d980.a(d980Var, false, null, null, null, new b980(list, bt9Var), false, false, 111)));
                                }
                            }
                        }
                        break;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        xi70 xi70Var3 = z880.U1;
                        int iH3 = f140.h(bundle3, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST");
                        boolean z = bundle3.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST");
                        aa80 aa80VarH2 = z880Var.H0();
                        p7m0 p7m0Var3 = aa80VarH2.z;
                        do {
                            value2 = p7m0Var3.getValue();
                            d980Var2 = (d980) value2;
                        } while (!p7m0Var3.m(value2, d980.a(d980Var2, false, null, c980.a(d980Var2.c, "", null, 5), null, null, false, false, 123)));
                        sac.V(jiu0.a(aa80VarH2), o980.f24868a, null, aa80VarH2.g.f22085a, new a48(aa80VarH2, iH3, z, null, (byte) 2), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new Function2(this) { // from class: a.x880
            public final /* synthetic */ z880 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00ce A[LOOP:2: B:25:0x00ce->B:43:?, LOOP_START] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String str;
                bt9 bt9Var;
                Object value;
                d980 d980Var;
                List list;
                Object value2;
                d980 d980Var2;
                byte b4 = b3;
                z880 z880Var = this.b;
                switch (b4) {
                    case 0:
                        xi70 xi70Var = z880.U1;
                        int iH = f140.h((Bundle) obj2, (String) obj, "REQUEST_SELECT_THEME_DIALOG_KEY");
                        aa80 aa80VarH0 = z880Var.H0();
                        aa80VarH0.t.W(iH);
                        aa80VarH0.B(true);
                        p7m0 p7m0Var = aa80VarH0.z;
                        a980 a980Var = ((d980) p7m0Var.getValue()).d;
                        if (a980Var != null && (str = a980Var.c) != null) {
                            aa80VarH0.A(Integer.valueOf(iH), str, ((d980) p7m0Var.getValue()).c.f3951a);
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        xi70 xi70Var2 = z880.U1;
                        int iH2 = f140.h(bundle2, (String) obj, "KEY_PICKER_MODEL_REQUEST");
                        PickerParams pickerParams = (PickerParams) bundle2.getParcelable("PICKER_PARAMS_KEY");
                        if (pickerParams != null) {
                            aa80 aa80VarH1 = z880Var.H0();
                            Object obj3 = null;
                            if (pickerParams instanceof PickerParams.Phone) {
                                sac.V(jiu0.a(aa80VarH1), o980.f24868a, null, aa80VarH1.g.f22085a, new a48(aa80VarH1, iH2, true, null, (byte) 2), 10);
                            } else if (pickerParams instanceof PickerParams.Language) {
                                p7m0 p7m0Var2 = aa80VarH1.z;
                                for (Object obj4 : ((d980) p7m0Var2.getValue()).e.f2196a) {
                                    if (((bt9) obj4).f3171a == iH2) {
                                        obj3 = obj4;
                                        bt9Var = (bt9) obj3;
                                        if (bt9Var != null) {
                                            do {
                                                value = p7m0Var2.getValue();
                                                d980Var = (d980) value;
                                                list = d980Var.e.f2196a;
                                                list.getClass();
                                            } while (!p7m0Var2.m(value, d980.a(d980Var, false, null, null, null, new b980(list, bt9Var), false, false, 111)));
                                        }
                                    }
                                }
                                bt9Var = (bt9) obj3;
                                if (bt9Var != null) {
                                    do {
                                        value = p7m0Var2.getValue();
                                        d980Var = (d980) value;
                                        list = d980Var.e.f2196a;
                                        list.getClass();
                                    } while (!p7m0Var2.m(value, d980.a(d980Var, false, null, null, null, new b980(list, bt9Var), false, false, 111)));
                                }
                            }
                        }
                        break;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        xi70 xi70Var3 = z880.U1;
                        int iH3 = f140.h(bundle3, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST");
                        boolean z = bundle3.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST");
                        aa80 aa80VarH2 = z880Var.H0();
                        p7m0 p7m0Var3 = aa80VarH2.z;
                        do {
                            value2 = p7m0Var3.getValue();
                            d980Var2 = (d980) value2;
                        } while (!p7m0Var3.m(value2, d980.a(d980Var2, false, null, c980.a(d980Var2.c, "", null, 5), null, null, false, false, 123)));
                        sac.V(jiu0.a(aa80VarH2), o980.f24868a, null, aa80VarH2.g.f22085a, new a48(aa80VarH2, iH3, z, null, (byte) 2), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        sj3.A0(this, "PICKER_DISMISS_KEY", new zc70(this));
        G0().e.b();
        G0().e.a();
        G0().e.setAfterTextFormattingCallback(new gk70(1, H0(), aa80.class, "onPhoneChanged", "onPhoneChanged(Ljava/lang/String;)V", 0, (byte) 27));
        m2r m2rVarG0 = G0();
        m2rVarG0.h.a(new jt6(new csw((Object) this, (byte) 5), (byte) 11));
        DsPhoneTextField dsPhoneTextField = m2rVarG0.e;
        dsPhoneTextField.setCodeClickListener(new l910(this, (byte) 12));
        int iG = m5d.g(o0(), R.attr.uikitSecondary60, 4);
        dsPhoneTextField.d();
        dsPhoneTextField.setCodeStartIconTint(iG);
        DsBottomBar.u(m2rVarG0.b, new a540((Object) this, (Object) m2rVarG0, (byte) 27));
        dyb.O(m2rVarG0.g, new cd60(this, (byte) 24));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o880.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            o880 o880Var = (o880) (ze3Var instanceof o880 ? ze3Var : null);
            if (o880Var != null) {
                cni cniVarA = o880Var.a();
                this.K1 = new fiu0(Collections.singletonMap(aa80.class, cniVarA.x));
                this.L1 = new gl5((byte) 17);
                this.M1 = cniVarA.t;
                this.N1 = cniVarA.u;
                return;
            }
        }
        jf4.n(b1j.i(o880.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        aa80 aa80VarH0 = H0();
        m430 m430Var = new m430(aa80VarH0.z, aa80VarH0, (byte) 18);
        hi70 hi70Var = new hi70(2, this, z880.class, "handleUiState", "handleUiState(Lorg/xplatform/callback/impl/presentation/call/model/OrderCallUiState;)V", 4, (byte) 9);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zm70(m430Var, clzVarW, hi70Var, (yje) null), 3);
        wk30 wk30Var = new wk30(H0().A, (byte) 10);
        hi70 hi70Var2 = new hi70(2, this, z880.class, "handleEvent", "handleEvent(Lorg/xplatform/callback/impl/presentation/call/model/OrderCallEvent;)V", 4, (byte) 10);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zm70(wk30Var, clzVarW2, hi70Var2, (yje) null), 3);
    }

    public final m2r G0() {
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        return (m2r) objN;
    }

    public final aa80 H0() {
        return (aa80) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        j120.Y(this);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        View viewQ0 = q0();
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(viewQ0);
        if (xiv0VarA != null) {
            uiv0 uiv0Var = xiv0VarA.f40966a;
            int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height);
            int dimensionPixelSize2 = G().getDimensionPixelSize(R.dimen.space_12);
            DsBottomBar dsBottomBar = G0().b;
            int i = uiv0Var.i(8).d;
            int i2 = uiv0Var.i(2).d;
            if (getK1()) {
                i -= i2;
            }
            sj3.L0(dsBottomBar, 0, 0, 0, Math.max((i - dimensionPixelSize) - dimensionPixelSize2, 0), 7);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return this.R1.n(this, V1[2]).booleanValue();
    }
}
