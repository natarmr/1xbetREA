package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gge implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f11249a;

    public gge(ha8 ha8Var) {
        this.f11249a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f11249a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gge) && this.f11249a.equals(((gge) obj).f11249a);
    }

    public final int hashCode() {
        return this.f11249a.hashCode();
    }

    public final String toString() {
        return "TournamentsMonthCarousel(blockState=" + this.f11249a + Separators.RPAREN;
    }
}
