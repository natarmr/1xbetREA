package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1837a;

    public b230(long j) {
        this.f1837a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b230) && this.f1837a == ((b230) obj).f1837a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1837a);
    }

    public final String toString() {
        return axq.h(this.f1837a, "OnCategorySelected(marketTypeId=", Separators.RPAREN);
    }
}
