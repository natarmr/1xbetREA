package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class hrn0 {
    public static final grn0 Companion = new grn0();
    public static final a8z[] j = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new a7n0((byte) 18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13540a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final List i;

    public /* synthetic */ hrn0(int i, long j2, String str, long j3, String str2, int i2, boolean z, String str3, boolean z2, List list) {
        if (511 != (i & 511)) {
            m2x.I(i, 511, frn0.f10027a.getDescriptor());
            throw null;
        }
        this.f13540a = j2;
        this.b = str;
        this.c = j3;
        this.d = str2;
        this.e = i2;
        this.f = z;
        this.g = str3;
        this.h = z2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrn0)) {
            return false;
        }
        hrn0 hrn0Var = (hrn0) obj;
        return this.f13540a == hrn0Var.f13540a && Intrinsics.d(this.b, hrn0Var.b) && this.c == hrn0Var.c && Intrinsics.d(this.d, hrn0Var.d) && this.e == hrn0Var.e && this.f == hrn0Var.f && Intrinsics.d(this.g, hrn0Var.g) && this.h == hrn0Var.h && Intrinsics.d(this.i, hrn0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(ua80.b(brm0.e(twn.a(this.e, ua80.b(rw2.b(ua80.b(Long.hashCode(this.f13540a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f13540a, "SwipeXSportWithChampsModel(sportId=", ", sportName=", this.b);
        kng0.A(sbO, ", subSportId=", this.c, ", subSportName=");
        twn.w(this.e, this.d, ", champsCount=", ", selected=", sbO);
        f140.s(", imageUrl=", this.g, ", isCyber=", sbO, this.f);
        sbO.append(this.h);
        sbO.append(", champs=");
        sbO.append(this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public hrn0(int i, long j2, long j3, String str, String str2, String str3, List list, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        this.f13540a = j2;
        this.b = str;
        this.c = j3;
        this.d = str2;
        this.e = i;
        this.f = z;
        this.g = str3;
        this.h = z2;
        this.i = list;
    }
}
