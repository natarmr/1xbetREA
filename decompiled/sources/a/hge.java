package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hge implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f13014a;

    public hge(ha8 ha8Var) {
        this.f13014a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f13014a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hge) && this.f13014a.equals(((hge) obj).f13014a);
    }

    public final int hashCode() {
        return this.f13014a.hashCode();
    }

    public final String toString() {
        return "UserTournamentsCarousel(blockState=" + this.f13014a + Separators.RPAREN;
    }
}
