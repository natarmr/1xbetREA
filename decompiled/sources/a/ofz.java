package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ofz implements qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25191a;

    public ofz(int i) {
        this.f25191a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofz) && this.f25191a == ((ofz) obj).f25191a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25191a);
    }

    public final String toString() {
        return ua80.e(this.f25191a, "OnTimeFilterSelect(year=", Separators.RPAREN);
    }
}
