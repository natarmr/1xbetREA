package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29171a;
    public final long b;
    public final String c;

    public qqk0(long j, long j2, String str) {
        str.getClass();
        this.f29171a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqk0)) {
            return false;
        }
        qqk0 qqk0Var = (qqk0) obj;
        return this.f29171a == qqk0Var.f29171a && this.b == qqk0Var.b && Intrinsics.d(this.c, qqk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f29171a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29171a, "OnCyberTeamClick(subSportId=", ", teamId=");
        kng0.z(sbQ, this.b, ", teamName=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
