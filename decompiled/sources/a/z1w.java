package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z1w extends d2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43642a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public boolean f;

    public z1w(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f43642a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = "";
        this.f = false;
    }

    @Override // a.d2w
    public final long b() {
        return this.f43642a;
    }

    @Override // a.d2w
    public final String c() {
        return this.c;
    }

    @Override // a.d2w
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1w)) {
            return false;
        }
        z1w z1wVar = (z1w) obj;
        return this.f43642a == z1wVar.f43642a && Intrinsics.d(this.b, z1wVar.b) && Intrinsics.d(this.c, z1wVar.c) && this.d == z1wVar.d && this.e.equals(z1wVar.e) && this.f == z1wVar.f;
    }

    @Override // a.d2w
    public final String f() {
        return this.e;
    }

    @Override // a.d2w
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + rw2.b(ua80.b(rw2.b(twn.a(0, rw2.b(ua80.b(ua80.b(Long.hashCode(this.f43642a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, 0L), 31, this.e), 31, 0L);
    }

    public final String toString() {
        boolean z = this.f;
        StringBuilder sbO = axq.o(this.f43642a, "SubHistoryGame(id=", ", title=", this.b);
        hne.B(sbO, ", score=", this.c, ", sportId=");
        kng0.z(sbO, this.d, ", globalChampId=0, subSportId=0, statId=", this.e);
        return f140.n(sbO, ", stadiumId=0, lastItem=", z, Separators.RPAREN);
    }
}
