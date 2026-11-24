package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mm80 extends nm80 implements Iterable, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22025a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;

    static {
        new mm80(iun.f15405a, null, null, 0, 0);
    }

    public mm80(List list, Object obj, Object obj2, int i, int i2) {
        list.getClass();
        this.f22025a = list;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            jf4.o("itemsBefore cannot be negative");
            throw null;
        }
        if (i2 == Integer.MIN_VALUE || i2 >= 0) {
            return;
        }
        jf4.o("itemsAfter cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm80)) {
            return false;
        }
        mm80 mm80Var = (mm80) obj;
        return Intrinsics.d(this.f22025a, mm80Var.f22025a) && Intrinsics.d(this.b, mm80Var.b) && Intrinsics.d(this.c, mm80Var.c) && this.d == mm80Var.d && this.e == mm80Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f22025a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return Integer.hashCode(this.e) + twn.a(this.d, (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f22025a.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.f22025a;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(CollectionsKt.firstOrNull(list));
        sb.append("\n                    |   last Item: ");
        sb.append(CollectionsKt.f0(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.c);
        sb.append("\n                    |   prevKey: ");
        sb.append(this.b);
        sb.append("\n                    |   itemsBefore: ");
        sb.append(this.d);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.e);
        sb.append("\n                    |) ");
        return ntm0.d(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mm80(List list, Object obj, Object obj2) {
        this(list, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
        list.getClass();
    }
}
