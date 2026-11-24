package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z39 implements b49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43709a;
    public final long b;
    public final long c;
    public final v39 d;
    public final String e;
    public final long f;
    public final long g;
    public final boolean h;
    public final String i;

    public z39(long j, long j2, long j3, v39 v39Var, String str, long j4, long j5, boolean z, String str2) {
        str.getClass();
        this.f43709a = j;
        this.b = j2;
        this.c = j3;
        this.d = v39Var;
        this.e = str;
        this.f = j4;
        this.g = j5;
        this.h = z;
        this.i = str2;
    }

    public static z39 a(z39 z39Var, long j, long j2, boolean z, String str, int i) {
        long j3 = z39Var.f43709a;
        long j4 = z39Var.b;
        long j5 = z39Var.c;
        v39 v39Var = z39Var.d;
        String str2 = z39Var.e;
        long j6 = (i & 32) != 0 ? z39Var.f : j;
        long j7 = (i & 64) != 0 ? z39Var.g : j2;
        boolean z2 = (i & 128) != 0 ? z39Var.h : z;
        String str3 = (i & 256) != 0 ? z39Var.i : str;
        str2.getClass();
        return new z39(j3, j4, j5, v39Var, str2, j6, j7, z2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z39)) {
            return false;
        }
        z39 z39Var = (z39) obj;
        return this.f43709a == z39Var.f43709a && this.b == z39Var.b && this.c == z39Var.c && this.d == z39Var.d && Intrinsics.d(this.e, z39Var.e) && this.f == z39Var.f && this.g == z39Var.g && this.h == z39Var.h && this.i.equals(z39Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(rw2.b(rw2.b(ua80.b((this.d.hashCode() + rw2.b(rw2.b(Long.hashCode(this.f43709a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f43709a, "Active(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", sourceType=");
        sbQ.append(this.d);
        sbQ.append(", sourceId=");
        sbQ.append(this.e);
        sbQ.append(", playStartTimestamp=");
        sbQ.append(this.f);
        kng0.A(sbQ, ", accumulatedTime=", this.g, ", isPlaying=");
        return twn.q(", broadcastSessionHost=", this.i, Separators.RPAREN, sbQ, this.h);
    }
}
