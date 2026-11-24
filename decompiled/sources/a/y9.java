package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y9 implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42220a;

    public y9(String str) {
        this.f42220a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9) && this.f42220a.equals(((y9) obj).f42220a);
    }

    public final int hashCode() {
        return this.f42220a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(link=", this.f42220a, Separators.RPAREN);
    }
}
