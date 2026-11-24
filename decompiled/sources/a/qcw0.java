package a;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qcw0 extends AbstractMap {
    public static final jzt0 f = new jzt0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f28505a;
    public final int[] b;
    public final pcw0 c;
    public Integer d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.qcw0, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.qcw0] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public qcw0(qcw0 qcw0Var, qcw0 qcw0Var2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.c = new pcw0(abstractMap, -1);
        abstractMap.d = null;
        abstractMap.e = null;
        int size = qcw0Var2.size() + qcw0Var.size();
        int i = qcw0Var.b[qcw0Var.size()] + qcw0Var2.b[qcw0Var2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryC = qcw0Var.c(0);
        Map.Entry entryC2 = qcw0Var2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        int i6 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            i6++;
            if (entryC != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryC.getKey(), new pcw0(abstractMap, i6));
                        pcw0 pcw0Var = (pcw0) entryC.getValue();
                        pcw0 pcw0Var2 = (pcw0) entryC2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iC = pcw0Var.c();
                            qcw0 qcw0Var3 = pcw0Var.b;
                            if (i9 >= iC - pcw0Var.b() && i10 >= pcw0Var2.c() - pcw0Var2.b()) {
                                break;
                            }
                            int iCompare = i9 == pcw0Var.c() - pcw0Var.b() ? 1 : i10 == pcw0Var2.c() - pcw0Var2.b() ? -1 : 0;
                            if (iCompare == 0) {
                                jzt0 jzt0Var = rcw0.b;
                                iCompare = rcw0.b.compare(qcw0Var3.f28505a[pcw0Var.b() + i9], pcw0Var2.b.f28505a[pcw0Var2.b() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = qcw0Var3.f28505a[pcw0Var.b() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = pcw0Var2.b.f28505a[pcw0Var2.b() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i6] = iA;
                        entryC = qcw0Var.c(i8);
                        entryC2 = qcw0Var2.c(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iA = a(entryC, i6, iA, objArr2, iArr);
                entryC = qcw0Var.c(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC;
            i4++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = qcw0Var2.c(i4);
            iA = iA2;
            entryC = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (b(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.f28505a = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.b = b(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    public static boolean b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        pcw0 pcw0Var = (pcw0) entry.getValue();
        int iC = pcw0Var.c() - pcw0Var.b();
        System.arraycopy(pcw0Var.b.f28505a, pcw0Var.b(), objArr, i2, iC);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new pcw0(this, i));
        int i3 = i2 + iC;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.b[0]) {
            return (Map.Entry) this.f28505a[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer numValueOf = this.d;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(super.hashCode());
            this.d = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.e = string;
        return string;
    }

    public qcw0() {
        List list = Collections.EMPTY_LIST;
        this.c = new pcw0(this, -1);
        this.d = null;
        this.e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f28505a = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.b = iArr;
                return;
            }
            throw rw2.h(it2);
        }
        throw rw2.h(it);
    }
}
