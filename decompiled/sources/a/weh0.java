package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class weh0 implements xeh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39019a;

    public final boolean equals(Object obj) {
        if (obj instanceof weh0) {
            return this.f39019a.equals(((weh0) obj).f39019a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39019a.hashCode();
    }

    public final String toString() {
        return kng0.l("SearchChange(search=", this.f39019a, Separators.RPAREN);
    }
}
