package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o56 implements q56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24672a;
    public final k4i b;
    public final e76 c;
    public final nem d;

    public o56(long j, k4i k4iVar, e76 e76Var, nem nemVar) {
        this.f24672a = j;
        this.b = k4iVar;
        this.c = e76Var;
        this.d = nemVar;
    }

    @Override // a.q56
    public final long a() {
        return this.f24672a;
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
        return new r76(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o56)) {
            return false;
        }
        o56 o56Var = (o56) obj;
        return this.f24672a == o56Var.f24672a && this.b.equals(o56Var.b) && this.c.equals(o56Var.c) && this.d.equals(o56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f24672a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f24672a, "MediumCardSmallTeamLogo(gameId=", ", topBlock=", rz4.l("MediumCardSmallTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
