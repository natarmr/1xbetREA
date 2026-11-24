package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wu1 implements xu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39770a;
    public final String b;

    public wu1(long j, String str) {
        str.getClass();
        this.f39770a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu1)) {
            return false;
        }
        wu1 wu1Var = (wu1) obj;
        return this.f39770a == wu1Var.f39770a && Intrinsics.d(this.b, wu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f39770a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39770a, "ShowRegistrationBottomSheet(tournamentId=", ", tournamentName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
