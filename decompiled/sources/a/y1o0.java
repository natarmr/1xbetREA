package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y1o0 implements b2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41867a;
    public final l4i b;
    public final v4o0 c;
    public final nem d;
    public final n0x e;

    public y1o0(long j, l4i l4iVar, v4o0 v4o0Var, nem nemVar, n0x n0xVar) {
        this.f41867a = j;
        this.b = l4iVar;
        this.c = v4o0Var;
        this.d = nemVar;
        this.e = n0xVar;
    }

    @Override // a.b2o0
    public final long a() {
        return this.f41867a;
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
        return new p5o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1o0)) {
            return false;
        }
        y1o0 y1o0Var = (y1o0) obj;
        return this.f41867a == y1o0Var.f41867a && this.b.equals(y1o0Var.b) && this.c.equals(y1o0Var.c) && this.d.equals(y1o0Var.d) && this.e.equals(y1o0Var.e);
    }

    public final int hashCode() {
        return f140.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f41867a) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f41867a, "LargeCardWatermark(gameId=", ", topBlock=", "LargeCardWatermark(model=" + this.b + Separators.RPAREN);
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
