package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yrl implements asl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43127a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public yrl(String str, String str2, String str3, String str4, String str5, long j) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f43127a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrl)) {
            return false;
        }
        yrl yrlVar = (yrl) obj;
        return Intrinsics.d(this.f43127a, yrlVar.f43127a) && Intrinsics.d(this.b, yrlVar.b) && Intrinsics.d(this.c, yrlVar.c) && Intrinsics.d(this.d, yrlVar.d) && Intrinsics.d(this.e, yrlVar.e) && this.f == yrlVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(this.f43127a.hashCode() * 961, 31, true), 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f43127a, ", titleColor=null, showDays=true, timerDaysTitle=", this.b, ", timerHoursTitle=");
        f140.v(sbN, this.c, ", timerMinutesTitle=", this.d, ", timerSecondsTitle=");
        defpackage.c.i(sbN, this.f, this.e, ", counterDateMillis=");
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
