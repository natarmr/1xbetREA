package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o86 implements r86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f24817a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;

    public o86(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar) {
        this.f24817a = czmVar;
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
        if (!(obj instanceof o86)) {
            return false;
        }
        o86 o86Var = (o86) obj;
        return this.f24817a.equals(o86Var.f24817a) && this.b.equals(o86Var.b) && Intrinsics.d(this.c, o86Var.c) && Intrinsics.d(this.d, o86Var.d) && this.e.equals(o86Var.e) && this.f == o86Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f24817a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (tymVar2 != null ? tymVar2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Tennis(teamOne=" + this.f24817a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + Separators.RPAREN;
    }
}
