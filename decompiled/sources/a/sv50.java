package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sv50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32851a;
    public final /* synthetic */ uv50 b;

    public /* synthetic */ sv50(uv50 uv50Var, byte b) {
        this.f32851a = b;
        this.b = uv50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32851a;
        uv50 uv50Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = uv50.U1;
                ComponentCallbacks2 application = uv50Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ov50.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ov50)) {
                        ze3Var = null;
                    }
                    ov50 ov50Var = (ov50) ze3Var;
                    if (ov50Var != null) {
                        i1w0 i1w0VarF = a4n0.f(uv50Var);
                        phf0 phf0Var = uv50Var.L1;
                        iiy[] iiyVarArr = uv50.V1;
                        String strN = phf0Var.n(uv50Var, iiyVarArr[1]);
                        String strN2 = uv50Var.M1.n(uv50Var, iiyVarArr[2]);
                        boolean zBooleanValue = uv50Var.O1.n(uv50Var, iiyVarArr[4]).booleanValue();
                        oo5 oo5Var = (oo5) uv50Var.N1.n(uv50Var, iiyVarArr[3]);
                        strN.getClass();
                        strN2.getClass();
                        o24 o24Var = new o24();
                        o24Var.b = strN;
                        o24Var.c = strN2;
                        o24Var.f24513a = zBooleanValue;
                        o24Var.d = oo5Var;
                        i1w0VarF.getClass();
                        lp4 lp4Var = ov50Var.f25910a;
                        b3c0 b3c0Var = ov50Var.b;
                        gst0 gst0Var = ov50Var.c;
                        wsz wszVar = ov50Var.d;
                        nv20 nv20Var = ov50Var.f;
                        ii iiVar = ov50Var.h;
                        btt0 btt0Var = ov50Var.g;
                        duj dujVar = ov50Var.i;
                        j1q0 j1q0Var = ov50Var.n;
                        gii0 gii0Var = ov50Var.e;
                        m1e m1eVar = ov50Var.j;
                        mne mneVar = ov50Var.k;
                        xnt xntVar = ov50Var.l;
                        ctf0 ctf0Var = ov50Var.m;
                        nv20 nv20Var2 = ov50Var.o;
                        gle0 gle0Var = ov50Var.p;
                        grj grjVar = ov50Var.q;
                        tzi tziVar = ov50Var.r;
                        bzt bztVar = ov50Var.s;
                        yj yjVar = ov50Var.t;
                        lp4Var.getClass();
                        iiVar.getClass();
                        b3c0Var.getClass();
                        gst0Var.getClass();
                        gii0Var.getClass();
                        btt0Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        j1q0Var.getClass();
                        yjVar.getClass();
                        return new ami(new evz(), lp4Var, iiVar, b3c0Var, gst0Var, wszVar, gii0Var, nv20Var, btt0Var, dujVar, m1eVar, mneVar, i1w0VarF, xntVar, ctf0Var, nv20Var2, gle0Var, grjVar, tziVar, o24Var, bztVar, yjVar);
                    }
                }
                jf4.n(b1j.i(ov50.class, "Cannot create dependency "));
                return null;
            case 1:
                xuz xuzVar2 = uv50.U1;
                return new q0h0((zli) ((ami) uv50Var.R1.getValue()).y.get());
            case 2:
                xuz xuzVar3 = uv50.U1;
                uv50Var.G0().x(av50.f1511a);
                return Unit.f46060a;
            default:
                xuz xuzVar4 = uv50.U1;
                uv50Var.G0().x(yu50.f43253a);
                return Unit.f46060a;
        }
    }
}
