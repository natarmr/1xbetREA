package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m56 implements q56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21206a;
    public final k4i b;
    public final o66 c;
    public final nem d;

    public m56(long j, k4i k4iVar, o66 o66Var, nem nemVar) {
        this.f21206a = j;
        this.b = k4iVar;
        this.c = o66Var;
        this.d = nemVar;
    }

    @Override // a.q56
    public final long a() {
        return this.f21206a;
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
        return new p76(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m56)) {
            return false;
        }
        m56 m56Var = (m56) obj;
        return this.f21206a == m56Var.f21206a && this.b.equals(m56Var.b) && this.c.equals(m56Var.c) && this.d.equals(m56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f21206a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f21206a, "LargeCardLargeTeamLogo(gameId=", ", topBlock=", rz4.l("LargeCardLargeTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
