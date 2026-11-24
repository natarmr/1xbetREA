package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2754a;
    public final n0x b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public bkl(long j, n0x n0xVar, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f2754a = j;
        this.b = n0xVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkl)) {
            return false;
        }
        bkl bklVar = (bkl) obj;
        return this.f2754a == bklVar.f2754a && this.b.equals(bklVar.b) && Intrinsics.d(this.c, bklVar.c) && Intrinsics.d(this.d, bklVar.d) && Intrinsics.d(this.e, bklVar.e) && Intrinsics.d(this.f, bklVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(f140.f(this.b, Long.hashCode(this.f2754a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsAggregatorBannerItemUiModel(bannerId=");
        sb.append(this.f2754a);
        sb.append(", image=");
        sb.append(this.b);
        f140.v(sb, ", title=", this.c, ", subtitle=", this.d);
        f140.v(sb, ", generalTitle=", this.e, ", generalSubTitle=", this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
