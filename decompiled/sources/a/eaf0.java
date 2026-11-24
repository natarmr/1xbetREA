package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eaf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7462a;
    public final /* synthetic */ iaf0 b;

    public /* synthetic */ eaf0(iaf0 iaf0Var, byte b) {
        this.f7462a = b;
        this.b = iaf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7462a;
        iaf0 iaf0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = iaf0.Z1;
                j120.Y(iaf0Var);
                iaf0Var.H0().x(e9f0.f7418a);
                iaf0Var.H0().x(z8f0.f43963a);
                return Unit.f46060a;
            case 1:
                zie0 zie0Var2 = iaf0.Z1;
                ComponentCallbacks2 application = iaf0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(jaf0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof jaf0)) {
                        ze3Var = null;
                    }
                    jaf0 jaf0Var = (jaf0) ze3Var;
                    if (jaf0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(iaf0Var);
                        i1w0VarF.getClass();
                        cyh cyhVar = jaf0Var.p;
                        bzs0 bzs0Var = jaf0Var.e;
                        yox yoxVar = jaf0Var.d;
                        z4w0 z4w0Var = jaf0Var.r;
                        cad cadVar = jaf0Var.b;
                        vue0 vue0Var = jaf0Var.c;
                        ii iiVar = jaf0Var.q;
                        lbu lbuVar = jaf0Var.s;
                        lhf0 lhf0Var = jaf0Var.t;
                        pru pruVar = jaf0Var.m;
                        b8u b8uVar = jaf0Var.o;
                        ntu ntuVar = jaf0Var.n;
                        ctf0 ctf0Var = jaf0Var.u;
                        duj dujVar = jaf0Var.v;
                        pp90 pp90Var = jaf0Var.j;
                        lef0 lef0Var = jaf0Var.k;
                        wsf0 wsf0Var = jaf0Var.l;
                        rl70 rl70Var = jaf0Var.f;
                        eke0 eke0Var = jaf0Var.g;
                        lme0 lme0Var = jaf0Var.h;
                        pek0 pek0Var = jaf0Var.i;
                        n4u n4uVar = jaf0Var.w;
                        xte0 xte0VarH = jaf0Var.f16187a.h();
                        aqt aqtVar = jaf0Var.x;
                        s64 s64Var = jaf0Var.y;
                        gqc gqcVar = jaf0Var.A;
                        wdk0 wdk0Var = jaf0Var.B;
                        m1e m1eVar = jaf0Var.C;
                        ieu ieuVar = jaf0Var.D;
                        kd30 kd30Var = jaf0Var.E;
                        rpt rptVar = jaf0Var.F;
                        tqt tqtVar = jaf0Var.z;
                        yox yoxVar2 = jaf0Var.G;
                        sek sekVar = jaf0Var.H;
                        mi70 mi70Var = jaf0Var.I;
                        hru hruVar = jaf0Var.J;
                        nh70 nh70Var = jaf0Var.K;
                        vue0Var.getClass();
                        pp90Var.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        aqtVar.getClass();
                        wdk0Var.getClass();
                        m1eVar.getClass();
                        return new pri(iiVar, s64Var, gqcVar, cadVar, m1eVar, cyhVar, dujVar, sekVar, rptVar, aqtVar, tqtVar, n4uVar, b8uVar, lbuVar, ieuVar, hruVar, pruVar, ntuVar, yoxVar2, yoxVar, kd30Var, nh70Var, mi70Var, rl70Var, pp90Var, eke0Var, lme0Var, xte0VarH, vue0Var, lef0Var, lhf0Var, wsf0Var, ctf0Var, wdk0Var, pek0Var, bzs0Var, i1w0VarF, z4w0Var);
                    }
                }
                jf4.n(b1j.i(jaf0.class, "Cannot create dependency "));
                return null;
            case 2:
                ori oriVar = iaf0Var.L1;
                if (oriVar != null) {
                    return new q0h0(oriVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                zie0 zie0Var3 = iaf0.Z1;
                iaf0Var.H0().x(v8f0.f36979a);
                return Unit.f46060a;
            case 4:
                zie0 zie0Var4 = iaf0.Z1;
                j120.Y(iaf0Var);
                iaf0Var.H0().x(f9f0.f9151a);
                return Unit.f46060a;
            case 5:
                zie0 zie0Var5 = iaf0.Z1;
                j120.Y(iaf0Var);
                iaf0Var.H0().x(s8f0.f31797a);
                return Unit.f46060a;
            default:
                zie0 zie0Var6 = iaf0.Z1;
                iaf0Var.H0().x(r9f0.f30078a);
                return Unit.f46060a;
        }
    }
}
