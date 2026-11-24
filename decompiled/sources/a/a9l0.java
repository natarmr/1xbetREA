package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a9l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f484a;
    public final long b;

    public a9l0(long j, List list) {
        list.getClass();
        this.f484a = list;
        this.b = j;
    }

    public static a9l0 a(a9l0 a9l0Var, ArrayList arrayList, long j, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = a9l0Var.f484a;
        }
        if ((i & 2) != 0) {
            j = a9l0Var.b;
        }
        list.getClass();
        return new a9l0(j, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9l0)) {
            return false;
        }
        a9l0 a9l0Var = (a9l0) obj;
        return Intrinsics.d(this.f484a, a9l0Var.f484a) && this.b == a9l0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f484a.hashCode() * 31);
    }

    public final String toString() {
        return "SportFilterState(list=" + this.f484a + ", selectedFilterId=" + this.b + Separators.RPAREN;
    }
}
