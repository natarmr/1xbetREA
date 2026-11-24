package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lf5 implements nf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f19937a;

    public lf5(int i, y3d y3dVar) {
        this.f19937a = (i & 1) != 0 ? null : y3dVar;
    }

    @Override // a.uf5
    public final y3d a() {
        return this.f19937a;
    }

    @Override // a.uf5
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf5) && Intrinsics.d(this.f19937a, ((lf5) obj).f19937a);
    }

    public final int hashCode() {
        int iHashCode;
        y3d y3dVar = this.f19937a;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return Boolean.hashCode(true) + (iHashCode * 31);
    }

    public final String toString() {
        return "Primary(backgroundColor=" + this.f19937a + ", hasBorder=true)";
    }
}
