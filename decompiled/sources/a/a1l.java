package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f75a = 0;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ float c;

    public /* synthetic */ a1l(float f, ArrayList arrayList) {
        this.c = f;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f75a;
        ArrayList<bw3> arrayList = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                vtm0 vtm0Var = new vtm0(this.c, 0.0f, 1, 0, null, 26);
                for (bw3 bw3Var : arrayList) {
                    vtm0 vtm0Var2 = vtm0Var;
                    fhl.V(fhlVar, bw3Var.c, bw3Var.b, bw3Var.f3306a, 0L, fhlVar.d(), 0.0f, vtm0Var2, 832);
                    vtm0Var = vtm0Var2;
                }
                return Unit.f46060a;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar2.w0(8.0f);
                float fD = (h7k0.d(fhlVar2.d()) - fW0) / 2.0f;
                float f = 360.0f / (6.2831855f * fD);
                float fW1 = arrayList.size() > 1 ? (fhlVar2.w0(4.0f) + fW0) * f : 0.0f;
                float fW2 = fhlVar2.w0(8.0f) * f;
                float size = 360.0f - (arrayList.size() * fW1);
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Float.valueOf((((g1p0) it.next()).b * size) / this.c));
                }
                Iterator it2 = arrayList2.iterator();
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (it2.hasNext()) {
                    float fFloatValue = ((Number) it2.next()).floatValue();
                    if (fFloatValue < fW2) {
                        f3 += fW2 - fFloatValue;
                    } else {
                        f2 += fFloatValue - fW2;
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    float fFloatValue2 = ((Number) it3.next()).floatValue();
                    if (fFloatValue2 <= fW2) {
                        fFloatValue2 = fW2;
                    } else if (f2 > 0.0f) {
                        fFloatValue2 -= ((fFloatValue2 - fW2) * f3) / f2;
                    }
                    arrayList3.add(Float.valueOf(fFloatValue2));
                }
                vtm0 vtm0Var3 = new vtm0(fW0, 0.0f, 1, 0, null, 26);
                float f4 = fD * 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) / 2.0f)) & 4294967295L);
                float f5 = -90.0f;
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    float fFloatValue3 = ((Number) arrayList3.get(i)).floatValue();
                    vtm0 vtm0Var4 = vtm0Var3;
                    long j = jFloatToRawIntBits;
                    float f6 = f5;
                    fhl.V(fhlVar2, ((g1p0) obj2).d, f6, fFloatValue3, jFloatToRawIntBits2, j, 0.0f, vtm0Var4, 832);
                    vtm0Var3 = vtm0Var4;
                    f5 = fFloatValue3 + fW1 + f6;
                    jFloatToRawIntBits = j;
                    i = i2;
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ a1l(ArrayList arrayList, float f) {
        this.b = arrayList;
        this.c = f;
    }
}
