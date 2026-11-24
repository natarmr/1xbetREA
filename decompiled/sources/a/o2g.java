package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o2g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24528a;
    public final d280 b;
    public final int c;
    public final int d;

    public o2g(String str, d280 d280Var, int i, int i2) {
        str.getClass();
        this.f24528a = str;
        this.b = d280Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2g)) {
            return false;
        }
        o2g o2gVar = (o2g) obj;
        return Intrinsics.d(this.f24528a, o2gVar.f24528a) && this.b.equals(o2gVar.b) && this.c == o2gVar.c && this.d == o2gVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.e(this.b, this.f24528a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(opponentName=");
        sb.append(this.f24528a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return w6x.o(this.c, this.d, ", winCount=", Separators.RPAREN, sb);
    }
}
