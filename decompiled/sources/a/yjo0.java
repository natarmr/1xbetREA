package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42751a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public yjo0(String str, boolean z, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f42751a = str;
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
        if (obj instanceof yjo0) {
            yjo0 yjo0Var = (yjo0) obj;
            String str = yjo0Var.f42751a;
            if (this.b == yjo0Var.b && Intrinsics.d(this.c, yjo0Var.c) && Intrinsics.d(this.d, yjo0Var.d)) {
                String str2 = this.f42751a;
                return kotlin.text.c.x(str2, "index_", false) ? kotlin.text.c.x(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f42751a;
        return this.d.hashCode() + dw9.a((((kotlin.text.c.x(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f42751a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        ntm0.b(CollectionsKt.b0(this.c, Separators.COMMA, null, null, null, 62));
        ntm0.b("},");
        Unit unit = Unit.f46060a;
        sb.append(unit);
        sb.append("\n            |   orders = {");
        ntm0.b(CollectionsKt.b0(this.d, Separators.COMMA, null, null, null, 62));
        ntm0.b(" }");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return ntm0.b(ntm0.d(sb.toString()));
    }
}
