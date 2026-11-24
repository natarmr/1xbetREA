package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hxs extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13826a;

    public hxs(String str) {
        this.f13826a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxs) && this.f13826a.equals(((hxs) obj).f13826a);
    }

    public final int hashCode() {
        return this.f13826a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return kng0.l("GameVideoServiceException(errorMessage=", this.f13826a, Separators.RPAREN);
    }
}
