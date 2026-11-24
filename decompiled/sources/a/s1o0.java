package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s1o0 implements v1o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31467a;
    public final l4i b;
    public final a3o0 c;
    public final nem d;
    public final n0x e;

    public s1o0(long j, l4i l4iVar, a3o0 a3o0Var, nem nemVar, n0x n0xVar) {
        this.f31467a = j;
        this.b = l4iVar;
        this.c = a3o0Var;
        this.d = nemVar;
        this.e = n0xVar;
    }

    @Override // a.v1o0
    public final long a() {
        return this.f31467a;
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
        return new u3o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1o0)) {
            return false;
        }
        s1o0 s1o0Var = (s1o0) obj;
        return this.f31467a == s1o0Var.f31467a && this.b.equals(s1o0Var.b) && this.c.equals(s1o0Var.c) && this.d.equals(s1o0Var.d) && this.e.equals(s1o0Var.e);
    }

    public final int hashCode() {
        return f140.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f31467a) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31467a, "LargeCardWatermark(gameId=", ", topBlock=", "LargeCardWatermark(model=" + this.b + Separators.RPAREN);
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
