package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16433a;
    public final String b;
    public final long c;
    public final boolean d;

    public jfl0(boolean z, String str, long j, long j2) {
        str.getClass();
        this.f16433a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfl0)) {
            return false;
        }
        jfl0 jfl0Var = (jfl0) obj;
        return this.f16433a == jfl0Var.f16433a && Intrinsics.d(this.b, jfl0Var.b) && this.c == jfl0Var.c && this.d == jfl0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.b(ua80.b(Long.hashCode(this.f16433a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f16433a, "SportItem(sportId=", ", sportName=", this.b);
        kng0.A(sbO, ", champsCount=", this.c, ", newChamp=");
        return rw2.p(sbO, this.d, Separators.RPAREN);
    }
}
