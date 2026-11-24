package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x0o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40080a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public x0o0(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        ohs0.z(str2, str3, str4, str5, str6);
        this.f40080a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0o0)) {
            return false;
        }
        x0o0 x0o0Var = (x0o0) obj;
        return this.f40080a.equals(x0o0Var.f40080a) && Intrinsics.d(this.b, x0o0Var.b) && Intrinsics.d(this.c, x0o0Var.c) && Intrinsics.d(this.d, x0o0Var.d) && Intrinsics.d(this.e, x0o0Var.e) && Intrinsics.d(this.f, x0o0Var.f) && this.g == x0o0Var.g;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f40080a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f40080a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticBaseballUiModel(key=", this.f40080a, ", gameTitle=", this.b, ", firstTeamName=");
        f140.v(sbN, this.c, ", secondTeamName=", this.d, ", firstTeamScore=");
        f140.v(sbN, this.e, ", secondTeamScore=", this.f, ", background=");
        return rz4.j(this.g, Separators.RPAREN, sbN);
    }
}
