package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n56 implements q56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22927a;
    public final l4i b;
    public final w66 c;
    public final nem d;
    public final n0x e;

    public n56(long j, l4i l4iVar, w66 w66Var, nem nemVar, n0x n0xVar) {
        this.f22927a = j;
        this.b = l4iVar;
        this.c = w66Var;
        this.d = nemVar;
        this.e = n0xVar;
    }

    @Override // a.q56
    public final long a() {
        return this.f22927a;
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
        return new q76(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n56)) {
            return false;
        }
        n56 n56Var = (n56) obj;
        return this.f22927a == n56Var.f22927a && this.b.equals(n56Var.b) && this.c.equals(n56Var.c) && this.d.equals(n56Var.d) && this.e.equals(n56Var.e);
    }

    public final int hashCode() {
        return f140.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f22927a) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f22927a, "LargeCardWatermark(gameId=", ", topBlock=", "LargeCardWatermark(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(", waterMark=");
        sbO.append(this.e);
        sbO.append(", waterMarkColor=null)");
        return sbO.toString();
    }
}
