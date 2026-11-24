package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z7p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43929a;

    public z7p0(int i) {
        this.f43929a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7p0) && this.f43929a == ((z7p0) obj).f43929a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43929a);
    }

    public final String toString() {
        return ua80.e(this.f43929a, "OnCalendarClick(index=", Separators.RPAREN);
    }
}
