package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y0m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41814a;
    public final String b;
    public final String c;

    public y0m0(long j, String str, String str2) {
        this.f41814a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0m0)) {
            return false;
        }
        y0m0 y0m0Var = (y0m0) obj;
        return this.f41814a == y0m0Var.f41814a && this.b.equals(y0m0Var.b) && this.c.equals(y0m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f41814a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f41814a, "StageNetHeaderModel(sportId=", ", title=", this.b), ", logo=", this.c, Separators.RPAREN);
    }
}
