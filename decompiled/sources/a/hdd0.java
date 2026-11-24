package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hdd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12864a;
    public final boolean b;
    public final String c;
    public final String d;

    public hdd0(String str, String str2, boolean z, boolean z2) {
        this.f12864a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdd0)) {
            return false;
        }
        hdd0 hdd0Var = (hdd0) obj;
        return this.f12864a == hdd0Var.f12864a && this.b == hdd0Var.b && this.c.equals(hdd0Var.c) && this.d.equals(hdd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(brm0.e(Boolean.hashCode(this.f12864a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(f140.q("TvBetJackpot(fromAggregator=", ", showNavBar=", ", imageUrl=", this.f12864a, this.b), this.c, ", translateId=", this.d, Separators.RPAREN);
    }
}
