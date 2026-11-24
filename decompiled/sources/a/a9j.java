package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a9j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f480a;

    public final boolean equals(Object obj) {
        if (obj instanceof a9j) {
            return this.f480a == ((a9j) obj).f480a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f480a);
    }

    public final String toString() {
        return ua80.e(this.f480a, "RoundNumber(value=", Separators.RPAREN);
    }
}
