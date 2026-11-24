package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zwe0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45103a;
    public final /* synthetic */ dxe0 b;

    public /* synthetic */ zwe0(dxe0 dxe0Var, byte b) {
        this.f45103a = b;
        this.b = dxe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45103a;
        dxe0 dxe0Var = this.b;
        switch (b) {
            case 0:
                hri hriVar = dxe0Var.L1;
                if (hriVar != null) {
                    return new q0h0(hriVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                lme0 lme0Var = dxe0.Y1;
                j120.Y(dxe0Var);
                dxe0Var.G0().x(rve0.f31164a);
                dxe0Var.G0().x(mve0.f22453a);
                return Unit.f46060a;
            case 2:
                lme0 lme0Var2 = dxe0.Y1;
                dxe0Var.G0().x(ive0.f15442a);
                return Unit.f46060a;
            case 3:
                lme0 lme0Var3 = dxe0.Y1;
                ComponentCallbacks2 application = dxe0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(v1f0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof v1f0)) {
                        ze3Var = null;
                    }
                    v1f0 v1f0Var = (v1f0) ze3Var;
                    if (v1f0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(dxe0Var);
                        RegistrationDefaultScreenParams registrationDefaultScreenParams = (RegistrationDefaultScreenParams) dxe0Var.V1.n(dxe0Var, dxe0.Z1[1]);
                        i1w0VarF.getClass();
                        cyh cyhVar = v1f0Var.o;
                        bzs0 bzs0Var = v1f0Var.e;
                        yox yoxVar = v1f0Var.d;
                        z4w0 z4w0Var = v1f0Var.q;
                        cad cadVar = v1f0Var.b;
                        vue0 vue0Var = v1f0Var.c;
                        ii iiVar = v1f0Var.p;
                        lbu lbuVar = v1f0Var.s;
                        lhf0 lhf0Var = v1f0Var.t;
                        pru pruVar = v1f0Var.l;
                        b8u b8uVar = v1f0Var.n;
                        ntu ntuVar = v1f0Var.m;
                        g2v g2vVar = v1f0Var.r;
                        ctf0 ctf0Var = v1f0Var.u;
                        duj dujVar = v1f0Var.v;
                        pp90 pp90Var = v1f0Var.i;
                        lef0 lef0Var = v1f0Var.j;
                        wsf0 wsf0Var = v1f0Var.k;
                        rl70 rl70Var = v1f0Var.f;
                        lme0 lme0Var4 = v1f0Var.g;
                        pek0 pek0Var = v1f0Var.h;
                        n4u n4uVar = v1f0Var.w;
                        aqt aqtVar = v1f0Var.x;
                        s64 s64Var = v1f0Var.y;
                        gqc gqcVar = v1f0Var.A;
                        wdk0 wdk0Var = v1f0Var.B;
                        m1e m1eVar = v1f0Var.C;
                        ieu ieuVar = v1f0Var.D;
                        kd30 kd30Var = v1f0Var.E;
                        rpt rptVar = v1f0Var.F;
                        tqt tqtVar = v1f0Var.z;
                        yox yoxVar2 = v1f0Var.G;
                        sek sekVar = v1f0Var.H;
                        mi70 mi70Var = v1f0Var.I;
                        hru hruVar = v1f0Var.J;
                        xte0 xte0VarH = v1f0Var.f36626a.h();
                        nh70 nh70Var = v1f0Var.K;
                        vue0Var.getClass();
                        pp90Var.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        aqtVar.getClass();
                        wdk0Var.getClass();
                        m1eVar.getClass();
                        return new iri(cadVar, vue0Var, pp90Var, lef0Var, wsf0Var, yoxVar2, hruVar, bzs0Var, yoxVar, iiVar, registrationDefaultScreenParams, lbuVar, lhf0Var, rl70Var, lme0Var4, pek0Var, pruVar, b8uVar, ntuVar, cyhVar, z4w0Var, g2vVar, i1w0VarF, ctf0Var, dujVar, n4uVar, xte0VarH, aqtVar, s64Var, gqcVar, wdk0Var, m1eVar, ieuVar, kd30Var, rptVar, tqtVar, sekVar, mi70Var, nh70Var);
                    }
                }
                jf4.n(b1j.i(v1f0.class, "Cannot create dependency "));
                return null;
            case 4:
                lme0 lme0Var5 = dxe0.Y1;
                j120.Y(dxe0Var);
                dxe0Var.G0().x(sve0.f32861a);
                return Unit.f46060a;
            case 5:
                lme0 lme0Var6 = dxe0.Y1;
                j120.Y(dxe0Var);
                dxe0Var.G0().x(fve0.f10211a);
                return Unit.f46060a;
            default:
                lme0 lme0Var7 = dxe0.Y1;
                dxe0Var.G0().x(gwe0.f12023a);
                return Unit.f46060a;
        }
    }
}
