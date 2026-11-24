package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i2d implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f14041a;
    public final /* synthetic */ f3d b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ boolean e;

    public i2d(float f, f3d f3dVar, pz40 pz40Var, pz40 pz40Var2, boolean z) {
        this.f14041a = f;
        this.b = f3dVar;
        this.c = pz40Var;
        this.d = pz40Var2;
        this.e = z;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Object next;
        Object next2;
        pu90 pu90VarS;
        pz40 pz40Var;
        pu90 pu90VarS2;
        list.getClass();
        int i = 0;
        if (list.isEmpty()) {
            return vj30.x(vj30Var, 0, 0, new e6c((byte) 27));
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next), "BACKGROUND_KEY"));
        pj30 pj30Var = (pj30) next;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next2), "TOOLBAR_KEY"));
        pj30 pj30Var2 = (pj30) next2;
        if (pj30Var != null) {
            int i2 = p4e.i(j);
            if (i2 < 0) {
                zcx.a("width must be >= 0");
            }
            pu90VarS = pj30Var.S(r4e.h(i2, i2, 0, Integer.MAX_VALUE));
        } else {
            pu90VarS = null;
        }
        pu90 pu90VarS3 = pj30Var2 != null ? pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 11)) : null;
        Integer numValueOf = Integer.valueOf(pu90VarS3 != null ? pu90VarS3.b : 0);
        pz40 pz40Var2 = this.c;
        pz40Var2.setValue(numValueOf);
        int iT = vj30Var.T(this.f14041a);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            pj30 pj30Var3 = (pj30) obj;
            if (!Intrinsics.d(mrv.i0(pj30Var3), "BACKGROUND_KEY") && !Intrinsics.d(mrv.i0(pj30Var3), "TOOLBAR_KEY")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i4 = 0;
        while (true) {
            pz40Var = this.d;
            if (i4 >= size2) {
                break;
            }
            pj30 pj30Var4 = (pj30) arrayList.get(i4);
            if (Intrinsics.d(mrv.i0(pj30Var4), "COLLAPSING_HEADER_KEY")) {
                int iIntValue = ((pu90VarS != null ? pu90VarS.b : i) - ((Number) pz40Var2.getValue()).intValue()) - iT;
                int i5 = p4e.i(j);
                if (((i5 >= 0 ? 1 : i) & (iIntValue < 0 ? i : 1)) == 0) {
                    zcx.a("width and height must be >= 0");
                }
                pu90VarS2 = pj30Var4.S(r4e.h(i5, i5, iIntValue, iIntValue));
                pz40Var.setValue(Integer.valueOf(pu90VarS2.b));
            } else {
                pu90VarS2 = pj30Var4.S(p4e.b(j, 0, 0, 0, 0, 11));
            }
            arrayList2.add(pu90VarS2);
            i4++;
            iT = iT;
            i = 0;
        }
        int iIntValue2 = ((Number) pz40Var.getValue()).intValue() + ((Number) pz40Var2.getValue()).intValue() + iT;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (pu90VarS != null) {
            lc00VarB.add(pu90VarS);
        }
        if (pu90VarS3 != null) {
            lc00VarB.add(pu90VarS3);
        }
        lc00VarB.addAll(arrayList2);
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        float fIntValue = ((Number) pz40Var.getValue()).intValue();
        f3d f3dVar = this.b;
        f3dVar.f(fIntValue);
        int iB = iIntValue2 - si30.b(f3dVar.f8856a.l());
        int iIntValue3 = ((Number) pz40Var2.getValue()).intValue();
        if (iB < iIntValue3) {
            iB = iIntValue3;
        }
        int i6 = f3dVar.i;
        if (i6 < 0) {
            iB = -i6;
        }
        f3dVar.i = iB;
        return vj30.x(vj30Var, p4e.i(j), iB, new t13((Object) f3dVar, (Object) lc00VarA, this.e, (Object) pz40Var2, (byte) 3));
    }
}
