package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wzr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40034a;
    public final String b;
    public final String c;
    public final m0x d;

    public wzr0(long j, String str, String str2, m0x m0xVar) {
        str2.getClass();
        this.f40034a = j;
        this.b = str;
        this.c = str2;
        this.d = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzr0)) {
            return false;
        }
        wzr0 wzr0Var = (wzr0) obj;
        return this.f40034a == wzr0Var.f40034a && this.b.equals(wzr0Var.b) && Intrinsics.d(this.c, wzr0Var.c) && this.d.equals(wzr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Long.hashCode(this.f40034a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40034a, "TournamentCollectionPopularTimerModel(timeToExpire=", ", timerLabel=", this.b);
        sbO.append(", daysLabel=");
        sbO.append(this.c);
        sbO.append(", timerIcon=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
