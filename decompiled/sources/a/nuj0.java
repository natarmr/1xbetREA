package a;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class nuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24151a;
    public Object[] b;
    public int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nuj0(nuj0 nuj0Var) {
        this(0);
        int i = nuj0Var.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(nuj0Var.f(i2), nuj0Var.j(i2));
            }
        } else if (i > 0) {
            qx3.d(0, 0, i, nuj0Var.f24151a, this.f24151a);
            qx3.e(0, 0, i << 1, nuj0Var.b, this.b);
            this.c = i;
        }
    }

    public final int a(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.f24151a;
        if (iArr.length < i) {
            this.f24151a = Arrays.copyOf(iArr, i);
            this.b = Arrays.copyOf(this.b, i * 2);
        }
        if (this.c == i2) {
            return;
        }
        jf4.e();
    }

    public final int c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int iX = jd8.X(i2, i, this.f24151a);
        if (iX < 0 || Intrinsics.d(obj, this.b[iX << 1])) {
            return iX;
        }
        int i3 = iX + 1;
        while (i3 < i2 && this.f24151a[i3] == i) {
            if (Intrinsics.d(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iX - 1; i4 >= 0 && this.f24151a[i4] == i; i4--) {
            if (Intrinsics.d(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        int i = this.c;
        if (i > 0) {
            this.f24151a = jd8.h;
            this.b = jd8.j;
            i = 0;
            this.c = 0;
        }
        if (i <= 0) {
            return;
        }
        jf4.e();
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int iX = jd8.X(i, 0, this.f24151a);
        if (iX < 0 || this.b[iX << 1] == null) {
            return iX;
        }
        int i2 = iX + 1;
        while (i2 < i && this.f24151a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iX - 1; i3 >= 0 && this.f24151a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof nuj0) {
                int i = this.c;
                if (i != ((nuj0) obj).c) {
                    return false;
                }
                nuj0 nuj0Var = (nuj0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objJ = j(i2);
                    Object obj2 = nuj0Var.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !nuj0Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objJ2 = j(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return this.b[i << 1];
        }
        jf4.o(twn.m(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            jf4.o(twn.m(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f24151a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                qx3.d(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                qx3.e(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f24151a = Arrays.copyOf(iArr, i7);
            this.b = Arrays.copyOf(this.b, i7 << 1);
            if (i2 != this.c) {
                jf4.e();
                return null;
            }
            if (i > 0) {
                qx3.d(0, 0, i, iArr, this.f24151a);
                qx3.e(0, 0, i3, objArr, this.b);
            }
            if (i < i4) {
                int i8 = i + 1;
                qx3.d(i, i8, i2, iArr, this.f24151a);
                qx3.e(i3, i8 << 1, i2 << 1, objArr, this.b);
            }
        }
        if (i2 == this.c) {
            this.c = i4;
            return obj;
        }
        jf4.e();
        return null;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.b[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (!z) {
            jf4.o(twn.m(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f24151a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return this.b[(i << 1) + 1];
        }
        jf4.o(twn.m(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.f24151a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f24151a = Arrays.copyOf(iArr, i4);
            this.b = Arrays.copyOf(this.b, i4 << 1);
            if (i != this.c) {
                jf4.e();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f24151a;
            int i5 = i3 + 1;
            qx3.d(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.b;
            qx3.e(i5 << 1, i3 << 1, this.c << 1, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.f24151a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        jf4.e();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.d(obj2, j(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.d(obj2, j(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public nuj0(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = jd8.h;
        } else {
            iArr = new int[i];
        }
        this.f24151a = iArr;
        if (i == 0) {
            objArr = jd8.j;
        } else {
            objArr = new Object[i << 1];
        }
        this.b = objArr;
    }

    public nuj0() {
        this(0);
    }
}
