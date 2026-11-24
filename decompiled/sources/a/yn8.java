package a;

import android.javax.sip.message.Response;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yn8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42926a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yn8(long j, List list, boolean z, long j2) {
        this.b = j;
        this.e = list;
        this.c = z;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42926a;
        boolean z = this.c;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                float fFloatValue = ((Number) ((Function0) obj2).invoke()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                float f = fIntBitsToFloat / 2.0f;
                fhl.Q(fhlVar, this.b, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), fIntBitsToFloat, 1, null, Response.TEMPORARILY_UNAVAILABLE);
                if (fFloatValue != 0.0f) {
                    long j = this.d;
                    if (fFloatValue == 1.0f) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                        fhl.Q(fhlVar, j, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), fIntBitsToFloat, 1, null, Response.TEMPORARILY_UNAVAILABLE);
                    } else if (z) {
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                        zcl zclVar = qmk.f28987a;
                        float fW0 = fhlVar.w0(8.0f);
                        float f2 = fIntBitsToFloat5 - (fW0 * 2.0f);
                        if (f2 < fW0) {
                            f2 = fW0;
                        }
                        fhl.Q(fhlVar, j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - ((Number) l1e0.g(Float.valueOf(fFloatValue * fIntBitsToFloat5), new cvc(fW0, f2))).floatValue())) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L), fIntBitsToFloat, 1, null, Response.TEMPORARILY_UNAVAILABLE);
                    } else {
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                        zcl zclVar2 = qmk.f28987a;
                        float fW1 = fhlVar.w0(8.0f);
                        float f3 = fIntBitsToFloat7 - (fW1 * 2.0f);
                        if (f3 < fW1) {
                            f3 = fW1;
                        }
                        fhl.Q(fhlVar, j, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) & 4294967295L), (((long) Float.floatToRawIntBits(((Number) l1e0.g(Float.valueOf(fFloatValue * fIntBitsToFloat7), new cvc(fW1, f3))).floatValue())) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) & 4294967295L), fIntBitsToFloat, 1, null, Response.TEMPORARILY_UNAVAILABLE);
                    }
                }
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                fhl.u(fhlVar2, this.b, 0L, 0L, 0.0f, null, null, 1, 62);
                fhl.r(fhlVar2, new e900((List) obj2, null, 0L, 9187343241974906880L), 0L, 0L, 0.0f, null, null, 15, 62);
                if (z) {
                    float fIntBitsToFloat9 = Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) - (fhlVar2.w0(1.0f) / 2.0f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat9)) & 4294967295L);
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar2.d() >> 32)));
                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat9);
                    fhl.Q(fhlVar2, this.d, jFloatToRawIntBits, (jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & 4294967295L), fhlVar2.w0(1.0f), 0, null, 496);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yn8(Function0 function0, long j, long j2, boolean z) {
        this.e = function0;
        this.b = j;
        this.d = j2;
        this.c = z;
    }
}
