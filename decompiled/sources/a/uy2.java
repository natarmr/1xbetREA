package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uy2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36468a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ uy2(ArrayList arrayList, byte b) {
        this.f36468a = b;
        this.b = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0357  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.f36468a;
        Object obj2 = null;
        byte b2 = 1;
        boolean z2 = true;
        ArrayList<pu90> arrayList = this.b;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ou90Var.m((pu90) arrayList.get(i2), 0, 0, 0.0f);
                }
                return Unit.f46060a;
            case 1:
                ou90 ou90Var2 = (ou90) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ou90Var2.m((pu90) arrayList.get(i3), 0, 0, 0.0f);
                }
                return Unit.f46060a;
            case 2:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                byte b3 = 4;
                hczVar.f(arrayList.size(), new at7(new i87((byte) 26), arrayList, b3), new j13(arrayList, b3, false), new ugd(2039820996, true, new ui8(arrayList, arrayList, 0 == true ? 1 : 0)));
                return Unit.f46060a;
            case 3:
                d8h d8hVar = (d8h) obj;
                d8hVar.getClass();
                if (arrayList.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((f2h) it.next()).f8812a.equals(d8hVar.c)) {
                            if (arrayList.isEmpty()) {
                                z = true;
                            } else {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (((f2h) it2.next()).f8812a.equals(d8hVar.b)) {
                                        z = false;
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                ou90 ou90Var3 = (ou90) obj;
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    wj30 wj30Var = (wj30) arrayList.get(i4);
                    List list = wj30Var.b;
                    boolean z3 = wj30Var.g;
                    if (wj30Var.k == Integer.MIN_VALUE) {
                        adx.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i5 = i;
                    while (i5 < size4) {
                        pu90 pu90Var = (pu90) list.get(i5);
                        int[] iArr = wj30Var.i;
                        int i6 = i5 * 2;
                        long jD = ikx.d((((long) iArr[i6 + b2]) & 4294967295L) | (((long) iArr[i6]) << 32), wj30Var.c);
                        if (z3) {
                            ou90.G(ou90Var3, pu90Var, jD);
                        } else {
                            ou90.y(ou90Var3, pu90Var, jD);
                        }
                        i5++;
                        b2 = 1;
                    }
                    i4++;
                    b2 = 1;
                    i = 0;
                }
                return Unit.f46060a;
            case 5:
                ou90 ou90Var4 = (ou90) obj;
                ou90Var4.getClass();
                int i7 = 0;
                for (pu90 pu90Var2 : arrayList) {
                    ou90Var4.m(pu90Var2, 0, i7, 0.0f);
                    i7 += pu90Var2.b;
                }
                return Unit.f46060a;
            case 6:
                ou90 ou90Var5 = (ou90) obj;
                ou90Var5.getClass();
                int i8 = 0;
                for (pu90 pu90Var3 : arrayList) {
                    ou90Var5.m(pu90Var3, 0, i8, 0.0f);
                    i8 += pu90Var3.b;
                }
                return Unit.f46060a;
            case 7:
                ou90 ou90Var6 = (ou90) obj;
                ou90Var6.getClass();
                int i9 = 0;
                for (pu90 pu90Var4 : arrayList) {
                    ou90Var6.m(pu90Var4, 0, i9, 0.0f);
                    i9 += pu90Var4.b;
                }
                return Unit.f46060a;
            case 8:
                ou90 ou90Var7 = (ou90) obj;
                ou90Var7.getClass();
                int i10 = 0;
                for (pu90 pu90Var5 : arrayList) {
                    ou90Var7.m(pu90Var5, 0, i10, 0.0f);
                    i10 += pu90Var5.b;
                }
                return Unit.f46060a;
            case 9:
                ou90 ou90Var8 = (ou90) obj;
                ou90Var8.getClass();
                int size5 = arrayList.size();
                for (int i11 = 0; i11 < size5; i11++) {
                    pu90 pu90Var6 = (pu90) arrayList.get(i11);
                    if (i11 == 1) {
                        Object objN = pu90Var6.n();
                        gww gwwVar = objN instanceof gww ? (gww) objN : null;
                        if (gwwVar != null) {
                            ou90Var8.g(pu90Var6, ou90Var8.T(gwwVar.b), ou90Var8.T(gwwVar.c), 0.0f);
                        }
                    } else {
                        ou90Var8.m(pu90Var6, 0, 0, 0.0f);
                    }
                }
                return Unit.f46060a;
            case 10:
                ou90 ou90Var9 = (ou90) obj;
                ou90Var9.getClass();
                int size6 = arrayList.size();
                for (int i12 = 0; i12 < size6; i12++) {
                    pu90 pu90Var7 = (pu90) arrayList.get(i12);
                    if (i12 == 1) {
                        Object objN2 = pu90Var7.n();
                        hww hwwVar = objN2 instanceof hww ? (hww) objN2 : null;
                        if (hwwVar != null) {
                            ou90Var9.g(pu90Var7, ou90Var9.T(hwwVar.b), ou90Var9.T(hwwVar.c), 0.0f);
                        }
                    } else {
                        ou90Var9.m(pu90Var7, 0, 0, 0.0f);
                    }
                }
                return Unit.f46060a;
            case 11:
                ou90 ou90Var10 = (ou90) obj;
                ou90Var10.getClass();
                int size7 = arrayList.size();
                for (int i13 = 0; i13 < size7; i13++) {
                    pu90 pu90Var8 = (pu90) arrayList.get(i13);
                    if (i13 == 1) {
                        Object objN3 = pu90Var8.n();
                        iww iwwVar = objN3 instanceof iww ? (iww) objN3 : null;
                        if (iwwVar != null) {
                            ou90Var10.g(pu90Var8, ou90Var10.T(iwwVar.b), ou90Var10.T(iwwVar.c), 0.0f);
                        }
                    } else {
                        ou90Var10.m(pu90Var8, 0, 0, 0.0f);
                    }
                }
                return Unit.f46060a;
            case 12:
                ou90 ou90Var11 = (ou90) obj;
                ou90Var11.getClass();
                int size8 = arrayList.size();
                for (int i14 = 0; i14 < size8; i14++) {
                    pu90 pu90Var9 = (pu90) arrayList.get(i14);
                    if (i14 == 1) {
                        Object objN4 = pu90Var9.n();
                        jww jwwVar = objN4 instanceof jww ? (jww) objN4 : null;
                        if (jwwVar != null) {
                            ou90Var11.g(pu90Var9, ou90Var11.T(jwwVar.b), ou90Var11.T(jwwVar.c), 0.0f);
                        }
                    } else {
                        ou90Var11.m(pu90Var9, 0, 0, 0.0f);
                    }
                }
                return Unit.f46060a;
            case 13:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(arrayList.size(), null, new j13(arrayList, (byte) 20, objArr == true ? 1 : 0), new ugd(2039820996, true, new ui8(arrayList, arrayList, b2)));
                return Unit.f46060a;
            case 14:
                ou90 ou90Var12 = (ou90) obj;
                int size9 = arrayList.size();
                for (int i15 = 0; i15 < size9; i15++) {
                    ou90.w(ou90Var12, (pu90) arrayList.get(i15), 0, 0, null, 12);
                }
                return Unit.f46060a;
            case 15:
                ou90 ou90Var13 = (ou90) obj;
                ou90Var13.getClass();
                int i16 = 0;
                for (pu90 pu90Var10 : arrayList) {
                    ou90Var13.m(pu90Var10, 0, i16, 0.0f);
                    i16 += pu90Var10.b;
                }
                return Unit.f46060a;
            case 16:
                ou90 ou90Var14 = (ou90) obj;
                int size10 = arrayList.size();
                for (int i17 = 0; i17 < size10; i17++) {
                    ou90Var14.g((pu90) arrayList.get(i17), 0, 0, 0.0f);
                }
                return Unit.f46060a;
            case 17:
                hcz hczVar3 = (hcz) obj;
                gle0 gle0Var = xyl0.n2;
                hczVar3.getClass();
                hczVar3.f(arrayList.size(), null, new t9l0(arrayList, (byte) 3), new ugd(2039820996, true, new wyl0(arrayList, objArr2 == true ? 1 : 0)));
                return Unit.f46060a;
            case 18:
                StatisticBlockModel statisticBlockModel = (StatisticBlockModel) obj;
                statisticBlockModel.getClass();
                if (arrayList.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((StatisticBlockModel) it3.next()).f46623a == statisticBlockModel.f46623a) {
                        }
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                epn0 epn0Var = (epn0) obj;
                epn0Var.getClass();
                for (Object obj3 : arrayList) {
                    epn0 epn0Var2 = (epn0) obj3;
                    if (epn0Var.f8198a == epn0Var2.f8198a && epn0Var.d == epn0Var2.d && epn0Var.e == epn0Var2.e) {
                        obj2 = obj3;
                        return Boolean.valueOf(obj2 != null);
                    }
                }
                return Boolean.valueOf(obj2 != null);
            default:
                ou90 ou90Var15 = (ou90) obj;
                ou90Var15.getClass();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ou90Var15.m((pu90) it4.next(), 0, 0, 0.0f);
                }
                return Unit.f46060a;
        }
    }
}
