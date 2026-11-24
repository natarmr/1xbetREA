package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n010 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22679a;
    public final long b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public n010(long j, long j2, long j3, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        cs0.x(str, str4, str5, str6);
        this.f22679a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n010)) {
            return false;
        }
        n010 n010Var = (n010) obj;
        return this.f22679a == n010Var.f22679a && this.b == n010Var.b && this.c == n010Var.c && this.d == n010Var.d && Intrinsics.d(this.e, n010Var.e) && this.f.equals(n010Var.f) && this.g.equals(n010Var.g) && Intrinsics.d(this.h, n010Var.h) && Intrinsics.d(this.i, n010Var.i) && Intrinsics.d(this.j, n010Var.j) && this.k.equals(n010Var.k);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return Long.valueOf(this.f22679a);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f22679a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f22679a, "LolGroupsUiModel(key=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", feedId=", this.c, ", isLastItem=");
        f140.s(", teamNumber=", this.e, ", teamName=", sbQ, this.d);
        f140.v(sbQ, this.f, ", teamIconUrl=", this.g, ", gamesValue=");
        f140.v(sbQ, this.h, ", winsValue=", this.i, ", losesValue=");
        return ua80.m(sbQ, this.j, ", wrValue=", this.k, Separators.RPAREN);
    }
}
