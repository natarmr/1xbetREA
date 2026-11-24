package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ila implements lla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14966a;
    public final hem b;
    public final vma c;
    public final fma d;
    public final n0x e;

    public ila(long j, gem gemVar, vma vmaVar, fma fmaVar, n0x n0xVar) {
        this.f14966a = j;
        this.b = gemVar;
        this.c = vmaVar;
        this.d = fmaVar;
        this.e = n0xVar;
    }

    @Override // a.lla
    public final long a() {
        return this.f14966a;
    }

    @Override // a.lla
    public final hem c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ila)) {
            return false;
        }
        ila ilaVar = (ila) obj;
        return this.f14966a == ilaVar.f14966a && Intrinsics.d(this.b, ilaVar.b) && this.c.equals(ilaVar.c) && this.d.equals(ilaVar.d) && this.e.equals(ilaVar.e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f14966a) * 31;
        hem hemVar = this.b;
        return f140.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (hemVar == null ? 0 : hemVar.hashCode())) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f14966a + ", bottomBlock=" + this.b + ", topBlock=" + this.c + ", middleBlock=" + this.d + ", waterMark=" + this.e + ", waterMarkColor=null)";
    }
}
