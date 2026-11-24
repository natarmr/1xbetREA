package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b2j0 implements c2j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1854a;

    public final boolean equals(Object obj) {
        if (obj instanceof b2j0) {
            return this.f1854a.equals(((b2j0) obj).f1854a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1854a.hashCode();
    }

    public final String toString() {
        return kng0.l("Description(value=", this.f1854a, Separators.RPAREN);
    }
}
