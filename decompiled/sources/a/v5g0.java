package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36824a;
    public final Date b;

    public v5g0(long j, Date date) {
        this.f36824a = j;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5g0)) {
            return false;
        }
        v5g0 v5g0Var = (v5g0) obj;
        return this.f36824a == v5g0Var.f36824a && Intrinsics.d(this.b, v5g0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f36824a) * 31;
        Date date = this.b;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "ResultsFilterModel(sportId=" + this.f36824a + ", date=" + this.b + Separators.RPAREN;
    }
}
