package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f29836a;
    public final y3d b;
    public final y3d c;
    public final y3d d;
    public final y3d e;

    public r4i(y3d y3dVar, y3d y3dVar2, y3d y3dVar3, y3d y3dVar4, y3d y3dVar5, int i) {
        y3dVar = (i & 1) != 0 ? null : y3dVar;
        y3dVar2 = (i & 2) != 0 ? null : y3dVar2;
        y3dVar3 = (i & 4) != 0 ? null : y3dVar3;
        y3dVar4 = (i & 8) != 0 ? null : y3dVar4;
        y3dVar5 = (i & 32) != 0 ? null : y3dVar5;
        this.f29836a = y3dVar;
        this.b = y3dVar2;
        this.c = y3dVar3;
        this.d = y3dVar4;
        this.e = y3dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4i)) {
            return false;
        }
        r4i r4iVar = (r4i) obj;
        return Intrinsics.d(this.f29836a, r4iVar.f29836a) && Intrinsics.d(this.b, r4iVar.b) && Intrinsics.d(this.c, r4iVar.c) && Intrinsics.d(this.d, r4iVar.d) && Intrinsics.d(this.e, r4iVar.e);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5 = 0;
        y3d y3dVar = this.f29836a;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = iHashCode * 31;
        y3d y3dVar2 = this.b;
        if (y3dVar2 == null) {
            iHashCode2 = 0;
        } else {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        int i2 = (i + iHashCode2) * 31;
        y3d y3dVar3 = this.c;
        if (y3dVar3 == null) {
            iHashCode3 = 0;
        } else {
            long j3 = y3dVar3.f41946a;
            g2t0 g2t0Var3 = h2t0.b;
            iHashCode3 = Long.hashCode(j3);
        }
        int i3 = (i2 + iHashCode3) * 31;
        y3d y3dVar4 = this.d;
        if (y3dVar4 == null) {
            iHashCode4 = 0;
        } else {
            long j4 = y3dVar4.f41946a;
            g2t0 g2t0Var4 = h2t0.b;
            iHashCode4 = Long.hashCode(j4);
        }
        int i4 = (i3 + iHashCode4) * 961;
        y3d y3dVar5 = this.e;
        if (y3dVar5 != null) {
            long j5 = y3dVar5.f41946a;
            g2t0 g2t0Var5 = h2t0.b;
            iHashCode5 = Long.hashCode(j5);
        }
        return i4 + iHashCode5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DSTabColors(activeLabelColor=");
        sb.append(this.f29836a);
        sb.append(", activeIconColor=");
        sb.append(this.b);
        sb.append(", inactiveIconColor=");
        sb.append(this.c);
        sb.append(", inactiveLabelColor=");
        sb.append(this.d);
        sb.append(", activeBackgroundColor=null, containerColor=");
        return hne.p(sb, this.e, Separators.RPAREN);
    }
}
