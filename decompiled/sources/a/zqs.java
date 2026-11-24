package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44821a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final vzj0 j;

    public zqs(boolean z, long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, long j5, vzj0 vzj0Var) {
        this.f44821a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = j5;
        this.j = vzj0Var;
    }

    public static zqs a(zqs zqsVar, boolean z, long j, long j2, long j3, boolean z2, boolean z3, long j4, vzj0 vzj0Var, int i) {
        boolean z4 = (i & 1) != 0 ? zqsVar.f44821a : z;
        long j5 = (i & 2) != 0 ? zqsVar.b : j;
        long j6 = (i & 4) != 0 ? zqsVar.c : j2;
        long j7 = (i & 8) != 0 ? zqsVar.d : j3;
        long j8 = zqsVar.e;
        boolean z5 = (i & 32) != 0 ? zqsVar.f : z2;
        boolean z6 = (i & 64) != 0 ? zqsVar.g : z3;
        boolean z7 = (i & 128) != 0 ? zqsVar.h : false;
        long j9 = (i & 256) != 0 ? zqsVar.i : j4;
        vzj0 vzj0Var2 = (i & 512) != 0 ? zqsVar.j : vzj0Var;
        zqsVar.getClass();
        return new zqs(z4, j5, j6, j7, j8, z5, z6, z7, j9, vzj0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqs)) {
            return false;
        }
        zqs zqsVar = (zqs) obj;
        return this.f44821a == zqsVar.f44821a && this.b == zqsVar.b && this.c == zqsVar.c && this.d == zqsVar.d && this.e == zqsVar.e && this.f == zqsVar.f && this.g == zqsVar.g && this.h == zqsVar.h && znq0.e(this.i, zqsVar.i) && Intrinsics.d(this.j, zqsVar.j);
    }

    public final int hashCode() {
        int iB = rw2.b(brm0.e(brm0.e(brm0.e(rw2.b(rw2.b(rw2.b(rw2.b(Boolean.hashCode(this.f44821a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        vzj0 vzj0Var = this.j;
        return iB + (vzj0Var == null ? 0 : vzj0Var.hashCode());
    }

    public final String toString() {
        String strH = znq0.h(this.i);
        StringBuilder sb = new StringBuilder("GameScreenContentModel(showBettingContent=");
        sb.append(this.f44821a);
        sb.append(", gameId=");
        sb.append(this.b);
        kng0.A(sb, ", sportId=", this.c, ", champId=");
        sb.append(this.d);
        kng0.A(sb, ", subGameId=", this.e, ", live=");
        ua80.u(", transferContinue=", ", transferFailed=", sb, this.f, this.g);
        f140.s(", transferTimeLeft=", strH, ", simulation=", sb, this.h);
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
