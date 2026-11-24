package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x3k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40224a;
    public final h3m0 b;
    public final long c;
    public final int d;
    public final String e;

    public x3k0(int i, h3m0 h3m0Var, long j, int i2, String str) {
        str.getClass();
        this.f40224a = i;
        this.b = h3m0Var;
        this.c = j;
        this.d = i2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3k0)) {
            return false;
        }
        x3k0 x3k0Var = (x3k0) obj;
        return this.f40224a == x3k0Var.f40224a && this.b.equals(x3k0Var.b) && this.c == x3k0Var.c && this.d == x3k0Var.d && Intrinsics.d(this.e, x3k0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, rw2.b((this.b.hashCode() + (Integer.hashCode(this.f40224a) * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleStageScreenParams(eventId=");
        sb.append(this.f40224a);
        sb.append(", stageType=");
        sb.append(this.b);
        sb.append(", sportId=");
        ua80.v(sb, this.c, ", champId=", this.d);
        return rw2.o(sb, ", screenName=", this.e, Separators.RPAREN);
    }
}
