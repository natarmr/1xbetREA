package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ajl0 implements bjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f982a;
    public final q4n b;
    public final gjl0 c;
    public final ynm d;

    public ajl0(long j, q4n q4nVar, gjl0 gjl0Var, ynm ynmVar) {
        this.f982a = j;
        this.b = q4nVar;
        this.c = gjl0Var;
        this.d = ynmVar;
    }

    @Override // a.bjl0
    public final long a() {
        return this.f982a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajl0)) {
            return false;
        }
        ajl0 ajl0Var = (ajl0) obj;
        return this.f982a == ajl0Var.f982a && this.b.equals(ajl0Var.b) && this.c.equals(ajl0Var.c) && this.d.equals(ajl0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f982a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=" + this.f982a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
