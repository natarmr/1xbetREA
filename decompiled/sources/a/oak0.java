package a;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oak0 extends AbstractMap {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24931a;
    public List b = Collections.EMPTY_LIST;
    public Map c = Collections.EMPTY_MAP;
    public boolean d;
    public volatile ax3 e;

    /* JADX WARN: Multi-variable type inference failed */
    public oak0(int i) {
        this.f24931a = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((sak0) this.b.get(i3)).f31893a);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((sak0) this.b.get(i4)).f31893a);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((sak0) this.b.get(i3)).f31893a);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.d) {
            e9d0.b();
        }
    }

    public final Iterable c() {
        return this.c.isEmpty() ? dj8.j : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((sak0) this.b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.b.isEmpty();
        byte b = this.f24931a;
        if (zIsEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(b);
        }
        int i = -(iA + 1);
        if (i >= b) {
            return d().put(comparable, obj);
        }
        if (this.b.size() == b) {
            sak0 sak0Var = (sak0) this.b.remove(b - 1);
            d().put(sak0Var.f31893a, sak0Var.b);
        }
        this.b.add(i, new sak0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new ax3(this, (byte) 2);
        }
        return this.e;
    }

    public final Object f(int i) {
        b();
        Object obj = ((sak0) this.b.remove(i)).b;
        if (!this.c.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new sak0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((sak0) this.b.get(iA)).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
