package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cq7 extends eq7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4778a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final mdm f;

    public cq7(String str, String str2, int i, String str3, boolean z, mdm mdmVar) {
        da10 da10Var = da10.DEFAULT_ERROR;
        brm0.B(str, str2, str3);
        this.f4778a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = mdmVar;
    }

    @Override // a.eq7
    public final String a() {
        return this.f4778a;
    }

    @Override // a.eq7
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq7)) {
            return false;
        }
        cq7 cq7Var = (cq7) obj;
        if (!Intrinsics.d(this.f4778a, cq7Var.f4778a) || !Intrinsics.d(this.b, cq7Var.b) || this.c != cq7Var.c || !Intrinsics.d(this.d, cq7Var.d) || this.e != cq7Var.e || !this.f.equals(cq7Var.f)) {
            return false;
        }
        da10 da10Var = da10.DEFAULT_ERROR;
        return true;
    }

    public final int hashCode() {
        return da10.TIMER_ERROR.hashCode() + f140.d(this.f, brm0.e(ua80.b(twn.a(this.c, ua80.b(this.f4778a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        da10 da10Var = da10.TIMER_ERROR;
        StringBuilder sbN = b1j.n("Error(imgUrl=", this.f4778a, ", title=", this.b, ", lotteryId=");
        kng0.w(this.c, ", bannerId=", this.d, ", expanded=", sbN);
        sbN.append(this.e);
        sbN.append(", lottieConfig=");
        sbN.append(this.f);
        sbN.append(", countDownTimeMillis=");
        sbN.append(da10Var);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
