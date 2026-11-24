package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hp8 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vtj f13430a;
    public final /* synthetic */ rv2 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function2 d;

    public hp8(rv2 rv2Var, l7m0 l7m0Var, Function2 function2) {
        this.b = rv2Var;
        this.c = l7m0Var;
        this.d = function2;
        this.f13430a = rv2Var.d();
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z = fIntBitsToFloat > 0.0f;
        boolean z2 = fIntBitsToFloat < 0.0f;
        rv2 rv2Var = this.b;
        boolean z3 = rv2Var.f.l() > this.f13430a.d(pt2.c);
        if (z2 && i == 1 && z3) {
            rv2Var.c(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        } else {
            if (!z || i != 1 || !((Boolean) this.c.getValue()).booleanValue()) {
                return 0L;
            }
            rv2Var.c(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        gp8 gp8Var;
        if (yjeVar instanceof gp8) {
            gp8Var = (gp8) yjeVar;
            int i = gp8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gp8Var.l = i - Integer.MIN_VALUE;
            } else {
                gp8Var = new gp8(this, (zje) yjeVar);
            }
        } else {
            gp8Var = new gp8(this, (zje) yjeVar);
        }
        Object obj = gp8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = gp8Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            float fC = g6u0.c(j);
            rv2 rv2Var = this.b;
            float f = rv2Var.f();
            float fC2 = rv2Var.d().c();
            if (fC >= 0.0f || f <= fC2) {
                j = 0;
            } else {
                Float f2 = new Float(fC);
                gp8Var.i = j;
                gp8Var.l = 1;
                if (this.d.invoke(f2, gp8Var) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = gp8Var.i;
            z1x.P(obj);
        }
        return new g6u0(j);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        this.b.c(Float.intBitsToFloat(i2));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        fp8 fp8Var;
        if (zjeVar instanceof fp8) {
            fp8Var = (fp8) zjeVar;
            int i = fp8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp8Var.l = i - Integer.MIN_VALUE;
            } else {
                fp8Var = new fp8(this, zjeVar);
            }
        } else {
            fp8Var = new fp8(this, zjeVar);
        }
        Object obj = fp8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fp8Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            Float f = new Float(g6u0.c(j2));
            fp8Var.i = j2;
            fp8Var.l = 1;
            if (this.d.invoke(f, fp8Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = fp8Var.i;
            z1x.P(obj);
        }
        return new g6u0(j2);
    }
}
