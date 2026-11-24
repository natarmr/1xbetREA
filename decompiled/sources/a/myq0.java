package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class myq0 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ilq f22615a;
    public final float b;

    public myq0(ilq ilqVar, float f) {
        this.f22615a = ilqVar;
        this.b = f;
    }

    @Override // a.tj30
    public final int a(cnx cnxVar, List list, int i) {
        Integer numValueOf;
        int iT = cnxVar.T(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((pj30) list.get(0)).D(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pj30) list.get(i2)).D(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iT, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        int i;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            pj30 pj30Var = (pj30) list.get(i3);
            if (Intrinsics.d(mrv.i0(pj30Var), "navigationIcon")) {
                pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    pj30 pj30Var2 = (pj30) list.get(i4);
                    if (Intrinsics.d(mrv.i0(pj30Var2), "actionIcons")) {
                        pu90 pu90VarS2 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 14));
                        if (p4e.i(j) == Integer.MAX_VALUE) {
                            i = p4e.i(j);
                        } else {
                            i = (p4e.i(j) - pu90VarS.f27604a) - pu90VarS2.f27604a;
                            if (i < 0) {
                                i = 0;
                            }
                        }
                        int i5 = i;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            pj30 pj30Var3 = (pj30) list.get(i6);
                            if (Intrinsics.d(mrv.i0(pj30Var3), "title")) {
                                pu90 pu90VarS3 = pj30Var3.S(p4e.b(j, 0, i5, 0, 0, 12));
                                ykw ykwVar = z12.b;
                                int iC0 = pu90VarS3.c0(ykwVar) != Integer.MIN_VALUE ? pu90VarS3.c0(ykwVar) : 0;
                                float fInvoke = this.f22615a.invoke();
                                int iB = Float.isNaN(fInvoke) ? 0 : si30.b(fInvoke);
                                int iMax = Math.max(vj30Var.T(this.b), pu90VarS3.b);
                                if (p4e.h(j) == Integer.MAX_VALUE) {
                                    i2 = iMax;
                                } else {
                                    int i7 = iB + iMax;
                                    if (i7 >= 0) {
                                        i2 = i7;
                                    }
                                }
                                return vj30.x(vj30Var, p4e.i(j), i2, new duo(pu90VarS, i2, pu90VarS3, pu90VarS2, j, vj30Var, this, iC0, iMax));
                            }
                            i6++;
                            this = this;
                        }
                        qf00.b("Collection contains no element matching the predicate.");
                        csj.b();
                        return null;
                    }
                    i4++;
                    this = this;
                }
                qf00.b("Collection contains no element matching the predicate.");
                csj.b();
                return null;
            }
        }
        qf00.b("Collection contains no element matching the predicate.");
        csj.b();
        return null;
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        Integer numValueOf;
        int iT = cnxVar.T(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((pj30) list.get(0)).b(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pj30) list.get(i2)).b(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iT, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // a.tj30
    public final int d(cnx cnxVar, List list, int i) {
        int size = list.size();
        int iL = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iL += ((pj30) list.get(i2)).L(i);
        }
        return iL;
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        int size = list.size();
        int iP = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iP += ((pj30) list.get(i2)).P(i);
        }
        return iP;
    }
}
