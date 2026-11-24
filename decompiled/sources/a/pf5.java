package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pf5 implements uf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f26884a;

    public pf5(int i, y3d y3dVar) {
        this.f26884a = (i & 1) != 0 ? null : y3dVar;
    }

    @Override // a.uf5
    public final y3d a() {
        return this.f26884a;
    }

    @Override // a.uf5
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf5) && Intrinsics.d(this.f26884a, ((pf5) obj).f26884a);
    }

    public final int hashCode() {
        int iHashCode;
        y3d y3dVar = this.f26884a;
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
        return "Popular(backgroundColor=" + this.f26884a + ", hasBorder=true)";
    }
}
