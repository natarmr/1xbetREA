package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class glw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11516a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ glw(float f, long j, long j2, boolean z, t33 t33Var, t33 t33Var2) {
        this.c = f;
        this.d = j;
        this.e = j2;
        this.b = z;
        this.f = t33Var;
        this.g = t33Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11516a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        float fS0 = this.c;
        switch (b) {
            case 0:
                final t33 t33Var = (t33) obj3;
                final t33 t33Var2 = (t33) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                final float density = fS0 * pi9Var.getDensity();
                long j = this.d;
                y3d y3dVar = new y3d(j);
                long j2 = this.e;
                final List listJ = q3d.j(y3dVar, new y3d(j2));
                final List listJ2 = q3d.j(new y3d(j2), new y3d(j));
                final boolean z = this.b;
                return pi9Var.a(new Function1() { // from class: a.ilw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        fhl fhlVar = (fhl) obj4;
                        fhlVar.getClass();
                        boolean z2 = z;
                        float fIntBitsToFloat = z2 ? Float.intBitsToFloat((int) (fhlVar.d() >> 32)) : 0.0f;
                        float f = density;
                        fhl.r(fhlVar, yk5.g(listJ, fIntBitsToFloat, z2 ? Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - f : f, 8), 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32), ((Number) t33Var.d()).floatValue(), null, null, 0, 114);
                        e900 e900VarG = yk5.g(listJ2, z2 ? f : Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - f, z2 ? 0.0f : Float.intBitsToFloat((int) (fhlVar.d() >> 32)), 8);
                        fhl.r(fhlVar, e900VarG, (((long) Float.floatToRawIntBits(z2 ? 0.0f : Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)))) & 4294967295L), ((Number) t33Var2.d()).floatValue(), null, null, 0, 112);
                        return Unit.f46060a;
                    }
                });
            default:
                Function0 function0 = (Function0) obj3;
                Function1 function1 = (Function1) obj2;
                fhl fhlVar = (fhl) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                boolean z2 = this.b;
                if (z2 && Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (fhlVar.d() >> 32))) {
                    fS0 += fhlVar.s0(fIntBitsToFloat);
                }
                float fS1 = fS0 / fhlVar.s0(Float.intBitsToFloat((int) (fhlVar.d() >> 32)));
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                float fMin = Math.min(fFloatValue, fS1) + fFloatValue;
                if (fMin <= 1.0f) {
                    p3c0.e(fhlVar, fMin, 1.0f, this.d, fIntBitsToFloat, z2 ? 1 : 0);
                }
                p3c0.e(fhlVar, 0.0f, fFloatValue, this.e, fIntBitsToFloat, z2 ? 1 : 0);
                function1.invoke(fhlVar);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ glw(int i, float f, Function0 function0, long j, long j2, Function1 function1) {
        this.b = i;
        this.c = f;
        this.f = function0;
        this.d = j;
        this.e = j2;
        this.g = function1;
    }
}
