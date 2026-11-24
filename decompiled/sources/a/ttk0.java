package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ttk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34513a;
    public final boolean b;
    public final int c;
    public final long d;
    public final long e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final y78 m;
    public final v5l0 n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final oho r;
    public final Locale s;
    public final int t;

    public ttk0(int i, boolean z, int i2, long j, long j2, List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, y78 y78Var, v5l0 v5l0Var, boolean z8, boolean z9, String str, oho ohoVar, Locale locale, int i3) {
        list.getClass();
        v5l0Var.getClass();
        str.getClass();
        ohoVar.getClass();
        this.f34513a = i;
        this.b = z;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = y78Var;
        this.n = v5l0Var;
        this.o = z8;
        this.p = z9;
        this.q = str;
        this.r = ohoVar;
        this.s = locale;
        this.t = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ttk0) {
            ttk0 ttk0Var = (ttk0) obj;
            if (this.f34513a == ttk0Var.f34513a && this.b == ttk0Var.b && this.c == ttk0Var.c && this.d == ttk0Var.d && this.e == ttk0Var.e && Intrinsics.d(this.f, ttk0Var.f) && this.g == ttk0Var.g && this.h == ttk0Var.h && this.i == ttk0Var.i && this.j == ttk0Var.j && this.k == ttk0Var.k && this.l == ttk0Var.l && this.m == ttk0Var.m && this.n == ttk0Var.n && this.o == ttk0Var.o && this.p == ttk0Var.p && Intrinsics.d(this.q, ttk0Var.q) && this.r == ttk0Var.r && this.s.equals(ttk0Var.s) && this.t == ttk0Var.t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + ((this.s.hashCode() + ((this.r.hashCode() + ua80.b(brm0.e(brm0.e(axq.c(this.n, (this.m.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(rw2.b(rw2.b(twn.a(this.c, brm0.e(Integer.hashCode(this.f34513a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31), 31, this.o), 31, this.p), 31, this.q)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f34513a, "SpecialEventTabScreenSettingsModel(eventId=", ", hasCalendar=", ", globalChampId=", this.b);
        sbL.append(this.c);
        sbL.append(", sportId=");
        sbL.append(this.d);
        kng0.A(sbL, ", subSportId=", this.e, ", tabContentIds=");
        rz4.z(sbL, ", customSportIcon=", this.f, ", topIcon=", this.g);
        ua80.u(", hasFinals=", ", isBettingDisabled=", sbL, this.h, this.i);
        ua80.u(", isNewEventParams=", ", hasStream=", sbL, this.j, this.k);
        sbL.append(this.l);
        sbL.append(", gameUtilsProvider=");
        sbL.append(this.m);
        sbL.append(", sportEventCardStyle=");
        sbL.append(this.n);
        sbL.append(", isTablet=");
        sbL.append(this.o);
        sbL.append(", isNewBanners=");
        f140.s(", overrideImagesId=", this.q, ", eventStyle=", sbL, this.p);
        sbL.append(this.r);
        sbL.append(", currentLocale=");
        sbL.append(this.s);
        sbL.append(", lottieType=");
        return rz4.j(this.t, Separators.RPAREN, sbL);
    }
}
