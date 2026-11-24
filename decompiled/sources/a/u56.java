package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u56 implements w56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35079a;
    public final k4i b;
    public final z86 c;
    public final nem d;

    public u56(long j, k4i k4iVar, z86 z86Var, nem nemVar) {
        this.f35079a = j;
        this.b = k4iVar;
        this.c = z86Var;
        this.d = nemVar;
    }

    @Override // a.w56
    public final long a() {
        return this.f35079a;
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
        return new m96(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u56)) {
            return false;
        }
        u56 u56Var = (u56) obj;
        return this.f35079a == u56Var.f35079a && this.b.equals(u56Var.b) && this.c.equals(u56Var.c) && this.d.equals(u56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f35079a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f35079a, "MediumCardSmallTeamLogo(gameId=", ", topBlock=", rz4.l("MediumCardSmallTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
