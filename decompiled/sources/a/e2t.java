package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e2t implements n2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7103a;

    public e2t(long j) {
        this.f7103a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2t) && this.f7103a == ((e2t) obj).f7103a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7103a);
    }

    public final String toString() {
        return axq.h(this.f7103a, "OnMenuActionSelected(gameId=", Separators.RPAREN);
    }
}
