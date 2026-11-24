package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q1o0 implements v1o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27964a;
    public final i4i b;
    public final k2o0 c;
    public final nem d;

    public q1o0(long j, i4i i4iVar, k2o0 k2o0Var, nem nemVar) {
        this.f27964a = j;
        this.b = i4iVar;
        this.c = k2o0Var;
        this.d = nemVar;
    }

    @Override // a.v1o0
    public final long a() {
        return this.f27964a;
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
        return new s3o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1o0)) {
            return false;
        }
        q1o0 q1o0Var = (q1o0) obj;
        return this.f27964a == q1o0Var.f27964a && this.b.equals(q1o0Var.b) && this.c.equals(q1o0Var.c) && this.d.equals(q1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f27964a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27964a, "LargeCardLargeSportIcon(gameId=", ", topBlock=", "LargeCardLargeSportIcon(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
