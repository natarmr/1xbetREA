package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y1s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41874a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;

    public y1s0(long j, long j2, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f41874a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1s0)) {
            return false;
        }
        y1s0 y1s0Var = (y1s0) obj;
        return this.f41874a.equals(y1s0Var.f41874a) && this.b == y1s0Var.b && this.c == y1s0Var.c && Intrinsics.d(this.d, y1s0Var.d) && Intrinsics.d(this.e, y1s0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(rw2.b(rw2.b(this.f41874a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "TournamentItemUiModel(userName=", this.f41874a, ", points=");
        kng0.A(sbO, ", place=", this.c, ", prize=");
        return ua80.m(sbO, this.d, ", imageUrl=", this.e, Separators.RPAREN);
    }
}
