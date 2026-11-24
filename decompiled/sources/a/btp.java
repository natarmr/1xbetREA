package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class btp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3192a;
    public final jup b;

    public btp(int i, jup jupVar) {
        this.f3192a = i;
        this.b = jupVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btp)) {
            return false;
        }
        btp btpVar = (btp) obj;
        return this.f3192a == btpVar.f3192a && this.b.equals(btpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f3192a) * 31);
    }

    public final String toString() {
        return "FightRoundStatisticModel(roundNumber=" + this.f3192a + ", values=" + this.b + Separators.RPAREN;
    }
}
