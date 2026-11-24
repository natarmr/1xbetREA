package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mdb extends odb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21587a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public boolean h;

    public mdb(long j, String str, long j2, long j3, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.f21587a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
    }

    public static mdb c(mdb mdbVar, long j, long j2, String str, boolean z, int i) {
        long j3 = mdbVar.f21587a;
        String str2 = mdbVar.b;
        long j4 = (i & 4) != 0 ? mdbVar.c : j;
        long j5 = (i & 8) != 0 ? mdbVar.d : j2;
        String str3 = mdbVar.e;
        String str4 = mdbVar.f;
        String str5 = (i & 64) != 0 ? mdbVar.g : str;
        boolean z2 = (i & 128) != 0 ? mdbVar.h : z;
        mdbVar.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        return new mdb(j3, str2, j4, j5, str3, str4, str5, z2);
    }

    @Override // a.odb
    public final long a() {
        return this.f21587a;
    }

    @Override // a.odb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdb)) {
            return false;
        }
        mdb mdbVar = (mdb) obj;
        return this.f21587a == mdbVar.f21587a && Intrinsics.d(this.b, mdbVar.b) && this.c == mdbVar.c && this.d == mdbVar.d && Intrinsics.d(this.e, mdbVar.e) && this.f.equals(mdbVar.f) && this.g.equals(mdbVar.g) && this.h == mdbVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f21587a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        boolean z = this.h;
        StringBuilder sbO = axq.o(this.f21587a, "ChampSubItem(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbO, this.d, ", groupTitle=", this.e);
        f140.v(sbO, ", image=", this.f, ", gamesCount=", this.g);
        return f140.n(sbO, ", lastInGroup=", z, Separators.RPAREN);
    }
}
