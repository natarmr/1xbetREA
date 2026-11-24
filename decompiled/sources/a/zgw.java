package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44363a;

    public zgw(long j) {
        this.f44363a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgw) && this.f44363a == ((zgw) obj).f44363a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44363a);
    }

    public final String toString() {
        return axq.h(this.f44363a, "OnDisciplineClick(disciplineId=", Separators.RPAREN);
    }
}
