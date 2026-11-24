package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h3d implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f12379a;
    public final /* synthetic */ f3d b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;

    public h3d(float f, f3d f3dVar, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4) {
        this.f12379a = f;
        this.b = f3dVar;
        this.c = pz40Var;
        this.d = pz40Var2;
        this.e = pz40Var3;
        this.f = pz40Var4;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01db  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x0202  */
    /* JADX WARN: Code duplicated, block: B:74:0x0234  */
    /* JADX WARN: Code duplicated, block: B:77:0x0239  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        Object next;
        pz40 pz40Var;
        pz40 pz40Var2;
        pz40 pz40Var3;
        pz40 pz40Var4;
        int i;
        int iIntValue;
        int iIntValue2;
        lc00 lc00VarB;
        int iB;
        int iIntValue3;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        pu90 pu90VarS2;
        list.getClass();
        if (list.isEmpty()) {
            return vj30.x(vj30Var, 0, 0, new y2d((byte) 1));
        }
        Iterator it = list.iterator();
        do {
            pu90VarS = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next), "BACKGROUND_KEY"));
        pj30 pj30Var = (pj30) next;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (!Intrinsics.d(mrv.i0((pj30) obj), "BACKGROUND_KEY")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i5 = 0;
        while (true) {
            pz40Var = this.d;
            pz40Var2 = this.c;
            pz40Var3 = this.f;
            pz40Var4 = this.e;
            if (i5 >= size2) {
                break;
            }
            pj30 pj30Var2 = (pj30) arrayList.get(i5);
            Object objI0 = mrv.i0(pj30Var2);
            if (Intrinsics.d(objI0, "STATIC_HEADER_KEY")) {
                int i6 = Integer.MAX_VALUE;
                if (p4e.h(j) != Integer.MAX_VALUE) {
                    int iH = (p4e.h(j) - wzb.b(pz40Var2)) - ((Number) pz40Var.getValue()).intValue();
                    i6 = iH < 0 ? 0 : iH;
                }
                pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, i6, 3));
                pz40Var4.setValue(Integer.valueOf(pu90VarS2.b));
            } else if (Intrinsics.d(objI0, "COLLAPSING_HEADER_KEY")) {
                pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, Integer.MAX_VALUE, 3));
                pz40Var3.setValue(Integer.valueOf(pu90VarS2.b));
            } else if (Intrinsics.d(objI0, "ANIMATED_CONTENT_KEY")) {
                pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, Integer.MAX_VALUE, 3));
                pz40Var.setValue(Integer.valueOf(pu90VarS2.b));
            } else if (Intrinsics.d(objI0, "TOOLBAR_KEY")) {
                pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 11));
                pz40Var2.setValue(Integer.valueOf(pu90VarS2.b));
            } else {
                pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 11));
            }
            arrayList2.add(pu90VarS2);
            i5++;
        }
        if (((Number) pz40Var4.getValue()).intValue() == 0 || ((Number) pz40Var3.getValue()).intValue() == 0) {
            if (((Number) pz40Var4.getValue()).intValue() == 0) {
                if (((Number) pz40Var3.getValue()).intValue() != 0) {
                    iIntValue = ((Number) pz40Var3.getValue()).intValue();
                } else {
                    i = 0;
                }
                iIntValue2 = ((Number) pz40Var.getValue()).intValue() + wzb.b(pz40Var2) + i + vj30Var.T(this.f12379a);
                if (pj30Var != null) {
                    i3 = p4e.i(j);
                    if (i3 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iIntValue2 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(z & z2)) {
                        zcx.a("width and height must be >= 0");
                    }
                    pu90VarS = pj30Var.S(r4e.h(i3, i3, iIntValue2, iIntValue2));
                }
                lc00VarB = kotlin.collections.a.b();
                if (pu90VarS != null) {
                    lc00VarB.add(pu90VarS);
                }
                lc00VarB.addAll(arrayList2);
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                f3d f3dVar = this.b;
                f3dVar.f(i);
                iB = iIntValue2 - si30.b(f3dVar.f8856a.l());
                iIntValue3 = ((Number) pz40Var.getValue()).intValue() + ((Number) pz40Var2.getValue()).intValue();
                if (iB < iIntValue3) {
                    iB = iIntValue3;
                }
                i2 = f3dVar.i;
                if (i2 < 0) {
                    iB = -i2;
                }
                f3dVar.i = iB;
                return vj30.x(vj30Var, p4e.i(j), iB, new ec3(f3dVar, lc00VarA, i, pz40Var2, (byte) 3));
            }
            iIntValue = ((Number) pz40Var4.getValue()).intValue();
        } else {
            iIntValue = Math.max(((Number) pz40Var4.getValue()).intValue(), ((Number) pz40Var3.getValue()).intValue());
        }
        i = iIntValue;
        iIntValue2 = ((Number) pz40Var.getValue()).intValue() + wzb.b(pz40Var2) + i + vj30Var.T(this.f12379a);
        if (pj30Var != null) {
            i3 = p4e.i(j);
            if (i3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (iIntValue2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(z & z2)) {
                zcx.a("width and height must be >= 0");
            }
            pu90VarS = pj30Var.S(r4e.h(i3, i3, iIntValue2, iIntValue2));
        }
        lc00VarB = kotlin.collections.a.b();
        if (pu90VarS != null) {
            lc00VarB.add(pu90VarS);
        }
        lc00VarB.addAll(arrayList2);
        lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB);
        f3d f3dVar2 = this.b;
        f3dVar2.f(i);
        iB = iIntValue2 - si30.b(f3dVar2.f8856a.l());
        iIntValue3 = ((Number) pz40Var.getValue()).intValue() + ((Number) pz40Var2.getValue()).intValue();
        if (iB < iIntValue3) {
            iB = iIntValue3;
        }
        i2 = f3dVar2.i;
        if (i2 < 0) {
            iB = -i2;
        }
        f3dVar2.i = iB;
        return vj30.x(vj30Var, p4e.i(j), iB, new ec3(f3dVar2, lc00VarA2, i, pz40Var2, (byte) 3));
    }
}
