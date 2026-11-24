package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ath0 implements bth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8m0 f1433a;

    public final boolean equals(Object obj) {
        if (obj instanceof ath0) {
            return this.f1433a == ((ath0) obj).f1433a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1433a.hashCode();
    }

    public final String toString() {
        return "Status(value=" + this.f1433a + Separators.RPAREN;
    }
}
