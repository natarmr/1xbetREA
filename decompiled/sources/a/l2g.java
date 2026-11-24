package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l2g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19306a;
    public final d280 b;
    public final int c;
    public final int d;

    public l2g(String str, d280 d280Var, int i, int i2) {
        str.getClass();
        this.f19306a = str;
        this.b = d280Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2g)) {
            return false;
        }
        l2g l2gVar = (l2g) obj;
        return Intrinsics.d(this.f19306a, l2gVar.f19306a) && this.b.equals(l2gVar.b) && this.c == l2gVar.c && this.d == l2gVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.e(this.b, this.f19306a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(opponentName=");
        sb.append(this.f19306a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return w6x.o(this.c, this.d, ", winCount=", Separators.RPAREN, sb);
    }
}
