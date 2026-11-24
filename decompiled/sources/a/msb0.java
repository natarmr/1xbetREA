package a;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class msb0 implements lsb0, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22310a;

    public msb0(List list) {
        this.f22310a = list;
    }

    @Override // a.lsb0
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f22310a;
            if (i >= list.size()) {
                return true;
            }
            if (!((lsb0) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof msb0) {
            return this.f22310a.equals(((msb0) obj).f22310a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22310a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f22310a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
