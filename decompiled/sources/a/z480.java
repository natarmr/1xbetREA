package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class z480 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f43757a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public z480(pz40 pz40Var, long j, long j2) {
        this.f43757a = pz40Var;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pi9 pi9Var = (pi9) obj;
        pi9Var.getClass();
        v12 v12Var = ((q380) this.f43757a.getValue()).f;
        zcl zclVar = qmk.f28987a;
        float density = pi9Var.getDensity() * 16.0f;
        float density2 = pi9Var.getDensity() * 1.0f;
        float density3 = pi9Var.getDensity() * 56.0f;
        w03 w03VarA = z03.a();
        float f = (v12Var == v12.f36608a || v12Var == v12.d) ? density : 0.0f;
        if (v12Var != v12.c && v12Var != v12.d) {
            density = 0.0f;
        }
        float f2 = density;
        w03.b(w03VarA, r8x.u(k9x.r(0L, pi9Var.f27033a.d()), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L)));
        return pi9Var.a(new y480(w03VarA, this.b, v12Var, this.c, density3, density2));
    }
}
