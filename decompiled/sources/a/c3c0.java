package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c3c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3668a;
    public final boolean b;
    public final long c;

    public c3c0(int i, long j, boolean z) {
        this.f3668a = i;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3c0)) {
            return false;
        }
        c3c0 c3c0Var = (c3c0) obj;
        return this.f3668a == c3c0Var.f3668a && this.b == c3c0Var.b && this.c == c3c0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(Integer.hashCode(this.f3668a) * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, h97.l(this.f3668a, "ProfileShortInfoModel(countryId=", ", cutCoef=", ", userId=", this.b));
    }
}
