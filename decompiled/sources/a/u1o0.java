package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u1o0 implements v1o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34910a;
    public final j4i b;
    public final q3o0 c;
    public final nem d;

    public u1o0(long j, j4i j4iVar, q3o0 q3o0Var, nem nemVar) {
        this.f34910a = j;
        this.b = j4iVar;
        this.c = q3o0Var;
        this.d = nemVar;
    }

    @Override // a.v1o0
    public final long a() {
        return this.f34910a;
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
        return new w3o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1o0)) {
            return false;
        }
        u1o0 u1o0Var = (u1o0) obj;
        return this.f34910a == u1o0Var.f34910a && this.b.equals(u1o0Var.b) && this.c.equals(u1o0Var.c) && this.d.equals(u1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f34910a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34910a, "SmallCardNoTeamLogo(gameId=", ", topBlock=", "SmallCardNoTeamLogo(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
