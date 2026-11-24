package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sy80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33015a;
    public final /* synthetic */ uy80 b;

    public /* synthetic */ sy80(uy80 uy80Var, byte b) {
        this.f33015a = b;
        this.b = uy80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33015a;
        uy80 uy80Var = this.b;
        switch (b) {
            case 0:
                jh70 jh70Var = uy80.W1;
                fiu0 fiu0Var = uy80Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                jh70 jh70Var2 = uy80.W1;
                ComponentCallbacks2 application = uy80Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(vy80.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof vy80)) {
                        ze3Var = null;
                    }
                    vy80 vy80Var = (vy80) ze3Var;
                    if (vy80Var != null) {
                        phf0 phf0Var = uy80Var.Q1;
                        iiy[] iiyVarArr = uy80.X1;
                        String strN = phf0Var.n(uy80Var, iiyVarArr[0]);
                        Long lN = uy80Var.R1.n(uy80Var, iiyVarArr[1]);
                        Boolean boolN = uy80Var.S1.n(uy80Var, iiyVarArr[2]);
                        strN.getClass();
                        oeg0 oeg0Var = vy80Var.f38236a;
                        g2v g2vVar = vy80Var.b;
                        duj dujVar = vy80Var.c;
                        cad cadVar = vy80Var.d;
                        m1e m1eVar = vy80Var.e;
                        knf0 knf0Var = vy80Var.f;
                        gii0 gii0Var = vy80Var.g;
                        pyg pygVar = vy80Var.m;
                        cad cadVar2 = vy80Var.h;
                        iip iipVar = vy80Var.k;
                        gst0 gst0Var = vy80Var.i;
                        xri xriVar = vy80Var.l;
                        itr itrVar = vy80Var.j;
                        vqc vqcVar = vy80Var.n;
                        b3c0 b3c0Var = vy80Var.o;
                        btt0 btt0Var = vy80Var.p;
                        wdk0 wdk0Var = vy80Var.q;
                        ctf0 ctf0Var = vy80Var.r;
                        dnu dnuVar = vy80Var.s;
                        poq0 poq0Var = vy80Var.t;
                        h3c h3cVar = vy80Var.u;
                        kt2 kt2Var = vy80Var.v;
                        zr1 zr1Var = vy80Var.w;
                        bn6 bn6Var = vy80Var.x;
                        je jeVar = vy80Var.y;
                        xriVar.getClass();
                        pygVar.getClass();
                        itrVar.getClass();
                        iipVar.getClass();
                        oeg0Var.getClass();
                        m1eVar.getClass();
                        knf0Var.getClass();
                        gii0Var.getClass();
                        gst0Var.getClass();
                        b3c0Var.getClass();
                        btt0Var.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        kt2Var.getClass();
                        return new hni(cadVar, pygVar, iipVar, vqcVar, oeg0Var, g2vVar, dujVar, m1eVar, knf0Var, gii0Var, strN, lN, boolN, cadVar2, gst0Var, b3c0Var, wdk0Var, ctf0Var, dnuVar, poq0Var, h3cVar, kt2Var, zr1Var, bn6Var, jeVar);
                    }
                }
                jf4.n(b1j.i(vy80.class, "Cannot create dependency "));
                return null;
            case 2:
                jh70 jh70Var3 = uy80.W1;
                uy80Var.G0().x(ey80.f8617a);
                return Unit.f46060a;
            default:
                jh70 jh70Var4 = uy80.W1;
                uy80Var.G0().x(dy80.f6881a);
                return Unit.f46060a;
        }
    }
}
