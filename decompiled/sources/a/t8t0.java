package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t8t0 implements u8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33529a;
    public final String b;

    public t8t0(long j, String str) {
        str.getClass();
        this.f33529a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8t0)) {
            return false;
        }
        t8t0 t8t0Var = (t8t0) obj;
        return this.f33529a == t8t0Var.f33529a && Intrinsics.d(this.b, t8t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f33529a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f33529a, "OnTeamClick(teamId=", ", teamName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
