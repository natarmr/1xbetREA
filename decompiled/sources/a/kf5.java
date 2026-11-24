package a;

/* JADX INFO: loaded from: classes4.dex */
public final class kf5 implements nf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f18182a;

    public kf5(y3d y3dVar) {
        this.f18182a = y3dVar;
    }

    @Override // a.uf5
    public final y3d a() {
        return this.f18182a;
    }

    @Override // a.uf5
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf5) && this.f18182a.equals(((kf5) obj).f18182a);
    }

    public final int hashCode() {
        long j = this.f18182a.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(true) + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        return "Green(backgroundColor=" + this.f18182a + ", hasBorder=true)";
    }
}
