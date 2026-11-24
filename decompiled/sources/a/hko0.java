package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hko0 {
    public static final hko0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13217a;
    public final List b;
    public final List c;

    static {
        iun iunVar = iun.f15405a;
        d = new hko0(iunVar, iunVar, iunVar);
    }

    public hko0(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f13217a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hko0)) {
            return false;
        }
        hko0 hko0Var = (hko0) obj;
        return Intrinsics.d(this.f13217a, hko0Var.f13217a) && Intrinsics.d(this.b, hko0Var.b) && Intrinsics.d(this.c, hko0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f13217a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("TableModel(tableColumnTitles=", ", tableRows=", this.f13217a, ", results=", this.b), this.c, Separators.RPAREN);
    }
}
