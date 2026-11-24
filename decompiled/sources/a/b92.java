package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2186a;
    public final String b;
    public final boolean c;
    public final lok0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public b92(int i, String str, boolean z, lok0 lok0Var, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.f2186a = i;
        this.b = str;
        this.c = z;
        this.d = lok0Var;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b92)) {
            return false;
        }
        b92 b92Var = (b92) obj;
        return this.f2186a == b92Var.f2186a && Intrinsics.d(this.b, b92Var.b) && this.c == b92Var.c && this.d.equals(b92Var.d) && this.e == b92Var.e && this.f == b92Var.f && this.g == b92Var.g && this.h == b92Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e((this.d.hashCode() + brm0.e(ua80.b(Integer.hashCode(this.f2186a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f2186a, "AltDesignLSpecialEventMainSettings(eventId=", ", eventTitle=", this.b, ", isTabletDevice=");
        sbR.append(this.c);
        sbR.append(", specialEventInfo=");
        sbR.append(this.d);
        sbR.append(", isSmallDevice=");
        ua80.u(", isThemeDark=", ", isNewEventParams=", sbR, this.e, this.f);
        return ohs0.p(", hasWhoWinSection=", Separators.RPAREN, sbR, this.g, this.h);
    }
}
