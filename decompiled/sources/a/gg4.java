package a;

import android.javax.sip.message.Response;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11235a;
    public final /* synthetic */ List b;

    public /* synthetic */ gg4(List list, byte b) {
        this.f11235a = b;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0205  */
    /* JADX WARN: Code duplicated, block: B:45:0x021c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x021e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0230  */
    /* JADX WARN: Code duplicated, block: B:50:0x0246  */
    /* JADX WARN: Code duplicated, block: B:52:0x025a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        long j;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long j2;
        long jFloatToRawIntBits2;
        long jFloatToRawIntBits3;
        long jFloatToRawIntBits4;
        int iFloatToRawIntBits2;
        long jFloatToRawIntBits5;
        long jFloatToRawIntBits6;
        int iFloatToRawIntBits3;
        byte b = this.f11235a;
        byte b2 = 2;
        byte b3 = 1;
        List list = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                rek0 rek0Var = ig4.O1;
                fhlVar.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fhl.r(fhlVar, (t89) it.next(), 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.f46060a;
            case 1:
                return list.get(((Integer) obj).intValue());
            case 2:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                if (list.size() >= 2) {
                    zcl zclVar = qmk.f28987a;
                    float fW0 = fhlVar2.w0(2.0f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) / 3.0f;
                    int iIntValue = ((Number) CollectionsKt.U(list)).intValue();
                    int iIntValue2 = ((Number) CollectionsKt.d0(list)).intValue();
                    int i = iIntValue / 3;
                    int i2 = iIntValue % 3;
                    int i3 = iIntValue2 / 3;
                    int i4 = iIntValue2 % 3;
                    if (i == i3) {
                        f = 0.5f;
                        j = 4294967295L;
                        jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((i2 * fIntBitsToFloat) + fW0)) << 32;
                        jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits((fIntBitsToFloat * 0.5f) + (i * fIntBitsToFloat))) & 4294967295L;
                    } else {
                        f = 0.5f;
                        j = 4294967295L;
                        if (i2 == i4) {
                            jFloatToRawIntBits2 = Float.floatToRawIntBits((fIntBitsToFloat * 0.5f) + (i2 * fIntBitsToFloat)) << 32;
                            jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits((i * fIntBitsToFloat) + fW0)) & 4294967295L;
                        } else {
                            if (i2 < i4) {
                                jFloatToRawIntBits = Float.floatToRawIntBits((i2 * fIntBitsToFloat) + fW0);
                                iFloatToRawIntBits = Float.floatToRawIntBits((i * fIntBitsToFloat) + fW0);
                            } else {
                                jFloatToRawIntBits = Float.floatToRawIntBits(((i2 * fIntBitsToFloat) + fIntBitsToFloat) - fW0);
                                iFloatToRawIntBits = Float.floatToRawIntBits((i * fIntBitsToFloat) + fW0);
                            }
                            j2 = (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32);
                        }
                        long j3 = j2;
                        if (i == i3) {
                            jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits((fIntBitsToFloat * f) + (i3 * fIntBitsToFloat))) & j) | (Float.floatToRawIntBits(((i4 * fIntBitsToFloat) + fIntBitsToFloat) - fW0) << 32);
                        } else {
                            if (i2 == i4) {
                                float f2 = (fIntBitsToFloat * f) + (i4 * fIntBitsToFloat);
                                float f3 = ((i3 * fIntBitsToFloat) + fIntBitsToFloat) - fW0;
                                jFloatToRawIntBits4 = Float.floatToRawIntBits(f2);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                            } else if (i2 < i4) {
                                float f4 = ((i3 * fIntBitsToFloat) + fIntBitsToFloat) - fW0;
                                jFloatToRawIntBits4 = Float.floatToRawIntBits(((i4 * fIntBitsToFloat) + fIntBitsToFloat) - fW0);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            } else {
                                float f5 = ((i3 * fIntBitsToFloat) + fIntBitsToFloat) - fW0;
                                jFloatToRawIntBits4 = Float.floatToRawIntBits((i4 * fIntBitsToFloat) + fW0);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
                            }
                            jFloatToRawIntBits5 = (jFloatToRawIntBits4 << 32) | (((long) iFloatToRawIntBits2) & j);
                        }
                        if (i == i3) {
                            float fW1 = fhlVar2.w0(1.0f);
                            jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                            iFloatToRawIntBits3 = Float.floatToRawIntBits(fW1);
                        } else {
                            jFloatToRawIntBits6 = Float.floatToRawIntBits(fhlVar2.w0(1.0f));
                            iFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                        }
                        long j4 = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits3) & j);
                        fhl.Q(fhlVar2, StaticColors.INSTANCE.m62getBlack0d7_KjU(), ne60.f(j3, j4), ne60.f(jFloatToRawIntBits5, j4), fhlVar2.w0(2.0f), 1, null, Response.TEMPORARILY_UNAVAILABLE);
                        fhl.Q(fhlVar2, ijg.e0, j3, jFloatToRawIntBits5, fhlVar2.w0(2.0f), 1, null, Response.TEMPORARILY_UNAVAILABLE);
                    }
                    j2 = jFloatToRawIntBits2 | jFloatToRawIntBits3;
                    long j5 = j2;
                    if (i == i3) {
                        jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits((fIntBitsToFloat * f) + (i3 * fIntBitsToFloat))) & j) | (Float.floatToRawIntBits(((i4 * fIntBitsToFloat) + fIntBitsToFloat) - fW0) << 32);
                    } else {
                        if (i2 == i4) {
                            float f6 = (fIntBitsToFloat * f) + (i4 * fIntBitsToFloat);
                            float f7 = ((i3 * fIntBitsToFloat) + fIntBitsToFloat) - fW0;
                            jFloatToRawIntBits4 = Float.floatToRawIntBits(f6);
                            iFloatToRawIntBits2 = Float.floatToRawIntBits(f7);
                        } else if (i2 < i4) {
                            float f8 = ((i3 * fIntBitsToFloat) + fIntBitsToFloat) - fW0;
                            jFloatToRawIntBits4 = Float.floatToRawIntBits(((i4 * fIntBitsToFloat) + fIntBitsToFloat) - fW0);
                            iFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                        } else {
                            float f9 = ((i3 * fIntBitsToFloat) + fIntBitsToFloat) - fW0;
                            jFloatToRawIntBits4 = Float.floatToRawIntBits((i4 * fIntBitsToFloat) + fW0);
                            iFloatToRawIntBits2 = Float.floatToRawIntBits(f9);
                        }
                        jFloatToRawIntBits5 = (jFloatToRawIntBits4 << 32) | (((long) iFloatToRawIntBits2) & j);
                    }
                    if (i == i3) {
                        float fW2 = fhlVar2.w0(1.0f);
                        jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(fW2);
                    } else {
                        jFloatToRawIntBits6 = Float.floatToRawIntBits(fhlVar2.w0(1.0f));
                        iFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                    }
                    long j6 = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits3) & j);
                    fhl.Q(fhlVar2, StaticColors.INSTANCE.m62getBlack0d7_KjU(), ne60.f(j5, j6), ne60.f(jFloatToRawIntBits5, j6), fhlVar2.w0(2.0f), 1, null, Response.TEMPORARILY_UNAVAILABLE);
                    fhl.Q(fhlVar2, ijg.e0, j5, jFloatToRawIntBits5, fhlVar2.w0(2.0f), 1, null, Response.TEMPORARILY_UNAVAILABLE);
                }
                return Unit.f46060a;
            case 3:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(list.size(), null, new bzh(list, (byte) 18), new ugd(802480018, true, new xy1(list, (byte) 6)));
                return Unit.f46060a;
            case 4:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(list.size(), null, new v2m(list, (byte) 2), new ugd(802480018, true, new xy1(list, (byte) 8)));
                return Unit.f46060a;
            case 5:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hczVar3.f(list.size(), null, new v2m(list, (byte) 5), new ugd(802480018, true, new xy1(list, (byte) 9)));
                return Unit.f46060a;
            case 6:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(list.size(), null, new v2m(list, (byte) 22), new ugd(2039820996, true, new lvo(list, list, (byte) 0)));
                return Unit.f46060a;
            case 7:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hczVar5.f(list.size(), null, new ap30(list, (byte) 20), new ugd(2039820996, true, new lvo(list, list, b3)));
                return Unit.f46060a;
            case 8:
                return Boolean.valueOf(((cav0) list.get(((Integer) obj).intValue())).c);
            case 9:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hczVar6.f(list.size(), new zu90((byte) 21, new t4c0((byte) 27), list), new d1c0(list, (byte) 5), new ugd(2039820996, true, new xy1(list, (byte) 24)));
                return Unit.f46060a;
            case 10:
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                hczVar7.f(list.size(), null, new adn0(list, (byte) 25), new ugd(802480018, true, new bzp0(list, b2)));
                return Unit.f46060a;
            default:
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((hzj) it2.next()).b();
                }
                return Unit.f46060a;
        }
    }
}
