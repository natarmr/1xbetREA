package a;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ggw0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f11271a;
    public int b;
    public Map c;
    public boolean d;
    public volatile ax3 e;
    public Map f;

    public ggw0() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final hgw0 a(int i) {
        if (i < this.b) {
            return (hgw0) this.f11271a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((hgw0) this.f11271a[iE]).setValue(obj);
        }
        f();
        Object[] objArr = this.f11271a;
        if (objArr == null) {
            objArr = new Object[16];
            this.f11271a = objArr;
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.b == 16) {
            hgw0 hgw0Var = (hgw0) objArr[15];
            this.b = 15;
            g().put(hgw0Var.f13033a, hgw0Var.b);
        }
        Object[] objArr2 = this.f11271a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.f11271a[i] = new hgw0(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.b != 0) {
            this.f11271a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.f11271a;
        Object obj = ((hgw0) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f11271a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new hgw0(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((hgw0) this.f11271a[i2]).f13033a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((hgw0) this.f11271a[i4]).f13033a);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new ax3(this, (byte) 4);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggw0)) {
            return super.equals(obj);
        }
        ggw0 ggw0Var = (ggw0) obj;
        int size = size();
        if (size == ggw0Var.size()) {
            int i = this.b;
            if (i != ggw0Var.b) {
                return entrySet().equals(ggw0Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(ggw0Var.a(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(ggw0Var.c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.d) {
            e9d0.b();
        }
    }

    public final SortedMap g() {
        f();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((hgw0) this.f11271a[iE]).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f11271a[i2].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
