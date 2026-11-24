package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v4b implements x4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36767a;

    public v4b(String str) {
        this.f36767a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4b) && this.f36767a.equals(((v4b) obj).f36767a);
    }

    public final int hashCode() {
        return this.f36767a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(value=", this.f36767a, Separators.RPAREN);
    }
}
