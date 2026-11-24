package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wkc0 implements ykc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39302a;

    public wkc0(int i) {
        this.f39302a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkc0) && this.f39302a == ((wkc0) obj).f39302a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39302a);
    }

    public final String toString() {
        return ua80.e(this.f39302a, "ShowErrorMessage(messageRes=", Separators.RPAREN);
    }
}
