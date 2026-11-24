package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s53 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v63 f31636a;
    public boolean b;

    public s53(v63 v63Var) {
        this.f31636a = v63Var;
    }

    @Override // a.tj30
    public final int a(cnx cnxVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((pj30) list.get(0)).D(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iD2 = ((pj30) list.get(i2)).D(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pz40 pz40Var = this.f31636a.f36852a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            pu90 pu90VarS = ((pj30) list.get(i)).S(j);
            iMax = Math.max(iMax, pu90VarS.f27604a);
            iMax2 = Math.max(iMax2, pu90VarS.b);
            arrayList.add(pu90VarS);
        }
        if (vj30Var.M()) {
            this.b = true;
            ((hgk0) pz40Var).setValue(new qkx((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            ((hgk0) pz40Var).setValue(new qkx((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return vj30.x(vj30Var, iMax, iMax2, new r53(arrayList, (byte) 0));
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((pj30) list.get(0)).b(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iB2 = ((pj30) list.get(i2)).b(i);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iB;
    }

    @Override // a.tj30
    public final int d(cnx cnxVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL = ((pj30) list.get(0)).L(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iL2 = ((pj30) list.get(i2)).L(i);
                if (iL2 > iL) {
                    iL = iL2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iL;
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iP = ((pj30) list.get(0)).P(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iP2 = ((pj30) list.get(i2)).P(i);
                if (iP2 > iP) {
                    iP = iP2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iP;
    }
}
