package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class w3j implements z3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38505a;

    public w3j(long j) {
        this.f38505a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3j) && this.f38505a == ((w3j) obj).f38505a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38505a);
    }

    public final String toString() {
        return axq.h(this.f38505a, "OnDetailsButtonClick(id=", Separators.RPAREN);
    }
}
