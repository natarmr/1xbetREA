package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24891a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;

    public o9p0(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3) {
        str6.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f24891a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = list;
        this.j = list2;
        this.k = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9p0)) {
            return false;
        }
        o9p0 o9p0Var = (o9p0) obj;
        return this.f24891a == o9p0Var.f24891a && this.b.equals(o9p0Var.b) && this.c == o9p0Var.c && this.d.equals(o9p0Var.d) && this.e.equals(o9p0Var.e) && this.f.equals(o9p0Var.f) && this.g.equals(o9p0Var.g) && Intrinsics.d(this.h, o9p0Var.h) && Intrinsics.d(this.i, o9p0Var.i) && Intrinsics.d(this.j, o9p0Var.j) && Intrinsics.d(this.k, o9p0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(Long.hashCode(this.f24891a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f24891a, "TeamDetailsModel(feedId=", ", imageS3=", this.b);
        kng0.A(sbO, ", subSportId=", this.c, ", name=");
        f140.v(sbO, this.d, ", description=", this.e, ", location=");
        f140.v(sbO, this.f, ", locationImageS3=", this.g, ", foundedAt=");
        cs0.y(this.h, ", achievements=", ", transfers=", sbO, this.i);
        return kng0.n(", allLineups=", Separators.RPAREN, sbO, this.j, this.k);
    }
}
