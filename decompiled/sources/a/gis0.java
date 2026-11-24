package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gis0 implements pis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11365a;

    public gis0(long j) {
        this.f11365a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gis0) && this.f11365a == ((gis0) obj).f11365a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11365a);
    }

    public final String toString() {
        return axq.h(this.f11365a, "OnDisciplineSubSportSelect(subSportId=", Separators.RPAREN);
    }
}
