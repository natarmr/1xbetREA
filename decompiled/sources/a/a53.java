package a;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class a53 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53 f250a;
    public pu90[] b;
    public pu90[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final z43 h = new z43(this, (byte) 1);
    public final z43 i = new z43(this, (byte) 0);

    public a53(i53 i53Var) {
        this.f250a = i53Var;
    }

    @Override // a.tj30
    public final int a(cnx cnxVar, List list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Pair pair;
        int size = list.size();
        pu90[] pu90VarArr = new pu90[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            pj30 pj30Var = (pj30) list.get(i);
            Object objN = pj30Var.n();
            d53 d53Var = objN instanceof d53 ? (d53) objN : null;
            if (d53Var != null && ((Boolean) ((hgk0) d53Var.b).getValue()).booleanValue()) {
                pu90 pu90VarS = pj30Var.S(j);
                long j3 = (((long) pu90VarS.b) & 4294967295L) | (((long) pu90VarS.f27604a) << 32);
                pu90VarArr[i] = pu90VarS;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            pj30 pj30Var2 = (pj30) list.get(i2);
            if (pu90VarArr[i2] == null) {
                pu90VarArr[i2] = pj30Var2.S(j);
            }
        }
        if (vj30Var.M()) {
            pair = new Pair(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                pu90 pu90Var = pu90VarArr[i5];
                if (pu90Var != null) {
                    Object objN2 = ((pj30) list.get(i5)).n();
                    d53 d53Var2 = objN2 instanceof d53 ? (d53) objN2 : null;
                    if (d53Var2 == null || !((Boolean) ((hgk0) d53Var2.c).getValue()).booleanValue()) {
                        int i6 = pu90Var.f27604a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = pu90Var.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) pair.f46059a).intValue();
        int iIntValue2 = ((Number) pair.b).intValue();
        if (vj30Var.M()) {
            this.b = pu90VarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return vj30.x(vj30Var, iIntValue, iIntValue2, this.h);
        }
        ((hgk0) this.f250a.c).setValue(new qkx((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = pu90VarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return vj30.x(vj30Var, iIntValue, iIntValue2, this.i);
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // a.tj30
    public final int d(cnx cnxVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((pj30) list.get(0)).L(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pj30) list.get(i2)).L(i));
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // a.tj30
    public final int e(cnx cnxVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((pj30) list.get(0)).P(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pj30) list.get(i2)).P(i));
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
