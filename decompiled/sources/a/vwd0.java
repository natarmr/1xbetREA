package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vwd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38146a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;

    public vwd0(String str, long j, String str2, String str3, String str4, String str5, long j2, String str6) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f38146a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = j2;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwd0)) {
            return false;
        }
        vwd0 vwd0Var = (vwd0) obj;
        return Intrinsics.d(this.f38146a, vwd0Var.f38146a) && this.b == vwd0Var.b && Intrinsics.d(this.c, vwd0Var.c) && Intrinsics.d(this.d, vwd0Var.d) && Intrinsics.d(this.e, vwd0Var.e) && Intrinsics.d(this.f, vwd0Var.f) && this.g == vwd0Var.g && Intrinsics.d(this.h, vwd0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(this.f38146a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "RainbowPostGameScenarioParams(gameId=", this.f38146a, ", subSportId=");
        f140.v(sbO, ", firstTeamName=", this.c, ", secondTeamName=", this.d);
        f140.v(sbO, ", firstTeamImage=", this.e, ", secondTeamImage=", this.f);
        kng0.A(sbO, ", startDateMs=", this.g, ", score=");
        return axq.n(sbO, this.h, Separators.RPAREN);
    }
}
