package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ky00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f19085a;

    public final boolean equals(Object obj) {
        if (obj instanceof ky00) {
            return this.f19085a.equals(((ky00) obj).f19085a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19085a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f19085a + Separators.RPAREN;
    }
}
