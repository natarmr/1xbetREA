package a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class atg0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xsg0 f1431a;
    public xsg0 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final Object b(Object obj, Object obj2) {
        xsg0 xsg0Var = this.f1431a;
        while (xsg0Var != null && !xsg0Var.f41415a.equals(obj)) {
            xsg0Var = xsg0Var.c;
        }
        if (xsg0Var != null) {
            return xsg0Var.b;
        }
        xsg0 xsg0Var2 = new xsg0(obj, obj2);
        this.d++;
        xsg0 xsg0Var3 = this.b;
        if (xsg0Var3 == null) {
            this.f1431a = xsg0Var2;
            this.b = xsg0Var2;
            return null;
        }
        xsg0Var3.c = xsg0Var2;
        xsg0Var2.d = xsg0Var3;
        this.b = xsg0Var2;
        return null;
    }

    public final boolean equals(Object obj) {
        wsg0 wsg0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof atg0)) {
            return false;
        }
        atg0 atg0Var = (atg0) obj;
        if (this.d != atg0Var.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = atg0Var.iterator();
        while (true) {
            wsg0Var = (wsg0) it;
            if (!wsg0Var.hasNext()) {
                break;
            }
            wsg0 wsg0Var2 = (wsg0) it2;
            if (!wsg0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) wsg0Var.next();
            Object next = wsg0Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (wsg0Var.hasNext() || ((wsg0) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            wsg0 wsg0Var = (wsg0) it;
            if (!wsg0Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) wsg0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        xsg0 xsg0Var = this.f1431a;
        xsg0 xsg0Var2 = this.b;
        wsg0 wsg0Var = new wsg0();
        wsg0Var.f39690a = xsg0Var2;
        wsg0Var.b = xsg0Var;
        this.c.put(wsg0Var, Boolean.FALSE);
        return wsg0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            wsg0 wsg0Var = (wsg0) it;
            if (!wsg0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) wsg0Var.next()).toString());
            if (wsg0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
