package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r56 implements w56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29868a;
    public final i4i b;
    public final b86 c;
    public final nem d;

    public r56(long j, i4i i4iVar, b86 b86Var, nem nemVar) {
        this.f29868a = j;
        this.b = i4iVar;
        this.c = b86Var;
        this.d = nemVar;
    }

    @Override // a.w56
    public final long a() {
        return this.f29868a;
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
        return new j96(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r56)) {
            return false;
        }
        r56 r56Var = (r56) obj;
        return this.f29868a == r56Var.f29868a && this.b.equals(r56Var.b) && this.c.equals(r56Var.c) && this.d.equals(r56Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f29868a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29868a, "LargeCardLargeSportIcon(gameId=", ", topBlock=", "LargeCardLargeSportIcon(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
