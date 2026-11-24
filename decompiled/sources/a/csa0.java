package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class csa0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4879a;
    public final /* synthetic */ fsa0 b;

    public /* synthetic */ csa0(fsa0 fsa0Var, byte b) {
        this.f4879a = b;
        this.b = fsa0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4879a;
        fsa0 fsa0Var = this.b;
        switch (b) {
            case 0:
                nh70 nh70Var = fsa0.V1;
                ComponentCallbacks2 application = fsa0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(gsa0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof gsa0)) {
                        ze3Var = null;
                    }
                    gsa0 gsa0Var = (gsa0) ze3Var;
                    if (gsa0Var != null) {
                        Long lN = fsa0Var.P1.n(fsa0Var, fsa0.W1[0]);
                        a4n0.f(fsa0Var).getClass();
                        ocl oclVar = gsa0Var.c;
                        knf0 knf0Var = gsa0Var.e;
                        gii0 gii0Var = gsa0Var.d;
                        cad cadVar = gsa0Var.b;
                        ctf0 ctf0Var = gsa0Var.f11821a;
                        xv20 xv20Var = gsa0Var.f;
                        duj dujVar = gsa0Var.g;
                        ugf0 ugf0Var = gsa0Var.h;
                        iw20 iw20Var = gsa0Var.i;
                        sue sueVar = gsa0Var.j;
                        reu reuVar = gsa0Var.k;
                        edo edoVar = gsa0Var.l;
                        zfo zfoVar = gsa0Var.m;
                        j1q0 j1q0Var = gsa0Var.n;
                        rmd0 rmd0Var = gsa0Var.o;
                        iip iipVar = gsa0Var.p;
                        m1e m1eVar = gsa0Var.y;
                        nr00 nr00Var = gsa0Var.q;
                        itr itrVar = gsa0Var.r;
                        y78 y78Var = gsa0Var.s;
                        d1p d1pVar = gsa0Var.t;
                        qoi qoiVar = gsa0Var.u;
                        o2j0 o2j0Var = gsa0Var.v;
                        a1d a1dVar = gsa0Var.w;
                        oeg0 oeg0Var = gsa0Var.x;
                        wdk0 wdk0Var = gsa0Var.z;
                        sueVar.getClass();
                        rmd0Var.getClass();
                        iipVar.getClass();
                        itrVar.getClass();
                        d1pVar.getClass();
                        qoiVar.getClass();
                        o2j0Var.getClass();
                        m1eVar.getClass();
                        xv20Var.getClass();
                        knf0Var.getClass();
                        gii0Var.getClass();
                        ctf0Var.getClass();
                        edoVar.getClass();
                        zfoVar.getClass();
                        j1q0Var.getClass();
                        oeg0Var.getClass();
                        wdk0Var.getClass();
                        return new ooi(cadVar, ugf0Var, iw20Var, sueVar, rmd0Var, iipVar, nr00Var, itrVar, a1dVar, lN, y78Var, m1eVar, oclVar, knf0Var, gii0Var, ctf0Var, dujVar, reuVar, edoVar, zfoVar, j1q0Var, oeg0Var, wdk0Var);
                    }
                }
                jf4.n(b1j.i(gsa0.class, "Cannot create dependency "));
                return null;
            case 1:
                nh70 nh70Var2 = fsa0.V1;
                return new q0h0((noi) ((ooi) fsa0Var.Q1.getValue()).y.get());
            case 2:
                nh70 nh70Var3 = fsa0.V1;
                fsa0Var.G0().x(rra0.f30973a);
                return Unit.f46060a;
            default:
                nh70 nh70Var4 = fsa0.V1;
                fsa0Var.G0().x(yra0.f43112a);
                return Unit.f46060a;
        }
    }
}
