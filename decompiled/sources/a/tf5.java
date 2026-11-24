package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tf5 implements uf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33850a;
    public final y3d b;

    public tf5(int i, y3d y3dVar, int i2) {
        y3dVar = (i2 & 2) != 0 ? null : y3dVar;
        this.f33850a = i;
        this.b = y3dVar;
    }

    @Override // a.uf5
    public final y3d a() {
        return this.b;
    }

    @Override // a.uf5
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf5)) {
            return false;
        }
        tf5 tf5Var = (tf5) obj;
        return this.f33850a == tf5Var.f33850a && Intrinsics.d(this.b, tf5Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = Integer.hashCode(this.f33850a) * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return Boolean.hashCode(true) + ((iHashCode2 + iHashCode) * 31);
    }

    public final String toString() {
        return "Status(iconRes=" + this.f33850a + ", backgroundColor=" + this.b + ", hasBorder=true)";
    }
}
