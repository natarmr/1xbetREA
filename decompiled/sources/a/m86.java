package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m86 implements r86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f21354a;
    public final czm b;
    public final tym c;

    public m86(czm czmVar, czm czmVar2, tym tymVar) {
        p6x p6xVar = p6x.f26478a;
        this.f21354a = czmVar;
        this.b = czmVar2;
        this.c = tymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m86)) {
            return false;
        }
        m86 m86Var = (m86) obj;
        if (!this.f21354a.equals(m86Var.f21354a) || !this.b.equals(m86Var.b) || !this.c.equals(m86Var.c)) {
            return false;
        }
        p6x p6xVar = p6x.f26478a;
        return true;
    }

    public final int hashCode() {
        return p6x.c.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f21354a.hashCode() * 31)) * 29791)) * 31);
    }

    public final String toString() {
        return "MultiTeams(teamOne=" + this.f21354a + ", teamTwo=" + this.b + ", scoreRoundOne=null, scoreRoundTwo=null, scoreResult=" + this.c + ", indicatorState=" + p6x.c + Separators.RPAREN;
    }
}
