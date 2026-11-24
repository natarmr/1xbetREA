package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jri0 implements ori0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17005a;

    public jri0(String str) {
        this.f17005a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jri0) && this.f17005a.equals(((jri0) obj).f17005a);
    }

    public final int hashCode() {
        return this.f17005a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowExpiredTokenError(message=", this.f17005a, Separators.RPAREN);
    }
}
