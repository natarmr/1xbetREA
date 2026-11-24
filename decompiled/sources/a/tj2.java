package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34033a;
    public final long b;
    public final String c;
    public final long d;
    public final long e;
    public final sgb f;
    public final int g;

    public tj2(long j, long j2, String str, long j3, long j4, sgb sgbVar, int i) {
        str.getClass();
        sgbVar.getClass();
        this.f34033a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = j4;
        this.f = sgbVar;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj2)) {
            return false;
        }
        tj2 tj2Var = (tj2) obj;
        return this.f34033a == tj2Var.f34033a && this.b == tj2Var.b && Intrinsics.d(this.c, tj2Var.c) && this.d == tj2Var.d && this.e == tj2Var.e && Intrinsics.d(this.f, tj2Var.f) && this.g == tj2Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((this.f.hashCode() + rw2.b(rw2.b(ua80.b(rw2.b(Long.hashCode(this.f34033a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34033a, "TournamentNavModel(id=", ", globalChampId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        kng0.A(sbQ, ", sportId=", this.d, ", subSportId=");
        sbQ.append(this.e);
        sbQ.append(", champType=");
        sbQ.append(this.f);
        return vqd.p(sbQ, ", cyberType=", this.g, Separators.RPAREN);
    }
}
