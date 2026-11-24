package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hzt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13920a;

    public hzt0(int i) {
        this.f13920a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzt0) && this.f13920a == ((hzt0) obj).f13920a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13920a);
    }

    public final String toString() {
        return ua80.e(this.f13920a, "ShowSnackbar(message=", Separators.RPAREN);
    }
}
