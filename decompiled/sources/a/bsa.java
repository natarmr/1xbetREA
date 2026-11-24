package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bsa implements fsa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dta f3119a;

    public final boolean equals(Object obj) {
        if (obj instanceof bsa) {
            return this.f3119a.equals(((bsa) obj).f3119a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3119a.hashCode();
    }

    public final String toString() {
        return "DeleteAllSideEffect(openTabState=" + this.f3119a + Separators.RPAREN;
    }
}
