package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hzm implements kzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f13913a;
    public final czm b;
    public final tym c;
    public final tym d;
    public final tym e;
    public final p6x f;
    public final rym g;

    public hzm(czm czmVar, czm czmVar2, tym tymVar, tym tymVar2, tym tymVar3, p6x p6xVar, rym rymVar) {
        this.f13913a = czmVar;
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
        if (!(obj instanceof hzm)) {
            return false;
        }
        hzm hzmVar = (hzm) obj;
        return this.f13913a.equals(hzmVar.f13913a) && this.b.equals(hzmVar.b) && Intrinsics.d(this.c, hzmVar.c) && Intrinsics.d(this.d, hzmVar.d) && this.e.equals(hzmVar.e) && this.f == hzmVar.f && this.g.equals(hzmVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f13913a.hashCode() * 31)) * 31;
        tym tymVar = this.c;
        int iHashCode2 = (iHashCode + (tymVar == null ? 0 : tymVar.hashCode())) * 31;
        tym tymVar2 = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (tymVar2 != null ? tymVar2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Default(teamOne=" + this.f13913a + ", teamTwo=" + this.b + ", scoreRoundOne=" + this.c + ", scoreRoundTwo=" + this.d + ", scoreResult=" + this.e + ", indicatorState=" + this.f + ", infoModel=" + this.g + Separators.RPAREN;
    }
}
