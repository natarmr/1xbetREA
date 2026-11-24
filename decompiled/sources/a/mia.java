package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21834a;
    public final boolean b;
    public final long c;
    public final long d;
    public final String e;
    public final long f;

    public mia(long j, long j2, long j3, long j4, String str, boolean z) {
        this.f21834a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mia)) {
            return false;
        }
        mia miaVar = (mia) obj;
        return this.f21834a == miaVar.f21834a && this.b == miaVar.b && this.c == miaVar.c && this.d == miaVar.d && this.e.equals(miaVar.e) && this.f == miaVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ua80.b(rw2.b(rw2.b(brm0.e(Long.hashCode(this.f21834a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f21834a, "CardGameMoreClickUiModel(gameId=", ", live=", this.b);
        kng0.A(sbR, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbR, this.d, ", champName=", this.e);
        return rw2.n(sbR, this.f, ", champId=", Separators.RPAREN);
    }
}
