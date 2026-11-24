package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class llf extends slf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20244a;
    public final int b;
    public final int c;
    public final String d;

    public llf(String str, int i, int i2, String str2) {
        this.f20244a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llf)) {
            return false;
        }
        llf llfVar = (llf) obj;
        return this.f20244a.equals(llfVar.f20244a) && this.b == llfVar.b && this.c == llfVar.c && this.d.equals(llfVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f20244a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", bombSite=", this.d, Separators.RPAREN, kng0.p(this.b, "Cs2BombPlantedGameLogModel(player=", this.f20244a, ", ctPlayers=", ", tPlayers="));
    }
}
