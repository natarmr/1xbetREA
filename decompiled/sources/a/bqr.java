package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3046a;
    public final long b;
    public final String c;

    public bqr(long j, long j2, String str) {
        str.getClass();
        this.f3046a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqr)) {
            return false;
        }
        bqr bqrVar = (bqr) obj;
        return this.f3046a == bqrVar.f3046a && this.b == bqrVar.b && Intrinsics.d(this.c, bqrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f3046a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f3046a, "GameBackgroundModel(sportId=", ", subSportId=");
        kng0.z(sbQ, this.b, ", imagePath=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
