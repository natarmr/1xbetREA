package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class orr implements zrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25748a;

    public final boolean equals(Object obj) {
        if (obj instanceof orr) {
            return this.f25748a.equals(((orr) obj).f25748a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25748a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(value=", this.f25748a, Separators.RPAREN);
    }
}
