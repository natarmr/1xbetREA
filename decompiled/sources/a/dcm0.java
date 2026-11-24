package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dcm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5852a;
    public final boolean b;
    public final boolean c;
    public final sfb d;
    public final eme e;
    public final nc5 f;
    public final String g;

    public dcm0(long j, boolean z, boolean z2, sfb sfbVar, eme emeVar, nc5 nc5Var, String str) {
        this.f5852a = j;
        this.b = z;
        this.c = z2;
        this.d = sfbVar;
        this.e = emeVar;
        this.f = nc5Var;
        this.g = str;
    }

    public static dcm0 a(dcm0 dcm0Var, boolean z, boolean z2, sfb sfbVar, nc5 nc5Var, String str, int i) {
        long j = dcm0Var.f5852a;
        if ((i & 2) != 0) {
            z = dcm0Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = dcm0Var.c;
        }
        boolean z4 = z2;
        dcm0Var.getClass();
        if ((i & 16) != 0) {
            sfbVar = dcm0Var.d;
        }
        sfb sfbVar2 = sfbVar;
        eme emeVar = dcm0Var.e;
        if ((i & 64) != 0) {
            nc5Var = dcm0Var.f;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i & 128) != 0) {
            str = dcm0Var.g;
        }
        String str2 = str;
        dcm0Var.getClass();
        sfbVar2.getClass();
        str2.getClass();
        return new dcm0(j, z3, z4, sfbVar2, emeVar, nc5Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcm0)) {
            return false;
        }
        dcm0 dcm0Var = (dcm0) obj;
        return this.f5852a == dcm0Var.f5852a && this.b == dcm0Var.b && this.c == dcm0Var.c && this.d.equals(dcm0Var.d) && this.e == dcm0Var.e && this.f.equals(dcm0Var.f) && this.g.equals(dcm0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(brm0.e(Long.hashCode(this.f5852a) * 31, 31, this.b), 31, this.c), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f5852a, "StatisticChampState(sportId=", ", isLoading=", this.b);
        sbR.append(", hasError=");
        sbR.append(this.c);
        sbR.append(", isLive=false, champStatisticModel=");
        sbR.append(this.d);
        sbR.append(", coreHeaderModel=");
        sbR.append(this.e);
        sbR.append(", backgroundHeaderModel=");
        sbR.append(this.f);
        return rw2.o(sbR, ", sportName=", this.g, Separators.RPAREN);
    }
}
