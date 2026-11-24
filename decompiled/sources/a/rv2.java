package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rv2 {
    public final pz40 c;
    public final pz40 d;
    public final agk0 g;
    public final pz40 h;
    public final pz40 i;
    public final nv2 j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xd2 f31150a = new xd2(24);
    public final g050 b = new g050();
    public final zbk e = jgk0.b(new st2(this, 4));
    public final agk0 f = androidx.compose.runtime.e.a(Float.NaN);

    public rv2(vtj vtjVar, Object obj) {
        this.c = androidx.compose.runtime.e.e(obj);
        this.d = androidx.compose.runtime.e.e(obj);
        new a14(0);
        xfk0.h().g();
        v960.f37020a.getClass();
        this.g = androidx.compose.runtime.e.a(0.0f);
        this.h = androidx.compose.runtime.e.e(null);
        pz40 pz40VarE = androidx.compose.runtime.e.e(new vtj(iun.f15405a, new float[0]));
        this.i = pz40VarE;
        this.j = new nv2(this);
        ((hgk0) pz40VarE).setValue(vtjVar);
        h(obj);
    }

    public static Object b(rv2 rv2Var, xdr xdrVar, zje zjeVar) {
        c050 c050Var = c050.f3507a;
        g050 g050Var = rv2Var.b;
        yje yjeVar = null;
        za zaVar = new za(rv2Var, xdrVar, yjeVar, (byte) 13);
        g050Var.getClass();
        Object objJ = d5c.J(zjeVar, new lpp(c050Var, g050Var, zaVar, yjeVar, (byte) 4));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, c050 c050Var, ydr ydrVar, yje yjeVar) {
        lv2 lv2Var;
        if (yjeVar instanceof lv2) {
            lv2Var = (lv2) yjeVar;
            int i = lv2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lv2Var.k = i - Integer.MIN_VALUE;
            } else {
                lv2Var = new lv2(this, yjeVar);
            }
        } else {
            lv2Var = new lv2(this, yjeVar);
        }
        Object obj2 = lv2Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lv2Var.k;
        pz40 pz40Var = this.h;
        yje yjeVar2 = null;
        try {
            if (i2 == 0) {
                z1x.P(obj2);
                if (d().f38010a.indexOf(obj) != -1) {
                    g050 g050Var = this.b;
                    xg0 xg0Var = new xg0(this, obj, ydrVar, yjeVar2, (byte) 2);
                    lv2Var.k = 1;
                    g050Var.getClass();
                    if (d5c.J(lv2Var, new lpp(c050Var, g050Var, xg0Var, yjeVar2, (byte) 4)) == wneVar) {
                        return wneVar;
                    }
                } else {
                    ((hgk0) this.d).setValue(obj);
                    ((hgk0) this.c).setValue(obj);
                }
                return Unit.f46060a;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
            pz40Var = (hgk0) pz40Var;
            pz40Var.setValue(null);
            return Unit.f46060a;
        } catch (Throwable th) {
            ((hgk0) pz40Var).setValue(null);
            throw th;
        }
    }

    public final float c(float f) {
        float fE = e(f);
        float f2 = fE - f();
        this.j.a(fE, 0.0f);
        return f2;
    }

    public final vtj d() {
        return (vtj) ((hgk0) this.i).getValue();
    }

    public final float e(float f) {
        float f2;
        agk0 agk0Var = this.f;
        float fL = (Float.isNaN(agk0Var.l()) ? 0.0f : agk0Var.l()) + f;
        float fC = d().c();
        float[] fArr = d().b;
        if (fArr.length == 0) {
            f2 = Float.NaN;
        } else {
            float fMax = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMax = Math.max(fMax, fArr[i]);
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            f2 = fMax;
        }
        return l1e0.c(fL, fC, f2);
    }

    public final float f() {
        agk0 agk0Var = this.f;
        if (Float.isNaN(agk0Var.l())) {
            adx.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return agk0Var.l();
    }

    public final Object g(uts0 uts0Var, zje zjeVar) {
        Object value = ((hgk0) this.c).getValue();
        Object objA = d().a(f());
        if (objA != null) {
            Object objC = dv2.c(this, objA, uts0Var, zjeVar);
            return objC == wne.f39444a ? objC : Unit.f46060a;
        }
        Object objC2 = dv2.c(this, value, uts0Var, zjeVar);
        return objC2 == wne.f39444a ? objC2 : Unit.f46060a;
    }

    public final boolean h(Object obj) {
        g050 g050Var = this.b;
        k050 k050Var = g050Var.b;
        k050 k050Var2 = g050Var.b;
        boolean zG = k050Var.g();
        if (!zG) {
            return zG;
        }
        try {
            nv2 nv2Var = this.j;
            float fD = d().d(obj);
            if (!Float.isNaN(fD)) {
                nv2Var.a(fD, 0.0f);
                ((hgk0) this.h).setValue(null);
            }
            ((hgk0) this.c).setValue(obj);
            ((hgk0) this.d).setValue(obj);
            return zG;
        } finally {
            k050Var2.c(null);
        }
    }

    public final void i(vtj vtjVar, Object obj) {
        if (Intrinsics.d(d(), vtjVar)) {
            return;
        }
        ((hgk0) this.i).setValue(vtjVar);
        if (h(obj)) {
            return;
        }
        ((hgk0) this.h).setValue(obj);
    }
}
