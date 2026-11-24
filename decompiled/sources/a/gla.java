package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gla implements lla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tma f11481a;
    public final tla b;
    public final hem c;
    public final long d;

    public gla(tma tmaVar, tla tlaVar, dem demVar, long j) {
        this.f11481a = tmaVar;
        this.b = tlaVar;
        this.c = demVar;
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
        if (!(obj instanceof gla)) {
            return false;
        }
        gla glaVar = (gla) obj;
        return this.f11481a.equals(glaVar.f11481a) && this.b.equals(glaVar.b) && Intrinsics.d(this.c, glaVar.c) && this.d == glaVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f11481a.hashCode() * 31)) * 31;
        hem hemVar = this.c;
        return Long.hashCode(this.d) + ((iHashCode + (hemVar == null ? 0 : hemVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(topBlock=" + this.f11481a + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + ", gameId=" + this.d + Separators.RPAREN;
    }
}
