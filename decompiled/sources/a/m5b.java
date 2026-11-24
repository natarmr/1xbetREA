package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m5b implements o5b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih2 f21212a;

    public m5b(ih2 ih2Var) {
        this.f21212a = ih2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5b) && this.f21212a == ((m5b) obj).f21212a;
    }

    public final int hashCode() {
        return this.f21212a.hashCode();
    }

    public final String toString() {
        return "OpenSportTab(tab=" + this.f21212a + Separators.RPAREN;
    }
}
