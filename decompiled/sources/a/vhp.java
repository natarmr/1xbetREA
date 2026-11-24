package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vhp implements qlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37442a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final m6l0 i;
    public final boolean j;

    public vhp(long j, String str, long j2, int i, boolean z, String str2, long j3, long j4, m6l0 m6l0Var, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f37442a = j;
        this.b = str;
        this.c = j2;
        this.d = i;
        this.e = z;
        this.f = str2;
        this.g = j3;
        this.h = j4;
        this.i = m6l0Var;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhp)) {
            return false;
        }
        vhp vhpVar = (vhp) obj;
        return this.f37442a == vhpVar.f37442a && Intrinsics.d(this.b, vhpVar.b) && this.c == vhpVar.c && this.d == vhpVar.d && this.e == vhpVar.e && Intrinsics.d(this.f, vhpVar.f) && this.g == vhpVar.g && this.h == vhpVar.h && this.i.equals(vhpVar.i) && this.j == vhpVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + brm0.e(rw2.b(rw2.b(ua80.b(brm0.e(twn.a(this.d, rw2.b(ua80.b(Long.hashCode(this.f37442a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f37442a, "FeedChampGameUiItemModel(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", subSportId=");
        brm0.w(this.d, ", live=", ", champName=", sbO, this.e);
        defpackage.c.i(sbO, this.g, this.f, ", champId=");
        kng0.A(sbO, ", globalChampId=", this.h, ", subChampGame=false, cardStyle=");
        sbO.append(this.i);
        sbO.append(", supportRtl=");
        sbO.append(this.j);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
