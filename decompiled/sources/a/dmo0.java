package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dmo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6332a;
    public final List b;

    public dmo0(long j, List list) {
        list.getClass();
        this.f6332a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmo0)) {
            return false;
        }
        dmo0 dmo0Var = (dmo0) obj;
        return this.f6332a == dmo0Var.f6332a && Intrinsics.d(this.b, dmo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f6332a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f6332a, "TableTitleModel(id=", ", ratingValueCols=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
