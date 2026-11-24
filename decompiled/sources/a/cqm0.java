package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cqm0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4802a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final byte h;
    public final String i;
    public final int j;
    public final boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    public cqm0(int i, String str, String str2, String str3, boolean z, String str4, String str5, int i2, String str6, int i3, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f4802a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = i2;
        this.i = str6;
        this.j = i3;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqm0)) {
            return false;
        }
        cqm0 cqm0Var = (cqm0) obj;
        return this.f4802a == cqm0Var.f4802a && Intrinsics.d(this.b, cqm0Var.b) && Intrinsics.d(this.c, cqm0Var.c) && this.d.equals(cqm0Var.d) && this.e == cqm0Var.e && this.f.equals(cqm0Var.f) && this.g.equals(cqm0Var.g) && this.h == cqm0Var.h && this.i.equals(cqm0Var.i) && this.j == cqm0Var.j && this.k == cqm0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + twn.a(this.j, ua80.b(twn.a(this.h, ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f4802a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f4802a, "StockBannerUiModel(id=", ", imageUrl=", this.b, ", title=");
        f140.v(sbR, this.c, ", subtitle=", this.d, ", action=");
        f140.s(", deepLink=", this.f, ", siteLink=", sbR, this.e);
        twn.w(this.h, this.g, ", actionType=", ", translationId=", sbR);
        twn.w(this.j, this.i, ", lotteryId=", ", fireBadgeVisible=", sbR);
        return rw2.p(sbR, this.k, Separators.RPAREN);
    }
}
