package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ce7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4197a;

    public final boolean equals(Object obj) {
        if (obj instanceof ce7) {
            return this.f4197a == ((ce7) obj).f4197a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4197a);
    }

    public final String toString() {
        return ua80.e(this.f4197a, "IsTrackedIcon(value=", Separators.RPAREN);
    }
}
