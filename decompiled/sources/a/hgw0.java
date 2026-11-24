package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hgw0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f13033a;
    public Object b;
    public final /* synthetic */ ggw0 c;

    public hgw0(ggw0 ggw0Var, Comparable comparable, Object obj) {
        this.c = ggw0Var;
        this.f13033a = comparable;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f13033a.compareTo(((hgw0) obj).f13033a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f13033a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f13033a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f13033a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.f();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13033a);
        String strValueOf2 = String.valueOf(this.b);
        return rw2.o(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
