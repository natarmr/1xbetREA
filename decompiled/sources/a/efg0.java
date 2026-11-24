package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class efg0 implements ffg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7720a;

    public final boolean equals(Object obj) {
        if (obj instanceof efg0) {
            return this.f7720a == ((efg0) obj).f7720a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7720a);
    }

    public final String toString() {
        return ua80.e(this.f7720a, "SectorColor(value=", Separators.RPAREN);
    }
}
