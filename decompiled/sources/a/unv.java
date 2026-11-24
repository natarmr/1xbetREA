package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class unv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35981a;

    public final boolean equals(Object obj) {
        if (obj instanceof unv) {
            return this.f35981a == ((unv) obj).f35981a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35981a);
    }

    public final String toString() {
        return ua80.e(this.f35981a, "FirstTeamWinTitleColor(value=", Separators.RPAREN);
    }
}
