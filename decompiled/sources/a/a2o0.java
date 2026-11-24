package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a2o0 implements b2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f133a;
    public final j4i b;
    public final l5o0 c;
    public final nem d;

    public a2o0(long j, j4i j4iVar, l5o0 l5o0Var, nem nemVar) {
        this.f133a = j;
        this.b = j4iVar;
        this.c = l5o0Var;
        this.d = nemVar;
    }

    @Override // a.b2o0
    public final long a() {
        return this.f133a;
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
        return new r5o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2o0)) {
            return false;
        }
        a2o0 a2o0Var = (a2o0) obj;
        return this.f133a == a2o0Var.f133a && this.b.equals(a2o0Var.b) && this.c.equals(a2o0Var.c) && this.d.equals(a2o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f133a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f133a, "SmallCardNoTeamLogo(gameId=", ", topBlock=", "SmallCardNoTeamLogo(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
