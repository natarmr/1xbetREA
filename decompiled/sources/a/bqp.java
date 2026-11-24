package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3043a;
    public final String b;
    public final String c;

    public bqp(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f3043a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqp)) {
            return false;
        }
        bqp bqpVar = (bqp) obj;
        return Intrinsics.d(this.f3043a, bqpVar.f3043a) && Intrinsics.d(this.b, bqpVar.b) && Intrinsics.d(this.c, bqpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f3043a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("StatisticRequest(gameStatId=", this.f3043a, ", firstTeamName=", this.b, ", secondTeamName="), this.c, Separators.RPAREN);
    }
}
