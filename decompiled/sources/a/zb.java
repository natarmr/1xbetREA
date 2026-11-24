package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zb implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f44089a;
    public final y3d b;
    public final s8 c;

    public zb(y3d y3dVar, y3d y3dVar2, int i) {
        y3dVar = (i & 1) != 0 ? null : y3dVar;
        y3dVar2 = (i & 2) != 0 ? null : y3dVar2;
        s8 s8Var = s8.f31777a;
        this.f44089a = y3dVar;
        this.b = y3dVar2;
        this.c = s8Var;
    }

    @Override // a.bc
    public final y3d a() {
        return this.f44089a;
    }

    @Override // a.bc
    public final s8 b() {
        return this.c;
    }

    @Override // a.bc
    public final y3d c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        return Intrinsics.d(this.f44089a, zbVar.f44089a) && Intrinsics.d(this.b, zbVar.b) && this.c == zbVar.c;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = 0;
        y3d y3dVar = this.f44089a;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = iHashCode * 31;
        y3d y3dVar2 = this.b;
        if (y3dVar2 != null) {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        return this.c.hashCode() + ((i + iHashCode2) * 31);
    }

    public final String toString() {
        return "Primary(backgroundColor=" + this.f44089a + ", iconColor=" + this.b + ", colorStyle=" + this.c + Separators.RPAREN;
    }
}
