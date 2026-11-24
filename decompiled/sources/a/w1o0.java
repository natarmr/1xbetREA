package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w1o0 implements b2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38413a;
    public final i4i b;
    public final f4o0 c;
    public final nem d;

    public w1o0(long j, i4i i4iVar, f4o0 f4o0Var, nem nemVar) {
        this.f38413a = j;
        this.b = i4iVar;
        this.c = f4o0Var;
        this.d = nemVar;
    }

    @Override // a.b2o0
    public final long a() {
        return this.f38413a;
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
        return new n5o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1o0)) {
            return false;
        }
        w1o0 w1o0Var = (w1o0) obj;
        return this.f38413a == w1o0Var.f38413a && this.b.equals(w1o0Var.b) && this.c.equals(w1o0Var.c) && this.d.equals(w1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f38413a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f38413a, "LargeCardLargeSportIcon(gameId=", ", topBlock=", "LargeCardLargeSportIcon(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
