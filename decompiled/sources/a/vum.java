package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38055a;
    public final d280 b;
    public final int c;
    public final int d;

    public vum(String str, d280 d280Var, int i, int i2) {
        str.getClass();
        this.f38055a = str;
        this.b = d280Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vum)) {
            return false;
        }
        vum vumVar = (vum) obj;
        return Intrinsics.d(this.f38055a, vumVar.f38055a) && this.b.equals(vumVar.b) && this.c == vumVar.c && this.d == vumVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.e(this.b, this.f38055a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(opponentName=");
        sb.append(this.f38055a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return w6x.o(this.c, this.d, ", winCount=", Separators.RPAREN, sb);
    }
}
