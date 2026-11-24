package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e86 implements j86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f7357a;
    public final czm b;
    public final tym c;
    public final sym d;

    public e86(czm czmVar, czm czmVar2, tym tymVar, sym symVar) {
        p6x p6xVar = p6x.f26478a;
        this.f7357a = czmVar;
        this.b = czmVar2;
        this.c = tymVar;
        this.d = symVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e86)) {
            return false;
        }
        e86 e86Var = (e86) obj;
        if (!this.f7357a.equals(e86Var.f7357a) || !this.b.equals(e86Var.b) || !this.c.equals(e86Var.c)) {
            return false;
        }
        p6x p6xVar = p6x.f26478a;
        return this.d.equals(e86Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((p6x.c.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f7357a.hashCode() * 31)) * 29791)) * 31)) * 31);
    }

    public final String toString() {
        return "MultiTeams(teamOne=" + this.f7357a + ", teamTwo=" + this.b + ", scoreRoundOne=null, scoreRoundTwo=null, scoreResult=" + this.c + ", indicatorState=" + p6x.c + ", infoModel=" + this.d + Separators.RPAREN;
    }
}
