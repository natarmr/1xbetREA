package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qf5 implements sf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f28613a;

    public qf5(int i, y3d y3dVar) {
        this.f28613a = (i & 1) != 0 ? null : y3dVar;
    }

    @Override // a.uf5
    public final y3d a() {
        return this.f28613a;
    }

    @Override // a.uf5
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf5) && Intrinsics.d(this.f28613a, ((qf5) obj).f28613a);
    }

    public final int hashCode() {
        int iHashCode;
        y3d y3dVar = this.f28613a;
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
        return "Green(backgroundColor=" + this.f28613a + ", hasBorder=true)";
    }
}
