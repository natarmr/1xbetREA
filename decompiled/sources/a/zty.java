package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zty implements buy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44984a;

    public final boolean equals(Object obj) {
        if (obj instanceof zty) {
            return this.f44984a.equals(((zty) obj).f44984a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44984a.hashCode();
    }

    public final String toString() {
        return kng0.l("Counter(count=", this.f44984a, Separators.RPAREN);
    }
}
