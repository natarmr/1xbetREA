package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v3z implements x3z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36754a;

    public v3z(long j) {
        this.f36754a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3z) && this.f36754a == ((v3z) obj).f36754a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36754a);
    }

    public final String toString() {
        return axq.h(this.f36754a, "RunTransfer(gameId=", Separators.RPAREN);
    }
}
