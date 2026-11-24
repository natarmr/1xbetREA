package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s56 implements w56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31640a;
    public final k4i b;
    public final j86 c;
    public final nem d;

    public s56(long j, k4i k4iVar, j86 j86Var, nem nemVar) {
        this.f31640a = j;
        this.b = k4iVar;
        this.c = j86Var;
        this.d = nemVar;
    }

    @Override // a.w56
    public final long a() {
        return this.f31640a;
    }

    @Override // a.w56
    public final i96 b() {
        return this.c;
    }

    @Override // a.w56
    public final nem c() {
        return this.d;
    }

    @Override // a.w56
    public final o96 d() {
        return new k96(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s56)) {
            return false;
        }
        s56 s56Var = (s56) obj;
        return this.f31640a == s56Var.f31640a && this.b.equals(s56Var.b) && this.c.equals(s56Var.c) && this.d.equals(s56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f31640a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31640a, "LargeCardLargeTeamLogo(gameId=", ", topBlock=", rz4.l("LargeCardLargeTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
