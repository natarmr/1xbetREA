package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class izm implements kzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f15641a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;

    public izm(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar) {
        this.f15641a = czmVar;
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
        if (!(obj instanceof izm)) {
            return false;
        }
        izm izmVar = (izm) obj;
        return this.f15641a.equals(izmVar.f15641a) && this.b.equals(izmVar.b) && Intrinsics.d(this.c, izmVar.c) && Intrinsics.d(this.d, izmVar.d) && Intrinsics.d(this.e, izmVar.e) && this.f == izmVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f15641a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (tymVar2 == null ? 0 : tymVar2.hashCode())) * 31;
        tym tymVar3 = this.e;
        int iHashCode4 = (iHashCode3 + (tymVar3 == null ? 0 : tymVar3.hashCode())) * 31;
        p6x p6xVar = this.f;
        return iHashCode4 + (p6xVar != null ? p6xVar.hashCode() : 0);
    }

    public final String toString() {
        return "V3(teamOne=" + this.f15641a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + Separators.RPAREN;
    }
}
