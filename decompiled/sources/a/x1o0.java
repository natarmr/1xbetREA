package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x1o0 implements b2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40131a;
    public final k4i b;
    public final n4o0 c;
    public final nem d;

    public x1o0(long j, k4i k4iVar, n4o0 n4o0Var, nem nemVar) {
        this.f40131a = j;
        this.b = k4iVar;
        this.c = n4o0Var;
        this.d = nemVar;
    }

    @Override // a.b2o0
    public final long a() {
        return this.f40131a;
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
        return new o5o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1o0)) {
            return false;
        }
        x1o0 x1o0Var = (x1o0) obj;
        return this.f40131a == x1o0Var.f40131a && this.b.equals(x1o0Var.b) && this.c.equals(x1o0Var.c) && this.d.equals(x1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f40131a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40131a, "LargeCardLargeTeamLogo(gameId=", ", topBlock=", rz4.l("LargeCardLargeTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
