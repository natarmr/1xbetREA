package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i4j0 implements n4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14149a;

    public final boolean equals(Object obj) {
        if (obj instanceof i4j0) {
            return this.f14149a.equals(((i4j0) obj).f14149a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14149a.hashCode();
    }

    public final String toString() {
        return kng0.l("Description(value=", this.f14149a, Separators.RPAREN);
    }
}
