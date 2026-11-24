package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z900 implements aa00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43994a;

    public z900(int i) {
        this.f43994a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z900) && this.f43994a == ((z900) obj).f43994a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43994a);
    }

    public final String toString() {
        return ua80.e(this.f43994a, "OnTabSelected(position=", Separators.RPAREN);
    }
}
