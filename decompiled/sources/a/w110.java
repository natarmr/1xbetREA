package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w110 implements x110 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38376a;

    public final boolean equals(Object obj) {
        if (obj instanceof w110) {
            return this.f38376a.equals(((w110) obj).f38376a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38376a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchClick(value=", this.f38376a, Separators.RPAREN);
    }
}
