package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jla implements lla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wma f16706a;
    public final lma b;
    public final hem c;
    public final long d;

    public jla(wma wmaVar, lma lmaVar, fem femVar, long j) {
        this.f16706a = wmaVar;
        this.b = lmaVar;
        this.c = femVar;
        this.d = j;
    }

    @Override // a.lla
    public final long a() {
        return this.d;
    }

    @Override // a.lla
    public final hem c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jla)) {
            return false;
        }
        jla jlaVar = (jla) obj;
        return this.f16706a.equals(jlaVar.f16706a) && this.b.equals(jlaVar.b) && Intrinsics.d(this.c, jlaVar.c) && this.d == jlaVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f16706a.hashCode() * 31)) * 31;
        hem hemVar = this.c;
        return Long.hashCode(this.d) + ((iHashCode + (hemVar == null ? 0 : hemVar.hashCode())) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(topBlock=" + this.f16706a + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + ", gameId=" + this.d + Separators.RPAREN;
    }
}
