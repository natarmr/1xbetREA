package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p57 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26391a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;

    public p57(int i, long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f26391a = i;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p57)) {
            return false;
        }
        p57 p57Var = (p57) obj;
        return this.f26391a == p57Var.f26391a && this.b == p57Var.b && this.c == p57Var.c && Intrinsics.d(this.d, p57Var.d) && Intrinsics.d(this.e, p57Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(rw2.b(rw2.b(Integer.hashCode(this.f26391a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f26391a, this.b, "BetHistoryScreenParams(betHistoryTypeId=", ", balanceId=");
        kng0.A(sbQ, ", betIdToOpen=", this.c, ", champId=");
        return ua80.m(sbQ, this.d, ", champTitle=", this.e, Separators.RPAREN);
    }

    public /* synthetic */ p57(int i, long j, long j2) {
        this(i, j, j2, "", "");
    }
}
