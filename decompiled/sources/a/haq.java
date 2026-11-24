package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class haq implements naq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12736a;
    public final long b;
    public final String c;
    public final double d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public haq(double d, long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        brm0.B(str, str2, str5);
        this.f12736a = str;
        this.b = j;
        this.c = str2;
        this.d = d;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haq)) {
            return false;
        }
        haq haqVar = (haq) obj;
        return Intrinsics.d(this.f12736a, haqVar.f12736a) && this.b == haqVar.b && Intrinsics.d(this.c, haqVar.c) && Double.compare(this.d, haqVar.d) == 0 && this.e.equals(haqVar.e) && this.f.equals(haqVar.f) && Intrinsics.d(this.g, haqVar.g) && this.h == haqVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(ua80.b(ua80.b(brm0.d(this.d, ua80.b(rw2.b(this.f12736a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ShowBetSuccessMessage(betNumber=", this.f12736a, ", balanceId=");
        hne.B(sbO, ", symbol=", this.c, ", betSum=");
        hne.w(sbO, this.d, ", coefficient=", this.e);
        f140.v(sbO, ", possibleWinSum=", this.f, ", possibleWinTitle=", this.g);
        return f140.n(sbO, ", isAvailablePossibleWinTax=", this.h, Separators.RPAREN);
    }
}
