package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ynv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42959a;

    public final boolean equals(Object obj) {
        if (obj instanceof ynv) {
            return this.f42959a == ((ynv) obj).f42959a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42959a);
    }

    public final String toString() {
        return ua80.e(this.f42959a, "SecondTeamWinTitleColor(value=", Separators.RPAREN);
    }
}
