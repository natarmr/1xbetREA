package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class icd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14531a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ icd(long j, Function2 function2, byte b) {
        this.f14531a = b;
        this.b = j;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float fValueOf;
        byte b = this.f14531a;
        Function2 function2 = this.c;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                fValueOf = function2 != null ? Float.valueOf(fhlVar.w0(8.0f)) : null;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fValueOf != null ? fValueOf.floatValue() : 0.0f)) & 4294967295L);
                float fW0 = fhlVar.w0(16.0f);
                fhl.o0(fhlVar, this.b, jFloatToRawIntBits, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 244);
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar2 = qmk.f28987a;
                fValueOf = function2 != null ? Float.valueOf(fhlVar2.w0(8.0f)) : null;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fValueOf != null ? fValueOf.floatValue() : 0.0f)) & 4294967295L);
                float fW1 = fhlVar2.w0(16.0f);
                fhl.o0(fhlVar2, this.b, jFloatToRawIntBits2, 0L, (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), null, 244);
                break;
        }
        return Unit.f46060a;
    }
}
