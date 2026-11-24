package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t56 implements w56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33353a;
    public final l4i b;
    public final r86 c;
    public final nem d;
    public final n0x e;

    public t56(long j, l4i l4iVar, r86 r86Var, nem nemVar, n0x n0xVar) {
        this.f33353a = j;
        this.b = l4iVar;
        this.c = r86Var;
        this.d = nemVar;
        this.e = n0xVar;
    }

    @Override // a.w56
    public final long a() {
        return this.f33353a;
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
        return new l96(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t56)) {
            return false;
        }
        t56 t56Var = (t56) obj;
        return this.f33353a == t56Var.f33353a && this.b.equals(t56Var.b) && this.c.equals(t56Var.c) && this.d.equals(t56Var.d) && this.e.equals(t56Var.e);
    }

    public final int hashCode() {
        return f140.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f33353a) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f33353a, "LargeCardWatermark(gameId=", ", topBlock=", "LargeCardWatermark(model=" + this.b + Separators.RPAREN);
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
