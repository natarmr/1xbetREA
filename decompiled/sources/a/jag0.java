package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16188a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public jag0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        ohs0.z(str, str2, str3, str4, str5);
        brm0.B(str6, str7, str8);
        this.f16188a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jag0)) {
            return false;
        }
        jag0 jag0Var = (jag0) obj;
        return Intrinsics.d(this.f16188a, jag0Var.f16188a) && Intrinsics.d(this.b, jag0Var.b) && Intrinsics.d(this.c, jag0Var.c) && Intrinsics.d(this.d, jag0Var.d) && Intrinsics.d(this.e, jag0Var.e) && Intrinsics.d(this.f, jag0Var.f) && Intrinsics.d(this.g, jag0Var.g) && Intrinsics.d(this.h, jag0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f16188a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ReturnStatsModel(firstServeReturnPointsWon=", this.f16188a, ", secondServeReturnPointsWon=", this.b, ", breakPointsOpportunities=");
        f140.v(sbN, this.c, ", breakPointsConverted=", this.d, ", returnGamesPlayed=");
        f140.v(sbN, this.e, ", returnGamesWon=", this.f, ", returnPointsWon=");
        return ua80.m(sbN, this.g, ", totalPointsWon=", this.h, Separators.RPAREN);
    }
}
