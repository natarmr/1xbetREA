package a;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jo20 implements Map, Serializable, ohy {
    public static final fo20 n = new fo20(null);
    public static final jo20 o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f16838a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public lo20 j;
    public mo20 k;
    public ko20 l;
    public boolean m;

    static {
        jo20 jo20Var = new jo20(0);
        jo20Var.m = true;
        o = jo20Var;
    }

    public jo20(int i) {
        if (i < 0) {
            jf4.o("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        n.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f16838a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int iK = k(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iK];
                if (i3 == 0) {
                    int i4 = this.f;
                    Object[] objArr = this.f16838a;
                    if (i4 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f = i5;
                    objArr[i4] = obj;
                    this.c[i4] = iK;
                    iArr[iK] = i5;
                    this.i++;
                    this.h++;
                    if (i2 > this.e) {
                        this.e = i2;
                    }
                    return i4;
                }
                if (Intrinsics.d(this.f16838a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    l(this.d.length * 2);
                    break;
                }
                iK = iK == 0 ? this.d.length - 1 : iK - 1;
            }
        }
    }

    public final jo20 b() {
        d();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        jo20 jo20Var = o;
        jo20Var.getClass();
        return jo20Var;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        uvw.N(this.f16838a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            uvw.N(objArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d() {
        if (this.m) {
            e9d0.b();
        }
    }

    public final void e(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f16838a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        uvw.N(this.f16838a, i3, i);
        if (objArr != null) {
            uvw.N(objArr, i3, this.f);
        }
        this.f = i3;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ko20 ko20Var = this.l;
        if (ko20Var != null) {
            return ko20Var;
        }
        ko20 ko20Var2 = new ko20(this);
        this.l = ko20Var2;
        return ko20Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.i == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        boolean zD;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = h(entry.getKey());
                    if (iH < 0) {
                        zD = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        zD = Intrinsics.d(objArr[iH], entry.getValue());
                    }
                    if (!zD) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        Object[] objArr = this.f16838a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            x2 x2Var = b3.f1878a;
            int length2 = objArr.length;
            x2Var.getClass();
            int iE = x2.e(length2, i5);
            Object[] objArr2 = this.f16838a;
            objArr2.getClass();
            this.f16838a = Arrays.copyOf(objArr2, iE);
            Object[] objArr3 = this.b;
            this.b = objArr3 != null ? Arrays.copyOf(objArr3, iE) : null;
            this.c = Arrays.copyOf(this.c, iE);
            n.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iK = k(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iK];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (Intrinsics.d(this.f16838a[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iK = iK == 0 ? this.d.length - 1 : iK - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        go20 go20Var = new go20(this, (byte) 0);
        int i = 0;
        while (go20Var.hasNext()) {
            int i2 = go20Var.f15098a;
            jo20 jo20Var = (jo20) go20Var.d;
            if (i2 >= jo20Var.f) {
                itt0.a();
                return 0;
            }
            go20Var.f15098a = i2 + 1;
            go20Var.b = i2;
            Object obj = jo20Var.f16838a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = jo20Var.b;
            objArr.getClass();
            Object obj2 = objArr[go20Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            go20Var.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int j(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (Intrinsics.d(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        lo20 lo20Var = this.j;
        if (lo20Var != null) {
            return lo20Var;
        }
        lo20 lo20Var2 = new lo20(this, (byte) 0);
        this.j = lo20Var2;
        return lo20Var2;
    }

    public final void l(int i) {
        int[] iArr;
        this.h++;
        int i2 = 0;
        if (this.f > this.i) {
            e(false);
        }
        this.d = new int[i];
        n.getClass();
        this.g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int iK = k(this.f16838a[i2]);
            int i4 = this.e;
            while (true) {
                iArr = this.d;
                if (iArr[iK] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    jf4.n("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iK = iK == 0 ? iArr.length - 1 : iK - 1;
            }
            iArr[iK] = i3;
            this.c[i2] = iK;
            i2 = i3;
        }
    }

    public final void m(int i) {
        int i2;
        int i3;
        int iK;
        int[] iArr;
        Object[] objArr = this.f16838a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.c[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.d.length - 1 : length - 1;
                int[] iArr2 = this.d;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.e) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iK = k(this.f16838a[i3]) - length;
                    iArr = this.d;
                }
            } while ((iK & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.c[i3] = i4;
        }
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.f16838a.length;
            if (length < 0) {
                jf4.o("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        d();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.f16838a.length;
                if (length < 0) {
                    jf4.o("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!Intrinsics.d(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[iH];
        m(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        go20 go20Var = new go20(this, (byte) 0);
        while (go20Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = go20Var.f15098a;
            jo20 jo20Var = (jo20) go20Var.d;
            if (i2 >= jo20Var.f) {
                itt0.a();
                return null;
            }
            go20Var.f15098a = i2 + 1;
            go20Var.b = i2;
            Object obj = jo20Var.f16838a[i2];
            if (obj == jo20Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = jo20Var.b;
            objArr.getClass();
            Object obj2 = objArr[go20Var.b];
            if (obj2 == jo20Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            go20Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        mo20 mo20Var = this.k;
        if (mo20Var != null) {
            return mo20Var;
        }
        mo20 mo20Var2 = new mo20(this, (byte) 0);
        this.k = mo20Var2;
        return mo20Var2;
    }

    public jo20() {
        this(8);
    }
}
