package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iib implements jib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14821a;

    public iib(String str) {
        this.f14821a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iib) && this.f14821a.equals(((iib) obj).f14821a);
    }

    public final int hashCode() {
        return this.f14821a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenDeepLink(deeplink=", this.f14821a, Separators.RPAREN);
    }
}
