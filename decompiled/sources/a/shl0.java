package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class shl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32218a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ shl0(l7m0 l7m0Var, long j, long j2, long j3, byte b) {
        this.f32218a = b;
        this.b = l7m0Var;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32218a;
        long j = this.d;
        long j2 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(14.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                fhl.o0(fhlVar, ((Boolean) l7m0Var.getValue()).booleanValue() ? j2 : j, 0L, fhlVar.d(), jFloatToRawIntBits, null, 242);
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    float fW1 = fhlVar.w0(1.0f);
                    float f = fW1 / 2.0f;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fW1;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - fW1;
                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat);
                    fhl.o0(fhlVar, this.e, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits3 << 32), jFloatToRawIntBits, new vtm0(fW1, 0.0f, 0, 0, null, 30), 224);
                }
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar2 = qmk.f28987a;
                float fW2 = fhlVar2.w0(10.0f);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
                fhl.o0(fhlVar2, ((Boolean) l7m0Var.getValue()).booleanValue() ? j2 : j, 0L, fhlVar2.d(), jFloatToRawIntBits4, null, 242);
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    float fW3 = fhlVar2.w0(1.0f);
                    float f2 = fW3 / 2.0f;
                    fhl.o0(fhlVar2, this.e, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) - fW3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) - fW3)) & 4294967295L), jFloatToRawIntBits4, new vtm0(fW3, 0.0f, 0, 0, null, 30), 224);
                }
                break;
        }
        return Unit.f46060a;
    }
}
