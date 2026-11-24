package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pu2 implements ffk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv2 f27592a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ nc c;

    public pu2(rv2 rv2Var, Function1 function1, nc ncVar) {
        this.f27592a = rv2Var;
        this.b = function1;
        this.c = ncVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    @Override // a.ffk0
    public final float a(float f) {
        Object objB;
        rv2 rv2Var = this.f27592a;
        float f2 = rv2Var.f();
        vtj vtjVarD = rv2Var.d();
        if (Float.isNaN(f2)) {
            jf4.o("The offset provided to computeTarget must not be NaN.");
            return 0.0f;
        }
        boolean z = Math.abs(f) > 0.0f;
        boolean z2 = z && f > 0.0f;
        if (!z) {
            objB = vtjVarD.a(f2);
            objB.getClass();
        } else if (Math.abs(f) >= Math.abs(((Number) this.c.invoke()).floatValue())) {
            objB = vtjVarD.b(f2, z2);
            objB.getClass();
        } else {
            Object objB2 = vtjVarD.b(f2, false);
            objB2.getClass();
            float fD = vtjVarD.d(objB2);
            Object objB3 = vtjVarD.b(f2, true);
            objB3.getClass();
            float fD2 = vtjVarD.d(objB3);
            float fAbs = Math.abs(((Number) this.b.invoke(Float.valueOf(Math.abs(fD - fD2)))).floatValue());
            if (!z2) {
                fD = fD2;
            }
            boolean z3 = Math.abs(fD - f2) >= fAbs;
            if (z3) {
                if (z2) {
                    objB = objB3;
                } else {
                    objB = objB2;
                }
            } else {
                if (z3) {
                    t9f.b();
                    return 0.0f;
                }
                if (z2) {
                    objB = objB2;
                } else {
                    objB = objB3;
                }
            }
        }
        return rv2Var.d().d(objB) - f2;
    }

    @Override // a.ffk0
    public final float b(float f, float f2) {
        return 0.0f;
    }
}
