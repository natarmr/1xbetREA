package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3940a;

    public final boolean equals(Object obj) {
        if (obj instanceof c92) {
            return this.f3940a == ((c92) obj).f3940a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3940a);
    }

    public final String toString() {
        return ua80.e(this.f3940a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
