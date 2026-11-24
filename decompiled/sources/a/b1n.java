package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1814a;
    public final int b;
    public final d280 c;

    public b1n(int i, d280 d280Var, String str) {
        str.getClass();
        this.f1814a = str;
        this.b = i;
        this.c = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1n)) {
            return false;
        }
        b1n b1nVar = (b1n) obj;
        return Intrinsics.d(this.f1814a, b1nVar.f1814a) && this.b == b1nVar.b && this.c.equals(b1nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f1814a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V3(opponentLabel=", this.f1814a, ", redCardCounter=", ", opponentIcon=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
