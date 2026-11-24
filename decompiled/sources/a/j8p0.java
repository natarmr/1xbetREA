package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16097a;
    public final String b;
    public final boolean c;

    public j8p0(String str, long j, boolean z) {
        this.f16097a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8p0)) {
            return false;
        }
        j8p0 j8p0Var = (j8p0) obj;
        return this.f16097a == j8p0Var.f16097a && this.b.equals(j8p0Var.b) && this.c == j8p0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f16097a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f16097a, "OnTeamClick(teamId=", ", teamName=", this.b), ", hasStat=", this.c, Separators.RPAREN);
    }
}
