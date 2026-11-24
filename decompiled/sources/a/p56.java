package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p56 implements q56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26389a;
    public final j4i b;
    public final m76 c;
    public final nem d;

    public p56(long j, j4i j4iVar, m76 m76Var, nem nemVar) {
        this.f26389a = j;
        this.b = j4iVar;
        this.c = m76Var;
        this.d = nemVar;
    }

    @Override // a.q56
    public final long a() {
        return this.f26389a;
    }

    @Override // a.q56
    public final n76 b() {
        return this.c;
    }

    @Override // a.q56
    public final nem c() {
        return this.d;
    }

    @Override // a.q56
    public final t76 d() {
        return new s76(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p56)) {
            return false;
        }
        p56 p56Var = (p56) obj;
        return this.f26389a == p56Var.f26389a && this.b.equals(p56Var.b) && this.c.equals(p56Var.c) && this.d.equals(p56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f26389a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26389a, "SmallCardNoTeamLogo(gameId=", ", topBlock=", "SmallCardNoTeamLogo(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
