package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class vy40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f38232a;
    public int b;
    public ty40 c;

    public vy40(int i) {
        this.f38232a = i == 0 ? w960.f38764a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.f38232a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.f38232a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(vy40 vy40Var) {
        vy40Var.getClass();
        if (vy40Var.i()) {
            return;
        }
        int i = this.b + vy40Var.b;
        Object[] objArr = this.f38232a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        qx3.e(this.b, 0, vy40Var.b, vy40Var.f38232a, this.f38232a);
        this.b += vy40Var.b;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.f38232a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.f38232a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        qx3.l(0, this.b, null, this.f38232a);
        this.b = 0;
    }

    public final boolean e(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vy40) {
            vy40 vy40Var = (vy40) obj;
            int i = vy40Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.f38232a;
                Object[] objArr2 = vy40Var.f38232a;
                IntRange intRangeO = l1e0.o(0, i2);
                int i3 = intRangeO.f46068a;
                int i4 = intRangeO.b;
                if (i3 > i4) {
                    return true;
                }
                while (Intrinsics.d(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f() {
        if (!i()) {
            return this.f38232a[0];
        }
        v4i0.o("ObjectList is empty.");
        return null;
    }

    public final Object g(int i) {
        if (i >= 0 && i < this.b) {
            return this.f38232a[i];
        }
        p(i);
        throw null;
    }

    public final int h(Object obj) {
        Object[] objArr = this.f38232a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int hashCode() {
        Object[] objArr = this.f38232a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public final boolean j() {
        return this.b != 0;
    }

    public final boolean k(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return false;
        }
        l(iH);
        return true;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            p(i);
            throw null;
        }
        Object[] objArr = this.f38232a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            qx3.e(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            hny.k(this.b, dw9.t("Start (", i, ") and end (", ") must be in 0..", i2));
            return;
        }
        if (i2 < i) {
            jf4.o(ohs0.m("Start (", i, ") is more than end (", Separators.RPAREN, i2));
            return;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f38232a;
                qx3.e(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            qx3.l(i5, i4, null, this.f38232a);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        qx3.e(0, 0, length, objArr, objArr2);
        this.f38232a = objArr2;
    }

    public final Object o(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            p(i);
            throw null;
        }
        Object[] objArr = this.f38232a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void p(int i) {
        throw new IndexOutOfBoundsException(f140.j(i, "Index ", this.b - 1, " must be in 0.."));
    }

    public final void q(int i) {
        throw new IndexOutOfBoundsException(f140.j(i, "Index ", this.b, " must be in 0.."));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f38232a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ vy40() {
        this(16);
    }
}
