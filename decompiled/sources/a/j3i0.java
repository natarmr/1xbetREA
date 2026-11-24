package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class j3i0 implements l3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f15835a;
    public final long b;

    public j3i0(long j, Date date) {
        this.f15835a = date;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3i0)) {
            return false;
        }
        j3i0 j3i0Var = (j3i0) obj;
        return this.f15835a.equals(j3i0Var.f15835a) && this.b == j3i0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f15835a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSelectEndDateDialog(startDate=" + this.f15835a + ", endTime=" + this.b + Separators.RPAREN;
    }
}
