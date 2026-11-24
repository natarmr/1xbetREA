package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tn90 implements un90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34223a;

    public final boolean equals(Object obj) {
        if (obj instanceof tn90) {
            return this.f34223a.equals(((tn90) obj).f34223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34223a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchValueChange(searchValue=", this.f34223a, Separators.RPAREN);
    }
}
