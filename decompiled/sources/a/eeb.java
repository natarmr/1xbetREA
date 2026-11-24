package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eeb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7663a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final int h;
    public final long i;
    public final pgb j;
    public final List k;
    public final int l;

    public eeb(long j, String str, String str2, long j2, String str3, String str4, long j3, int i, long j4, pgb pgbVar, iun iunVar, int i2) {
        iunVar.getClass();
        this.f7663a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = str3;
        this.f = str4;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = pgbVar;
        this.k = iunVar;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeb)) {
            return false;
        }
        eeb eebVar = (eeb) obj;
        return this.f7663a == eebVar.f7663a && this.b.equals(eebVar.b) && this.c.equals(eebVar.c) && this.d == eebVar.d && this.e.equals(eebVar.e) && this.f.equals(eebVar.f) && this.g == eebVar.g && this.h == eebVar.h && this.i == eebVar.i && this.j == eebVar.j && Intrinsics.d(this.k, eebVar.k) && this.l == eebVar.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + dw9.a((this.j.hashCode() + rw2.b(twn.a(this.h, rw2.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(Long.hashCode(this.f7663a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f7663a, "ChampModel(id=", ", name=", this.b);
        hne.B(sbO, ", sportName=", this.c, ", count=");
        kng0.z(sbO, this.d, ", champImage=", this.e);
        hne.B(sbO, ", countryImage=", this.f, ", subSportId=");
        ua80.v(sbO, this.g, ", idCountry=", this.h);
        kng0.A(sbO, ", sportId=", this.i, ", champType=");
        sbO.append(this.j);
        sbO.append(", games=");
        sbO.append(this.k);
        sbO.append(", globalChampId=");
        return rz4.j(this.l, Separators.RPAREN, sbO);
    }
}
