package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wwk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39889a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ wwk(float f, long j, byte b) {
        this.f39889a = b;
        this.b = f;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39889a;
        float f = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                float fW0 = fhlVar.w0(f);
                fhl.Q(fhlVar, this.c, (((long) Float.floatToRawIntBits(fhlVar.w0(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fhlVar.w0(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)))) & 4294967295L), fW0, 0, null, 496);
                return Unit.f46060a;
            case 1:
                fhl fhlVar2 = (fhl) obj;
                float fW1 = fhlVar2.w0(f);
                fhl.Q(fhlVar2, this.c, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fhlVar2.w0(f) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar2.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fhlVar2.w0(f) / 2.0f)) & 4294967295L), fW1, 0, null, 496);
                return Unit.f46060a;
            case 2:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                float fW2 = fhlVar3.w0(f);
                fhl.o0(fhlVar3, this.c, (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar3.d() & 4294967295L)) - (fhlVar3.w0(f) * 2.0f)))) | (Float.floatToRawIntBits(0.0f) << 32), h7k0.a(fhlVar3.d(), 0.0f, fhlVar3.w0(1.0f) + (fhlVar3.w0(f) * 2.0f), 1), (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L), null, 240);
                return Unit.f46060a;
            default:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                float density = pi9Var.getDensity() * f;
                return pi9Var.a(new lf4((byte) 7, this.c, (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L)));
        }
    }
}
