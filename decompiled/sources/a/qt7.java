package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qt7 implements rt7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29286a;

    public final boolean equals(Object obj) {
        if (obj instanceof qt7) {
            return this.f29286a == ((qt7) obj).f29286a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29286a);
    }

    public final String toString() {
        return ua80.e(this.f29286a, "OnTeamClick(selectedTab=", Separators.RPAREN);
    }
}
