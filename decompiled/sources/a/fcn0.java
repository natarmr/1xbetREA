package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fcn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9320a;
    public final /* synthetic */ icn0 b;

    public /* synthetic */ fcn0(icn0 icn0Var, byte b) {
        this.f9320a = b;
        this.b = icn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9320a;
        icn0 icn0Var = this.b;
        switch (b) {
            case 0:
                g9m0 g9m0Var = icn0.W1;
                icn0Var.H0().x(wcn0.f38933a);
                return Unit.f46060a;
            case 1:
                g9m0 g9m0Var2 = icn0.W1;
                ((k3t0) icn0Var.S1.getValue()).x(ydn0.f42447a);
                return Unit.f46060a;
            case 2:
                g9m0 g9m0Var3 = icn0.W1;
                icn0Var.G0().x(bcn0.f2362a);
                return Unit.f46060a;
            case 3:
                dvi dviVar = icn0Var.N1;
                if (dviVar != null) {
                    return new q0h0(dviVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                evi eviVar = icn0Var.O1;
                if (eviVar != null) {
                    return new q0h0(eviVar);
                }
                Intrinsics.h("eventsViewModelFactory");
                throw null;
            case 5:
                fvi fviVar = icn0Var.P1;
                if (fviVar != null) {
                    return new q0h0(fviVar);
                }
                Intrinsics.h("teamsViewModelFactory");
                throw null;
            default:
                g9m0 g9m0Var4 = icn0.W1;
                ComponentCallbacks2 application = icn0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(jcn0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof jcn0)) {
                        ze3Var = null;
                    }
                    jcn0 jcn0Var = (jcn0) ze3Var;
                    if (jcn0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(icn0Var);
                        i1w0VarF.getClass();
                        iip iipVar = jcn0Var.b;
                        a1d a1dVar = jcn0Var.c;
                        bwl bwlVar = jcn0Var.d;
                        fvt0 fvt0Var = jcn0Var.e;
                        itr itrVar = jcn0Var.f;
                        ugf0 ugf0Var = jcn0Var.f16285a;
                        xri xriVar = jcn0Var.A;
                        rou rouVar = jcn0Var.g;
                        knf0 knf0Var = jcn0Var.h;
                        gii0 gii0Var = jcn0Var.i;
                        ctf0 ctf0Var = jcn0Var.j;
                        y78 y78Var = jcn0Var.k;
                        lbu lbuVar = jcn0Var.l;
                        pru pruVar = jcn0Var.m;
                        m1e m1eVar = jcn0Var.n;
                        mne mneVar = jcn0Var.o;
                        duj dujVar = jcn0Var.p;
                        ii iiVar = jcn0Var.q;
                        x4v x4vVar = jcn0Var.r;
                        iqt iqtVar = jcn0Var.s;
                        b4j b4jVar = jcn0Var.t;
                        d1p d1pVar = jcn0Var.u;
                        wdk0 wdk0Var = jcn0Var.v;
                        lsn lsnVar = jcn0Var.w;
                        wdu wduVar = jcn0Var.x;
                        sue sueVar = jcn0Var.y;
                        gst0 gst0Var = jcn0Var.z;
                        g2v g2vVar = jcn0Var.B;
                        r9u r9uVar = jcn0Var.C;
                        viu viuVar = jcn0Var.D;
                        bzt bztVar = jcn0Var.E;
                        kys0 kys0Var = jcn0Var.F;
                        lk5 lk5Var = jcn0Var.G;
                        iipVar.getClass();
                        itrVar.getClass();
                        d1pVar.getClass();
                        sueVar.getClass();
                        xriVar.getClass();
                        knf0Var.getClass();
                        gii0Var.getClass();
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        iiVar.getClass();
                        wdk0Var.getClass();
                        gst0Var.getClass();
                        r9uVar.getClass();
                        return new gvi(iipVar, a1dVar, bwlVar, fvt0Var, ugf0Var, itrVar, xriVar, d1pVar, lsnVar, i1w0VarF, rouVar, knf0Var, gii0Var, ctf0Var, y78Var, lbuVar, pruVar, m1eVar, mneVar, dujVar, iiVar, x4vVar, iqtVar, b4jVar, wduVar, gst0Var, g2vVar, r9uVar, viuVar, bztVar, kys0Var, lk5Var);
                    }
                }
                jf4.n(b1j.i(jcn0.class, "Cannot create dependency "));
                return null;
        }
    }
}
