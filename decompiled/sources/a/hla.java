package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hla implements lla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uma f13248a;
    public final zla b;
    public final hem c;
    public final long d;

    public hla(uma umaVar, zla zlaVar, fem femVar, long j) {
        this.f13248a = umaVar;
        this.b = zlaVar;
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
        if (!(obj instanceof hla)) {
            return false;
        }
        hla hlaVar = (hla) obj;
        return this.f13248a.equals(hlaVar.f13248a) && this.b.equals(hlaVar.b) && Intrinsics.d(this.c, hlaVar.c) && this.d == hlaVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f13248a.hashCode() * 31)) * 31;
        hem hemVar = this.c;
        return Long.hashCode(this.d) + ((iHashCode + (hemVar == null ? 0 : hemVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(topBlock=" + this.f13248a + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + ", gameId=" + this.d + Separators.RPAREN;
    }
}
