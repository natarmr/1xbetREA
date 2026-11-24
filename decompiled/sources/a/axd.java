package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1619a;
    public final /* synthetic */ exd b;

    public /* synthetic */ axd(exd exdVar, byte b) {
        this.f1619a = b;
        this.b = exdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1619a;
        ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator confirmByAuthenticator = ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator.f46929a;
        byte b2 = 2;
        yje yjeVar = null;
        exd exdVar = this.b;
        switch (b) {
            case 0:
                usd usdVar = exd.U1;
                exdVar.I0().J();
                return Unit.f46060a;
            case 1:
                usd usdVar2 = exd.U1;
                exdVar.I0().E(true);
                return Unit.f46060a;
            case 2:
                usd usdVar3 = exd.U1;
                exdVar.I0().D(false);
                return Unit.f46060a;
            case 3:
                usd usdVar4 = exd.U1;
                exdVar.I0().E(false);
                return Unit.f46060a;
            case 4:
                usd usdVar5 = exd.U1;
                ComponentCallbacks2 application = exdVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(zwd.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof zwd)) {
                        ze3Var = null;
                    }
                    zwd zwdVar = (zwd) ze3Var;
                    if (zwdVar != null) {
                        i1w0 i1w0VarF = a4n0.f(exdVar);
                        ConfirmRestoreByAuthenticatorType confirmRestoreByAuthenticatorType = (ConfirmRestoreByAuthenticatorType) exdVar.S1.n(exdVar, exd.V1[1]);
                        i1w0VarF.getClass();
                        qgd qgdVar = zwdVar.f45100a;
                        lp4 lp4Var = zwdVar.d;
                        duj dujVar = zwdVar.b;
                        ii iiVar = zwdVar.c;
                        lef0 lef0Var = zwdVar.g;
                        m1e m1eVar = zwdVar.h;
                        wdk0 wdk0Var = zwdVar.i;
                        ctf0 ctf0Var = zwdVar.j;
                        iqt iqtVar = zwdVar.k;
                        mne mneVar = zwdVar.m;
                        rou rouVar = zwdVar.o;
                        pru pruVar = zwdVar.l;
                        z4w0 z4w0Var = zwdVar.n;
                        mi70 mi70Var = zwdVar.p;
                        zn00 zn00Var = zwdVar.q;
                        kt2 kt2Var = zwdVar.r;
                        hse0 hse0Var = zwdVar.e;
                        g2v g2vVar = zwdVar.f;
                        d1p d1pVar = zwdVar.s;
                        lp4Var.getClass();
                        d1pVar.getClass();
                        iiVar.getClass();
                        m1eVar.getClass();
                        hse0Var.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        kt2Var.getClass();
                        return new xci(lp4Var, lef0Var, d1pVar, iiVar, i1w0VarF, confirmRestoreByAuthenticatorType, dujVar, m1eVar, z4w0Var, hse0Var, g2vVar, wdk0Var, ctf0Var, iqtVar, mneVar, qgdVar, rouVar, pruVar, mi70Var, zn00Var, kt2Var);
                    }
                }
                jf4.n(b1j.i(zwd.class, "Cannot create dependency "));
                return null;
            case 5:
                usd usdVar6 = exd.U1;
                return (wci) ((xci) exdVar.P1.getValue()).v.get();
            case 6:
                usd usdVar7 = exd.U1;
                kyd kydVarI0 = exdVar.I0();
                kydVarI0.z.h();
                kydVarI0.A.f44833a.a(tx3.l0(new k1p[]{new j1p("settings", (byte) 0), new j1p("authenticator", (byte) 1)}), 3344L);
                ywq ywqVar = exdVar.R1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 7:
                usd usdVar8 = exd.U1;
                kyd kydVarI1 = exdVar.I0();
                kydVarI1.z.i();
                kydVarI1.A.f44833a.a(tx3.l0(new k1p[]{new j1p("cancel", (byte) 0), new j1p("authenticator", (byte) 1)}), 3344L);
                exdVar.I0().H();
                return Unit.f46060a;
            case 8:
                usd usdVar9 = exd.U1;
                exdVar.I0().J();
                return Unit.f46060a;
            case 9:
                usd usdVar10 = exd.U1;
                kyd kydVarI2 = exdVar.I0();
                if (kydVarI2.J) {
                    if (Intrinsics.d(kydVarI2.p, confirmByAuthenticator)) {
                        i8i.D("action", "resend", kydVarI2.z.f42966a, "authenticator_linked_device_click");
                        b1j.v("resend", kydVarI2.A.f44833a, 3341L);
                    }
                    sac.V(jiu0.a(kydVarI2), new ejd(kydVarI2, (byte) 7), null, null, new yxd(kydVarI2, null, (byte) 2), 14);
                }
                return Unit.f46060a;
            case 10:
                usd usdVar11 = exd.U1;
                exdVar.I0().E(true);
                return Unit.f46060a;
            case 11:
                usd usdVar12 = exd.U1;
                kyd kydVarI3 = exdVar.I0();
                if (Intrinsics.d(kydVarI3.p, confirmByAuthenticator)) {
                    i8i.D("action", "confirm", kydVarI3.z.f42966a, "authenticator_linked_device_click");
                    b1j.v("confirm", kydVarI3.A.f44833a, 3341L);
                }
                if (kydVarI3.J) {
                    sac.V(jiu0.a(kydVarI3), new enc(1, new enc(1, kydVarI3, kyd.class, "handleServerError", "handleServerError(Ljava/lang/Throwable;)V", 0, (byte) 21), Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 22), new fxd(kydVarI3, (byte) 1), kydVarI3.c.f22085a, new cxd(kydVarI3, new yxd(kydVarI3, null, (byte) 0), yjeVar, b2), 8);
                } else {
                    kydVarI3.D.f(kxd.f19048a);
                }
                return Unit.f46060a;
            case 12:
                usd usdVar13 = exd.U1;
                exdVar.I0().D(false);
                return Unit.f46060a;
            case 13:
                usd usdVar14 = exd.U1;
                exdVar.I0().D(true);
                return Unit.f46060a;
            case 14:
                usd usdVar15 = exd.U1;
                exd exdVar2 = this.b;
                wdk0 wdk0Var2 = exdVar2.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = exdVar2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), exdVar2, null, null, false, null, 1020);
                return Unit.f46060a;
            default:
                usd usdVar16 = exd.U1;
                exdVar.I0().D(false);
                return Unit.f46060a;
        }
    }
}
