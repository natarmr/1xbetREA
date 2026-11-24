package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2522a;
    public final long b;
    public final boolean c;
    public final String d;
    public final int e;
    public final boolean f;
    public final long g;

    public bfu0(long j, long j2, boolean z, String str, int i, boolean z2, long j3) {
        str.getClass();
        this.f2522a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = i;
        this.f = z2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfu0)) {
            return false;
        }
        bfu0 bfu0Var = (bfu0) obj;
        return this.f2522a == bfu0Var.f2522a && this.b == bfu0Var.b && this.c == bfu0Var.c && Intrinsics.d(this.d, bfu0Var.d) && this.e == bfu0Var.e && this.f == bfu0Var.f && this.g == bfu0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + brm0.e(twn.a(this.e, ua80.b(brm0.e(rw2.b(Long.hashCode(this.f2522a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f2522a, "VideoMetaInfoModel(gameId=", ", sportId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        axq.s(this.e, ", videoId=", this.d, ", zoneId=", sbQ);
        rz4.A(sbQ, ", finished=", this.f, ", subSportId=");
        return brm0.k(this.g, Separators.RPAREN, sbQ);
    }
}
