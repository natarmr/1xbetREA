package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tf90 {
    public static final tf90 d = new tf90("", 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33857a;
    public final int b;
    public final int c;

    public tf90(String str, int i, int i2) {
        this.f33857a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf90)) {
            return false;
        }
        tf90 tf90Var = (tf90) obj;
        return this.f33857a.equals(tf90Var.f33857a) && this.b == tf90Var.b && this.c == tf90Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f33857a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "PeriodSubScoreZip(title=", this.f33857a, ", subScoreOne=", ", subScoreTwo="));
    }
}
