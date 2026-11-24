package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xuv0 implements sv40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywv0 f41530a;
    public final pz40 b;
    public final pz40 c;
    public final pz40 d;
    public final boolean e;
    public final muv0 f;

    public xuv0(ywv0 ywv0Var, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, boolean z, l7m0 l7m0Var, muv0 muv0Var) {
        ywv0Var.getClass();
        l7m0Var.getClass();
        this.f41530a = ywv0Var;
        this.b = pz40Var;
        this.c = pz40Var2;
        this.d = pz40Var3;
        this.e = z;
        this.f = muv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    @Override // a.sv40
    public final uj30 b(vj30 vj30Var, List list, long j) {
        boolean z;
        int iB;
        c4m0 c4m0Var;
        int iD;
        int i;
        int iMax;
        int iMin;
        float f;
        int i2;
        muv0 muv0Var = this.f;
        h0q0 h0q0Var = muv0Var.f22430a;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return vj30.x(vj30Var, 0, 0, new ejv0((byte) 18));
        }
        int i3 = p4e.i(j);
        boolean zM = vj30Var.M();
        ywv0 ywv0Var = this.f41530a;
        boolean z2 = zM && !ywv0Var.j.g() && muv0Var.b() && ((muv0Var.c && h0q0Var.l().b == null) || (muv0Var.c && h0q0Var.p().f == stv0.c && muv0Var.e));
        boolean z3 = vj30Var.M() && !muv0Var.b();
        boolean z4 = vj30Var.M() && muv0Var.b();
        if (z4 && Intrinsics.d(ywv0Var.d.d(), jxv0.f17330a)) {
            if ((!muv0Var.f ? false : h0q0Var.l().f3152a instanceof dsv0) && (((atv0) ((hgk0) muv0Var.i).getValue()) instanceof zsv0) && muv0Var.h < 3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int iH = (z3 || z) ? p4e.h(j) : l1e0.d(si30.b(((Number) ((t33) ywv0Var.d.c).d()).floatValue()), 0, p4e.h(j));
        pz40 pz40Var = this.b;
        boolean z5 = this.e;
        int iIntValue = !z5 ? 0 : ((Number) pz40Var.getValue()).intValue();
        if (z3) {
            iB = iIntValue;
        } else {
            if (z5) {
                ruv0 ruv0Var = ywv0Var.j;
                iB = (ruv0Var.g() || ((c4m0Var = ruv0Var.u) != null && c4m0Var.isActive())) ? si30.b(Math.max(si30.b(ruv0Var.e()) - ((Number) this.c.getValue()).intValue(), ((Number) pz40Var.getValue()).intValue())) : ((Number) pz40Var.getValue()).intValue();
            } else {
                iB = 0;
            }
            zcl zclVar = qmk.f28987a;
            int iT = iH - vj30Var.T(40.0f + ((ycl) this.d.getValue()).f42389a);
            if (iT < 0) {
                iT = 0;
            }
            if (iB > iT) {
                iB = iT;
            }
        }
        int i4 = iH - iB;
        if (i4 < 0) {
            i4 = 0;
        }
        int iJ = p4e.j(j) - iB;
        if (iJ < 0) {
            iJ = 0;
        }
        if (z4) {
            iD = p4e.h(j) - iIntValue;
            if (iD < 0) {
                iD = 0;
            }
        } else {
            iD = i4;
        }
        int i5 = iB;
        long jA = r4e.a(0, i3, 0, iD);
        pj30 pj30Var = (pj30) CollectionsKt.firstOrNull((List) arrayList.get(0));
        Integer num = null;
        pu90 pu90VarS = pj30Var != null ? pj30Var.S(jA) : null;
        pj30 pj30Var2 = (pj30) CollectionsKt.firstOrNull((List) arrayList.get(3));
        pu90 pu90VarS2 = pj30Var2 != null ? pj30Var2.S(jA) : null;
        if (!z4) {
            iD = l1e0.d((i4 - (pu90VarS2 != null ? pu90VarS2.b : 0)) - (pu90VarS != null ? pu90VarS.b : 0), 0, i4);
        }
        int i6 = iD;
        pu90 pu90Var = pu90VarS;
        pj30 pj30Var3 = (pj30) CollectionsKt.firstOrNull((List) arrayList.get(1));
        pu90 pu90VarS3 = pj30Var3 != null ? pj30Var3.S(p4e.b(jA, 0, 0, 0, i6, 7)) : null;
        int i7 = (pu90Var != null ? pu90Var.b : 0) + (pu90VarS3 != null ? pu90VarS3.b : 0) + (pu90VarS2 != null ? pu90VarS2.b : 0);
        int iMin2 = i4 - Math.min(pu90Var != null ? pu90Var.b : 0, i4);
        pu90 pu90Var2 = pu90VarS2;
        int iMin3 = iMin2 - Math.min(pu90VarS2 != null ? pu90VarS2.b : 0, iMin2 < 0 ? 0 : iMin2);
        int iMin4 = Math.min(pu90VarS3 != null ? pu90VarS3.b : 0, iMin3 < 0 ? 0 : iMin3);
        if (!z4 ? (i = i4 - i7) < 0 : (i = iMin3 - iMin4) < 0) {
            i = 0;
        }
        int iH2 = p4e.h(j) - iIntValue;
        if (iH2 < 0) {
            iH2 = 0;
        }
        int iIntValue2 = iH2 - i7;
        if (iIntValue2 < 0) {
            iIntValue2 = 0;
        }
        if (vj30Var.M() && !muv0Var.b()) {
            i = iIntValue2;
        }
        pu90 pu90VarS4 = ((pj30) CollectionsKt.U((List) arrayList.get(2))).S(r4e.a(0, i3, p4e.f(j) ? i : 0, i));
        float f2 = i;
        boolean z6 = f2 > 1.0f && ((float) pu90VarS4.b) >= f2 - 1.0f;
        if (vj30Var.M()) {
            if (z2) {
                muv0Var.e = z6;
                i2 = 1;
            } else {
                i2 = 1;
                muv0Var.c = true;
                muv0Var.e = z6;
            }
            if (z) {
                muv0Var.h += i2;
            }
        }
        int iD2 = l1e0.d(pu90VarS4.b + i7, iJ, i4);
        if (vj30Var.M()) {
            boolean zB = muv0Var.b();
            Integer numA = muv0Var.a();
            if (numA != null) {
                int iIntValue3 = numA.intValue();
                cvv0 cvv0VarF = ywv0Var.c.f();
                f = 1.0f;
                if (iIntValue3 + i7 + iIntValue <= (cvv0VarF != null ? ktt0.n(cvv0VarF) : Integer.MAX_VALUE) - vj30Var.T(48.0f)) {
                    num = numA;
                }
            } else {
                f = 1.0f;
            }
            int i8 = pu90VarS4.b;
            if (zB) {
                if (num != null) {
                    iIntValue2 = num.intValue();
                }
            } else if (i8 < iIntValue2 - f) {
                iIntValue2 = i8;
            }
        } else {
            iIntValue2 = pu90VarS4.b;
        }
        if (vj30Var.M()) {
            int i9 = i7 + iIntValue2;
            int iH3 = p4e.h(j) - iIntValue;
            if (iH3 < 0) {
                iH3 = 0;
            }
            iMax = l1e0.d(i9, iJ, iH3);
        } else {
            iMax = iD2;
        }
        if (vj30Var.M() && z2 && z6) {
            cvv0 cvv0VarF2 = muv0Var.b.f();
            if (cvv0VarF2 == null) {
                iMin = 0;
            } else {
                iMin = (muv0Var.c && h0q0Var.l().b == null) ? Math.min(ktt0.n(cvv0VarF2), ktt0.k(cvv0VarF2)) : ktt0.k(cvv0VarF2);
            }
            int i10 = iMin - iIntValue;
            if (i10 < 0) {
                i10 = 0;
            }
            iMax = Math.max(iMax, i10);
        }
        int i11 = (pu90Var != null ? pu90Var.b : 0) + (pu90VarS3 != null ? pu90VarS3.b : 0);
        if (!vj30Var.M()) {
            iIntValue = i5;
        }
        return vj30.x(vj30Var, i3, iMax + iIntValue, new jm10(pu90Var, pu90VarS3, pu90VarS4, i11, pu90Var2, iD2));
    }
}
