package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ldb extends odb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19842a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;

    public ldb(long j, String str, long j2, long j3, String str2, String str3) {
        str.getClass();
        this.f19842a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = str2;
        this.f = str3;
    }

    public static ldb c(ldb ldbVar, long j, long j2, String str) {
        long j3 = ldbVar.f19842a;
        String str2 = ldbVar.b;
        String str3 = ldbVar.e;
        str2.getClass();
        str.getClass();
        return new ldb(j3, str2, j, j2, str3, str);
    }

    @Override // a.odb
    public final long a() {
        return this.f19842a;
    }

    @Override // a.odb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldb)) {
            return false;
        }
        ldb ldbVar = (ldb) obj;
        return this.f19842a == ldbVar.f19842a && Intrinsics.d(this.b, ldbVar.b) && this.c == ldbVar.c && this.d == ldbVar.d && this.e.equals(ldbVar.e) && this.f.equals(ldbVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f19842a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f19842a, "ChampSingleItem(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbO, this.d, ", image=", this.e);
        return rw2.o(sbO, ", gamesCount=", this.f, Separators.RPAREN);
    }
}
