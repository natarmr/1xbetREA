package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f17364a;
    public final y3d b;
    public final y3d c;

    public /* synthetic */ jyl(y3d y3dVar, y3d y3dVar2, y3d y3dVar3, int i) {
        this((i & 1) != 0 ? null : y3dVar, (i & 8) != 0 ? null : y3dVar2, (i & 32) != 0 ? null : y3dVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyl)) {
            return false;
        }
        jyl jylVar = (jyl) obj;
        return Intrinsics.d(this.f17364a, jylVar.f17364a) && Intrinsics.d(this.b, jylVar.b) && Intrinsics.d(this.c, jylVar.c);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        y3d y3dVar = this.f17364a;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = iHashCode * 29791;
        y3d y3dVar2 = this.b;
        if (y3dVar2 == null) {
            iHashCode2 = 0;
        } else {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        int i2 = (i + iHashCode2) * 961;
        y3d y3dVar3 = this.c;
        if (y3dVar3 != null) {
            long j3 = y3dVar3.f41946a;
            g2t0 g2t0Var3 = h2t0.b;
            iHashCode3 = Long.hashCode(j3);
        }
        return (i2 + iHashCode3) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsChipsCustomColors(activeBackgroundColor=");
        sb.append(this.f17364a);
        sb.append(", activeLabelColor=null, activeValueColor=null, activeLeftIconTintColor=");
        sb.append(this.b);
        sb.append(", activeRightIconTintColor=null, inactiveLeftIconTintColor=");
        return hne.p(sb, this.c, ", inactiveRightIconTintColor=null)");
    }

    public jyl(y3d y3dVar, y3d y3dVar2, y3d y3dVar3) {
        this.f17364a = y3dVar;
        this.b = y3dVar2;
        this.c = y3dVar3;
    }
}
