package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zrm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2l0 f44861a;
    public final u1l0 b;
    public final g3l0 c;
    public final d4d d;
    public final n3l0 e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zrm(f2l0 f2l0Var, u1l0 u1l0Var, g3l0 g3l0Var, d4d d4dVar, n3l0 n3l0Var, int i) {
        u1l0Var = (i & 2) != 0 ? null : u1l0Var;
        g3l0Var = (i & 4) != 0 ? null : g3l0Var;
        d4dVar = (i & 8) != 0 ? d4d.BACKGROUND_CONTENT : d4dVar;
        n3l0Var = (i & 16) != 0 ? j3l0.f15840a : n3l0Var;
        boolean z = false;
        if ((i & 32) != 0 && ((n3l0Var instanceof j3l0) || (n3l0Var instanceof m3l0))) {
            z = true;
        }
        this(f2l0Var, u1l0Var, g3l0Var, d4dVar, n3l0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrm)) {
            return false;
        }
        zrm zrmVar = (zrm) obj;
        return Intrinsics.d(this.f44861a, zrmVar.f44861a) && Intrinsics.d(this.b, zrmVar.b) && Intrinsics.d(this.c, zrmVar.c) && this.d == zrmVar.d && Intrinsics.d(this.e, zrmVar.e) && this.f == zrmVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f44861a.hashCode() * 31;
        u1l0 u1l0Var = this.b;
        int iHashCode2 = (iHashCode + (u1l0Var == null ? 0 : u1l0Var.hashCode())) * 31;
        g3l0 g3l0Var = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + dw9.b(this.d, (iHashCode2 + (g3l0Var != null ? g3l0Var.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DsSportCellStyle(sportCellMiddleStyle=" + this.f44861a + ", sportCellLeftStyle=" + this.b + ", sportCellRightStyle=" + this.c + ", backgroundColor=" + this.d + ", shape=" + this.e + ", showSeparator=" + this.f + Separators.RPAREN;
    }

    public zrm(f2l0 f2l0Var, u1l0 u1l0Var, g3l0 g3l0Var, d4d d4dVar, n3l0 n3l0Var, boolean z) {
        f2l0Var.getClass();
        d4dVar.getClass();
        n3l0Var.getClass();
        this.f44861a = f2l0Var;
        this.b = u1l0Var;
        this.c = g3l0Var;
        this.d = d4dVar;
        this.e = n3l0Var;
        this.f = z;
    }
}
