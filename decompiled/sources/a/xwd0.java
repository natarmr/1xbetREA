package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xwd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41605a;

    public xwd0(int i) {
        this.f41605a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwd0) && this.f41605a == ((xwd0) obj).f41605a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41605a);
    }

    public final String toString() {
        return ua80.e(this.f41605a, "ShowSnackbar(message=", Separators.RPAREN);
    }
}
