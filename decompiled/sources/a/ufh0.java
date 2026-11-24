package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ufh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35577a;
    public final /* synthetic */ xfh0 b;

    public /* synthetic */ ufh0(xfh0 xfh0Var, byte b) {
        this.f35577a = b;
        this.b = xfh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35577a;
        xfh0 xfh0Var = this.b;
        switch (b) {
            case 0:
                rsi rsiVar = xfh0Var.M1;
                if (rsiVar != null) {
                    return new q0h0(rsiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                zz2 zz2Var = xfh0Var.S1;
                cge0 cge0Var = xfh0.V1;
                ComponentCallbacks2 application = xfh0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(zeh0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof zeh0)) {
                        ze3Var = null;
                    }
                    zeh0 zeh0Var = (zeh0) ze3Var;
                    if (zeh0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(xfh0Var);
                        iiy[] iiyVarArr = xfh0.W1;
                        Integer numN = zz2Var.n(xfh0Var, iiyVarArr[1]);
                        ifh0 ifh0Var = (ifh0) ifh0.d.get(xfh0Var.U1.n(xfh0Var, iiyVarArr[2]).intValue());
                        LinkedHashMap linkedHashMap = xnk0.f41174a;
                        String strB = xnk0.b(zz2Var.n(xfh0Var, iiyVarArr[1]).intValue(), efx.v(xfh0Var).f4046a);
                        Application application2 = xfh0Var.n0().getApplication();
                        application2.getClass();
                        cui cuiVarC = xnk0.c(application2, strB);
                        i1w0VarF.getClass();
                        ifh0Var.getClass();
                        itr itrVar = zeh0Var.n;
                        zx10 zx10Var = zeh0Var.o;
                        cad cadVar = zeh0Var.f44252a;
                        d1p d1pVar = zeh0Var.b;
                        yo4 yo4Var = zeh0Var.c;
                        iip iipVar = zeh0Var.d;
                        zfo zfoVar = zeh0Var.e;
                        edo edoVar = zeh0Var.f;
                        sjl0 sjl0Var = zeh0Var.g;
                        knf0 knf0Var = zeh0Var.h;
                        gii0 gii0Var = zeh0Var.i;
                        m1e m1eVar = zeh0Var.j;
                        gst0 gst0Var = zeh0Var.k;
                        btt0 btt0Var = zeh0Var.l;
                        b3c0 b3c0Var = zeh0Var.m;
                        iw20 iw20Var = zeh0Var.p;
                        y78 y78Var = zeh0Var.q;
                        ctf0 ctf0Var = zeh0Var.r;
                        j1q0 j1q0Var = zeh0Var.s;
                        g2v g2vVar = zeh0Var.t;
                        ugf0 ugf0Var = zeh0Var.u;
                        wdk0 wdk0Var = zeh0Var.v;
                        r9u r9uVar = zeh0Var.w;
                        bzt bztVar = zeh0Var.x;
                        ewk ewkVar = zeh0Var.y;
                        itrVar.getClass();
                        d1pVar.getClass();
                        iipVar.getClass();
                        zfoVar.getClass();
                        edoVar.getClass();
                        sjl0Var.getClass();
                        knf0Var.getClass();
                        gii0Var.getClass();
                        m1eVar.getClass();
                        gst0Var.getClass();
                        btt0Var.getClass();
                        b3c0Var.getClass();
                        ctf0Var.getClass();
                        j1q0Var.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        ewkVar.getClass();
                        return new ssi(itrVar, zx10Var, cadVar, d1pVar, iipVar, iw20Var, cuiVarC, ugf0Var, numN, i1w0VarF, yo4Var, sjl0Var, m1eVar, y78Var, ctf0Var, g2vVar, wdk0Var, ifh0Var, r9uVar, bztVar, ewkVar);
                    }
                }
                jf4.n(b1j.i(zeh0.class, "Cannot create dependency "));
                return null;
            case 2:
                cge0 cge0Var2 = xfh0.V1;
                xfh0Var.G0().x(peh0.f26853a);
                return Unit.f46060a;
            case 3:
                cge0 cge0Var3 = xfh0.V1;
                xfh0Var.G0().x(meh0.f21645a);
                return Unit.f46060a;
            default:
                cge0 cge0Var4 = xfh0.V1;
                xfh0Var.G0().x(ueh0.f35528a);
                return Unit.f46060a;
        }
    }
}
