package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ycl f6237a;
    public final ycl b;
    public final y3d c;

    public /* synthetic */ dkm(ycl yclVar, y3d y3dVar, int i) {
        this((i & 1) != 0 ? null : yclVar, (ycl) null, (i & 4) != 0 ? null : y3dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkm)) {
            return false;
        }
        dkm dkmVar = (dkm) obj;
        return Intrinsics.d(this.f6237a, dkmVar.f6237a) && Intrinsics.d(this.b, dkmVar.b) && Intrinsics.d(this.c, dkmVar.c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        ycl yclVar = this.f6237a;
        int iHashCode2 = (yclVar == null ? 0 : Float.hashCode(yclVar.f42389a)) * 31;
        ycl yclVar2 = this.b;
        int iHashCode3 = (iHashCode2 + (yclVar2 == null ? 0 : Float.hashCode(yclVar2.f42389a))) * 31;
        y3d y3dVar = this.c;
        if (y3dVar != null) {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Spinner(size=");
        sb.append(this.f6237a);
        sb.append(", strokeWidth=");
        sb.append(this.b);
        sb.append(", color=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }

    public dkm(ycl yclVar, ycl yclVar2, y3d y3dVar) {
        this.f6237a = yclVar;
        this.b = yclVar2;
        this.c = y3dVar;
    }
}
