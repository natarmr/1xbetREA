package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r1o0 implements v1o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29692a;
    public final k4i b;
    public final s2o0 c;
    public final nem d;

    public r1o0(long j, k4i k4iVar, s2o0 s2o0Var, nem nemVar) {
        this.f29692a = j;
        this.b = k4iVar;
        this.c = s2o0Var;
        this.d = nemVar;
    }

    @Override // a.v1o0
    public final long a() {
        return this.f29692a;
    }

    @Override // a.v1o0
    public final r3o0 b() {
        return this.c;
    }

    @Override // a.v1o0
    public final nem c() {
        return this.d;
    }

    @Override // a.v1o0
    public final x3o0 d() {
        return new t3o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1o0)) {
            return false;
        }
        r1o0 r1o0Var = (r1o0) obj;
        return this.f29692a == r1o0Var.f29692a && this.b.equals(r1o0Var.b) && this.c.equals(r1o0Var.c) && this.d.equals(r1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f29692a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29692a, "LargeCardLargeTeamLogo(gameId=", ", topBlock=", rz4.l("LargeCardLargeTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
