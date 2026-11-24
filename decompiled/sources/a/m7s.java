package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m7s implements q7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21335a;

    public final boolean equals(Object obj) {
        if (obj instanceof m7s) {
            return this.f21335a == ((m7s) obj).f21335a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21335a);
    }

    public final String toString() {
        return ua80.e(this.f21335a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
