package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r2m implements t2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29742a;
    public final v6n b;
    public final y3d c;
    public final y3d d;

    public r2m(String str, v6n v6nVar, y3d y3dVar, y3d y3dVar2) {
        this.f29742a = str;
        this.b = v6nVar;
        this.c = y3dVar;
        this.d = y3dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2m)) {
            return false;
        }
        r2m r2mVar = (r2m) obj;
        return this.f29742a.equals(r2mVar.f29742a) && this.b.equals(r2mVar.b) && Intrinsics.d(this.c, r2mVar.c) && Intrinsics.d(this.d, r2mVar.d);
    }

    @Override // a.t2m
    public final String getId() {
        return this.f29742a;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = (this.b.hashCode() + (this.f29742a.hashCode() * 31)) * 31;
        int iHashCode3 = 0;
        y3d y3dVar = this.c;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode2 + iHashCode) * 31;
        y3d y3dVar2 = this.d;
        if (y3dVar2 != null) {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode3 = Long.hashCode(j2);
        }
        return i + iHashCode3;
    }

    public final String toString() {
        return "Logo(id=" + this.f29742a + ", logoModel=" + this.b + ", borderColor=" + this.c + ", backgroundColor=" + this.d + Separators.RPAREN;
    }
}
