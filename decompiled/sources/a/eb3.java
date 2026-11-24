package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class eb3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7500a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ eb3(l7m0 l7m0Var, byte b) {
        this.f7500a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7500a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 1:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 2:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 3:
                uag0 uag0Var4 = (uag0) obj;
                uag0Var4.getClass();
                uag0Var4.I(-((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 4:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                Float fValueOf = Float.valueOf(fIntBitsToFloat);
                if (fIntBitsToFloat <= 0.0f) {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                Float fValueOf2 = fIntBitsToFloat2 > 0.0f ? Float.valueOf(fIntBitsToFloat2) : null;
                float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 1.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f * fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fFloatValue2)) & 4294967295L);
                float fSqrt = ((float) Math.sqrt(((float) Math.pow(fFloatValue, 2.0d)) + ((float) Math.pow(fFloatValue2, 2.0d)))) / 2.0f;
                pz40 pz40Var = s6t0.f31722a;
                fhl.r(fhlVar, new ttd0(q3d.j(new y3d(hi0.W), new y3d(hi0.b)), jFloatToRawIntBits, fSqrt), 0L, 0L, 1.0f - ((Number) l7m0Var.getValue()).floatValue(), null, null, 0, 118);
                return Unit.f46060a;
            case 5:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(fhlVar2, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, ((Number) l7m0Var.getValue()).floatValue(), null, null, 0, 118);
                return Unit.f46060a;
            case 6:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                return pi9Var.a(new eb3(l7m0Var, (byte) 5));
            case 7:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                fhl.E(fhlVar3, ((y3d) l7m0Var.getValue()).f41946a, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 8:
                uag0 uag0Var5 = (uag0) obj;
                uag0Var5.getClass();
                uag0Var5.b(((Number) l7m0Var.getValue()).floatValue() < 0.5f ? 1.0f - l1e0.c(((Number) l7m0Var.getValue()).floatValue() / 0.5f, 0.0f, 1.0f) : l1e0.c(((Number) l7m0Var.getValue()).floatValue() / 0.5f, 0.0f, 1.0f));
                return Unit.f46060a;
            case 9:
                uag0 uag0Var6 = (uag0) obj;
                uag0Var6.getClass();
                uag0Var6.b(l1e0.c((((Number) l7m0Var.getValue()).floatValue() - 0.5f) / 0.5f, 0.0f, 1.0f));
                return Unit.f46060a;
            case 10:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                fhl.E(fhlVar4, ((y3d) l7m0Var.getValue()).f41946a, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 11:
                uag0 uag0Var7 = (uag0) obj;
                uag0Var7.getClass();
                uag0Var7.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 12:
                uag0 uag0Var8 = (uag0) obj;
                uag0Var8.getClass();
                uag0Var8.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            default:
                uag0 uag0Var9 = (uag0) obj;
                uag0Var9.getClass();
                uag0Var9.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
        }
    }
}
