package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u9c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35277a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    public /* synthetic */ u9c(float f, long j, long j2) {
        this.f35277a = (byte) 0;
        this.c = f;
        this.b = j;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float fIntBitsToFloat4;
        float fIntBitsToFloat5;
        float fIntBitsToFloat6;
        byte b = this.f35277a;
        float f = this.c;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                int i = ((int) (fIntBitsToFloat7 / f)) + 1;
                int i2 = ((int) (fIntBitsToFloat8 / f)) + 1;
                fhl.u(fhlVar, this.b, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) & 4294967295L), 0.0f, null, null, 0, 120);
                for (int i3 = 0; i3 < i2; i3++) {
                    for (int i4 = 0; i4 < i; i4++) {
                        if ((i3 + i4) % 2 == 0) {
                            fhl.u(fhlVar, this.d, (((long) Float.floatToRawIntBits(i4 * f)) << 32) | (((long) Float.floatToRawIntBits(i3 * f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, null, 0, 120);
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar2.w0(360.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                float fW1 = fhlVar2.w0(1.0f);
                fhl.o0(fhlVar2, this.b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) - fW1) / 2.0f)) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar2.d() >> 32))) << 32) | (Float.floatToRawIntBits(fW1) & 4294967295L), jFloatToRawIntBits, null, 240);
                float fIntBitsToFloat9 = Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) * f;
                int iOrdinal = fhlVar2.getLayoutDirection().ordinal();
                if (iOrdinal == 0) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) - fIntBitsToFloat9;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    fIntBitsToFloat = 0.0f;
                }
                fhl.o0(fhlVar2, this.d, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat9)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L))))), jFloatToRawIntBits, null, 240);
                return Unit.f46060a;
            case 2:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                zcl zclVar2 = qmk.f28987a;
                float fW2 = fhlVar3.w0(360.0f);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
                fhl.o0(fhlVar3, this.b, 0L, 0L, jFloatToRawIntBits2, null, 246);
                float fIntBitsToFloat10 = Float.intBitsToFloat((int) (fhlVar3.d() >> 32)) * f;
                int iOrdinal2 = fhlVar3.getLayoutDirection().ordinal();
                if (iOrdinal2 == 0) {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar3.d() >> 32)) - fIntBitsToFloat10;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    fIntBitsToFloat2 = 0.0f;
                }
                fhl.o0(fhlVar3, this.d, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar3.d() & 4294967295L))))), jFloatToRawIntBits2, null, 240);
                return Unit.f46060a;
            case 3:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                zcl zclVar3 = qmk.f28987a;
                float fW3 = fhlVar4.w0(360.0f);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fW3)) << 32) | (((long) Float.floatToRawIntBits(fW3)) & 4294967295L);
                fhl.o0(fhlVar4, this.b, 0L, 0L, jFloatToRawIntBits3, null, 246);
                float fIntBitsToFloat11 = Float.intBitsToFloat((int) (fhlVar4.d() >> 32)) * f;
                int iOrdinal3 = fhlVar4.getLayoutDirection().ordinal();
                if (iOrdinal3 == 0) {
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar4.d() >> 32)) - fIntBitsToFloat11;
                } else {
                    if (iOrdinal3 != 1) {
                        t9f.b();
                        return null;
                    }
                    fIntBitsToFloat3 = 0.0f;
                }
                fhl.o0(fhlVar4, this.d, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar4.d() & 4294967295L))))), jFloatToRawIntBits3, null, 240);
                return Unit.f46060a;
            case 4:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                zcl zclVar4 = qmk.f28987a;
                float fW4 = fhlVar5.w0(360.0f);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fW4)) << 32) | (((long) Float.floatToRawIntBits(fW4)) & 4294967295L);
                fhl.o0(fhlVar5, this.b, 0L, 0L, jFloatToRawIntBits4, null, 246);
                float fIntBitsToFloat12 = Float.intBitsToFloat((int) (fhlVar5.d() >> 32)) * f;
                int iOrdinal4 = fhlVar5.getLayoutDirection().ordinal();
                if (iOrdinal4 == 0) {
                    fIntBitsToFloat4 = 0.0f;
                } else {
                    if (iOrdinal4 != 1) {
                        t9f.b();
                        return null;
                    }
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (fhlVar5.d() >> 32)) - fIntBitsToFloat12;
                }
                fhl.o0(fhlVar5, this.d, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat12)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar5.d() & 4294967295L))))), jFloatToRawIntBits4, null, 240);
                return Unit.f46060a;
            case 5:
                fhl fhlVar6 = (fhl) obj;
                fhlVar6.getClass();
                zcl zclVar5 = qmk.f28987a;
                float fW5 = fhlVar6.w0(360.0f);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fW5)) << 32) | (((long) Float.floatToRawIntBits(fW5)) & 4294967295L);
                fhl.o0(fhlVar6, this.b, 0L, 0L, jFloatToRawIntBits5, null, 246);
                float fIntBitsToFloat13 = Float.intBitsToFloat((int) (fhlVar6.d() >> 32)) * f;
                int iOrdinal5 = fhlVar6.getLayoutDirection().ordinal();
                if (iOrdinal5 == 0) {
                    fIntBitsToFloat5 = 0.0f;
                } else {
                    if (iOrdinal5 != 1) {
                        t9f.b();
                        return null;
                    }
                    fIntBitsToFloat5 = Float.intBitsToFloat((int) (fhlVar6.d() >> 32)) - fIntBitsToFloat13;
                }
                fhl.o0(fhlVar6, this.d, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar6.d() & 4294967295L))))), jFloatToRawIntBits5, null, 240);
                return Unit.f46060a;
            default:
                fhl fhlVar7 = (fhl) obj;
                fhlVar7.getClass();
                zcl zclVar6 = qmk.f28987a;
                float fW6 = fhlVar7.w0(360.0f);
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fW6)) << 32) | (((long) Float.floatToRawIntBits(fW6)) & 4294967295L);
                float fW7 = fhlVar7.w0(1.0f);
                fhl.o0(fhlVar7, this.b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar7.d() & 4294967295L)) - fW7) / 2.0f)) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar7.d() >> 32))) << 32) | (Float.floatToRawIntBits(fW7) & 4294967295L), jFloatToRawIntBits6, null, 240);
                float fIntBitsToFloat14 = Float.intBitsToFloat((int) (fhlVar7.d() >> 32)) * f;
                int iOrdinal6 = fhlVar7.getLayoutDirection().ordinal();
                if (iOrdinal6 == 0) {
                    fIntBitsToFloat6 = 0.0f;
                } else {
                    if (iOrdinal6 != 1) {
                        t9f.b();
                        return null;
                    }
                    fIntBitsToFloat6 = Float.intBitsToFloat((int) (fhlVar7.d() >> 32)) - fIntBitsToFloat14;
                }
                fhl.o0(fhlVar7, this.d, (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat14)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar7.d() & 4294967295L)))) & 4294967295L), jFloatToRawIntBits6, null, 240);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ u9c(long j, float f, long j2, byte b) {
        this.f35277a = b;
        this.b = j;
        this.c = f;
        this.d = j2;
    }
}
