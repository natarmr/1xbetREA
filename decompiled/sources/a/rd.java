package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f30265a;
    public final y3d b;
    public final y3d c;

    public rd(y3d y3dVar, y3d y3dVar2, y3d y3dVar3) {
        this.f30265a = y3dVar;
        this.b = y3dVar2;
        this.c = y3dVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return Intrinsics.d(this.f30265a, rdVar.f30265a) && Intrinsics.d(this.b, rdVar.b) && Intrinsics.d(this.c, rdVar.c);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        y3d y3dVar = this.f30265a;
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
        if (y3dVar3 != null) {
            long j3 = y3dVar3.f41946a;
            g2t0 g2t0Var3 = h2t0.b;
            iHashCode3 = Long.hashCode(j3);
        }
        return i2 + iHashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountControlColors(textColor=");
        sb.append(this.f30265a);
        sb.append(", borderColor=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }
}
