package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class les extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19919a;

    public les(int i) {
        this.f19919a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof les) && this.f19919a == ((les) obj).f19919a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19919a);
    }

    public final String toString() {
        return ua80.e(this.f19919a, "TeamTwoRedCardNumberChanged(teamTwoRedCards=", Separators.RPAREN);
    }
}
