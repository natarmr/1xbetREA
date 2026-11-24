package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class spj0 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xpj0 f32595a;
    public final /* synthetic */ Function1 b;

    public spj0(xpj0 xpj0Var, Function1 function1) {
        ma80 ma80Var = ma80.f21447a;
        this.f32595a = xpj0Var;
        this.b = function1;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        ma80 ma80Var = ma80.f21447a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        qv2 qv2Var = this.f32595a.e;
        float fU = qv2Var.u(fIntBitsToFloat);
        agk0 agk0Var = (agk0) qv2Var.l;
        float fL = Float.isNaN(agk0Var.l()) ? 0.0f : agk0Var.l();
        agk0Var.m(fU);
        return a(fU - fL);
    }

    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        ma80 ma80Var = ma80.f21447a;
        float fC = g6u0.c(j);
        xpj0 xpj0Var = this.f32595a;
        float fV = xpj0Var.e.v();
        float fC2 = xpj0Var.e.j().c();
        if (fC >= 0.0f || fV <= fC2) {
            j = 0;
        } else {
            this.b.invoke(new Float(fC));
        }
        return new g6u0(j);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        qv2 qv2Var = this.f32595a.e;
        ma80 ma80Var = ma80.f21447a;
        float fU = qv2Var.u(Float.intBitsToFloat((int) (4294967295L & j2)));
        agk0 agk0Var = (agk0) qv2Var.l;
        float fL = Float.isNaN(agk0Var.l()) ? 0.0f : agk0Var.l();
        agk0Var.m(fU);
        return a(fU - fL);
    }

    public final long a(float f) {
        ma80 ma80Var = ma80.f21447a;
        ma80 ma80Var2 = ma80.f21447a;
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        ma80 ma80Var = ma80.f21447a;
        this.b.invoke(new Float(g6u0.c(j2)));
        return new g6u0(j2);
    }
}
