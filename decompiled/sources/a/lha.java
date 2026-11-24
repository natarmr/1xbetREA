package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20044a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;

    public lha(String str, String str2, int i, int i2, int i3, String str3, String str4, int i4, int i5, int i6, boolean z) {
        str.getClass();
        str3.getClass();
        this.f20044a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lha)) {
            return false;
        }
        lha lhaVar = (lha) obj;
        return Intrinsics.d(this.f20044a, lhaVar.f20044a) && this.b.equals(lhaVar.b) && this.c == lhaVar.c && this.d == lhaVar.d && this.e == lhaVar.e && Intrinsics.d(this.f, lhaVar.f) && this.g.equals(lhaVar.g) && this.h == lhaVar.h && this.i == lhaVar.i && this.j == lhaVar.j && this.k == lhaVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + twn.a(this.j, twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(this.f20044a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardFootballPeriodModel(teamOneName=", this.f20044a, ", teamOneImageUrl=", this.b, ", teamOneCorners=");
        axq.r(this.c, this.d, ", teamOneYellowCards=", ", teamOneRedCards=", sbN);
        kng0.w(this.e, ", teamTwoName=", this.f, ", teamTwoImageUrl=", sbN);
        twn.w(this.h, this.g, ", teamTwoCorners=", ", teamTwoYellowCards=", sbN);
        axq.r(this.i, this.j, ", teamTwoRedCards=", ", hostsVsGuests=", sbN);
        return rw2.p(sbN, this.k, Separators.RPAREN);
    }
}
