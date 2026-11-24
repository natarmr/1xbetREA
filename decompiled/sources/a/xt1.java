package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xt1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41442a;
    public final /* synthetic */ au1 b;

    public /* synthetic */ xt1(au1 au1Var, byte b) {
        this.f41442a = b;
        this.b = au1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41442a;
        au1 au1Var = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = au1.Z1;
                au1Var.G0().x(ds1.f6589a);
                return Unit.f46060a;
            case 1:
                jdk0 jdk0Var2 = au1.Z1;
                fiu0 fiu0Var = au1Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                jdk0 jdk0Var3 = au1.Z1;
                ComponentCallbacks2 application = au1Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(us1.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof us1)) {
                        ze3Var = null;
                    }
                    us1 us1Var = (us1) ze3Var;
                    if (us1Var != null) {
                        r34 r34Var = au1Var.S1;
                        iiy[] iiyVarArr = au1.a2;
                        Long lN = r34Var.n(au1Var, iiyVarArr[1]);
                        String strN = au1Var.U1.n(au1Var, iiyVarArr[2]);
                        s9s0 s9s0Var = (s9s0) au1Var.V1.n(au1Var, iiyVarArr[3]);
                        Boolean boolN = au1Var.W1.n(au1Var, iiyVarArr[4]);
                        strN.getClass();
                        ehf0 ehf0Var = us1Var.f36187a;
                        cad cadVar = us1Var.b;
                        peg0 peg0Var = us1Var.c;
                        wsf0 wsf0Var = us1Var.e;
                        d1p d1pVar = us1Var.d;
                        wsf0 wsf0Var2 = us1Var.f;
                        peg0 peg0Var2 = us1Var.g;
                        gii0 gii0Var = us1Var.h;
                        wdk0 wdk0Var = us1Var.i;
                        btt0 btt0Var = us1Var.j;
                        kt2 kt2Var = us1Var.o;
                        s91 s91Var = us1Var.k;
                        m1e m1eVar = us1Var.l;
                        ii iiVar = us1Var.m;
                        duj dujVar = us1Var.n;
                        knf0 knf0Var = us1Var.p;
                        v88 v88Var = us1Var.q;
                        oeg0 oeg0Var = us1Var.r;
                        ctf0 ctf0Var = us1Var.s;
                        iqt iqtVar = us1Var.t;
                        bzt bztVar = us1Var.u;
                        pru pruVar = us1Var.v;
                        kc60 kc60Var = us1Var.w;
                        wiu wiuVar = us1Var.x;
                        r2v r2vVar = us1Var.y;
                        ytt yttVar = us1Var.z;
                        x0u x0uVar = us1Var.A;
                        d1pVar.getClass();
                        gii0Var.getClass();
                        wdk0Var.getClass();
                        btt0Var.getClass();
                        s91Var.getClass();
                        m1eVar.getClass();
                        iiVar.getClass();
                        knf0Var.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        kt2Var.getClass();
                        return new w7i(cadVar, ehf0Var, peg0Var, wsf0Var, wsf0Var2, peg0Var2, d1pVar, wdk0Var, s91Var, m1eVar, iiVar, dujVar, v88Var, oeg0Var, ctf0Var, iqtVar, bztVar, pruVar, kc60Var, wiuVar, r2vVar, yttVar, kt2Var, lN, strN, s9s0Var, boolN, x0uVar);
                    }
                }
                jf4.n(b1j.i(us1.class, "Cannot create dependency "));
                return null;
        }
    }
}
