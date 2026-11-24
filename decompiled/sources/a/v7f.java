package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v7f {
    public static final v7f c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36921a;
    public final List b;

    static {
        iun iunVar = iun.f15405a;
        c = new v7f(iunVar, iunVar);
    }

    public v7f(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f36921a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7f)) {
            return false;
        }
        v7f v7fVar = (v7f) obj;
        return Intrinsics.d(this.f36921a, v7fVar.f36921a) && Intrinsics.d(this.b, v7fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36921a.hashCode() * 31);
    }

    public final String toString() {
        return "CpuInfo(commonInfo=" + this.f36921a + ", perProcessorInfo=" + this.b + ')';
    }
}
