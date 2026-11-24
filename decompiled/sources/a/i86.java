package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i86 implements j86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f14323a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;
    public final sym g;

    public i86(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar, sym symVar) {
        this.f14323a = czmVar;
        this.b = czmVar2;
        this.c = tymVar;
        this.d = tymVar2;
        this.e = tymVar3;
        this.f = p6xVar;
        this.g = symVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i86)) {
            return false;
        }
        i86 i86Var = (i86) obj;
        return this.f14323a.equals(i86Var.f14323a) && this.b.equals(i86Var.b) && Intrinsics.d(this.c, i86Var.c) && Intrinsics.d(this.d, i86Var.d) && this.e.equals(i86Var.e) && this.f == i86Var.f && this.g.equals(i86Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f14323a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (tymVar2 != null ? tymVar2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TwoPairs(teamOne=" + this.f14323a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + ", infoModel=" + this.g + Separators.RPAREN;
    }
}
