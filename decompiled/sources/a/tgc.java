package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tgc implements mgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33903a;

    public final boolean equals(Object obj) {
        if (obj instanceof tgc) {
            return this.f33903a.equals(((tgc) obj).f33903a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33903a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchValue(query=", this.f33903a, Separators.RPAREN);
    }
}
