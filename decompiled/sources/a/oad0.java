package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24925a;
    public final String b;
    public final long c;

    public oad0(long j, long j2, String str) {
        this.f24925a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oad0)) {
            return false;
        }
        oad0 oad0Var = (oad0) obj;
        return this.f24925a == oad0Var.f24925a && this.b.equals(oad0Var.b) && this.c == oad0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(Long.hashCode(this.f24925a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(axq.o(this.f24925a, "CyberTeamDetails(sportId=", ", teamName=", this.b), this.c, ", feedId=", Separators.RPAREN);
    }
}
