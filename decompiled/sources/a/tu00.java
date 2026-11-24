package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tu00 implements vu00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34529a;

    public tu00(String str) {
        this.f34529a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu00) && this.f34529a.equals(((tu00) obj).f34529a);
    }

    public final int hashCode() {
        return this.f34529a.hashCode();
    }

    public final String toString() {
        return kng0.l("SessionTimeIsEnd(message=", this.f34529a, Separators.RPAREN);
    }
}
