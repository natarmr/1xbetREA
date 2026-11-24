package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class khv0 implements mhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18308a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;

    public khv0(long j, long j2, long j3, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f18308a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khv0)) {
            return false;
        }
        khv0 khv0Var = (khv0) obj;
        return this.f18308a == khv0Var.f18308a && this.b == khv0Var.b && Intrinsics.d(this.c, khv0Var.c) && this.d == khv0Var.d && Intrinsics.d(this.e, khv0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(ua80.b(rw2.b(Long.hashCode(this.f18308a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f18308a, "Video(gameId=", ", sportId=");
        kng0.z(sbQ, this.b, ", videoId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", url=");
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }
}
