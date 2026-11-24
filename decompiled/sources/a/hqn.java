package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hqn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13492a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final Long l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;

    public hqn(String str, String str2, String str3, Long l, String str4, int i, int i2, int i3, int i4, String str5, String str6, Long l2, String str7, String str8, String str9, String str10, int i5) {
        this.f13492a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = str4;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str5;
        this.k = str6;
        this.l = l2;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqn)) {
            return false;
        }
        hqn hqnVar = (hqn) obj;
        return this.f13492a.equals(hqnVar.f13492a) && this.b.equals(hqnVar.b) && this.c.equals(hqnVar.c) && Intrinsics.d(this.d, hqnVar.d) && this.e.equals(hqnVar.e) && this.f == hqnVar.f && this.g == hqnVar.g && this.h == hqnVar.h && this.i == hqnVar.i && this.j.equals(hqnVar.j) && this.k.equals(hqnVar.k) && Intrinsics.d(this.l, hqnVar.l) && this.m.equals(hqnVar.m) && this.n.equals(hqnVar.n) && this.o.equals(hqnVar.o) && this.p.equals(hqnVar.p) && this.q == hqnVar.q;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f13492a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iB2 = ua80.b(ua80.b(twn.a(this.i, twn.a(this.h, twn.a(this.g, twn.a(this.f, ua80.b((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31), 31), 31), 31), 31, this.j), 31, this.k);
        Long l2 = this.l;
        return Integer.hashCode(this.q) + brm0.e(ua80.b(ua80.b(ua80.b(ua80.b((iB2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, false);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("EditProfileModel(name=", this.f13492a, ", surname=", this.b, ", middleName=");
        h97.w(this.d, this.c, ", birthday=", ", birthPlace=", sbN);
        twn.w(this.f, this.e, ", countryId=", ", regionId=", sbN);
        axq.r(this.g, this.h, ", cityId=", ", documentType=", sbN);
        kng0.w(this.i, ", passportSeries=", this.j, ", passportNumber=", sbN);
        h97.w(this.l, this.k, ", passportDt=", ", passportWho=", sbN);
        f140.v(sbN, this.m, ", address=", this.n, ", inn=");
        f140.v(sbN, this.o, ", bankAccountNumber=", this.p, ", sendToVerification=false, sex=");
        return rz4.j(this.q, Separators.RPAREN, sbN);
    }
}
