package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r030 implements h130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29609a;
    public final oy20 b;
    public final String c;

    public r030(long j, oy20 oy20Var, String str) {
        str.getClass();
        this.f29609a = j;
        this.b = oy20Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r030)) {
            return false;
        }
        r030 r030Var = (r030) obj;
        return this.f29609a == r030Var.f29609a && this.b == r030Var.b && Intrinsics.d(this.c, r030Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f29609a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateCurrentSubGame(subGameId=");
        sb.append(this.f29609a);
        sb.append(", entryPoint=");
        sb.append(this.b);
        return rw2.o(sb, ", subGameName=", this.c, Separators.RPAREN);
    }
}
