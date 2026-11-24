package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mvm0 implements ovm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22464a;

    public mvm0(long j) {
        this.f22464a = j;
    }

    @Override // a.ovm0
    public final long a() {
        return this.f22464a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvm0) && this.f22464a == ((mvm0) obj).f22464a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22464a);
    }

    public final String toString() {
        return axq.h(this.f22464a, "All(subGameId=", Separators.RPAREN);
    }
}
