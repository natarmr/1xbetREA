package a;

import android.content.ComponentCallbacks2;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a5b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f263a;
    public final /* synthetic */ g5b b;

    public /* synthetic */ a5b(g5b g5bVar, byte b) {
        this.f263a = b;
        this.b = g5bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f263a;
        g5b g5bVar = this.b;
        switch (b) {
            case 0:
                gl5 gl5Var = g5b.c2;
                return new q0h0((ubi) g5bVar.R0().V.get());
            case 1:
                gl5 gl5Var2 = g5b.c2;
                return new q0h0((j7i) ((k7i) g5bVar.O1.getValue()).s.get());
            case 2:
                gl5 gl5Var3 = g5b.c2;
                return new q0h0((zhi) ((aii) g5bVar.P1.getValue()).o.get());
            case 3:
                return new q0h0((pgi) ((qgi) g5bVar.Q1.getValue()).S.get());
            case 4:
                gl5 gl5Var4 = g5b.c2;
                return new q0h0((vbi) g5bVar.R0().W.get());
            case 5:
                gl5 gl5Var5 = g5b.c2;
                g5bVar.P0().x(ok2.f25386a);
                return Unit.f46060a;
            case 6:
                gl5 gl5Var6 = g5b.c2;
                g5bVar.T0().x(wf2.f39047a);
                return Unit.f46060a;
            case 7:
                gl5 gl5Var7 = g5b.c2;
                g5bVar.P0().x(pk2.f27116a);
                return Unit.f46060a;
            case 8:
                gl5 gl5Var8 = g5b.c2;
                g5bVar.U0().x(oh2.f25244a);
                return Unit.f46060a;
            case 9:
                gl5 gl5Var9 = g5b.c2;
                g5bVar.V0().x(wi2.f39193a);
                return Unit.f46060a;
            case 10:
                gl5 gl5Var10 = g5b.c2;
                g5bVar.O0().x(ka0.f17939a);
                return Unit.f46060a;
            case 11:
                gl5 gl5Var11 = g5b.c2;
                g5bVar.X0().x(c2t.f3641a);
                return Unit.f46060a;
            case 12:
                gl5 gl5Var12 = g5b.c2;
                g5bVar.W0().x(mm2.f22018a);
                return Unit.f46060a;
            case 13:
                gl5 gl5Var13 = g5b.c2;
                return new q0h0((wbi) g5bVar.R0().X.get());
            case 14:
                gl5 gl5Var14 = g5b.c2;
                g5bVar.X0().x(g2t.f10577a);
                g5bVar.W0().x(em2.f8028a);
                return Unit.f46060a;
            case 15:
                gl5 gl5Var15 = g5b.c2;
                return new q0h0((xbi) g5bVar.R0().Y.get());
            case 16:
                gl5 gl5Var16 = g5b.c2;
                return new q0h0((ybi) g5bVar.R0().Z.get());
            case 17:
                gl5 gl5Var17 = g5b.c2;
                return new q0h0((zbi) g5bVar.R0().a0.get());
            case 18:
                gl5 gl5Var18 = g5b.c2;
                ComponentCallbacks2 application = g5bVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(y4b.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof y4b)) {
                        ze3Var = null;
                    }
                    y4b y4bVar = (y4b) ze3Var;
                    if (y4bVar != null) {
                        return y4bVar.a(a4n0.f(g5bVar));
                    }
                }
                jf4.n(b1j.i(y4b.class, "Cannot create dependency "));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gl5 gl5Var19 = g5b.c2;
                ComponentCallbacks2 application2 = g5bVar.n0().getApplication();
                application2.getClass();
                af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                if (af3Var2 != null) {
                    o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(rl0.class);
                    ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                    if (!(ze3Var2 instanceof rl0)) {
                        ze3Var2 = null;
                    }
                    rl0 rl0Var = (rl0) ze3Var2;
                    if (rl0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(g5bVar);
                        i1w0VarF.getClass();
                        a1d a1dVar = rl0Var.f30674a;
                        fvt0 fvt0Var = rl0Var.b;
                        iw20 iw20Var = rl0Var.c;
                        dn0 dn0Var = rl0Var.d;
                        btt0 btt0Var = rl0Var.e;
                        g2v g2vVar = rl0Var.f;
                        mne mneVar = rl0Var.g;
                        duj dujVar = rl0Var.h;
                        j1q0 j1q0Var = rl0Var.j;
                        r9u r9uVar = rl0Var.u;
                        gii0 gii0Var = rl0Var.i;
                        s31 s31Var = rl0Var.k;
                        m1e m1eVar = rl0Var.l;
                        ctf0 ctf0Var = rl0Var.m;
                        ii iiVar = rl0Var.n;
                        jdk0 jdk0Var = rl0Var.o;
                        gst0 gst0Var = rl0Var.r;
                        ntu ntuVar = rl0Var.s;
                        knf0 knf0Var = rl0Var.t;
                        d1p d1pVar = rl0Var.v;
                        xri xriVar = rl0Var.w;
                        wdk0 wdk0Var = rl0Var.x;
                        abp abpVar = rl0Var.p;
                        t6p t6pVar = rl0Var.q;
                        u58 u58Var = rl0Var.y;
                        wsf0 wsf0Var = rl0Var.z;
                        d1pVar.getClass();
                        xriVar.getClass();
                        t6pVar.getClass();
                        btt0Var.getClass();
                        gii0Var.getClass();
                        abpVar.getClass();
                        j1q0Var.getClass();
                        r9uVar.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        iiVar.getClass();
                        gst0Var.getClass();
                        knf0Var.getClass();
                        wdk0Var.getClass();
                        return new k7i(fvt0Var, a1dVar, iw20Var, d1pVar, wsf0Var, dn0Var, mneVar, g2vVar, dujVar, i1w0VarF, s31Var, m1eVar, ctf0Var, jdk0Var, gst0Var, ntuVar, wdk0Var, u58Var);
                    }
                }
                jf4.n(b1j.i(rl0.class, "Cannot create dependency "));
                return null;
            case 20:
                gl5 gl5Var20 = g5b.c2;
                ComponentCallbacks2 application3 = g5bVar.n0().getApplication();
                application3.getClass();
                af3 af3Var3 = application3 instanceof af3 ? (af3) application3 : null;
                if (af3Var3 != null) {
                    o5d0 o5d0Var3 = (o5d0) af3Var3.d().get(n5t.class);
                    ze3 ze3Var3 = o5d0Var3 != null ? (ze3) o5d0Var3.get() : null;
                    if (!(ze3Var3 instanceof n5t)) {
                        ze3Var3 = null;
                    }
                    n5t n5tVar = (n5t) ze3Var3;
                    if (n5tVar != null) {
                        i1w0 i1w0VarF2 = a4n0.f(g5bVar);
                        i1w0VarF2.getClass();
                        mne mneVar2 = n5tVar.f22961a;
                        bw60 bw60Var = n5tVar.b;
                        d1p d1pVar2 = n5tVar.c;
                        lbu lbuVar = n5tVar.d;
                        ali aliVar = n5tVar.e;
                        ctf0 ctf0Var2 = n5tVar.f;
                        iqt iqtVar = n5tVar.g;
                        gst0 gst0Var2 = n5tVar.h;
                        g2v g2vVar2 = n5tVar.i;
                        m1e m1eVar2 = n5tVar.j;
                        oct octVar = n5tVar.l;
                        kqc kqcVar = n5tVar.k;
                        s31 s31Var2 = n5tVar.m;
                        bw60Var.getClass();
                        d1pVar2.getClass();
                        ctf0Var2.getClass();
                        m1eVar2.getClass();
                        gst0Var2.getClass();
                        return new aii(mneVar2, d1pVar2, bw60Var, i1w0VarF2, lbuVar, aliVar, ctf0Var2, iqtVar, m1eVar2, gst0Var2, g2vVar2, octVar, kqcVar, s31Var2);
                    }
                }
                jf4.n(b1j.i(n5t.class, "Cannot create dependency "));
                return null;
            default:
                gl5 gl5Var21 = g5b.c2;
                ComponentCallbacks2 application4 = g5bVar.n0().getApplication();
                application4.getClass();
                af3 af3Var4 = application4 instanceof af3 ? (af3) application4 : null;
                if (af3Var4 != null) {
                    o5d0 o5d0Var4 = (o5d0) af3Var4.d().get(eep.class);
                    ze3 ze3Var4 = o5d0Var4 != null ? (ze3) o5d0Var4.get() : null;
                    if (!(ze3Var4 instanceof eep)) {
                        ze3Var4 = null;
                    }
                    eep eepVar = (eep) ze3Var4;
                    if (eepVar != null) {
                        return eepVar.a(a4n0.f(g5bVar));
                    }
                }
                jf4.n(b1j.i(eep.class, "Cannot create dependency "));
                return null;
        }
    }
}
