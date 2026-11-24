package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38362a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final int g;
    public final k0p0 h;
    public final boolean i;

    public w0p0(String str, String str2, String str3, String str4, String str5, long j, int i, k0p0 k0p0Var, boolean z) {
        str.getClass();
        this.f38362a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = i;
        this.h = k0p0Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0p0)) {
            return false;
        }
        w0p0 w0p0Var = (w0p0) obj;
        return Intrinsics.d(this.f38362a, w0p0Var.f38362a) && this.b.equals(w0p0Var.b) && this.c.equals(w0p0Var.c) && this.d.equals(w0p0Var.d) && this.e.equals(w0p0Var.e) && this.f == w0p0Var.f && this.g == w0p0Var.g && this.h == w0p0Var.h && this.i == w0p0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + twn.a(this.g, rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f38362a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamBetLastGameModel(id=", this.f38362a, ", firstTeamId=", this.b, ", secondTeamId=");
        f140.v(sbN, this.c, ", firstTeamScore=", this.d, ", secondTeamScore=");
        defpackage.c.i(sbN, this.f, this.e, ", dateStart=");
        sbN.append(", status=");
        sbN.append(this.g);
        sbN.append(", winner=");
        sbN.append(this.h);
        return f140.n(sbN, ", noScore=", this.i, Separators.RPAREN);
    }
}
