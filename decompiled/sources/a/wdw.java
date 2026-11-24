package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wdw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38993a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final int f;

    public wdw(int i, int i2, long j, long j2, String str, String str2) {
        this.f38993a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdw)) {
            return false;
        }
        wdw wdwVar = (wdw) obj;
        return this.f38993a == wdwVar.f38993a && this.b.equals(wdwVar.b) && this.c.equals(wdwVar.c) && this.d == wdwVar.d && this.e == wdwVar.e && this.f == wdwVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, rw2.b(ua80.b(ua80.b(Long.hashCode(this.f38993a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f38993a, "HltvAwardsPreviousWinnersModel(id=", ", name=", this.b);
        hne.B(sbO, ", playerImage=", this.c, ", playerFeedId=");
        ua80.v(sbO, this.d, ", year=", this.e);
        return vqd.p(sbO, ", place=", this.f, Separators.RPAREN);
    }
}
