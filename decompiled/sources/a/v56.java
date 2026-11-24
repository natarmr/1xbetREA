package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v56 implements w56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36813a;
    public final j4i b;
    public final h96 c;
    public final nem d;

    public v56(long j, j4i j4iVar, h96 h96Var, nem nemVar) {
        this.f36813a = j;
        this.b = j4iVar;
        this.c = h96Var;
        this.d = nemVar;
    }

    @Override // a.w56
    public final long a() {
        return this.f36813a;
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
        return new n96(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v56)) {
            return false;
        }
        v56 v56Var = (v56) obj;
        return this.f36813a == v56Var.f36813a && this.b.equals(v56Var.b) && this.c.equals(v56Var.c) && this.d.equals(v56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f36813a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f36813a, "SmallCardNoTeamLogo(gameId=", ", topBlock=", "SmallCardNoTeamLogo(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
