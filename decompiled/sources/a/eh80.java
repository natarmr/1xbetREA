package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class eh80 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7796a;
    public final xcz b;
    public final Function1 c;
    public final Function1 d;
    public final agk0 e;

    public eh80(float f, float f2, xcz xczVar, Function1 function1, Function1 function2) {
        xczVar.getClass();
        this.f7796a = f2;
        this.b = xczVar;
        this.c = function1;
        this.d = function2;
        this.e = androidx.compose.runtime.e.a(f);
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        agk0 agk0Var = this.e;
        if (fIntBitsToFloat > 0.0f) {
            xcz xczVar = this.b;
            if (xczVar.h() != 0 || xczVar.i() != 0) {
                return 0L;
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) + agk0Var.l();
            float f = this.f7796a;
            if (fIntBitsToFloat2 > f) {
                fIntBitsToFloat2 = f;
            }
            float fL = fIntBitsToFloat2 - agk0Var.l();
            if (fL <= 0.0f) {
                return 0L;
            }
            a(fIntBitsToFloat2);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fL);
        } else {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i2) + agk0Var.l();
            if (fIntBitsToFloat3 < 0.0f) {
                fIntBitsToFloat3 = 0.0f;
            }
            float fL2 = agk0Var.l() - fIntBitsToFloat3;
            if (fL2 <= 0.0f) {
                return 0L;
            }
            a(fIntBitsToFloat3);
            if (agk0Var.l() > 0.0f) {
                return j;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fL2);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0L;
        }
        xcz xczVar = this.b;
        if (xczVar.h() != 0 || xczVar.i() != 0) {
            return 0L;
        }
        agk0 agk0Var = this.e;
        float fIntBitsToFloat = Float.intBitsToFloat(i2) + agk0Var.l();
        float f = this.f7796a;
        if (fIntBitsToFloat > f) {
            fIntBitsToFloat = f;
        }
        float fL = fIntBitsToFloat - agk0Var.l();
        a(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(fL)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final void a(float f) {
        this.e.m(f);
        this.c.invoke(Float.valueOf(f));
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        float fC = g6u0.c(j2);
        Function1 function1 = this.d;
        float f = this.f7796a;
        if (fC > 0.0f) {
            function1.invoke(kfk0.f18200a);
            a(f);
        } else {
            boolean z = this.e.l() > f / 2.0f;
            function1.invoke(z ? kfk0.f18200a : kfk0.b);
            a(z ? f : 0.0f);
        }
        return new g6u0(0L);
    }
}
