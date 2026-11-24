package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class phm implements thm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27004a;

    public final boolean equals(Object obj) {
        if (obj instanceof phm) {
            return this.f27004a == ((phm) obj).f27004a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27004a);
    }

    public final String toString() {
        return ua80.e(this.f27004a, "OnRightButtonClick(index=", Separators.RPAREN);
    }
}
