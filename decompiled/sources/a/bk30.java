package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bk30 implements r96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4e f2731a;
    public LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final f7m0 e;
    public final int[] f;
    public final int[] g;
    public float h;

    public bk30(w6k w6kVar) {
        l4e l4eVar = new l4e(0, 0);
        l4eVar.u0 = new ArrayList();
        l4eVar.v0 = new phf0(l4eVar);
        h7k h7kVar = new h7k(l4eVar);
        l4eVar.w0 = h7kVar;
        l4eVar.y0 = null;
        l4eVar.z0 = false;
        l4eVar.A0 = new p900();
        l4eVar.D0 = 0;
        l4eVar.E0 = 0;
        l4eVar.F0 = new lbb[4];
        l4eVar.G0 = new lbb[4];
        l4eVar.H0 = 257;
        l4eVar.I0 = false;
        l4eVar.J0 = false;
        l4eVar.K0 = null;
        l4eVar.L0 = null;
        l4eVar.M0 = null;
        l4eVar.N0 = null;
        l4eVar.O0 = new HashSet();
        l4eVar.P0 = new q96();
        l4eVar.y0 = this;
        h7kVar.h = this;
        this.f2731a = l4eVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new f7m0(w6kVar);
        this.f = new int[2];
        this.g = new int[2];
        this.h = Float.NaN;
    }

    public static void d(j4e j4eVar, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int iOrdinal = j4eVar.ordinal();
        if (iOrdinal == 0) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 1) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (iOrdinal == 2) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 3) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((j4eVar + " is not supported").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.r96
    public final void b(k4e k4eVar, q96 q96Var) {
        int i;
        int i2;
        Integer numValueOf;
        int i3;
        Integer numValueOf2;
        Integer num;
        int iIntValue;
        int i4;
        int i5;
        Integer numValueOf3;
        int i6;
        Integer numValueOf4;
        Integer num2;
        int iIntValue2;
        boolean z;
        boolean z2;
        int iC0;
        char c;
        Object obj;
        String str = k4eVar.k;
        LinkedHashMap linkedHashMap = this.c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        j4e j4eVar = q96Var.f28332a;
        int i7 = q96Var.c;
        int i8 = k4eVar.s;
        int i9 = q96Var.j;
        boolean z3 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != k4eVar.m()) {
            z3 = false;
        }
        boolean zC = k4eVar.C();
        f7m0 f7m0Var = this.e;
        d(j4eVar, i7, i8, i9, z3, zC, p4e.i(f7m0Var.l), this.f);
        d(q96Var.b, q96Var.d, k4eVar.t, q96Var.j, (numArr != null ? numArr[0].intValue() : 0) == k4eVar.s(), k4eVar.D(), p4e.h(f7m0Var.l), this.g);
        int[] iArr = this.f;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = this.g;
        long jA = r4e.a(i10, i11, iArr2[0], iArr2[1]);
        int i12 = q96Var.j;
        if (i12 == 1 || i12 == 2) {
            long jC = c(k4eVar, jA);
            k4eVar.g = false;
            i = (int) (jC >> 32);
            Integer numValueOf5 = Integer.valueOf(i);
            i2 = k4eVar.v;
            numValueOf = Integer.valueOf(i2);
            if (i2 <= 0) {
                numValueOf = null;
            }
            i3 = k4eVar.w;
            numValueOf2 = Integer.valueOf(i3);
            if (i3 > 0) {
                num = numValueOf2;
            } else {
                num = null;
            }
            iIntValue = ((Number) l1e0.h(numValueOf5, numValueOf, num)).intValue();
            i4 = (int) (jC & 4294967295L);
            Integer numValueOf6 = Integer.valueOf(i4);
            i5 = k4eVar.y;
            numValueOf3 = Integer.valueOf(i5);
            if (i5 <= 0) {
                numValueOf3 = null;
            }
            i6 = k4eVar.z;
            numValueOf4 = Integer.valueOf(i6);
            if (i6 > 0) {
                num2 = numValueOf4;
            } else {
                num2 = null;
            }
            iIntValue2 = ((Number) l1e0.h(numValueOf6, numValueOf3, num2)).intValue();
            if (iIntValue != i) {
                jA = r4e.a(iIntValue, iIntValue, p4e.j(jA), p4e.h(jA));
                z = true;
            } else {
                z = false;
            }
            if (iIntValue2 != i4) {
                jA = r4e.a(p4e.k(jA), p4e.i(jA), iIntValue2, iIntValue2);
                z2 = true;
            } else {
                z2 = z;
            }
            if (z2) {
                c(k4eVar, jA);
                k4eVar.g = false;
            }
        } else {
            j4e j4eVar2 = q96Var.f28332a;
            j4e j4eVar3 = j4e.c;
            if (j4eVar2 != j4eVar3 || k4eVar.s != 0 || q96Var.b != j4eVar3 || k4eVar.t != 0) {
                long jC2 = c(k4eVar, jA);
                k4eVar.g = false;
                i = (int) (jC2 >> 32);
                Integer numValueOf7 = Integer.valueOf(i);
                i2 = k4eVar.v;
                numValueOf = Integer.valueOf(i2);
                if (i2 <= 0) {
                    numValueOf = null;
                }
                i3 = k4eVar.w;
                numValueOf2 = Integer.valueOf(i3);
                if (i3 > 0) {
                    num = numValueOf2;
                } else {
                    num = null;
                }
                iIntValue = ((Number) l1e0.h(numValueOf7, numValueOf, num)).intValue();
                i4 = (int) (jC2 & 4294967295L);
                Integer numValueOf8 = Integer.valueOf(i4);
                i5 = k4eVar.y;
                numValueOf3 = Integer.valueOf(i5);
                if (i5 <= 0) {
                    numValueOf3 = null;
                }
                i6 = k4eVar.z;
                numValueOf4 = Integer.valueOf(i6);
                if (i6 > 0) {
                    num2 = numValueOf4;
                } else {
                    num2 = null;
                }
                iIntValue2 = ((Number) l1e0.h(numValueOf8, numValueOf3, num2)).intValue();
                if (iIntValue != i) {
                    jA = r4e.a(iIntValue, iIntValue, p4e.j(jA), p4e.h(jA));
                    z = true;
                } else {
                    z = false;
                }
                if (iIntValue2 != i4) {
                    jA = r4e.a(p4e.k(jA), p4e.i(jA), iIntValue2, iIntValue2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    c(k4eVar, jA);
                    k4eVar.g = false;
                }
            }
        }
        pu90 pu90Var = (pu90) this.b.get(k4eVar.h0);
        q96Var.e = pu90Var != null ? pu90Var.f27604a : k4eVar.s();
        q96Var.f = pu90Var != null ? pu90Var.b : k4eVar.m();
        if (pu90Var != null) {
            ArrayList arrayList = f7m0Var.i;
            if (f7m0Var.j) {
                arrayList.clear();
                Iterator it = f7m0Var.h.iterator();
                while (it.hasNext()) {
                    k4e k4eVarA = ((vme0) f7m0Var.c.get(it.next())).a();
                    if (k4eVarA != null) {
                        arrayList.add(k4eVarA);
                    }
                }
                f7m0Var.j = false;
            }
            if (arrayList.contains(k4eVar)) {
                iC0 = pu90Var.c0(z12.f43597a);
            } else {
                iC0 = Integer.MIN_VALUE;
            }
        } else {
            iC0 = Integer.MIN_VALUE;
        }
        q96Var.h = iC0 != Integer.MIN_VALUE;
        q96Var.g = iC0;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            c = 0;
            Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
            linkedHashMap.put(str, numArr2);
            obj = numArr2;
        } else {
            c = 0;
            obj = obj2;
        }
        Integer[] numArr3 = (Integer[]) obj;
        numArr3[c] = Integer.valueOf(q96Var.e);
        numArr3[1] = Integer.valueOf(q96Var.f);
        numArr3[2] = Integer.valueOf(q96Var.g);
        q96Var.i = (q96Var.e == q96Var.c && q96Var.f == q96Var.d) ? c : 1;
    }

    public final long c(k4e k4eVar, long j) {
        int i;
        Object obj = k4eVar.h0;
        String str = k4eVar.k;
        int i2 = 0;
        if (!(k4eVar instanceof zru0)) {
            if (obj instanceof pj30) {
                pu90 pu90VarS = ((pj30) obj).S(j);
                this.b.put(obj, pu90VarS);
                return akx.a(pu90VarS.f27604a, pu90VarS.b);
            }
            Log.w("CCL", "Nothing to measure for widget: " + str);
            return akx.a(0, 0);
        }
        if (p4e.g(j)) {
            i = 1073741824;
        } else {
            i = p4e.e(j) ? Integer.MIN_VALUE : 0;
        }
        if (p4e.f(j)) {
            i2 = 1073741824;
        } else if (p4e.d(j)) {
            i2 = Integer.MIN_VALUE;
        }
        zru0 zru0Var = (zru0) k4eVar;
        zru0Var.Z(i, p4e.i(j), i2, p4e.h(j));
        return akx.a(zru0Var.D0, zru0Var.E0);
    }

    public final void e(ou90 ou90Var, List list, LinkedHashMap linkedHashMap) {
        pu90 pu90Var;
        ou90 ou90Var2;
        this.b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = this.d;
        int i = 0;
        if (linkedHashMap2.isEmpty()) {
            ArrayList arrayList = this.f2731a.u0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                k4e k4eVar = (k4e) arrayList.get(i2);
                Object obj = k4eVar.h0;
                if (obj instanceof pj30) {
                    vdv0 vdv0Var = k4eVar.j;
                    vdv0Var.d();
                    linkedHashMap2.put(h8x.I((pj30) obj), new vdv0(vdv0Var));
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            pj30 pj30Var = (pj30) list.get(i);
            vdv0 vdv0Var2 = (vdv0) linkedHashMap2.get(h8x.I(pj30Var));
            if (vdv0Var2 == null || (pu90Var = (pu90) this.b.get(pj30Var)) == null || vdv0Var2.q == 8) {
                ou90Var2 = ou90Var;
            } else if (vdv0Var2.c()) {
                ou90.j(ou90Var, pu90Var, (((long) vdv0Var2.c) & 4294967295L) | (((long) vdv0Var2.b) << 32));
                ou90Var2 = ou90Var;
            } else {
                ou90Var2 = ou90Var;
                ou90Var2.D(pu90Var, vdv0Var2.b, vdv0Var2.c, Float.isNaN(vdv0Var2.m) ? 0.0f : vdv0Var2.m, new s43(vdv0Var2, (byte) 3));
            }
            i++;
            ou90Var = ou90Var2;
        }
    }

    public final long f(long j, k6z k6zVar, s3e s3eVar, List list, LinkedHashMap linkedHashMap) {
        tmk tmkVarH;
        tmk tmkVarH2;
        this.b = linkedHashMap;
        if (list.isEmpty()) {
            return n2x.b(p4e.k(j), p4e.j(j));
        }
        if (p4e.g(j)) {
            tmkVarH = tmk.e(p4e.i(j));
        } else {
            tmkVarH = tmk.h();
            int iK = p4e.k(j);
            if (iK >= 0) {
                tmkVarH.b = iK;
            }
        }
        f7m0 f7m0Var = this.e;
        k3e k3eVar = f7m0Var.f;
        k3e k3eVar2 = f7m0Var.f;
        k3eVar.d0 = tmkVarH;
        if (p4e.f(j)) {
            tmkVarH2 = tmk.e(p4e.h(j));
        } else {
            tmkVarH2 = tmk.h();
            int iJ = p4e.j(j);
            if (iJ >= 0) {
                tmkVarH2.b = iJ;
            }
        }
        k3eVar2.e0 = tmkVarH2;
        tmk tmkVar = k3eVar2.d0;
        l4e l4eVar = this.f2731a;
        tmkVar.a(l4eVar, 0);
        k3eVar2.e0.a(l4eVar, 1);
        f7m0Var.l = j;
        f7m0Var.b = !(k6zVar == k6z.b);
        this.b.clear();
        this.c.clear();
        this.d.clear();
        if (s3eVar.a(list)) {
            f7m0Var.g();
            s3eVar.b(f7m0Var, list);
            jeb.L(f7m0Var, list);
            f7m0Var.a(l4eVar);
        } else {
            jeb.L(f7m0Var, list);
        }
        l4eVar.T(p4e.i(j));
        l4eVar.O(p4e.h(j));
        this.h = Float.NaN;
        l4eVar.v0.z(l4eVar);
        l4eVar.H0 = 257;
        p900.q = l4eVar.d0(512);
        l4eVar.b0(l4eVar.H0, 0, 0, 0, 0, 0, 0);
        return n2x.b(l4eVar.s(), l4eVar.m());
    }

    @Override // a.r96
    public final void a() {
    }
}
