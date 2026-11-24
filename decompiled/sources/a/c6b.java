package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c6b implements d6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3810a;
    public final boolean b;

    public c6b(boolean z, long j) {
        this.f3810a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6b)) {
            return false;
        }
        c6b c6bVar = (c6b) obj;
        return this.f3810a == c6bVar.f3810a && this.b == c6bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f3810a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f3810a, "SubGameExpandClick(subGameId=", ", isExpanded=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
