package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class skh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32348a;
    public final long b;
    public final List c;

    public skh(long j, String str, List list) {
        list.getClass();
        this.f32348a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skh)) {
            return false;
        }
        skh skhVar = (skh) obj;
        return this.f32348a.equals(skhVar.f32348a) && this.b == skhVar.b && Intrinsics.d(this.c, skhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f32348a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(f140.o(this.b, "CyberTournamentBracketPrizeDistributionModel(place=", this.f32348a, ", prize="), ", teams=", this.c, Separators.RPAREN);
    }
}
