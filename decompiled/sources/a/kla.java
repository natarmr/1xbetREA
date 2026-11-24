package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kla implements lla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xma f18477a;
    public final rma b;
    public final hem c;
    public final long d;

    public kla(xma xmaVar, rma rmaVar, eem eemVar, long j) {
        this.f18477a = xmaVar;
        this.b = rmaVar;
        this.c = eemVar;
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
        if (!(obj instanceof kla)) {
            return false;
        }
        kla klaVar = (kla) obj;
        return this.f18477a.equals(klaVar.f18477a) && this.b.equals(klaVar.b) && Intrinsics.d(this.c, klaVar.c) && this.d == klaVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f18477a.hashCode() * 31)) * 31;
        hem hemVar = this.c;
        return Long.hashCode(this.d) + ((iHashCode + (hemVar == null ? 0 : hemVar.hashCode())) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(topBlock=" + this.f18477a + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + ", gameId=" + this.d + Separators.RPAREN;
    }
}
