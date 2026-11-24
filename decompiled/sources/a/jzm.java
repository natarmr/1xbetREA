package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jzm implements kzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f17421a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;
    public final sym g;

    public jzm(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar, sym symVar) {
        this.f17421a = czmVar;
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
        if (!(obj instanceof jzm)) {
            return false;
        }
        jzm jzmVar = (jzm) obj;
        return this.f17421a.equals(jzmVar.f17421a) && this.b.equals(jzmVar.b) && Intrinsics.d(this.c, jzmVar.c) && Intrinsics.d(this.d, jzmVar.d) && Intrinsics.d(this.e, jzmVar.e) && this.f == jzmVar.f && this.g.equals(jzmVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f17421a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (tymVar2 == null ? 0 : tymVar2.hashCode())) * 31;
        tym tymVar3 = this.e;
        int iHashCode4 = (iHashCode3 + (tymVar3 == null ? 0 : tymVar3.hashCode())) * 31;
        p6x p6xVar = this.f;
        return this.g.hashCode() + ((iHashCode4 + (p6xVar != null ? p6xVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "V4(teamOne=" + this.f17421a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + ", infoModel=" + this.g + Separators.RPAREN;
    }
}
