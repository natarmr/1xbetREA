package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class pga0 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f26944a;
    public final /* synthetic */ ppj0 b;

    public pga0(Function0 function0, ppj0 ppj0Var) {
        this.f26944a = function0;
        this.b = ppj0Var;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        ppj0 ppj0Var = this.b;
        if (fIntBitsToFloat > 0.0f && ((Boolean) this.f26944a.invoke()).booleanValue()) {
            float fA = ppj0Var.a(Float.intBitsToFloat(i2));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        } else {
            if (Float.intBitsToFloat(i2) >= 0.0f || ((Number) ppj0Var.f27378a.d()).floatValue() <= ppj0Var.c.l()) {
                return 0L;
            }
            float fA2 = ppj0Var.a(Float.intBitsToFloat(i2));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fA2);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }

    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        float fC = g6u0.c(j);
        yje yjeVar2 = null;
        ppj0 ppj0Var = this.b;
        if (fC > 0.0f && ((Boolean) this.f26944a.invoke()).booleanValue()) {
            qjj.W(ppj0Var.b, null, null, new npj0(ppj0Var, yjeVar2, (byte) 0), 3);
        } else if (g6u0.c(j) >= 0.0f || ((Number) ppj0Var.f27378a.d()).floatValue() <= ppj0Var.c.l()) {
            j = 0;
        } else {
            qjj.W(ppj0Var.b, null, null, new npj0(ppj0Var, yjeVar2, (byte) 1), 3);
        }
        return new g6u0(j);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        return 0L;
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        if (g6u0.c(j) != 0.0f || g6u0.c(j2) != 0.0f) {
            this.b.b();
        }
        return new g6u0(0L);
    }
}
