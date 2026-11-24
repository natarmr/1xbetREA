package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dra0 implements era0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6550a;
    public final String b;
    public final long c;
    public final String d;
    public final s7l0 e;
    public final int f;
    public final boolean g;
    public final yi00 h;

    public dra0(long j, String str, long j2, String str2, s7l0 s7l0Var, int i, boolean z, yi00 yi00Var) {
        str.getClass();
        str2.getClass();
        this.f6550a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = s7l0Var;
        this.f = i;
        this.g = z;
        this.h = yi00Var;
    }

    @Override // a.era0
    public final String b() {
        return this.d;
    }

    @Override // a.era0
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dra0)) {
            return false;
        }
        dra0 dra0Var = (dra0) obj;
        return this.f6550a == dra0Var.f6550a && Intrinsics.d(this.b, dra0Var.b) && this.c == dra0Var.c && Intrinsics.d(this.d, dra0Var.d) && this.e.equals(dra0Var.e) && this.f == dra0Var.f && this.g == dra0Var.g && this.h.equals(dra0Var.h);
    }

    @Override // a.era0
    public final long getId() {
        return this.f6550a;
    }

    @Override // a.era0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h.f42663a) + brm0.e(brm0.e(twn.a(this.f, (this.e.hashCode() + ua80.b(rw2.b(ua80.b(Long.hashCode(this.f6550a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31, false), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f6550a, "Sub(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", image=");
        sbO.append(this.d);
        sbO.append(", style=");
        sbO.append(this.e);
        sbO.append(", subSportId=");
        brm0.w(this.f, ", live=false, favoriteChecked=", ", expressType=", sbO, this.g);
        sbO.append(this.h);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
