package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class znr0 implements aor0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44689a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public znr0(String str, String str2, String str3, String str4, String str5, String str6) {
        str2.getClass();
        str6.getClass();
        this.f44689a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znr0)) {
            return false;
        }
        znr0 znr0Var = (znr0) obj;
        return this.f44689a.equals(znr0Var.f44689a) && Intrinsics.d(this.b, znr0Var.b) && this.c.equals(znr0Var.c) && this.d.equals(znr0Var.d) && this.e.equals(znr0Var.e) && Intrinsics.d(this.f, znr0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f44689a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TotoHeaderBannerContent(jackpotValue=", this.f44689a, ", tirageValue=", this.b, ", betAcceptTimeLimit=");
        f140.v(sbN, this.c, ", poolTimerValue=", this.d, ", untilEndTimerValue=");
        return ua80.m(sbN, this.e, ", poolSumValue=", this.f, Separators.RPAREN);
    }
}
