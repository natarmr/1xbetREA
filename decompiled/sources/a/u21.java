package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34924a;
    public final v21 b;
    public final r21 c;

    public u21(List list, v21 v21Var, r21 r21Var) {
        list.getClass();
        this.f34924a = list;
        this.b = v21Var;
        this.c = r21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u21)) {
            return false;
        }
        u21 u21Var = (u21) obj;
        return Intrinsics.d(this.f34924a, u21Var.f34924a) && this.b == u21Var.b && this.c == u21Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f34924a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AggregatorHistoryFilterModel(statusFilter=" + this.f34924a + ", gameType=" + this.b + ", betType=" + this.c + Separators.RPAREN;
    }
}
