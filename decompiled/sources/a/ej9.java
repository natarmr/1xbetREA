package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ej9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8q0 f7897a;

    public ej9(z8q0 z8q0Var) {
        this.f7897a = z8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej9)) {
            return false;
        }
        z8q0 z8q0Var = this.f7897a;
        j83 j83Var = z8q0Var.f43981a;
        z8q0 z8q0Var2 = ((ej9) obj).f7897a;
        return Intrinsics.d(j83Var, z8q0Var2.f43981a) && z8q0Var.b.c(z8q0Var2.b) && Intrinsics.d(z8q0Var.c, z8q0Var2.c) && z8q0Var.d == z8q0Var2.d && z8q0Var.e == z8q0Var2.e && z8q0Var.f == z8q0Var2.f && Intrinsics.d(z8q0Var.g, z8q0Var2.g) && z8q0Var.h == z8q0Var2.h && z8q0Var.i == z8q0Var2.i && p4e.c(z8q0Var.j, z8q0Var2.j);
    }

    public final int hashCode() {
        z8q0 z8q0Var = this.f7897a;
        int iHashCode = z8q0Var.f43981a.hashCode() * 31;
        y9q0 y9q0Var = z8q0Var.b;
        smk0 smk0Var = y9q0Var.f42262a;
        long j = smk0Var.b;
        eaq0[] eaq0VarArr = daq0.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        psq psqVar = smk0Var.c;
        int i = (iHashCode2 + (psqVar != null ? psqVar.f27526a : 0)) * 31;
        lsq lsqVar = smk0Var.d;
        int iHashCode3 = (i + (lsqVar != null ? Integer.hashCode(lsqVar.f20592a) : 0)) * 31;
        msq msqVar = smk0Var.e;
        int iHashCode4 = (iHashCode3 + (msqVar != null ? Integer.hashCode(msqVar.f22332a) : 0)) * 31;
        nrq nrqVar = smk0Var.f;
        int iHashCode5 = (iHashCode4 + (nrqVar != null ? nrqVar.hashCode() : 0)) * 31;
        String str = smk0Var.g;
        int iB = rw2.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, smk0Var.h);
        j56 j56Var = smk0Var.i;
        int iHashCode6 = (iB + (j56Var != null ? Float.hashCode(j56Var.f15918a) : 0)) * 31;
        f8q0 f8q0Var = smk0Var.j;
        int iHashCode7 = (iHashCode6 + (f8q0Var != null ? f8q0Var.hashCode() : 0)) * 31;
        rs00 rs00Var = smk0Var.k;
        int iHashCode8 = rs00Var != null ? rs00Var.f31011a.hashCode() : 0;
        long j2 = smk0Var.l;
        int i2 = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iHashCode9 = (y9q0Var.b.hashCode() + rw2.b((iHashCode7 + iHashCode8) * 31, 961, j2)) * 31;
        rw90 rw90Var = y9q0Var.c;
        return Long.hashCode(z8q0Var.j) + ((z8q0Var.i.hashCode() + ((z8q0Var.h.hashCode() + ((z8q0Var.g.hashCode() + twn.a(z8q0Var.f, brm0.e((dw9.a((iHashCode9 + (rw90Var != null ? rw90Var.hashCode() : 0) + iHashCode) * 31, 31, z8q0Var.c) + z8q0Var.d) * 31, 31, z8q0Var.e), 31)) * 31)) * 31)) * 31);
    }
}
