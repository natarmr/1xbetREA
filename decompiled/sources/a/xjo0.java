package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40996a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public xjo0(String str, boolean z, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f40996a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xjo0) {
            xjo0 xjo0Var = (xjo0) obj;
            String str = xjo0Var.f40996a;
            if (this.b == xjo0Var.b && Intrinsics.d(this.c, xjo0Var.c) && Intrinsics.d(this.d, xjo0Var.d)) {
                String str2 = this.f40996a;
                return kotlin.text.c.x(str2, "index_", false) ? kotlin.text.c.x(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f40996a;
        return this.d.hashCode() + dw9.a((((kotlin.text.c.x(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        String strT = u4n0.t(this.c);
        String strS = u4n0.s(this.d);
        StringBuilder sbU = brm0.u("\n                |Index {\n                |   name = '", this.f40996a, "',\n                |   unique = '", this.b, "',\n                |   columns = {");
        sbU.append(strT);
        sbU.append("\n                |   orders = {");
        sbU.append(strS);
        sbU.append("\n                |}\n            ");
        return ntm0.b(ntm0.d(sbU.toString()));
    }
}
