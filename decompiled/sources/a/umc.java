package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class umc implements xmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35913a;

    public final boolean equals(Object obj) {
        if (obj instanceof umc) {
            return this.f35913a == ((umc) obj).f35913a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35913a);
    }

    public final String toString() {
        return ua80.e(this.f35913a, "OnRightButtonClick(index=", Separators.RPAREN);
    }
}
