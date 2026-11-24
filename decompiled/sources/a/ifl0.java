package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ifl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14694a;
    public final String b;
    public final int c;

    public ifl0(String str, int i, long j) {
        str.getClass();
        this.f14694a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifl0)) {
            return false;
        }
        ifl0 ifl0Var = (ifl0) obj;
        return this.f14694a == ifl0Var.f14694a && Intrinsics.d(this.b, ifl0Var.b) && this.c == ifl0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Long.hashCode(this.f14694a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(axq.o(this.f14694a, "SportItem(sportId=", ", sportName=", this.b), ", gamesCount=", this.c, Separators.RPAREN);
    }
}
