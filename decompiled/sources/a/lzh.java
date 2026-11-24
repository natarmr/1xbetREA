package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lzh implements ozh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20905a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final n0x j;
    public final n0x k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public lzh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, n0x n0xVar, n0x n0xVar2, String str10, boolean z, boolean z2) {
        ohs0.z(str2, str3, str4, str5, str6);
        cs0.x(str7, str8, str9, str10);
        this.f20905a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = n0xVar;
        this.k = n0xVar2;
        this.l = str10;
        this.m = z;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzh)) {
            return false;
        }
        lzh lzhVar = (lzh) obj;
        return Intrinsics.d(this.f20905a, lzhVar.f20905a) && Intrinsics.d(this.b, lzhVar.b) && Intrinsics.d(this.c, lzhVar.c) && Intrinsics.d(this.d, lzhVar.d) && Intrinsics.d(this.e, lzhVar.e) && Intrinsics.d(this.f, lzhVar.f) && Intrinsics.d(this.g, lzhVar.g) && Intrinsics.d(this.h, lzhVar.h) && Intrinsics.d(this.i, lzhVar.i) && this.j.equals(lzhVar.j) && this.k.equals(lzhVar.k) && Intrinsics.d(this.l, lzhVar.l) && this.m == lzhVar.m && this.n == lzhVar.n;
    }

    public final int hashCode() {
        String str = this.f20905a;
        return brm0.e(brm0.e(ua80.b(f140.f(this.k, f140.f(this.j, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((str == null ? 0 : str.hashCode()) * 961, 31, this.b), 31, this.c), 961, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 887503681, this.l), 31, this.m), 29791, this.n);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Placeholder(headerText=", this.f20905a, ", tagText=null, titleText=", this.b, ", titleTextPlaceholderNoTask=");
        f140.v(sbN, this.c, ", titleTextPlaceholderTask=", this.d, ", labelText=null, labelTextPlaceholderTask=");
        f140.v(sbN, this.e, ", labelTextPlaceholderNoTask=", this.f, ", buttonTextActive=");
        f140.v(sbN, this.g, ", buttonTextInactive=", this.h, ", buttonTextPlaceholder=");
        sbN.append(this.i);
        sbN.append(", linkCurrent=");
        sbN.append(this.j);
        sbN.append(", linkPlaceholder=");
        sbN.append(this.k);
        sbN.append(", tagCompleteText=");
        sbN.append(this.l);
        sbN.append(", textCurrentProgress=null, textMaxProgress=null, progress=null, maxProgress=null, maxProgressCurrency=null, isAuthorized=");
        return ohs0.p(", isNoTask=", ", taskKind=null, productId=null, taskId=null)", sbN, this.m, this.n);
    }
}
