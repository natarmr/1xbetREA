package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dsa implements fsa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih2 f6603a;

    public dsa(ih2 ih2Var) {
        this.f6603a = ih2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsa) && this.f6603a == ((dsa) obj).f6603a;
    }

    public final int hashCode() {
        return this.f6603a.hashCode();
    }

    public final String toString() {
        return "OpenSportTab(tab=" + this.f6603a + Separators.RPAREN;
    }
}
