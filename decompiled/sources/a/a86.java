package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a86 implements b86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f410a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;
    public final rym g;

    public a86(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar, rym rymVar) {
        this.f410a = czmVar;
        this.b = czmVar2;
        this.c = tymVar;
        this.d = tymVar2;
        this.e = tymVar3;
        this.f = p6xVar;
        this.g = rymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a86)) {
            return false;
        }
        a86 a86Var = (a86) obj;
        return this.f410a.equals(a86Var.f410a) && this.b.equals(a86Var.b) && Intrinsics.d(this.c, a86Var.c) && Intrinsics.d(this.d, a86Var.d) && this.e.equals(a86Var.e) && this.f == a86Var.f && this.g.equals(a86Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f410a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (tymVar2 != null ? tymVar2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TwoPairs(teamOne=" + this.f410a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + ", infoModel=" + this.g + Separators.RPAREN;
    }
}
