package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f4q implements i4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8928a;

    public f4q(int i) {
        this.f8928a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4q) && this.f8928a == ((f4q) obj).f8928a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8928a);
    }

    public final String toString() {
        return ua80.e(this.f8928a, "OnSeasonSelected(season=", Separators.RPAREN);
    }
}
