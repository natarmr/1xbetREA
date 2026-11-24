package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class usn0 implements atn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36221a;

    public final boolean equals(Object obj) {
        if (obj instanceof usn0) {
            return this.f36221a.equals(((usn0) obj).f36221a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36221a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coef(value=", this.f36221a, Separators.RPAREN);
    }
}
