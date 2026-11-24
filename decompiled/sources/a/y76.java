package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y76 implements b86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f42136a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;
    public final rym g;

    public y76(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar, rym rymVar) {
        this.f42136a = czmVar;
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
        if (!(obj instanceof y76)) {
            return false;
        }
        y76 y76Var = (y76) obj;
        return this.f42136a.equals(y76Var.f42136a) && this.b.equals(y76Var.b) && Intrinsics.d(this.c, y76Var.c) && Intrinsics.d(this.d, y76Var.d) && this.e.equals(y76Var.e) && this.f == y76Var.f && this.g.equals(y76Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f42136a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (tymVar2 != null ? tymVar2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Tennis(teamOne=" + this.f42136a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + ", infoModel=" + this.g + Separators.RPAREN;
    }
}
