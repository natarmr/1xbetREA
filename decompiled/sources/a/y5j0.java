package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y5j0 implements a6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42050a;

    public final boolean equals(Object obj) {
        if (obj instanceof y5j0) {
            return this.f42050a.equals(((y5j0) obj).f42050a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42050a.hashCode();
    }

    public final String toString() {
        return kng0.l("Description(value=", this.f42050a, Separators.RPAREN);
    }
}
