package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kzh implements ozh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19153a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final n0x l;
    public final n0x m;
    public final String n;
    public final long o;

    public kzh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, n0x n0xVar, n0x n0xVar2, String str12, long j) {
        ohs0.z(str3, str4, str5, str6, str7);
        ohs0.z(str8, str9, str10, str11, str12);
        this.f19153a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = n0xVar;
        this.m = n0xVar2;
        this.n = str12;
        this.o = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzh)) {
            return false;
        }
        kzh kzhVar = (kzh) obj;
        return Intrinsics.d(this.f19153a, kzhVar.f19153a) && Intrinsics.d(this.b, kzhVar.b) && Intrinsics.d(this.c, kzhVar.c) && Intrinsics.d(this.d, kzhVar.d) && Intrinsics.d(this.e, kzhVar.e) && Intrinsics.d(this.f, kzhVar.f) && Intrinsics.d(this.g, kzhVar.g) && Intrinsics.d(this.h, kzhVar.h) && Intrinsics.d(this.i, kzhVar.i) && Intrinsics.d(this.j, kzhVar.j) && Intrinsics.d(this.k, kzhVar.k) && this.l.equals(kzhVar.l) && this.m.equals(kzhVar.m) && Intrinsics.d(this.n, kzhVar.n) && this.o == kzhVar.o;
    }

    public final int hashCode() {
        String str = this.f19153a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Long.hashCode(this.o) + brm0.e(brm0.e(ua80.b(f140.f(this.m, f140.f(this.l, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31), 887503681, this.n), 31, true), 29791, false);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CurrentInactive(headerText=", this.f19153a, ", tagText=", this.b, ", titleText=");
        f140.v(sbN, this.c, ", titleTextPlaceholderNoTask=", this.d, ", titleTextPlaceholderTask=");
        f140.v(sbN, this.e, ", labelText=", this.f, ", labelTextPlaceholderTask=");
        f140.v(sbN, this.g, ", labelTextPlaceholderNoTask=", this.h, ", buttonTextActive=");
        f140.v(sbN, this.i, ", buttonTextInactive=", this.j, ", buttonTextPlaceholder=");
        sbN.append(this.k);
        sbN.append(", linkCurrent=");
        sbN.append(this.l);
        sbN.append(", linkPlaceholder=");
        sbN.append(this.m);
        sbN.append(", tagCompleteText=");
        sbN.append(this.n);
        sbN.append(", textCurrentProgress=null, textMaxProgress=null, progress=null, maxProgress=null, maxProgressCurrency=null, isAuthorized=true, isNoTask=false, taskKind=null, productId=null, taskId=");
        return brm0.k(this.o, Separators.RPAREN, sbN);
    }
}
