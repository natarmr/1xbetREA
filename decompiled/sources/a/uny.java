package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35984a;
    public final String b;
    public final String c;
    public final int d;

    public uny(int i, long j, String str, String str2) {
        this.f35984a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uny)) {
            return false;
        }
        uny unyVar = (uny) obj;
        return this.f35984a == unyVar.f35984a && this.b.equals(unyVar.b) && this.c.equals(unyVar.c) && this.d == unyVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(ua80.b(Long.hashCode(this.f35984a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f35984a, "KillTargetModel(heroId=", ", heroName=", this.b);
        axq.s(this.d, ", heroIcon=", this.c, ", numberOfKills=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
