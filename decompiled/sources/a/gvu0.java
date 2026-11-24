package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gvu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11993a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;

    public gvu0(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        ohs0.z(str2, str3, str4, str5, str6);
        this.f11993a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvu0)) {
            return false;
        }
        gvu0 gvu0Var = (gvu0) obj;
        return this.f11993a.equals(gvu0Var.f11993a) && Intrinsics.d(this.b, gvu0Var.b) && Intrinsics.d(this.c, gvu0Var.c) && Intrinsics.d(this.d, gvu0Var.d) && Intrinsics.d(this.e, gvu0Var.e) && Intrinsics.d(this.f, gvu0Var.f) && this.g == gvu0Var.g && this.h == gvu0Var.h;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f11993a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + twn.a(this.g, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f11993a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("VolleyballStatisticUiModel(key=", this.f11993a, ", setTitle=", this.b, ", firstTeamSetScore=");
        f140.v(sbN, this.c, ", secondTeamSetScore=", this.d, ", firstTeamName=");
        f140.v(sbN, this.e, ", secondTeamName=", this.f, ", serve=");
        return w6x.o(this.g, this.h, ", background=", Separators.RPAREN, sbN);
    }
}
