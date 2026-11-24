package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class usl implements vsl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssl f36217a;

    public usl(ssl sslVar) {
        this.f36217a = sslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usl) && this.f36217a.equals(((usl) obj).f36217a);
    }

    public final int hashCode() {
        return this.f36217a.hashCode();
    }

    public final String toString() {
        return "Unavailable(style=" + this.f36217a + Separators.RPAREN;
    }
}
