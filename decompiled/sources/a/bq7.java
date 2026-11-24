package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bq7 extends eq7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3014a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final mdm f;

    public bq7(String str, String str2, int i, String str3, boolean z, mdm mdmVar) {
        brm0.B(str, str2, str3);
        this.f3014a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = mdmVar;
    }

    @Override // a.eq7
    public final String a() {
        return this.f3014a;
    }

    @Override // a.eq7
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq7)) {
            return false;
        }
        bq7 bq7Var = (bq7) obj;
        return Intrinsics.d(this.f3014a, bq7Var.f3014a) && Intrinsics.d(this.b, bq7Var.b) && this.c == bq7Var.c && Intrinsics.d(this.d, bq7Var.d) && this.e == bq7Var.e && this.f.equals(bq7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b(twn.a(this.c, ua80.b(this.f3014a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Empty(imgUrl=", this.f3014a, ", title=", this.b, ", lotteryId=");
        kng0.w(this.c, ", bannerId=", this.d, ", expanded=", sbN);
        sbN.append(this.e);
        sbN.append(", lottieConfig=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
