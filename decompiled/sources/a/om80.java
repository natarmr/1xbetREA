package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class om80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25491a;
    public final Integer b;
    public final el80 c;
    public final int d;

    public om80(List list, Integer num, el80 el80Var, int i) {
        list.getClass();
        this.f25491a = list;
        this.b = num;
        this.c = el80Var;
        this.d = i;
    }

    public final mm80 a(int i) {
        List list = this.f25491a;
        if (list != null && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((mm80) it.next()).f22025a.isEmpty()) {
                int size = i - this.d;
                int i2 = 0;
                while (i2 < q3d.i(list) && size > q3d.i(((mm80) list.get(i2)).f22025a)) {
                    size -= ((mm80) list.get(i2)).f22025a.size();
                    i2++;
                }
                return size < 0 ? (mm80) CollectionsKt.U(list) : (mm80) list.get(i2);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof om80)) {
            return false;
        }
        om80 om80Var = (om80) obj;
        return Intrinsics.d(this.f25491a, om80Var.f25491a) && Intrinsics.d(this.b, om80Var.b) && this.c == om80Var.c && this.d == om80Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f25491a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.f25491a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return brm0.n(sb, this.d, ')');
    }
}
