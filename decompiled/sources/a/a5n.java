package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a5n implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f279a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public a5n(ow3 ow3Var, sw3 sw3Var, hh80 hh80Var, k6z k6zVar) {
        this.f279a = (byte) 4;
        this.b = ow3Var;
        this.e = sw3Var;
        this.c = hh80Var;
        this.d = k6zVar;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, final long j) {
        byte b = this.f279a;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ((pz40) obj2).getValue();
                long jF = ((bk30) obj4).f(j, vj30Var.getLayoutDirection(), (v3e) obj3, list, linkedHashMap);
                ((pz40) obj).getValue();
                return vj30.x(vj30Var, (int) (jF >> 32), (int) (jF & 4294967295L), new z4n((bk30) obj4, list, linkedHashMap, (byte) 0));
            case 1:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ((pz40) obj2).getValue();
                long jF2 = ((bk30) obj4).f(j, vj30Var.getLayoutDirection(), (v3e) obj3, list, linkedHashMap2);
                ((pz40) obj).getValue();
                return vj30.x(vj30Var, (int) (jF2 >> 32), (int) (jF2 & 4294967295L), new z4n((bk30) obj4, list, linkedHashMap2, (byte) 1));
            case 2:
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ((pz40) obj2).getValue();
                long jF3 = ((bk30) obj4).f(j, vj30Var.getLayoutDirection(), (v3e) obj3, list, linkedHashMap3);
                ((pz40) obj).getValue();
                return vj30.x(vj30Var, (int) (jF3 >> 32), (int) (jF3 & 4294967295L), new z4n((bk30) obj4, list, linkedHashMap3, (byte) 2));
            case 3:
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                ((pz40) obj2).getValue();
                long jF4 = ((bk30) obj4).f(j, vj30Var.getLayoutDirection(), (v3e) obj3, list, linkedHashMap4);
                ((pz40) obj).getValue();
                return vj30.x(vj30Var, (int) (jF4 >> 32), (int) (jF4 & 4294967295L), new z4n((bk30) obj4, list, linkedHashMap4, (byte) 3));
            default:
                final ow3 ow3Var = (ow3) obj2;
                k6z k6zVar = (k6z) obj3;
                hh80 hh80Var = (hh80) obj4;
                list.getClass();
                if (list.isEmpty()) {
                    return vj30.x(vj30Var, 0, 0, new d4u0((byte) 7));
                }
                final int iT = vj30Var.T(ow3Var.a());
                final int iT2 = vj30Var.T(((sw3) obj).a());
                final int i = (((p4e.i(j) - vj30Var.T(hh80Var.b(k6zVar))) - vj30Var.T(hh80Var.c(k6zVar))) - (2 * iT)) / 3;
                long jB = p4e.b(j, i, i, 0, 0, 12);
                final ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pj30) it.next()).S(jB));
                }
                int[] iArr = new int[3];
                int i2 = 0;
                for (Object obj5 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pu90 pu90Var = (pu90) obj5;
                    int i4 = i2 % 3;
                    if (i2 >= 3) {
                        iArr[i4] = iArr[i4] + iT2;
                    }
                    iArr[i4] = iArr[i4] + pu90Var.b;
                    i2 = i3;
                }
                Integer numR = tx3.R(iArr);
                int iIntValue = numR != null ? numR.intValue() : 0;
                final int[] iArr2 = new int[3];
                for (int i5 = 0; i5 < 3; i5++) {
                    iArr2[i5] = vj30Var.T(hh80Var.d());
                }
                final hh80 hh80Var2 = (hh80) obj4;
                final k6z k6zVar2 = (k6z) obj3;
                return vj30.x(vj30Var, p4e.i(j), vj30Var.T(hh80Var.a()) + vj30Var.T(hh80Var.d()) + iIntValue, new Function1() { // from class: a.jcu0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i6;
                        ou90 ou90Var = (ou90) obj6;
                        ou90Var.getClass();
                        int i7 = 0;
                        for (Object obj7 : arrayList) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                q3d.p();
                                throw null;
                            }
                            pu90 pu90Var2 = (pu90) obj7;
                            int i9 = i7 % 3;
                            int[] iArr3 = iArr2;
                            if (i7 >= 3) {
                                iArr3[i9] = iArr3[i9] + iT2;
                            }
                            nw3 nw3Var = uc9.e;
                            ow3 ow3Var2 = ow3Var;
                            boolean zEquals = ow3Var2.equals(nw3Var);
                            int i10 = i;
                            int i11 = iT;
                            if (zEquals) {
                                i6 = hne.d(i10, pu90Var2.f27604a, 2, (i11 + i10) * i9);
                            } else if (ow3Var2.equals(uc9.b)) {
                                i6 = (i10 - pu90Var2.f27604a) + ((i11 + i10) * i9);
                            } else {
                                i6 = ow3Var2.equals(uc9.g) ? (((p4e.i(j) - (i10 * 3)) / 2) + i10) * i9 : (i10 + i11) * i9;
                            }
                            ou90Var.m(pu90Var2, ou90Var.T(s5x0.B(hh80Var2, k6zVar2)) + i6, iArr3[i9], 0.0f);
                            iArr3[i9] = iArr3[i9] + pu90Var2.b;
                            i7 = i8;
                        }
                        return Unit.f46060a;
                    }
                });
        }
    }

    public /* synthetic */ a5n(pz40 pz40Var, bk30 bk30Var, v3e v3eVar, pz40 pz40Var2, byte b) {
        this.f279a = b;
        this.b = pz40Var;
        this.c = bk30Var;
        this.d = v3eVar;
        this.e = pz40Var2;
    }
}
