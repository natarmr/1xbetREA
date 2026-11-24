package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002"}, d2 = {"La/ze4;", "La/of80;", "<init>", "()V", "a/qek0", "", "isOtherEntryPointsNotEmpty", "La/wul;", "loginWayButtonUiModel", "forgetPasswordButtonUiModel", "La/if4;", "registration", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ze4 extends of80 {
    public y8i Y1;
    public pek0 Z1;
    public rl70 a2;
    public gl5 b2;
    public ii c2;
    public kd30 d2;
    public final a8z e2;
    public final s0r f2;
    public static final /* synthetic */ iiy[] h2 = {new j0d0(ze4.class, "viewBinding", "getViewBinding()Lorg/xplatform/login/simple/impl/databinding/DialogFragmentAuthLoginSimpleBinding;", 0)};
    public static final qek0 g2 = new qek0();
    public static final String i2 = ze4.class.getSimpleName();

    public ze4() {
        super(R.layout.dialog_fragment_auth_login_simple);
        this.e2 = xbc.a0(this, sre0.f32672a.b(fh4.class), null, new pe4(this, (byte) 4), 14);
        this.f2 = ltt0.o(this, ye4.f42469a);
    }

    public final k3t0 K0() {
        return (k3t0) this.e2.getValue();
    }

    @Override // a.of80, a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bf4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bf4 bf4Var = (bf4) (ze3Var instanceof bf4 ? ze3Var : null);
            if (bf4Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                dpc dpcVar = bf4Var.Z;
                ok50 ok50Var = bf4Var.b;
                rpt rptVar = bf4Var.T;
                epi0 epi0Var = bf4Var.N;
                sqx sqxVar = bf4Var.W;
                cad cadVar = bf4Var.f2483a;
                b8u b8uVar = bf4Var.X;
                n4u n4uVar = bf4Var.Y;
                zx10 zx10Var = bf4Var.e;
                pru pruVar = bf4Var.d;
                pek pekVar = bf4Var.f;
                fsd fsdVar = bf4Var.t;
                pek0 pek0Var = bf4Var.g;
                rl70 rl70Var = bf4Var.h;
                bzt bztVar = bf4Var.i;
                knf0 knf0Var = bf4Var.j;
                wsf0 wsf0Var = bf4Var.y;
                tgk tgkVar = bf4Var.k;
                us3 us3Var = bf4Var.l;
                wwb0 wwb0Var = bf4Var.m;
                gii0 gii0Var = bf4Var.n;
                btt0 btt0Var = bf4Var.o;
                b3c0 b3c0Var = bf4Var.p;
                vwb0 vwb0Var = bf4Var.q;
                xwb0 xwb0Var = bf4Var.r;
                gst0 gst0Var = bf4Var.s;
                ii iiVar = bf4Var.D;
                pp90 pp90Var = bf4Var.c;
                ctf0 ctf0Var = bf4Var.u;
                ojj ojjVar = bf4Var.v;
                yox yoxVar = bf4Var.w;
                d1p d1pVar = bf4Var.x;
                cyh cyhVar = bf4Var.z;
                kt2 kt2Var = bf4Var.B;
                qe50 qe50Var = bf4Var.A;
                z4w0 z4w0Var = bf4Var.C;
                kd30 kd30Var = bf4Var.E;
                n4u n4uVar2 = bf4Var.F;
                v6k v6kVar = bf4Var.G;
                m1e m1eVar = bf4Var.H;
                lp4 lp4Var = bf4Var.I;
                ieu ieuVar = bf4Var.J;
                u8u u8uVar = bf4Var.K;
                rpt rptVar2 = bf4Var.L;
                bot botVar = bf4Var.M;
                usd usdVar = bf4Var.O;
                mi70 mi70Var = bf4Var.P;
                svs0 svs0Var = bf4Var.Q;
                zn00 zn00Var = bf4Var.R;
                ilp0 ilp0Var = bf4Var.S;
                nh70 nh70Var = bf4Var.U;
                j1q0 j1q0Var = bf4Var.V;
                kwd kwdVar = bf4Var.a0;
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
                d1pVar.getClass();
                kt2Var.getClass();
                qe50Var.getClass();
                m1eVar.getClass();
                j1q0Var.getClass();
                this.Y1 = (y8i) ((n5d0) new z8i(cadVar, ok50Var, pp90Var, yoxVar, d1pVar, wsf0Var, zx10Var, v6kVar, lp4Var, epi0Var, ilp0Var, b8uVar, n4uVar, i1w0VarF, sqxVar, dpcVar, rptVar, iiVar, pruVar, pekVar, pek0Var, rl70Var, bztVar, b3c0Var, ctf0Var, ojjVar, cyhVar, z4w0Var, kd30Var, n4uVar2, m1eVar, ieuVar, u8uVar, rptVar2, botVar, usdVar, mi70Var, svs0Var, zn00Var, nh70Var, kwdVar).H).get();
                this.Z1 = pek0Var;
                this.a2 = rl70Var;
                this.b2 = new gl5((byte) 17);
                this.c2 = iiVar;
                this.d2 = kd30Var;
                return;
            }
        }
        jf4.n(b1j.i(bf4.class, "Cannot create dependency "));
    }

    @Override // a.of80, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F0(2, R.style.AppTheme_Overlay_Dialog);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        Window window;
        F().f("AUTH_DIALOG_CLOSED_RESULT_KEY");
        v1r v1rVarR = n0().r();
        v1rVarR.g("OTP_CONFIRMATION_RESULT_KEY");
        v1rVarR.g("KEY_REQUEST_CONFIRMATION_NEW_PLACE");
        v1rVarR.g("KEY_LOGIN_QR_SCANNER_REQUEST");
        C().g("KEY_REQUEST_SUPPORT");
        C().g("KEY_AUTH_ENTRY_POINT_REQUEST");
        C().g("KEY_PICKER_MODEL_REQUEST");
        androidx.fragment.app.e eVarC = C();
        if (this.a2 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        eVarC.g("PICKER_DIALOG_TAG");
        C().g("KEY_PICKER_COUNTRY_ID_REQUEST");
        Dialog dialog = this.S1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        Window window;
        view.getClass();
        Dialog dialog = this.S1;
        final byte b = 0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            bcm0.x(window, false);
            window.setSoftInputMode(a8k0.A() ? 16 : 48);
        }
        v1r v1rVarR = n0().r();
        v1rVarR.u0("OTP_CONFIRMATION_RESULT_KEY", this, new k4r(this) { // from class: a.te4
            public final /* synthetic */ ze4 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                String string;
                byte b2 = b;
                ze4 ze4Var = this.b;
                switch (b2) {
                    case 0:
                        qek0 qek0Var = ze4.g2;
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
                            ze4Var.K0().x(new le4(rvs0Var));
                        }
                        break;
                    default:
                        qek0 qek0Var2 = ze4.g2;
                        str.getClass();
                        if (str.equals("KEY_LOGIN_QR_SCANNER_REQUEST") && bundle2.containsKey("KEY_LOGIN_QR_SCANNER_BUNDLE") && (string = bundle2.getString("KEY_LOGIN_QR_SCANNER_BUNDLE")) != null && string.length() != 0) {
                            ze4Var.K0().x(new ee4(string));
                        }
                        break;
                }
            }
        });
        final byte b2 = 2;
        vdb.j0(this, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", new re4(this, b2));
        ccq0.V(this, "KEY_REQUEST_SUPPORT", new pe4(this, b2));
        final byte b3 = 3;
        ccq0.T(this, "KEY_REQUEST_SUPPORT", new pe4(this, b3));
        final byte b4 = 1;
        sj3.A0(this, "KEY_AUTH_ENTRY_POINT_REQUEST", new Function2(this) { // from class: a.se4
            public final /* synthetic */ ze4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v14 */
            /* JADX WARN: Type inference failed for: r9v15, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r9v21 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ?? r9;
                ugd ugdVarM;
                ze4 ze4Var;
                ugd ugdVarM2;
                byte b5 = b4;
                ze4 ze4Var2 = this.b;
                switch (b5) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        qek0 qek0Var = ze4.g2;
                        byte b6 = 1;
                        byte b7 = 0;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
                            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
                            boolean zF = fetVar.f(jB) | fetVar.d(f);
                            Object objP = fetVar.P();
                            Object obj3 = ukd.f35823a;
                            if (zF || objP == obj3) {
                                int i = (int) (jB >> 32);
                                int i3 = (int) (jB & 4294967295L);
                                objP = new ujv0(Math.min(i, i3) / f, Math.max(i, i3) / f);
                                fetVar.o0(objP);
                            }
                            ujv0 ujv0Var = (ujv0) objP;
                            wpq wpqVar = (wpq) fetVar.k(bmd.i);
                            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
                            ze4 ze4Var3 = this.b;
                            pz40 pz40VarY = ((i3t0) ze4Var3.K0()).y(fetVar);
                            boolean zI = fetVar.i(ze4Var3);
                            Object objP2 = fetVar.P();
                            if (zI || objP2 == obj3) {
                                objP2 = new pe4(ze4Var3, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            Function0 function0 = (Function0) objP2;
                            boolean zI2 = fetVar.i(ze4Var3);
                            Object objP3 = fetVar.P();
                            if (zI2 || objP3 == obj3) {
                                objP3 = new pe4(ze4Var3, (byte) 1);
                                fetVar.o0(objP3);
                            }
                            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
                            k3t0 k3t0VarK0 = ze4Var3.K0();
                            boolean zI3 = fetVar.i(ze4Var3);
                            Object objP4 = fetVar.P();
                            if (zI3 || objP4 == obj3) {
                                objP4 = new re4(ze4Var3, b7);
                                fetVar.o0(objP4);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar);
                            boolean zI4 = fetVar.i(k3t0VarK0) | fetVar.i(ze4Var3) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP5 = fetVar.P();
                            ugd ugdVarM3 = null;
                            if (zI4 || objP5 == obj3) {
                                objP5 = new l10(k3t0VarK0, ze4Var3, pz40VarF, null, (byte) 24);
                                fetVar.o0(objP5);
                            }
                            m0x0.t(fetVar, ze4Var3, (Function2) objP5);
                            Object[] objArr = new Object[0];
                            boolean zG = fetVar.g(pz40VarY);
                            Object objP6 = fetVar.P();
                            if (zG || objP6 == obj3) {
                                objP6 = new jb(pz40VarY, (byte) 23);
                                fetVar.o0(objP6);
                            }
                            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar);
                            Object[] objArr2 = new Object[0];
                            boolean zG2 = fetVar.g(pz40VarY);
                            Object objP7 = fetVar.P();
                            if (zG2 || objP7 == obj3) {
                                objP7 = new jb(pz40VarY, (byte) 24);
                                fetVar.o0(objP7);
                            }
                            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP7, fetVar);
                            Object[] objArr3 = new Object[0];
                            boolean zG3 = fetVar.g(l7m0VarY2);
                            Object objP8 = fetVar.P();
                            if (zG3 || objP8 == obj3) {
                                objP8 = new jb(l7m0VarY2, (byte) 25);
                                fetVar.o0(objP8);
                            }
                            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP8, fetVar);
                            Object[] objArr4 = new Object[0];
                            boolean zG4 = fetVar.g(pz40VarY);
                            Object objP9 = fetVar.P();
                            if (zG4 || objP9 == obj3) {
                                objP9 = new jb(pz40VarY, (byte) 26);
                                fetVar.o0(objP9);
                            }
                            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP9, fetVar);
                            Object[] objArr5 = new Object[0];
                            boolean zG5 = fetVar.g(pz40VarY);
                            Object objP10 = fetVar.P();
                            if (zG5 || objP10 == obj3) {
                                objP10 = new jb(pz40VarY, (byte) 27);
                                fetVar.o0(objP10);
                            }
                            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP10, fetVar);
                            Object[] objArr6 = new Object[0];
                            boolean zG6 = fetVar.g(pz40VarY);
                            Object objP11 = fetVar.P();
                            if (zG6 || objP11 == obj3) {
                                objP11 = new jb(pz40VarY, (byte) 28);
                                fetVar.o0(objP11);
                            }
                            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP11, fetVar);
                            Object[] objArr7 = new Object[0];
                            boolean zG7 = fetVar.g(pz40VarY);
                            Object objP12 = fetVar.P();
                            if (zG7 || objP12 == obj3) {
                                objP12 = new jb(pz40VarY, (byte) 29);
                                fetVar.o0(objP12);
                            }
                            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP12, fetVar);
                            Object[] objArr8 = new Object[0];
                            boolean zG8 = fetVar.g(pz40VarY);
                            Object objP13 = fetVar.P();
                            if (zG8 || objP13 == obj3) {
                                objP13 = new we4(pz40VarY, b7);
                                fetVar.o0(objP13);
                            }
                            l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP13, fetVar);
                            Object[] objArr9 = new Object[0];
                            boolean zG9 = fetVar.g(pz40VarY);
                            Object objP14 = fetVar.P();
                            if (zG9 || objP14 == obj3) {
                                objP14 = new we4(pz40VarY, b6);
                                fetVar.o0(objP14);
                            }
                            l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP14, fetVar);
                            Object[] objArr10 = new Object[0];
                            boolean zG10 = fetVar.g(pz40VarY);
                            Object objP15 = fetVar.P();
                            if (zG10 || objP15 == obj3) {
                                objP15 = new we4(pz40VarY, (byte) 2);
                                fetVar.o0(objP15);
                            }
                            l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP15, fetVar);
                            Object[] objArr11 = new Object[0];
                            boolean zG11 = fetVar.g(pz40VarY);
                            Object objP16 = fetVar.P();
                            if (zG11 || objP16 == obj3) {
                                objP16 = new we4(pz40VarY, (byte) 3);
                                fetVar.o0(objP16);
                            }
                            l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP16, fetVar);
                            mm40 mm40VarS = o050.S(o7k0.c);
                            boolean zG12 = fetVar.g(pz40VarY);
                            Object objP17 = fetVar.P();
                            if (zG12 || objP17 == obj3) {
                                objP17 = new yd1(pz40VarY, (byte) 17);
                                fetVar.o0(objP17);
                            }
                            mm40 mm40VarK = rq8.K(mm40VarS, (Function1) objP17);
                            if (((Boolean) l7m0VarY3.getValue()).booleanValue()) {
                                fetVar.e0(692232017);
                                ugdVarM = u1c.M(-1415377444, new ve4(l7m0VarY2, ze4Var3, (byte) 4), fetVar);
                                r9 = 0;
                                fetVar.r(false);
                            } else {
                                r9 = 0;
                                fetVar.e0(693212546);
                                fetVar.r(false);
                                ugdVarM = null;
                            }
                            wul wulVar = (wul) l7m0VarY8.getValue();
                            if (wulVar == null) {
                                fetVar.e0(693303376);
                                fetVar.r(r9);
                                ze4Var = ze4Var3;
                                ugdVarM2 = null;
                            } else {
                                fetVar.e0(693303377);
                                ze4Var = ze4Var3;
                                ugdVarM2 = u1c.M(-399106102, new x2g((Object) wulVar, (Object) wpqVar, (Object) pkk0Var, (Object) ze4Var, (byte) 9), fetVar);
                                fetVar.r(r9);
                            }
                            if4 if4Var = (if4) l7m0VarY9.getValue();
                            if (if4Var == null) {
                                fetVar.e0(693915502);
                                fetVar.r(r9);
                            } else {
                                fetVar.e0(693915503);
                                ugdVarM3 = u1c.M(260080615, new oe4(if4Var, wpqVar, pkk0Var, ze4Var, (byte) 0), fetVar);
                                fetVar.r(r9);
                            }
                            ugd ugdVar = ugdVarM3;
                            boolean zI5 = fetVar.i(ze4Var);
                            Object objP18 = fetVar.P();
                            if (zI5 || objP18 == obj3) {
                                objP18 = new pe4(ze4Var, r9);
                                fetVar.o0(objP18);
                            }
                            qjj.e(mm40VarK, ujv0Var, l7m0VarY, (Function0) objP18, u1c.M(-160006956, new un6(ze4Var, (byte) 21), fetVar), u1c.M(488220501, new v7i0(l7m0VarY11, (byte) 8), fetVar), u1c.M(1136447958, new qe4(pz40VarY, l7m0VarY4, wpqVar, pkk0Var, ze4Var, l7m0VarY5, l7m0VarY6, l7m0VarY10, l7m0VarY7), fetVar), ugdVarM2, ugdVar, ugdVarM, fetVar, 1794048);
                        } else {
                            fetVar.X();
                        }
                        return Unit.f46060a;
                    case 1:
                        qek0 qek0Var2 = ze4.g2;
                        ze4Var2.K0().x(new od4(f140.h((Bundle) obj2, (String) obj, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    case 2:
                        qek0 qek0Var3 = ze4.g2;
                        ze4Var2.K0().x(new sd4(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        Bundle bundle2 = (Bundle) obj2;
                        qek0 qek0Var4 = ze4.g2;
                        ze4Var2.K0().x(new td4(f140.h(bundle2, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        qek0 qek0Var5 = ze4.g2;
                        ((String) obj).getClass();
                        bundle3.getClass();
                        if (ze4Var2.a2 != null) {
                            ze4Var2.K0().x(new ud4(bundle3.getBoolean("PICKER_DIALOG_TAG")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                }
            }
        });
        v1rVarR.u0("KEY_LOGIN_QR_SCANNER_REQUEST", this, new k4r(this) { // from class: a.te4
            public final /* synthetic */ ze4 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                String string;
                byte b5 = b4;
                ze4 ze4Var = this.b;
                switch (b5) {
                    case 0:
                        qek0 qek0Var = ze4.g2;
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
                            ze4Var.K0().x(new le4(rvs0Var));
                        }
                        break;
                    default:
                        qek0 qek0Var2 = ze4.g2;
                        str.getClass();
                        if (str.equals("KEY_LOGIN_QR_SCANNER_REQUEST") && bundle2.containsKey("KEY_LOGIN_QR_SCANNER_BUNDLE") && (string = bundle2.getString("KEY_LOGIN_QR_SCANNER_BUNDLE")) != null && string.length() != 0) {
                            ze4Var.K0().x(new ee4(string));
                        }
                        break;
                }
            }
        });
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new Function2(this) { // from class: a.se4
            public final /* synthetic */ ze4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v14 */
            /* JADX WARN: Type inference failed for: r9v15, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r9v21 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ?? r9;
                ugd ugdVarM;
                ze4 ze4Var;
                ugd ugdVarM2;
                byte b5 = b2;
                ze4 ze4Var2 = this.b;
                switch (b5) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        qek0 qek0Var = ze4.g2;
                        byte b6 = 1;
                        byte b7 = 0;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
                            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
                            boolean zF = fetVar.f(jB) | fetVar.d(f);
                            Object objP = fetVar.P();
                            Object obj3 = ukd.f35823a;
                            if (zF || objP == obj3) {
                                int i = (int) (jB >> 32);
                                int i3 = (int) (jB & 4294967295L);
                                objP = new ujv0(Math.min(i, i3) / f, Math.max(i, i3) / f);
                                fetVar.o0(objP);
                            }
                            ujv0 ujv0Var = (ujv0) objP;
                            wpq wpqVar = (wpq) fetVar.k(bmd.i);
                            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
                            ze4 ze4Var3 = this.b;
                            pz40 pz40VarY = ((i3t0) ze4Var3.K0()).y(fetVar);
                            boolean zI = fetVar.i(ze4Var3);
                            Object objP2 = fetVar.P();
                            if (zI || objP2 == obj3) {
                                objP2 = new pe4(ze4Var3, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            Function0 function0 = (Function0) objP2;
                            boolean zI2 = fetVar.i(ze4Var3);
                            Object objP3 = fetVar.P();
                            if (zI2 || objP3 == obj3) {
                                objP3 = new pe4(ze4Var3, (byte) 1);
                                fetVar.o0(objP3);
                            }
                            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
                            k3t0 k3t0VarK0 = ze4Var3.K0();
                            boolean zI3 = fetVar.i(ze4Var3);
                            Object objP4 = fetVar.P();
                            if (zI3 || objP4 == obj3) {
                                objP4 = new re4(ze4Var3, b7);
                                fetVar.o0(objP4);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar);
                            boolean zI4 = fetVar.i(k3t0VarK0) | fetVar.i(ze4Var3) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP5 = fetVar.P();
                            ugd ugdVarM3 = null;
                            if (zI4 || objP5 == obj3) {
                                objP5 = new l10(k3t0VarK0, ze4Var3, pz40VarF, null, (byte) 24);
                                fetVar.o0(objP5);
                            }
                            m0x0.t(fetVar, ze4Var3, (Function2) objP5);
                            Object[] objArr = new Object[0];
                            boolean zG = fetVar.g(pz40VarY);
                            Object objP6 = fetVar.P();
                            if (zG || objP6 == obj3) {
                                objP6 = new jb(pz40VarY, (byte) 23);
                                fetVar.o0(objP6);
                            }
                            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar);
                            Object[] objArr2 = new Object[0];
                            boolean zG2 = fetVar.g(pz40VarY);
                            Object objP7 = fetVar.P();
                            if (zG2 || objP7 == obj3) {
                                objP7 = new jb(pz40VarY, (byte) 24);
                                fetVar.o0(objP7);
                            }
                            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP7, fetVar);
                            Object[] objArr3 = new Object[0];
                            boolean zG3 = fetVar.g(l7m0VarY2);
                            Object objP8 = fetVar.P();
                            if (zG3 || objP8 == obj3) {
                                objP8 = new jb(l7m0VarY2, (byte) 25);
                                fetVar.o0(objP8);
                            }
                            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP8, fetVar);
                            Object[] objArr4 = new Object[0];
                            boolean zG4 = fetVar.g(pz40VarY);
                            Object objP9 = fetVar.P();
                            if (zG4 || objP9 == obj3) {
                                objP9 = new jb(pz40VarY, (byte) 26);
                                fetVar.o0(objP9);
                            }
                            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP9, fetVar);
                            Object[] objArr5 = new Object[0];
                            boolean zG5 = fetVar.g(pz40VarY);
                            Object objP10 = fetVar.P();
                            if (zG5 || objP10 == obj3) {
                                objP10 = new jb(pz40VarY, (byte) 27);
                                fetVar.o0(objP10);
                            }
                            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP10, fetVar);
                            Object[] objArr6 = new Object[0];
                            boolean zG6 = fetVar.g(pz40VarY);
                            Object objP11 = fetVar.P();
                            if (zG6 || objP11 == obj3) {
                                objP11 = new jb(pz40VarY, (byte) 28);
                                fetVar.o0(objP11);
                            }
                            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP11, fetVar);
                            Object[] objArr7 = new Object[0];
                            boolean zG7 = fetVar.g(pz40VarY);
                            Object objP12 = fetVar.P();
                            if (zG7 || objP12 == obj3) {
                                objP12 = new jb(pz40VarY, (byte) 29);
                                fetVar.o0(objP12);
                            }
                            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP12, fetVar);
                            Object[] objArr8 = new Object[0];
                            boolean zG8 = fetVar.g(pz40VarY);
                            Object objP13 = fetVar.P();
                            if (zG8 || objP13 == obj3) {
                                objP13 = new we4(pz40VarY, b7);
                                fetVar.o0(objP13);
                            }
                            l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP13, fetVar);
                            Object[] objArr9 = new Object[0];
                            boolean zG9 = fetVar.g(pz40VarY);
                            Object objP14 = fetVar.P();
                            if (zG9 || objP14 == obj3) {
                                objP14 = new we4(pz40VarY, b6);
                                fetVar.o0(objP14);
                            }
                            l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP14, fetVar);
                            Object[] objArr10 = new Object[0];
                            boolean zG10 = fetVar.g(pz40VarY);
                            Object objP15 = fetVar.P();
                            if (zG10 || objP15 == obj3) {
                                objP15 = new we4(pz40VarY, (byte) 2);
                                fetVar.o0(objP15);
                            }
                            l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP15, fetVar);
                            Object[] objArr11 = new Object[0];
                            boolean zG11 = fetVar.g(pz40VarY);
                            Object objP16 = fetVar.P();
                            if (zG11 || objP16 == obj3) {
                                objP16 = new we4(pz40VarY, (byte) 3);
                                fetVar.o0(objP16);
                            }
                            l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP16, fetVar);
                            mm40 mm40VarS = o050.S(o7k0.c);
                            boolean zG12 = fetVar.g(pz40VarY);
                            Object objP17 = fetVar.P();
                            if (zG12 || objP17 == obj3) {
                                objP17 = new yd1(pz40VarY, (byte) 17);
                                fetVar.o0(objP17);
                            }
                            mm40 mm40VarK = rq8.K(mm40VarS, (Function1) objP17);
                            if (((Boolean) l7m0VarY3.getValue()).booleanValue()) {
                                fetVar.e0(692232017);
                                ugdVarM = u1c.M(-1415377444, new ve4(l7m0VarY2, ze4Var3, (byte) 4), fetVar);
                                r9 = 0;
                                fetVar.r(false);
                            } else {
                                r9 = 0;
                                fetVar.e0(693212546);
                                fetVar.r(false);
                                ugdVarM = null;
                            }
                            wul wulVar = (wul) l7m0VarY8.getValue();
                            if (wulVar == null) {
                                fetVar.e0(693303376);
                                fetVar.r(r9);
                                ze4Var = ze4Var3;
                                ugdVarM2 = null;
                            } else {
                                fetVar.e0(693303377);
                                ze4Var = ze4Var3;
                                ugdVarM2 = u1c.M(-399106102, new x2g((Object) wulVar, (Object) wpqVar, (Object) pkk0Var, (Object) ze4Var, (byte) 9), fetVar);
                                fetVar.r(r9);
                            }
                            if4 if4Var = (if4) l7m0VarY9.getValue();
                            if (if4Var == null) {
                                fetVar.e0(693915502);
                                fetVar.r(r9);
                            } else {
                                fetVar.e0(693915503);
                                ugdVarM3 = u1c.M(260080615, new oe4(if4Var, wpqVar, pkk0Var, ze4Var, (byte) 0), fetVar);
                                fetVar.r(r9);
                            }
                            ugd ugdVar = ugdVarM3;
                            boolean zI5 = fetVar.i(ze4Var);
                            Object objP18 = fetVar.P();
                            if (zI5 || objP18 == obj3) {
                                objP18 = new pe4(ze4Var, r9);
                                fetVar.o0(objP18);
                            }
                            qjj.e(mm40VarK, ujv0Var, l7m0VarY, (Function0) objP18, u1c.M(-160006956, new un6(ze4Var, (byte) 21), fetVar), u1c.M(488220501, new v7i0(l7m0VarY11, (byte) 8), fetVar), u1c.M(1136447958, new qe4(pz40VarY, l7m0VarY4, wpqVar, pkk0Var, ze4Var, l7m0VarY5, l7m0VarY6, l7m0VarY10, l7m0VarY7), fetVar), ugdVarM2, ugdVar, ugdVarM, fetVar, 1794048);
                        } else {
                            fetVar.X();
                        }
                        return Unit.f46060a;
                    case 1:
                        qek0 qek0Var2 = ze4.g2;
                        ze4Var2.K0().x(new od4(f140.h((Bundle) obj2, (String) obj, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    case 2:
                        qek0 qek0Var3 = ze4.g2;
                        ze4Var2.K0().x(new sd4(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        Bundle bundle2 = (Bundle) obj2;
                        qek0 qek0Var4 = ze4.g2;
                        ze4Var2.K0().x(new td4(f140.h(bundle2, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        qek0 qek0Var5 = ze4.g2;
                        ((String) obj).getClass();
                        bundle3.getClass();
                        if (ze4Var2.a2 != null) {
                            ze4Var2.K0().x(new ud4(bundle3.getBoolean("PICKER_DIALOG_TAG")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                }
            }
        });
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new Function2(this) { // from class: a.se4
            public final /* synthetic */ ze4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v14 */
            /* JADX WARN: Type inference failed for: r9v15, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r9v21 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ?? r9;
                ugd ugdVarM;
                ze4 ze4Var;
                ugd ugdVarM2;
                byte b5 = b3;
                ze4 ze4Var2 = this.b;
                switch (b5) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        qek0 qek0Var = ze4.g2;
                        byte b6 = 1;
                        byte b7 = 0;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
                            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
                            boolean zF = fetVar.f(jB) | fetVar.d(f);
                            Object objP = fetVar.P();
                            Object obj3 = ukd.f35823a;
                            if (zF || objP == obj3) {
                                int i = (int) (jB >> 32);
                                int i3 = (int) (jB & 4294967295L);
                                objP = new ujv0(Math.min(i, i3) / f, Math.max(i, i3) / f);
                                fetVar.o0(objP);
                            }
                            ujv0 ujv0Var = (ujv0) objP;
                            wpq wpqVar = (wpq) fetVar.k(bmd.i);
                            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
                            ze4 ze4Var3 = this.b;
                            pz40 pz40VarY = ((i3t0) ze4Var3.K0()).y(fetVar);
                            boolean zI = fetVar.i(ze4Var3);
                            Object objP2 = fetVar.P();
                            if (zI || objP2 == obj3) {
                                objP2 = new pe4(ze4Var3, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            Function0 function0 = (Function0) objP2;
                            boolean zI2 = fetVar.i(ze4Var3);
                            Object objP3 = fetVar.P();
                            if (zI2 || objP3 == obj3) {
                                objP3 = new pe4(ze4Var3, (byte) 1);
                                fetVar.o0(objP3);
                            }
                            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
                            k3t0 k3t0VarK0 = ze4Var3.K0();
                            boolean zI3 = fetVar.i(ze4Var3);
                            Object objP4 = fetVar.P();
                            if (zI3 || objP4 == obj3) {
                                objP4 = new re4(ze4Var3, b7);
                                fetVar.o0(objP4);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar);
                            boolean zI4 = fetVar.i(k3t0VarK0) | fetVar.i(ze4Var3) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP5 = fetVar.P();
                            ugd ugdVarM3 = null;
                            if (zI4 || objP5 == obj3) {
                                objP5 = new l10(k3t0VarK0, ze4Var3, pz40VarF, null, (byte) 24);
                                fetVar.o0(objP5);
                            }
                            m0x0.t(fetVar, ze4Var3, (Function2) objP5);
                            Object[] objArr = new Object[0];
                            boolean zG = fetVar.g(pz40VarY);
                            Object objP6 = fetVar.P();
                            if (zG || objP6 == obj3) {
                                objP6 = new jb(pz40VarY, (byte) 23);
                                fetVar.o0(objP6);
                            }
                            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar);
                            Object[] objArr2 = new Object[0];
                            boolean zG2 = fetVar.g(pz40VarY);
                            Object objP7 = fetVar.P();
                            if (zG2 || objP7 == obj3) {
                                objP7 = new jb(pz40VarY, (byte) 24);
                                fetVar.o0(objP7);
                            }
                            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP7, fetVar);
                            Object[] objArr3 = new Object[0];
                            boolean zG3 = fetVar.g(l7m0VarY2);
                            Object objP8 = fetVar.P();
                            if (zG3 || objP8 == obj3) {
                                objP8 = new jb(l7m0VarY2, (byte) 25);
                                fetVar.o0(objP8);
                            }
                            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP8, fetVar);
                            Object[] objArr4 = new Object[0];
                            boolean zG4 = fetVar.g(pz40VarY);
                            Object objP9 = fetVar.P();
                            if (zG4 || objP9 == obj3) {
                                objP9 = new jb(pz40VarY, (byte) 26);
                                fetVar.o0(objP9);
                            }
                            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP9, fetVar);
                            Object[] objArr5 = new Object[0];
                            boolean zG5 = fetVar.g(pz40VarY);
                            Object objP10 = fetVar.P();
                            if (zG5 || objP10 == obj3) {
                                objP10 = new jb(pz40VarY, (byte) 27);
                                fetVar.o0(objP10);
                            }
                            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP10, fetVar);
                            Object[] objArr6 = new Object[0];
                            boolean zG6 = fetVar.g(pz40VarY);
                            Object objP11 = fetVar.P();
                            if (zG6 || objP11 == obj3) {
                                objP11 = new jb(pz40VarY, (byte) 28);
                                fetVar.o0(objP11);
                            }
                            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP11, fetVar);
                            Object[] objArr7 = new Object[0];
                            boolean zG7 = fetVar.g(pz40VarY);
                            Object objP12 = fetVar.P();
                            if (zG7 || objP12 == obj3) {
                                objP12 = new jb(pz40VarY, (byte) 29);
                                fetVar.o0(objP12);
                            }
                            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP12, fetVar);
                            Object[] objArr8 = new Object[0];
                            boolean zG8 = fetVar.g(pz40VarY);
                            Object objP13 = fetVar.P();
                            if (zG8 || objP13 == obj3) {
                                objP13 = new we4(pz40VarY, b7);
                                fetVar.o0(objP13);
                            }
                            l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP13, fetVar);
                            Object[] objArr9 = new Object[0];
                            boolean zG9 = fetVar.g(pz40VarY);
                            Object objP14 = fetVar.P();
                            if (zG9 || objP14 == obj3) {
                                objP14 = new we4(pz40VarY, b6);
                                fetVar.o0(objP14);
                            }
                            l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP14, fetVar);
                            Object[] objArr10 = new Object[0];
                            boolean zG10 = fetVar.g(pz40VarY);
                            Object objP15 = fetVar.P();
                            if (zG10 || objP15 == obj3) {
                                objP15 = new we4(pz40VarY, (byte) 2);
                                fetVar.o0(objP15);
                            }
                            l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP15, fetVar);
                            Object[] objArr11 = new Object[0];
                            boolean zG11 = fetVar.g(pz40VarY);
                            Object objP16 = fetVar.P();
                            if (zG11 || objP16 == obj3) {
                                objP16 = new we4(pz40VarY, (byte) 3);
                                fetVar.o0(objP16);
                            }
                            l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP16, fetVar);
                            mm40 mm40VarS = o050.S(o7k0.c);
                            boolean zG12 = fetVar.g(pz40VarY);
                            Object objP17 = fetVar.P();
                            if (zG12 || objP17 == obj3) {
                                objP17 = new yd1(pz40VarY, (byte) 17);
                                fetVar.o0(objP17);
                            }
                            mm40 mm40VarK = rq8.K(mm40VarS, (Function1) objP17);
                            if (((Boolean) l7m0VarY3.getValue()).booleanValue()) {
                                fetVar.e0(692232017);
                                ugdVarM = u1c.M(-1415377444, new ve4(l7m0VarY2, ze4Var3, (byte) 4), fetVar);
                                r9 = 0;
                                fetVar.r(false);
                            } else {
                                r9 = 0;
                                fetVar.e0(693212546);
                                fetVar.r(false);
                                ugdVarM = null;
                            }
                            wul wulVar = (wul) l7m0VarY8.getValue();
                            if (wulVar == null) {
                                fetVar.e0(693303376);
                                fetVar.r(r9);
                                ze4Var = ze4Var3;
                                ugdVarM2 = null;
                            } else {
                                fetVar.e0(693303377);
                                ze4Var = ze4Var3;
                                ugdVarM2 = u1c.M(-399106102, new x2g((Object) wulVar, (Object) wpqVar, (Object) pkk0Var, (Object) ze4Var, (byte) 9), fetVar);
                                fetVar.r(r9);
                            }
                            if4 if4Var = (if4) l7m0VarY9.getValue();
                            if (if4Var == null) {
                                fetVar.e0(693915502);
                                fetVar.r(r9);
                            } else {
                                fetVar.e0(693915503);
                                ugdVarM3 = u1c.M(260080615, new oe4(if4Var, wpqVar, pkk0Var, ze4Var, (byte) 0), fetVar);
                                fetVar.r(r9);
                            }
                            ugd ugdVar = ugdVarM3;
                            boolean zI5 = fetVar.i(ze4Var);
                            Object objP18 = fetVar.P();
                            if (zI5 || objP18 == obj3) {
                                objP18 = new pe4(ze4Var, r9);
                                fetVar.o0(objP18);
                            }
                            qjj.e(mm40VarK, ujv0Var, l7m0VarY, (Function0) objP18, u1c.M(-160006956, new un6(ze4Var, (byte) 21), fetVar), u1c.M(488220501, new v7i0(l7m0VarY11, (byte) 8), fetVar), u1c.M(1136447958, new qe4(pz40VarY, l7m0VarY4, wpqVar, pkk0Var, ze4Var, l7m0VarY5, l7m0VarY6, l7m0VarY10, l7m0VarY7), fetVar), ugdVarM2, ugdVar, ugdVarM, fetVar, 1794048);
                        } else {
                            fetVar.X();
                        }
                        return Unit.f46060a;
                    case 1:
                        qek0 qek0Var2 = ze4.g2;
                        ze4Var2.K0().x(new od4(f140.h((Bundle) obj2, (String) obj, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    case 2:
                        qek0 qek0Var3 = ze4.g2;
                        ze4Var2.K0().x(new sd4(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        Bundle bundle2 = (Bundle) obj2;
                        qek0 qek0Var4 = ze4.g2;
                        ze4Var2.K0().x(new td4(f140.h(bundle2, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        qek0 qek0Var5 = ze4.g2;
                        ((String) obj).getClass();
                        bundle3.getClass();
                        if (ze4Var2.a2 != null) {
                            ze4Var2.K0().x(new ud4(bundle3.getBoolean("PICKER_DIALOG_TAG")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                }
            }
        });
        if (this.a2 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        final byte b5 = 4;
        sj3.A0(this, "PICKER_DIALOG_TAG", new Function2(this) { // from class: a.se4
            public final /* synthetic */ ze4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v14 */
            /* JADX WARN: Type inference failed for: r9v15, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r9v21 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ?? r9;
                ugd ugdVarM;
                ze4 ze4Var;
                ugd ugdVarM2;
                byte b6 = b5;
                ze4 ze4Var2 = this.b;
                switch (b6) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        qek0 qek0Var = ze4.g2;
                        byte b7 = 1;
                        byte b8 = 0;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
                            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
                            boolean zF = fetVar.f(jB) | fetVar.d(f);
                            Object objP = fetVar.P();
                            Object obj3 = ukd.f35823a;
                            if (zF || objP == obj3) {
                                int i = (int) (jB >> 32);
                                int i3 = (int) (jB & 4294967295L);
                                objP = new ujv0(Math.min(i, i3) / f, Math.max(i, i3) / f);
                                fetVar.o0(objP);
                            }
                            ujv0 ujv0Var = (ujv0) objP;
                            wpq wpqVar = (wpq) fetVar.k(bmd.i);
                            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
                            ze4 ze4Var3 = this.b;
                            pz40 pz40VarY = ((i3t0) ze4Var3.K0()).y(fetVar);
                            boolean zI = fetVar.i(ze4Var3);
                            Object objP2 = fetVar.P();
                            if (zI || objP2 == obj3) {
                                objP2 = new pe4(ze4Var3, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            Function0 function0 = (Function0) objP2;
                            boolean zI2 = fetVar.i(ze4Var3);
                            Object objP3 = fetVar.P();
                            if (zI2 || objP3 == obj3) {
                                objP3 = new pe4(ze4Var3, (byte) 1);
                                fetVar.o0(objP3);
                            }
                            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
                            k3t0 k3t0VarK0 = ze4Var3.K0();
                            boolean zI3 = fetVar.i(ze4Var3);
                            Object objP4 = fetVar.P();
                            if (zI3 || objP4 == obj3) {
                                objP4 = new re4(ze4Var3, b8);
                                fetVar.o0(objP4);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar);
                            boolean zI4 = fetVar.i(k3t0VarK0) | fetVar.i(ze4Var3) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP5 = fetVar.P();
                            ugd ugdVarM3 = null;
                            if (zI4 || objP5 == obj3) {
                                objP5 = new l10(k3t0VarK0, ze4Var3, pz40VarF, null, (byte) 24);
                                fetVar.o0(objP5);
                            }
                            m0x0.t(fetVar, ze4Var3, (Function2) objP5);
                            Object[] objArr = new Object[0];
                            boolean zG = fetVar.g(pz40VarY);
                            Object objP6 = fetVar.P();
                            if (zG || objP6 == obj3) {
                                objP6 = new jb(pz40VarY, (byte) 23);
                                fetVar.o0(objP6);
                            }
                            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar);
                            Object[] objArr2 = new Object[0];
                            boolean zG2 = fetVar.g(pz40VarY);
                            Object objP7 = fetVar.P();
                            if (zG2 || objP7 == obj3) {
                                objP7 = new jb(pz40VarY, (byte) 24);
                                fetVar.o0(objP7);
                            }
                            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP7, fetVar);
                            Object[] objArr3 = new Object[0];
                            boolean zG3 = fetVar.g(l7m0VarY2);
                            Object objP8 = fetVar.P();
                            if (zG3 || objP8 == obj3) {
                                objP8 = new jb(l7m0VarY2, (byte) 25);
                                fetVar.o0(objP8);
                            }
                            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP8, fetVar);
                            Object[] objArr4 = new Object[0];
                            boolean zG4 = fetVar.g(pz40VarY);
                            Object objP9 = fetVar.P();
                            if (zG4 || objP9 == obj3) {
                                objP9 = new jb(pz40VarY, (byte) 26);
                                fetVar.o0(objP9);
                            }
                            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP9, fetVar);
                            Object[] objArr5 = new Object[0];
                            boolean zG5 = fetVar.g(pz40VarY);
                            Object objP10 = fetVar.P();
                            if (zG5 || objP10 == obj3) {
                                objP10 = new jb(pz40VarY, (byte) 27);
                                fetVar.o0(objP10);
                            }
                            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP10, fetVar);
                            Object[] objArr6 = new Object[0];
                            boolean zG6 = fetVar.g(pz40VarY);
                            Object objP11 = fetVar.P();
                            if (zG6 || objP11 == obj3) {
                                objP11 = new jb(pz40VarY, (byte) 28);
                                fetVar.o0(objP11);
                            }
                            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP11, fetVar);
                            Object[] objArr7 = new Object[0];
                            boolean zG7 = fetVar.g(pz40VarY);
                            Object objP12 = fetVar.P();
                            if (zG7 || objP12 == obj3) {
                                objP12 = new jb(pz40VarY, (byte) 29);
                                fetVar.o0(objP12);
                            }
                            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP12, fetVar);
                            Object[] objArr8 = new Object[0];
                            boolean zG8 = fetVar.g(pz40VarY);
                            Object objP13 = fetVar.P();
                            if (zG8 || objP13 == obj3) {
                                objP13 = new we4(pz40VarY, b8);
                                fetVar.o0(objP13);
                            }
                            l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP13, fetVar);
                            Object[] objArr9 = new Object[0];
                            boolean zG9 = fetVar.g(pz40VarY);
                            Object objP14 = fetVar.P();
                            if (zG9 || objP14 == obj3) {
                                objP14 = new we4(pz40VarY, b7);
                                fetVar.o0(objP14);
                            }
                            l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP14, fetVar);
                            Object[] objArr10 = new Object[0];
                            boolean zG10 = fetVar.g(pz40VarY);
                            Object objP15 = fetVar.P();
                            if (zG10 || objP15 == obj3) {
                                objP15 = new we4(pz40VarY, (byte) 2);
                                fetVar.o0(objP15);
                            }
                            l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP15, fetVar);
                            Object[] objArr11 = new Object[0];
                            boolean zG11 = fetVar.g(pz40VarY);
                            Object objP16 = fetVar.P();
                            if (zG11 || objP16 == obj3) {
                                objP16 = new we4(pz40VarY, (byte) 3);
                                fetVar.o0(objP16);
                            }
                            l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP16, fetVar);
                            mm40 mm40VarS = o050.S(o7k0.c);
                            boolean zG12 = fetVar.g(pz40VarY);
                            Object objP17 = fetVar.P();
                            if (zG12 || objP17 == obj3) {
                                objP17 = new yd1(pz40VarY, (byte) 17);
                                fetVar.o0(objP17);
                            }
                            mm40 mm40VarK = rq8.K(mm40VarS, (Function1) objP17);
                            if (((Boolean) l7m0VarY3.getValue()).booleanValue()) {
                                fetVar.e0(692232017);
                                ugdVarM = u1c.M(-1415377444, new ve4(l7m0VarY2, ze4Var3, (byte) 4), fetVar);
                                r9 = 0;
                                fetVar.r(false);
                            } else {
                                r9 = 0;
                                fetVar.e0(693212546);
                                fetVar.r(false);
                                ugdVarM = null;
                            }
                            wul wulVar = (wul) l7m0VarY8.getValue();
                            if (wulVar == null) {
                                fetVar.e0(693303376);
                                fetVar.r(r9);
                                ze4Var = ze4Var3;
                                ugdVarM2 = null;
                            } else {
                                fetVar.e0(693303377);
                                ze4Var = ze4Var3;
                                ugdVarM2 = u1c.M(-399106102, new x2g((Object) wulVar, (Object) wpqVar, (Object) pkk0Var, (Object) ze4Var, (byte) 9), fetVar);
                                fetVar.r(r9);
                            }
                            if4 if4Var = (if4) l7m0VarY9.getValue();
                            if (if4Var == null) {
                                fetVar.e0(693915502);
                                fetVar.r(r9);
                            } else {
                                fetVar.e0(693915503);
                                ugdVarM3 = u1c.M(260080615, new oe4(if4Var, wpqVar, pkk0Var, ze4Var, (byte) 0), fetVar);
                                fetVar.r(r9);
                            }
                            ugd ugdVar = ugdVarM3;
                            boolean zI5 = fetVar.i(ze4Var);
                            Object objP18 = fetVar.P();
                            if (zI5 || objP18 == obj3) {
                                objP18 = new pe4(ze4Var, r9);
                                fetVar.o0(objP18);
                            }
                            qjj.e(mm40VarK, ujv0Var, l7m0VarY, (Function0) objP18, u1c.M(-160006956, new un6(ze4Var, (byte) 21), fetVar), u1c.M(488220501, new v7i0(l7m0VarY11, (byte) 8), fetVar), u1c.M(1136447958, new qe4(pz40VarY, l7m0VarY4, wpqVar, pkk0Var, ze4Var, l7m0VarY5, l7m0VarY6, l7m0VarY10, l7m0VarY7), fetVar), ugdVarM2, ugdVar, ugdVarM, fetVar, 1794048);
                        } else {
                            fetVar.X();
                        }
                        return Unit.f46060a;
                    case 1:
                        qek0 qek0Var2 = ze4.g2;
                        ze4Var2.K0().x(new od4(f140.h((Bundle) obj2, (String) obj, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    case 2:
                        qek0 qek0Var3 = ze4.g2;
                        ze4Var2.K0().x(new sd4(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        Bundle bundle2 = (Bundle) obj2;
                        qek0 qek0Var4 = ze4.g2;
                        ze4Var2.K0().x(new td4(f140.h(bundle2, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        qek0 qek0Var5 = ze4.g2;
                        ((String) obj).getClass();
                        bundle3.getClass();
                        if (ze4Var2.a2 != null) {
                            ze4Var2.K0().x(new ud4(bundle3.getBoolean("PICKER_DIALOG_TAG")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                }
            }
        });
        if (this.b2 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "KEY_REQUEST_CAPTCHA_CODE_DIALOG", new pe4(this, (byte) 5), new re4(this, b4));
        Object objN = this.f2.n(h2[0], this);
        objN.getClass();
        pkd.h(((tik) objN).b, qek0.h, null, new ugd(1667060219, true, new Function2(this) { // from class: a.se4
            public final /* synthetic */ ze4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v14 */
            /* JADX WARN: Type inference failed for: r9v15, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r9v21 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ?? r9;
                ugd ugdVarM;
                ze4 ze4Var;
                ugd ugdVarM2;
                byte b6 = b;
                ze4 ze4Var2 = this.b;
                switch (b6) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        qek0 qek0Var = ze4.g2;
                        byte b7 = 1;
                        byte b8 = 0;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
                            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
                            boolean zF = fetVar.f(jB) | fetVar.d(f);
                            Object objP = fetVar.P();
                            Object obj3 = ukd.f35823a;
                            if (zF || objP == obj3) {
                                int i = (int) (jB >> 32);
                                int i3 = (int) (jB & 4294967295L);
                                objP = new ujv0(Math.min(i, i3) / f, Math.max(i, i3) / f);
                                fetVar.o0(objP);
                            }
                            ujv0 ujv0Var = (ujv0) objP;
                            wpq wpqVar = (wpq) fetVar.k(bmd.i);
                            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
                            ze4 ze4Var3 = this.b;
                            pz40 pz40VarY = ((i3t0) ze4Var3.K0()).y(fetVar);
                            boolean zI = fetVar.i(ze4Var3);
                            Object objP2 = fetVar.P();
                            if (zI || objP2 == obj3) {
                                objP2 = new pe4(ze4Var3, (byte) 6);
                                fetVar.o0(objP2);
                            }
                            Function0 function0 = (Function0) objP2;
                            boolean zI2 = fetVar.i(ze4Var3);
                            Object objP3 = fetVar.P();
                            if (zI2 || objP3 == obj3) {
                                objP3 = new pe4(ze4Var3, (byte) 1);
                                fetVar.o0(objP3);
                            }
                            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
                            k3t0 k3t0VarK0 = ze4Var3.K0();
                            boolean zI3 = fetVar.i(ze4Var3);
                            Object objP4 = fetVar.P();
                            if (zI3 || objP4 == obj3) {
                                objP4 = new re4(ze4Var3, b8);
                                fetVar.o0(objP4);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar);
                            boolean zI4 = fetVar.i(k3t0VarK0) | fetVar.i(ze4Var3) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP5 = fetVar.P();
                            ugd ugdVarM3 = null;
                            if (zI4 || objP5 == obj3) {
                                objP5 = new l10(k3t0VarK0, ze4Var3, pz40VarF, null, (byte) 24);
                                fetVar.o0(objP5);
                            }
                            m0x0.t(fetVar, ze4Var3, (Function2) objP5);
                            Object[] objArr = new Object[0];
                            boolean zG = fetVar.g(pz40VarY);
                            Object objP6 = fetVar.P();
                            if (zG || objP6 == obj3) {
                                objP6 = new jb(pz40VarY, (byte) 23);
                                fetVar.o0(objP6);
                            }
                            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar);
                            Object[] objArr2 = new Object[0];
                            boolean zG2 = fetVar.g(pz40VarY);
                            Object objP7 = fetVar.P();
                            if (zG2 || objP7 == obj3) {
                                objP7 = new jb(pz40VarY, (byte) 24);
                                fetVar.o0(objP7);
                            }
                            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP7, fetVar);
                            Object[] objArr3 = new Object[0];
                            boolean zG3 = fetVar.g(l7m0VarY2);
                            Object objP8 = fetVar.P();
                            if (zG3 || objP8 == obj3) {
                                objP8 = new jb(l7m0VarY2, (byte) 25);
                                fetVar.o0(objP8);
                            }
                            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP8, fetVar);
                            Object[] objArr4 = new Object[0];
                            boolean zG4 = fetVar.g(pz40VarY);
                            Object objP9 = fetVar.P();
                            if (zG4 || objP9 == obj3) {
                                objP9 = new jb(pz40VarY, (byte) 26);
                                fetVar.o0(objP9);
                            }
                            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP9, fetVar);
                            Object[] objArr5 = new Object[0];
                            boolean zG5 = fetVar.g(pz40VarY);
                            Object objP10 = fetVar.P();
                            if (zG5 || objP10 == obj3) {
                                objP10 = new jb(pz40VarY, (byte) 27);
                                fetVar.o0(objP10);
                            }
                            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP10, fetVar);
                            Object[] objArr6 = new Object[0];
                            boolean zG6 = fetVar.g(pz40VarY);
                            Object objP11 = fetVar.P();
                            if (zG6 || objP11 == obj3) {
                                objP11 = new jb(pz40VarY, (byte) 28);
                                fetVar.o0(objP11);
                            }
                            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP11, fetVar);
                            Object[] objArr7 = new Object[0];
                            boolean zG7 = fetVar.g(pz40VarY);
                            Object objP12 = fetVar.P();
                            if (zG7 || objP12 == obj3) {
                                objP12 = new jb(pz40VarY, (byte) 29);
                                fetVar.o0(objP12);
                            }
                            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP12, fetVar);
                            Object[] objArr8 = new Object[0];
                            boolean zG8 = fetVar.g(pz40VarY);
                            Object objP13 = fetVar.P();
                            if (zG8 || objP13 == obj3) {
                                objP13 = new we4(pz40VarY, b8);
                                fetVar.o0(objP13);
                            }
                            l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP13, fetVar);
                            Object[] objArr9 = new Object[0];
                            boolean zG9 = fetVar.g(pz40VarY);
                            Object objP14 = fetVar.P();
                            if (zG9 || objP14 == obj3) {
                                objP14 = new we4(pz40VarY, b7);
                                fetVar.o0(objP14);
                            }
                            l7m0 l7m0VarY9 = v3c.Y(objArr9, (Function0) objP14, fetVar);
                            Object[] objArr10 = new Object[0];
                            boolean zG10 = fetVar.g(pz40VarY);
                            Object objP15 = fetVar.P();
                            if (zG10 || objP15 == obj3) {
                                objP15 = new we4(pz40VarY, (byte) 2);
                                fetVar.o0(objP15);
                            }
                            l7m0 l7m0VarY10 = v3c.Y(objArr10, (Function0) objP15, fetVar);
                            Object[] objArr11 = new Object[0];
                            boolean zG11 = fetVar.g(pz40VarY);
                            Object objP16 = fetVar.P();
                            if (zG11 || objP16 == obj3) {
                                objP16 = new we4(pz40VarY, (byte) 3);
                                fetVar.o0(objP16);
                            }
                            l7m0 l7m0VarY11 = v3c.Y(objArr11, (Function0) objP16, fetVar);
                            mm40 mm40VarS = o050.S(o7k0.c);
                            boolean zG12 = fetVar.g(pz40VarY);
                            Object objP17 = fetVar.P();
                            if (zG12 || objP17 == obj3) {
                                objP17 = new yd1(pz40VarY, (byte) 17);
                                fetVar.o0(objP17);
                            }
                            mm40 mm40VarK = rq8.K(mm40VarS, (Function1) objP17);
                            if (((Boolean) l7m0VarY3.getValue()).booleanValue()) {
                                fetVar.e0(692232017);
                                ugdVarM = u1c.M(-1415377444, new ve4(l7m0VarY2, ze4Var3, (byte) 4), fetVar);
                                r9 = 0;
                                fetVar.r(false);
                            } else {
                                r9 = 0;
                                fetVar.e0(693212546);
                                fetVar.r(false);
                                ugdVarM = null;
                            }
                            wul wulVar = (wul) l7m0VarY8.getValue();
                            if (wulVar == null) {
                                fetVar.e0(693303376);
                                fetVar.r(r9);
                                ze4Var = ze4Var3;
                                ugdVarM2 = null;
                            } else {
                                fetVar.e0(693303377);
                                ze4Var = ze4Var3;
                                ugdVarM2 = u1c.M(-399106102, new x2g((Object) wulVar, (Object) wpqVar, (Object) pkk0Var, (Object) ze4Var, (byte) 9), fetVar);
                                fetVar.r(r9);
                            }
                            if4 if4Var = (if4) l7m0VarY9.getValue();
                            if (if4Var == null) {
                                fetVar.e0(693915502);
                                fetVar.r(r9);
                            } else {
                                fetVar.e0(693915503);
                                ugdVarM3 = u1c.M(260080615, new oe4(if4Var, wpqVar, pkk0Var, ze4Var, (byte) 0), fetVar);
                                fetVar.r(r9);
                            }
                            ugd ugdVar = ugdVarM3;
                            boolean zI5 = fetVar.i(ze4Var);
                            Object objP18 = fetVar.P();
                            if (zI5 || objP18 == obj3) {
                                objP18 = new pe4(ze4Var, r9);
                                fetVar.o0(objP18);
                            }
                            qjj.e(mm40VarK, ujv0Var, l7m0VarY, (Function0) objP18, u1c.M(-160006956, new un6(ze4Var, (byte) 21), fetVar), u1c.M(488220501, new v7i0(l7m0VarY11, (byte) 8), fetVar), u1c.M(1136447958, new qe4(pz40VarY, l7m0VarY4, wpqVar, pkk0Var, ze4Var, l7m0VarY5, l7m0VarY6, l7m0VarY10, l7m0VarY7), fetVar), ugdVarM2, ugdVar, ugdVarM, fetVar, 1794048);
                        } else {
                            fetVar.X();
                        }
                        return Unit.f46060a;
                    case 1:
                        qek0 qek0Var2 = ze4.g2;
                        ze4Var2.K0().x(new od4(f140.h((Bundle) obj2, (String) obj, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                        return Unit.f46060a;
                    case 2:
                        qek0 qek0Var3 = ze4.g2;
                        ze4Var2.K0().x(new sd4(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        Bundle bundle2 = (Bundle) obj2;
                        qek0 qek0Var4 = ze4.g2;
                        ze4Var2.K0().x(new td4(f140.h(bundle2, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    default:
                        Bundle bundle3 = (Bundle) obj2;
                        qek0 qek0Var5 = ze4.g2;
                        ((String) obj).getClass();
                        bundle3.getClass();
                        if (ze4Var2.a2 != null) {
                            ze4Var2.K0().x(new ud4(bundle3.getBoolean("PICKER_DIALOG_TAG")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                }
            }
        }));
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        F().t0(i120.U(), "AUTH_DIALOG_CLOSED_RESULT_KEY");
        super.onDismiss(dialogInterface);
    }
}
