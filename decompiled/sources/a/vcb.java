package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37180a;

    public final boolean equals(Object obj) {
        if (obj instanceof vcb) {
            return this.f37180a == ((vcb) obj).f37180a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37180a);
    }

    public final String toString() {
        return axq.h(this.f37180a, "SubSportId(subSportId=", Separators.RPAREN);
    }
}
