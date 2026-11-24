package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36637a;

    public final boolean equals(Object obj) {
        if (obj instanceof v1l) {
            return this.f36637a == ((v1l) obj).f36637a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36637a);
    }

    public final String toString() {
        return axq.h(this.f36637a, "OnTabClick(value=", Separators.RPAREN);
    }
}
