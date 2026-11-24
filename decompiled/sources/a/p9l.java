package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p9l implements s9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26611a;

    public final boolean equals(Object obj) {
        if (obj instanceof p9l) {
            return this.f26611a.equals(((p9l) obj).f26611a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26611a.hashCode();
    }

    public final String toString() {
        return kng0.l("Date(value=", this.f26611a, Separators.RPAREN);
    }
}
