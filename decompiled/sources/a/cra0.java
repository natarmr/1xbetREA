package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cra0 implements era0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4836a;
    public final String b;
    public final long c;
    public final String d;
    public final s7l0 e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public cra0(long j, String str, long j2, String str2, s7l0 s7l0Var, int i, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f4836a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = s7l0Var;
        this.f = i;
        this.g = z;
        this.h = z2;
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
        if (!(obj instanceof cra0)) {
            return false;
        }
        cra0 cra0Var = (cra0) obj;
        return this.f4836a == cra0Var.f4836a && Intrinsics.d(this.b, cra0Var.b) && this.c == cra0Var.c && Intrinsics.d(this.d, cra0Var.d) && this.e.equals(cra0Var.e) && this.f == cra0Var.f && this.g == cra0Var.g && this.h == cra0Var.h;
    }

    @Override // a.era0
    public final long getId() {
        return this.f4836a;
    }

    @Override // a.era0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(twn.a(this.f, (this.e.hashCode() + ua80.b(rw2.b(ua80.b(Long.hashCode(this.f4836a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4836a, "Single(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", image=");
        sbO.append(this.d);
        sbO.append(", style=");
        sbO.append(this.e);
        sbO.append(", subSportId=");
        brm0.w(this.f, ", live=", ", favoriteChecked=", sbO, this.g);
        return rw2.p(sbO, this.h, Separators.RPAREN);
    }
}
