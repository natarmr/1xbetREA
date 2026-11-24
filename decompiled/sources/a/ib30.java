package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ib30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14468a;
    public final String b;
    public final String c;
    public final String d;

    public ib30(String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f14468a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib30)) {
            return false;
        }
        ib30 ib30Var = (ib30) obj;
        return this.f14468a.equals(ib30Var.f14468a) && Intrinsics.d(this.b, ib30Var.b) && Intrinsics.d(this.c, ib30Var.c) && Intrinsics.d(this.d, ib30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f14468a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("HeadToHead(tournamentName=", this.f14468a, ", firstTeamScore=", this.b, ", secondTeamScore="), this.c, ", date=", this.d, Separators.RPAREN);
    }
}
