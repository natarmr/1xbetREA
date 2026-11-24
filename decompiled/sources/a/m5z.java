package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m5z implements q5z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21240a;

    public m5z(long j) {
        this.f21240a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5z) && this.f21240a == ((m5z) obj).f21240a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21240a);
    }

    public final String toString() {
        return axq.h(this.f21240a, "Error(gameId=", Separators.RPAREN);
    }
}
