package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t1o0 implements v1o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33176a;
    public final k4i b;
    public final i3o0 c;
    public final nem d;

    public t1o0(long j, k4i k4iVar, i3o0 i3o0Var, nem nemVar) {
        this.f33176a = j;
        this.b = k4iVar;
        this.c = i3o0Var;
        this.d = nemVar;
    }

    @Override // a.v1o0
    public final long a() {
        return this.f33176a;
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
        return new v3o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1o0)) {
            return false;
        }
        t1o0 t1o0Var = (t1o0) obj;
        return this.f33176a == t1o0Var.f33176a && this.b.equals(t1o0Var.b) && this.c.equals(t1o0Var.c) && this.d.equals(t1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f33176a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f33176a, "MediumCardSmallTeamLogo(gameId=", ", topBlock=", rz4.l("MediumCardSmallTeamLogo(model=", this.b, Separators.RPAREN));
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
