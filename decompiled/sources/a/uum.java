package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36308a;
    public final d280 b;
    public final int c;
    public final int d;

    public uum(String str, d280 d280Var, int i, int i2) {
        str.getClass();
        this.f36308a = str;
        this.b = d280Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uum)) {
            return false;
        }
        uum uumVar = (uum) obj;
        return Intrinsics.d(this.f36308a, uumVar.f36308a) && this.b.equals(uumVar.b) && this.c == uumVar.c && this.d == uumVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.e(this.b, this.f36308a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V3(opponentName=");
        sb.append(this.f36308a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return w6x.o(this.c, this.d, ", winCount=", Separators.RPAREN, sb);
    }
}
