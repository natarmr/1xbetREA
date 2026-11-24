package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nb30 implements pb30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23221a;

    public nb30(long j) {
        this.f23221a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nb30) && this.f23221a == ((nb30) obj).f23221a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23221a);
    }

    public final String toString() {
        return axq.h(this.f23221a, "OnChipsClicked(chipsId=", Separators.RPAREN);
    }
}
