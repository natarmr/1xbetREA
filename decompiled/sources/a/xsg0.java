package a;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xsg0 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41415a;
    public final Object b;
    public xsg0 c;
    public xsg0 d;

    public xsg0(Object obj, Object obj2) {
        this.f41415a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xsg0)) {
            return false;
        }
        xsg0 xsg0Var = (xsg0) obj;
        return this.f41415a.equals(xsg0Var.f41415a) && this.b.equals(xsg0Var.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f41415a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.f41415a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f41415a + "=" + this.b;
    }
}
