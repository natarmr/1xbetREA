package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ujn0 implements xjn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35792a;

    public final boolean equals(Object obj) {
        if (obj instanceof ujn0) {
            return this.f35792a == ((ujn0) obj).f35792a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35792a);
    }

    public final String toString() {
        return ua80.e(this.f35792a, "NewMessageCount(value=", Separators.RPAREN);
    }
}
