package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uep0 implements vep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35540a;

    public final boolean equals(Object obj) {
        if (obj instanceof uep0) {
            return this.f35540a.equals(((uep0) obj).f35540a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35540a.hashCode();
    }

    public final String toString() {
        return kng0.l("TotalKills(value=", this.f35540a, Separators.RPAREN);
    }
}
