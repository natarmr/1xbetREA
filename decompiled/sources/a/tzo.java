package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tzo {
    public static final szo Companion = new szo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34814a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final long g;
    public final String h;
    public final boolean i;

    public /* synthetic */ tzo(int i, long j, long j2, int i2, String str, int i3, String str2, long j3, String str3, boolean z) {
        if (511 != (i & 511)) {
            m2x.I(i, 511, rzo.f31371a.getDescriptor());
            throw null;
        }
        this.f34814a = j;
        this.b = j2;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = str2;
        this.g = j3;
        this.h = str3;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzo)) {
            return false;
        }
        tzo tzoVar = (tzo) obj;
        return this.f34814a == tzoVar.f34814a && this.b == tzoVar.b && this.c == tzoVar.c && Intrinsics.d(this.d, tzoVar.d) && this.e == tzoVar.e && Intrinsics.d(this.f, tzoVar.f) && this.g == tzoVar.g && Intrinsics.d(this.h, tzoVar.h) && this.i == tzoVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(rw2.b(ua80.b(twn.a(this.e, ua80.b(twn.a(this.c, rw2.b(Long.hashCode(this.f34814a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34814a, "FastGamesRequest(playerId=", ", gameId=");
        ua80.v(sbQ, this.b, ", whence=", this.c);
        axq.s(this.e, ", lng=", this.d, ", refId=", sbQ);
        hne.B(sbQ, ", lobbyUrl=", this.f, ", playerBonusId=");
        kng0.z(sbQ, this.g, ", domen=", this.h);
        return f140.n(sbQ, ", test=", this.i, Separators.RPAREN);
    }

    public tzo(long j, long j2, String str, String str2, String str3) {
        this.f34814a = j;
        this.b = 77126L;
        this.c = 22;
        this.d = str;
        this.e = 1;
        this.f = str2;
        this.g = j2;
        this.h = str3;
        this.i = false;
    }
}
