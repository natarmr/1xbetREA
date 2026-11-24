package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class hpn0 {
    public static final gpn0 Companion = new gpn0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13452a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public /* synthetic */ hpn0(int i, long j, String str, long j2, String str2, int i2, boolean z, boolean z2, String str3) {
        if (255 != (i & 255)) {
            m2x.I(i, 255, fpn0.f9937a.getDescriptor());
            throw null;
        }
        this.f13452a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = str3;
    }

    public static hpn0 a(hpn0 hpn0Var, boolean z) {
        long j = hpn0Var.f13452a;
        String str = hpn0Var.b;
        long j2 = hpn0Var.c;
        String str2 = hpn0Var.d;
        int i = hpn0Var.e;
        boolean z2 = hpn0Var.g;
        String str3 = hpn0Var.h;
        hpn0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new hpn0(i, j, j2, str, str2, str3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpn0)) {
            return false;
        }
        hpn0 hpn0Var = (hpn0) obj;
        return this.f13452a == hpn0Var.f13452a && Intrinsics.d(this.b, hpn0Var.b) && this.c == hpn0Var.c && Intrinsics.d(this.d, hpn0Var.d) && this.e == hpn0Var.e && this.f == hpn0Var.f && this.g == hpn0Var.g && Intrinsics.d(this.h, hpn0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(brm0.e(twn.a(this.e, ua80.b(rw2.b(ua80.b(Long.hashCode(this.f13452a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f13452a, "SwipeXFilterSportsModel(sportId=", ", sportName=", this.b);
        kng0.A(sbO, ", subSportId=", this.c, ", subSportName=");
        twn.w(this.e, this.d, ", champsCount=", ", selected=", sbO);
        ua80.u(", isCyber=", ", imageUrl=", sbO, this.f, this.g);
        return axq.n(sbO, this.h, Separators.RPAREN);
    }

    public hpn0(int i, long j, long j2, String str, String str2, String str3, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f13452a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = str3;
    }
}
