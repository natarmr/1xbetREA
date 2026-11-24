package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class bbi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f2310a;
    public static final d1i0 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new mto(new mto(i == 0 ? s7f.g : s7f.d, (byte) 6), (byte) 7);
            i++;
        }
        f2310a = comparatorArr;
        b = new d1i0((byte) 23);
    }

    public static final void a(tai0 tai0Var, ArrayList arrayList, m51 m51Var, m51 m51Var2, ey40 ey40Var) {
        nai0 nai0Var = tai0Var.d;
        Object objG = nai0Var.f23193a.g(xai0.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) m51Var2.invoke(tai0Var)).booleanValue()) && ((Boolean) m51Var.invoke(tai0Var)).booleanValue()) {
            arrayList.add(tai0Var);
        }
        if (zBooleanValue) {
            ey40Var.j(tai0Var.f, b(tai0Var, m51Var, m51Var2, tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0)));
            return;
        }
        List listI = tai0Var.i((4 & 1) != 0 ? !tai0Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            a((tai0) listI.get(i), arrayList, m51Var, m51Var2, ey40Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(tai0 tai0Var, m51 m51Var, m51 m51Var2, List list) {
        int i;
        ey40 ey40Var = hkx.f13229a;
        ey40 ey40Var2 = new ey40();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((tai0) list.get(i2), arrayList, m51Var, m51Var2, ey40Var2);
        }
        int i3 = 1;
        char c = tai0Var.c.A == k6z.b ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                tai0 tai0Var2 = (tai0) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new Pair(tai0Var2.h(), q3d.l(tai0Var2)));
                    break;
                }
                float f = tai0Var2.h().b;
                float f2 = tai0Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        jge0 jge0Var = (jge0) ((Pair) arrayList2.get(i6)).f46059a;
                        float f3 = jge0Var.b;
                        i = i3;
                        float f4 = jge0Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new Pair(new jge0(Math.max(jge0Var.f16474a, 0.0f), Math.max(jge0Var.b, f), Math.min(jge0Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).b));
                            ((List) ((Pair) arrayList2.get(i6)).b).add(tai0Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new Pair(tai0Var2.h(), q3d.l(tai0Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        v3d.t(s7f.h, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f2310a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            v3d.t(comparator, (List) pair.b);
            arrayList3.addAll((Collection) pair.b);
        }
        v3d.t(new l13((byte) 22), arrayList3);
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) ey40Var2.b(((tai0) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) m51Var2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
