package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q86 implements r86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f28284a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;

    public q86(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar) {
        this.f28284a = czmVar;
        this.b = czmVar2;
        this.c = tymVar;
        this.d = tymVar2;
        this.e = tymVar3;
        this.f = p6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q86)) {
            return false;
        }
        q86 q86Var = (q86) obj;
        return this.f28284a.equals(q86Var.f28284a) && this.b.equals(q86Var.b) && Intrinsics.d(this.c, q86Var.c) && Intrinsics.d(this.d, q86Var.d) && this.e.equals(q86Var.e) && this.f == q86Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f28284a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (tymVar2 != null ? tymVar2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "TwoPairs(teamOne=" + this.f28284a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + Separators.RPAREN;
    }
}
