package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class age implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f819a;

    public age(ha8 ha8Var) {
        this.f819a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f819a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof age) && this.f819a.equals(((age) obj).f819a);
    }

    public final int hashCode() {
        return this.f819a.hashCode();
    }

    public final String toString() {
        return "GamesCarousel(blockState=" + this.f819a + Separators.RPAREN;
    }
}
