package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uzd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36532a;
    public final int b;

    public uzd0(int i, int i2) {
        this.f36532a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzd0)) {
            return false;
        }
        uzd0 uzd0Var = (uzd0) obj;
        return this.f36532a == uzd0Var.f36532a && this.b == uzd0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f36532a) * 31);
    }

    public final String toString() {
        return ohs0.m("RainbowStatisticMatchesMatchRoundModel(winnerTeamId=", this.f36532a, ", winType=", Separators.RPAREN, this.b);
    }
}
