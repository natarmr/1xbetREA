package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l56 implements q56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19439a;
    public final i4i b;
    public final g66 c;
    public final nem d;

    public l56(long j, i4i i4iVar, g66 g66Var, nem nemVar) {
        this.f19439a = j;
        this.b = i4iVar;
        this.c = g66Var;
        this.d = nemVar;
    }

    @Override // a.q56
    public final long a() {
        return this.f19439a;
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
        return new o76(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l56)) {
            return false;
        }
        l56 l56Var = (l56) obj;
        return this.f19439a == l56Var.f19439a && this.b.equals(l56Var.b) && this.c.equals(l56Var.c) && this.d.equals(l56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f19439a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f19439a, "LargeCardLargeSportIcon(gameId=", ", topBlock=", "LargeCardLargeSportIcon(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
