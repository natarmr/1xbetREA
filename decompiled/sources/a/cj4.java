package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002"}, d2 = {"La/cj4;", "La/yx5;", "<init>", "()V", "a/gfk0", "", "isOtherEntryPointsNotEmpty", "isLoading", "La/wul;", "loginWayButtonUiModel", "forgetPasswordButtonUiModel", "registrationButtonUiModel", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cj4 extends yx5 {
    public final e9o0 K1;
    public a9i L1;
    public pek0 M1;
    public rl70 N1;
    public gl5 O1;
    public ii P1;
    public kd30 Q1;
    public final a8z R1;
    public final s0r S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(cj4.class, "viewBinding", "getViewBinding()Lorg/xplatform/login/visual/impl/databinding/FragmentAuthLoginVisualBinding;", 0)};
    public static final gfk0 U1 = new gfk0((byte) 26);

    public cj4() {
        super(R.layout.fragment_auth_login_visual);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.R1 = xbc.a0(this, sre0.f32672a.b(hk4.class), null, new ui4(this, (byte) 4), 14);
        this.S1 = ltt0.o(this, bj4.f2687a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        v1r v1rVarR = n0().r();
        final byte b = 0;
        v1rVarR.u0("OTP_CONFIRMATION_RESULT_KEY", this, new k4r(this) { // from class: a.xi4
            public final /* synthetic */ cj4 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                String string;
                byte b2 = b;
                cj4 cj4Var = this.b;
                switch (b2) {
                    case 0:
                        gfk0 gfk0Var = cj4.U1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle2.getSerializable(str, rvs0.class);
                        } else {
                            Object serializable2 = bundle2.getSerializable(str);
                            if (!(serializable2 instanceof rvs0)) {
                                serializable2 = null;
                            }
                            serializable = (rvs0) serializable2;
                        }
                        rvs0 rvs0Var = serializable instanceof rvs0 ? (rvs0) serializable : null;
                        if (rvs0Var != null) {
                            cj4Var.G0().x(new mi4(rvs0Var));
                        }
                        break;
                    default:
                        gfk0 gfk0Var2 = cj4.U1;
                        str.getClass();
                        if (str.equals("KEY_LOGIN_QR_SCANNER_REQUEST") && bundle2.containsKey("KEY_LOGIN_QR_SCANNER_BUNDLE") && (string = bundle2.getString("KEY_LOGIN_QR_SCANNER_BUNDLE")) != null && string.length() != 0) {
                            cj4Var.G0().x(new gi4(string));
                        }
                        break;
                }
            }
        });
        vdb.j0(this, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", new aj4(this, (byte) 4));
        ccq0.V(this, "KEY_REQUEST_SUPPORT", new ui4(this, (byte) 8));
        ccq0.T(this, "KEY_REQUEST_SUPPORT", new ui4(this, (byte) 9));
        final byte b2 = 2;
        sj3.A0(this, "KEY_AUTH_ENTRY_POINT_REQUEST", new Function2(this) { // from class: a.ti4
            public final /* synthetic */ cj4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                cj4 cj4Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        gfk0 gfk0Var = cj4.U1;
                        cj4Var.G0().x(new uh4(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        gfk0 gfk0Var2 = cj4.U1;
                        str.getClass();
                        bundle2.getClass();
                        if (cj4Var.N1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        cj4Var.G0().x(new vh4(bundle2.getBoolean("PICKER_DIALOG_TAG")));
                        return Unit.f46060a;
                    case 2:
                        gfk0 gfk0Var3 = cj4.U1;
                        cj4Var.G0().x(new ph4(f140.h(bundle2, str, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    default:
                        gfk0 gfk0Var4 = cj4.U1;
                        cj4Var.G0().x(new th4(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                }
            }
        });
        final byte b3 = 1;
        v1rVarR.u0("KEY_LOGIN_QR_SCANNER_REQUEST", this, new k4r(this) { // from class: a.xi4
            public final /* synthetic */ cj4 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                String string;
                byte b4 = b3;
                cj4 cj4Var = this.b;
                switch (b4) {
                    case 0:
                        gfk0 gfk0Var = cj4.U1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle2.getSerializable(str, rvs0.class);
                        } else {
                            Object serializable2 = bundle2.getSerializable(str);
                            if (!(serializable2 instanceof rvs0)) {
                                serializable2 = null;
                            }
                            serializable = (rvs0) serializable2;
                        }
                        rvs0 rvs0Var = serializable instanceof rvs0 ? (rvs0) serializable : null;
                        if (rvs0Var != null) {
                            cj4Var.G0().x(new mi4(rvs0Var));
                        }
                        break;
                    default:
                        gfk0 gfk0Var2 = cj4.U1;
                        str.getClass();
                        if (str.equals("KEY_LOGIN_QR_SCANNER_REQUEST") && bundle2.containsKey("KEY_LOGIN_QR_SCANNER_BUNDLE") && (string = bundle2.getString("KEY_LOGIN_QR_SCANNER_BUNDLE")) != null && string.length() != 0) {
                            cj4Var.G0().x(new gi4(string));
                        }
                        break;
                }
            }
        });
        final byte b4 = 3;
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new Function2(this) { // from class: a.ti4
            public final /* synthetic */ cj4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b4;
                cj4 cj4Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b5) {
                    case 0:
                        gfk0 gfk0Var = cj4.U1;
                        cj4Var.G0().x(new uh4(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        gfk0 gfk0Var2 = cj4.U1;
                        str.getClass();
                        bundle2.getClass();
                        if (cj4Var.N1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        cj4Var.G0().x(new vh4(bundle2.getBoolean("PICKER_DIALOG_TAG")));
                        return Unit.f46060a;
                    case 2:
                        gfk0 gfk0Var3 = cj4.U1;
                        cj4Var.G0().x(new ph4(f140.h(bundle2, str, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    default:
                        gfk0 gfk0Var4 = cj4.U1;
                        cj4Var.G0().x(new th4(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                }
            }
        });
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new Function2(this) { // from class: a.ti4
            public final /* synthetic */ cj4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b;
                cj4 cj4Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b5) {
                    case 0:
                        gfk0 gfk0Var = cj4.U1;
                        cj4Var.G0().x(new uh4(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        gfk0 gfk0Var2 = cj4.U1;
                        str.getClass();
                        bundle2.getClass();
                        if (cj4Var.N1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        cj4Var.G0().x(new vh4(bundle2.getBoolean("PICKER_DIALOG_TAG")));
                        return Unit.f46060a;
                    case 2:
                        gfk0 gfk0Var3 = cj4.U1;
                        cj4Var.G0().x(new ph4(f140.h(bundle2, str, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    default:
                        gfk0 gfk0Var4 = cj4.U1;
                        cj4Var.G0().x(new th4(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                }
            }
        });
        if (this.N1 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        sj3.A0(this, "PICKER_DIALOG_TAG", new Function2(this) { // from class: a.ti4
            public final /* synthetic */ cj4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b3;
                cj4 cj4Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b5) {
                    case 0:
                        gfk0 gfk0Var = cj4.U1;
                        cj4Var.G0().x(new uh4(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        gfk0 gfk0Var2 = cj4.U1;
                        str.getClass();
                        bundle2.getClass();
                        if (cj4Var.N1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        cj4Var.G0().x(new vh4(bundle2.getBoolean("PICKER_DIALOG_TAG")));
                        return Unit.f46060a;
                    case 2:
                        gfk0 gfk0Var3 = cj4.U1;
                        cj4Var.G0().x(new ph4(f140.h(bundle2, str, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    default:
                        gfk0 gfk0Var4 = cj4.U1;
                        cj4Var.G0().x(new th4(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                }
            }
        });
        if (this.O1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "KEY_REQUEST_CAPTCHA_CODE_DIALOG", new ui4(this, (byte) 0), new aj4(this, (byte) 0));
        Object objS = !zdx.B(this) ? o050.S(o7k0.c) : o7k0.c;
        Object objN = this.S1.n(V1[0], this);
        objN.getClass();
        pkd.h(((eyq) objN).b, qek0.h, null, new ugd(-1820946802, true, new sr1(this, objS, (byte) 15)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dj4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            dj4 dj4Var = (dj4) (ze3Var instanceof dj4 ? ze3Var : null);
            if (dj4Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                dpc dpcVar = dj4Var.W;
                sqx sqxVar = dj4Var.M;
                rpt rptVar = dj4Var.S;
                epi0 epi0Var = dj4Var.L;
                cad cadVar = dj4Var.f6165a;
                b8u b8uVar = dj4Var.V;
                zx10 zx10Var = dj4Var.e;
                ok50 ok50Var = dj4Var.b;
                pru pruVar = dj4Var.d;
                pek pekVar = dj4Var.f;
                fsd fsdVar = dj4Var.t;
                pek0 pek0Var = dj4Var.g;
                rl70 rl70Var = dj4Var.h;
                bzt bztVar = dj4Var.i;
                knf0 knf0Var = dj4Var.j;
                wsf0 wsf0Var = dj4Var.x;
                tgk tgkVar = dj4Var.k;
                us3 us3Var = dj4Var.l;
                wwb0 wwb0Var = dj4Var.m;
                gii0 gii0Var = dj4Var.n;
                btt0 btt0Var = dj4Var.o;
                b3c0 b3c0Var = dj4Var.p;
                vwb0 vwb0Var = dj4Var.q;
                xwb0 xwb0Var = dj4Var.r;
                gst0 gst0Var = dj4Var.s;
                ii iiVar = dj4Var.B;
                pp90 pp90Var = dj4Var.c;
                ctf0 ctf0Var = dj4Var.u;
                ojj ojjVar = dj4Var.v;
                yox yoxVar = dj4Var.w;
                cyh cyhVar = dj4Var.y;
                qe50 qe50Var = dj4Var.z;
                z4w0 z4w0Var = dj4Var.A;
                kd30 kd30Var = dj4Var.C;
                n4u n4uVar = dj4Var.D;
                v6k v6kVar = dj4Var.E;
                m1e m1eVar = dj4Var.F;
                lp4 lp4Var = dj4Var.G;
                ieu ieuVar = dj4Var.H;
                u8u u8uVar = dj4Var.I;
                rpt rptVar2 = dj4Var.J;
                bot botVar = dj4Var.K;
                usd usdVar = dj4Var.N;
                mi70 mi70Var = dj4Var.O;
                svs0 svs0Var = dj4Var.P;
                zn00 zn00Var = dj4Var.Q;
                ilp0 ilp0Var = dj4Var.R;
                nh70 nh70Var = dj4Var.T;
                n4u n4uVar2 = dj4Var.U;
                ba50 ba50Var = dj4Var.X;
                kwd kwdVar = dj4Var.Y;
                cmt cmtVar = dj4Var.Z;
                pp90Var.getClass();
                lp4Var.getClass();
                iiVar.getClass();
                fsdVar.getClass();
                knf0Var.getClass();
                tgkVar.getClass();
                us3Var.getClass();
                wwb0Var.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                b3c0Var.getClass();
                vwb0Var.getClass();
                xwb0Var.getClass();
                gst0Var.getClass();
                ctf0Var.getClass();
                qe50Var.getClass();
                m1eVar.getClass();
                ba50Var.getClass();
                this.L1 = (a9i) ((n5d0) new z8i(cadVar, ok50Var, pp90Var, yoxVar, wsf0Var, zx10Var, v6kVar, lp4Var, epi0Var, ilp0Var, b8uVar, i1w0VarF, dpcVar, sqxVar, rptVar, iiVar, pruVar, pekVar, pek0Var, rl70Var, bztVar, b3c0Var, ctf0Var, ojjVar, cyhVar, z4w0Var, kd30Var, n4uVar, m1eVar, ieuVar, u8uVar, rptVar2, botVar, usdVar, mi70Var, svs0Var, zn00Var, nh70Var, n4uVar2, cmtVar, kwdVar).H).get();
                this.M1 = pek0Var;
                this.N1 = rl70Var;
                this.O1 = new gl5((byte) 17);
                this.P1 = iiVar;
                this.Q1 = kd30Var;
                return;
            }
        }
        jf4.n(b1j.i(dj4.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        v1r v1rVarR = n0().r();
        v1rVarR.g("OTP_CONFIRMATION_RESULT_KEY");
        v1rVarR.g("KEY_REQUEST_CONFIRMATION_NEW_PLACE");
        v1rVarR.g("KEY_LOGIN_QR_SCANNER_REQUEST");
        C().g("KEY_REQUEST_SUPPORT");
        C().g("KEY_AUTH_ENTRY_POINT_REQUEST");
        C().g("KEY_PICKER_MODEL_REQUEST");
        androidx.fragment.app.e eVarC = C();
        if (this.N1 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        eVarC.g("PICKER_DIALOG_TAG");
        C().g("KEY_PICKER_COUNTRY_ID_REQUEST");
        super.Z();
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
