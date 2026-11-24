package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r3g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29786a;
    public final int b;

    public r3g(int i, int i2) {
        this.f29786a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3g)) {
            return false;
        }
        r3g r3gVar = (r3g) obj;
        return this.f29786a == r3gVar.f29786a && this.b == r3gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f29786a) * 31);
    }

    public final String toString() {
        return ohs0.m("CyberCSMatchesStatisticMatchRoundModel(winnerTeamId=", this.f29786a, ", winType=", Separators.RPAREN, this.b);
    }
}
