package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ac implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f603a;
    public final y3d b;
    public final s8 c;

    public ac(y3d y3dVar, y3d y3dVar2, int i) {
        y3dVar2 = (i & 2) != 0 ? null : y3dVar2;
        s8 s8Var = s8.f31777a;
        this.f603a = y3dVar;
        this.b = y3dVar2;
        this.c = s8Var;
    }

    @Override // a.bc
    public final y3d a() {
        return this.f603a;
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
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f603a.equals(acVar.f603a) && Intrinsics.d(this.b, acVar.b) && this.c == acVar.c;
    }

    public final int hashCode() {
        long j = this.f603a.f41946a;
        g2t0 g2t0Var = h2t0.b;
        int iHashCode = Long.hashCode(j) * 31;
        y3d y3dVar = this.b;
        return this.c.hashCode() + ((iHashCode + (y3dVar == null ? 0 : Long.hashCode(y3dVar.f41946a))) * 31);
    }

    public final String toString() {
        return "Secondary(backgroundColor=" + this.f603a + ", iconColor=" + this.b + ", colorStyle=" + this.c + Separators.RPAREN;
    }
}
