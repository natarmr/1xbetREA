package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z1o0 implements b2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43632a;
    public final k4i b;
    public final d5o0 c;
    public final nem d;

    public z1o0(long j, k4i k4iVar, d5o0 d5o0Var, nem nemVar) {
        this.f43632a = j;
        this.b = k4iVar;
        this.c = d5o0Var;
        this.d = nemVar;
    }

    @Override // a.b2o0
    public final long a() {
        return this.f43632a;
    }

    @Override // a.b2o0
    public final m5o0 b() {
        return this.c;
    }

    @Override // a.b2o0
    public final nem c() {
        return this.d;
    }

    @Override // a.b2o0
    public final s5o0 d() {
        return new q5o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1o0)) {
            return false;
        }
        z1o0 z1o0Var = (z1o0) obj;
        return this.f43632a == z1o0Var.f43632a && this.b.equals(z1o0Var.b) && this.c.equals(z1o0Var.c) && this.d.equals(z1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f43632a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43632a, "MediumCardSmallTeamLogo(gameId=", ", topBlock=", rz4.l("MediumCardSmallTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
