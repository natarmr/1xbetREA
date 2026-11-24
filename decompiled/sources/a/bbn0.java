package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bbn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2316a;
    public final /* synthetic */ dbn0 b;

    public /* synthetic */ bbn0(dbn0 dbn0Var, byte b) {
        this.f2316a = b;
        this.b = dbn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2316a;
        dbn0 dbn0Var = this.b;
        switch (b) {
            case 0:
                bvi bviVar = dbn0Var.M1;
                if (bviVar != null) {
                    return new q0h0(bviVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                j6m0 j6m0Var = dbn0.S1;
                ComponentCallbacks2 application = dbn0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ebn0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ebn0)) {
                        ze3Var = null;
                    }
                    ebn0 ebn0Var = (ebn0) ze3Var;
                    if (ebn0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(dbn0Var);
                        i1w0VarF.getClass();
                        iip iipVar = ebn0Var.b;
                        fvt0 fvt0Var = ebn0Var.c;
                        itr itrVar = ebn0Var.d;
                        ugf0 ugf0Var = ebn0Var.f7527a;
                        xri xriVar = ebn0Var.y;
                        rou rouVar = ebn0Var.e;
                        knf0 knf0Var = ebn0Var.f;
                        gii0 gii0Var = ebn0Var.g;
                        ctf0 ctf0Var = ebn0Var.h;
                        y78 y78Var = ebn0Var.i;
                        lbu lbuVar = ebn0Var.j;
                        pru pruVar = ebn0Var.k;
                        m1e m1eVar = ebn0Var.l;
                        mne mneVar = ebn0Var.m;
                        duj dujVar = ebn0Var.n;
                        ii iiVar = ebn0Var.o;
                        x4v x4vVar = ebn0Var.p;
                        iqt iqtVar = ebn0Var.q;
                        b4j b4jVar = ebn0Var.r;
                        d1p d1pVar = ebn0Var.s;
                        wdk0 wdk0Var = ebn0Var.t;
                        lsn lsnVar = ebn0Var.u;
                        wdu wduVar = ebn0Var.v;
                        sue sueVar = ebn0Var.w;
                        gst0 gst0Var = ebn0Var.x;
                        g2v g2vVar = ebn0Var.z;
                        r9u r9uVar = ebn0Var.A;
                        viu viuVar = ebn0Var.B;
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
                        return new cvi(iipVar, fvt0Var, ugf0Var, itrVar, xriVar, d1pVar, lsnVar, i1w0VarF, rouVar, knf0Var, gii0Var, ctf0Var, y78Var, lbuVar, pruVar, m1eVar, mneVar, dujVar, iiVar, x4vVar, iqtVar, b4jVar, wdk0Var, wduVar, gst0Var, g2vVar, r9uVar, viuVar);
                    }
                }
                jf4.n(b1j.i(ebn0.class, "Cannot create dependency "));
                return null;
            case 2:
                j6m0 j6m0Var2 = dbn0.S1;
                dbn0Var.G0().x(qan0.f28405a);
                return Unit.f46060a;
            case 3:
                j6m0 j6m0Var3 = dbn0.S1;
                dbn0Var.G0().x(nan0.f23199a);
                return Unit.f46060a;
            case 4:
                j6m0 j6m0Var4 = dbn0.S1;
                dbn0Var.G0().x(man0.f21467a);
                return Unit.f46060a;
            default:
                j6m0 j6m0Var5 = dbn0.S1;
                dbn0Var.G0().x(kan0.f17974a);
                return Unit.f46060a;
        }
    }
}
